// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            StorageModule

public static final class setLibrary extends t
    implements Provider
{

    private final StorageModule module;
    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
    }

    public final PropellerRx get()
    {
        return module.providePropellerRxWrapper((PropellerDatabase)propeller.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
    }

    public (StorageModule storagemodule)
    {
        super("com.soundcloud.propeller.rx.PropellerRx", false, "com.soundcloud.android.storage.StorageModule", "providePropellerRxWrapper");
        module = storagemodule;
        setLibrary(true);
    }
}
