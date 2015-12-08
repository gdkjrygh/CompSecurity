// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule, Navigator

public static final class setLibrary extends t
    implements Provider
{

    private b featureFlags;
    private final ApplicationModule module;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
    }

    public final Navigator get()
    {
        return module.provideNavigator((FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureFlags);
    }

    public (ApplicationModule applicationmodule)
    {
        super("com.soundcloud.android.Navigator", false, "com.soundcloud.android.ApplicationModule", "provideNavigator");
        module = applicationmodule;
        setLibrary(true);
    }
}
