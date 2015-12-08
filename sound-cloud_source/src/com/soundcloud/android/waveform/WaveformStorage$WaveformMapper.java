// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformStorage, WaveformData, WaveformSerializer

private static class <init> extends RxResultMapper
{

    private final WaveformSerializer serializer;

    public WaveformData map(CursorReader cursorreader)
    {
        return new WaveformData(cursorreader.getInt("max_amplitude"), serializer.deserialize(cursorreader.getString("samples")));
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private (WaveformSerializer waveformserializer)
    {
        serializer = waveformserializer;
    }

    serializer(WaveformSerializer waveformserializer, serializer serializer1)
    {
        this(waveformserializer);
    }
}
