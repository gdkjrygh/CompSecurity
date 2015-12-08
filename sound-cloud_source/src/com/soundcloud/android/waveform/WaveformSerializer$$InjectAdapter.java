// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformSerializer

public final class  extends b
    implements Provider
{

    public final WaveformSerializer get()
    {
        return new WaveformSerializer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.waveform.WaveformSerializer", "members/com.soundcloud.android.waveform.WaveformSerializer", false, com/soundcloud/android/waveform/WaveformSerializer);
    }
}
