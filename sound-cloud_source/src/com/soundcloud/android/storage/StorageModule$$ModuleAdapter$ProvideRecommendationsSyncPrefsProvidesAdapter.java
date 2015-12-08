// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.Context;
import android.content.SharedPreferences;
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

    private b context;
    private final StorageModule module;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
    }

    public final SharedPreferences get()
    {
        return module.provideRecommendationsSyncPrefs((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (StorageModule storagemodule)
    {
        super("@javax.inject.Named(value=RecommendationsSync)/android.content.SharedPreferences", false, "com.soundcloud.android.storage.StorageModule", "provideRecommendationsSyncPrefs");
        module = storagemodule;
        setLibrary(true);
    }
}
