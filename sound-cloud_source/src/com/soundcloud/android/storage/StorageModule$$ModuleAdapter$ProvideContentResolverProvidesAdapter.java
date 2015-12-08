// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import com.soundcloud.android.SoundCloudApplication;
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

    private b application;
    private final StorageModule module;

    public final void attach(l l1)
    {
        application = l1.a("com.soundcloud.android.SoundCloudApplication", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
    }

    public final ContentResolver get()
    {
        return module.provideContentResolver((SoundCloudApplication)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (StorageModule storagemodule)
    {
        super("android.content.ContentResolver", false, "com.soundcloud.android.storage.StorageModule", "provideContentResolver");
        module = storagemodule;
        setLibrary(true);
    }
}
