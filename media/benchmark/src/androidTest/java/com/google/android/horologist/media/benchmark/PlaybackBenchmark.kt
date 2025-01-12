/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:OptIn(ExperimentalMacrobenchmarkApi::class)

package com.google.android.horologist.media.benchmark

import androidx.benchmark.macro.ExperimentalMacrobenchmarkApi
import androidx.test.filters.LargeTest

@LargeTest
class PlaybackBenchmark : BasePlaybackBenchmark() {
    override val mediaApp: MediaApp = TestMedia.MediaSampleApp
}
