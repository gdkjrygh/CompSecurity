// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamStorage

public final class  extends b
    implements Provider
{

    private b database;
    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/stream/SoundStreamStorage, getClass().getClassLoader());
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/stream/SoundStreamStorage, getClass().getClassLoader());
    }

    public final SoundStreamStorage get()
    {
        return new SoundStreamStorage((PropellerRx)propellerRx.get(), (PropellerDatabase)database.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
        set.add(database);
    }

    public ()
    {
        super("com.soundcloud.android.stream.SoundStreamStorage", "members/com.soundcloud.android.stream.SoundStreamStorage", false, com/soundcloud/android/stream/SoundStreamStorage);
    }
}
