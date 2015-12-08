// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformStorage, WaveformSerializer

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b propellerRx;
    private b serializer;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/waveform/WaveformStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/waveform/WaveformStorage, getClass().getClassLoader());
        serializer = l1.a("com.soundcloud.android.waveform.WaveformSerializer", com/soundcloud/android/waveform/WaveformStorage, getClass().getClassLoader());
    }

    public final WaveformStorage get()
    {
        return new WaveformStorage((PropellerRx)propellerRx.get(), (CurrentDateProvider)dateProvider.get(), (WaveformSerializer)serializer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
        set.add(dateProvider);
        set.add(serializer);
    }

    public ()
    {
        super("com.soundcloud.android.waveform.WaveformStorage", "members/com.soundcloud.android.waveform.WaveformStorage", false, com/soundcloud/android/waveform/WaveformStorage);
    }
}
