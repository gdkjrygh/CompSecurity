// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.creators.record.AmplitudeAnalyzer;
import com.soundcloud.android.creators.record.AudioConfig;
import java.nio.ByteBuffer;

public class NativeAmplitudeAnalyzer
    implements AmplitudeAnalyzer
{

    private final int bytes_per_sample;
    private final int channels;
    private int current_adjusted_max_amplitude;
    private int last_max;
    private int last_value;

    public NativeAmplitudeAnalyzer(AudioConfig audioconfig)
    {
        channels = audioconfig.channels;
        bytes_per_sample = audioconfig.bitsPerSample / 8;
    }

    public native float frameAmplitude(ByteBuffer bytebuffer, int i);

    public native int getLastValue();

    static 
    {
        System.loadLibrary("native_amplitude_analyzer");
_L1:
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        if ("Dalvik".equals(System.getProperty("java.vm.name")))
        {
            throw unsatisfiedlinkerror;
        }
          goto _L1
    }
}
