// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.waveform.WaveformSerializer;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            WaveformStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b propeller;
    private b serializer;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/WaveformStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/offline/WaveformStorage, getClass().getClassLoader());
        serializer = l1.a("com.soundcloud.android.waveform.WaveformSerializer", com/soundcloud/android/offline/WaveformStorage, getClass().getClassLoader());
    }

    public final WaveformStorage get()
    {
        return new WaveformStorage((PropellerDatabase)propeller.get(), (CurrentDateProvider)dateProvider.get(), (WaveformSerializer)serializer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(dateProvider);
        set.add(serializer);
    }

    public ()
    {
        super("com.soundcloud.android.offline.WaveformStorage", "members/com.soundcloud.android.offline.WaveformStorage", false, com/soundcloud/android/offline/WaveformStorage);
    }
}
