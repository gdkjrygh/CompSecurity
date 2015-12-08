// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.propeller.PropellerDatabase;
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

    private b database;
    private final StorageModule module;

    public final void attach(l l1)
    {
        database = l1.a("android.database.sqlite.SQLiteDatabase", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
    }

    public final PropellerDatabase get()
    {
        return module.providePropeller((SQLiteDatabase)database.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
    }

    public a(StorageModule storagemodule)
    {
        super("com.soundcloud.propeller.PropellerDatabase", false, "com.soundcloud.android.storage.StorageModule", "providePropeller");
        module = storagemodule;
        setLibrary(true);
    }
}
