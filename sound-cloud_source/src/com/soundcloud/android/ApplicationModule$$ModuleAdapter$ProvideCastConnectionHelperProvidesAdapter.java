// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.Context;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private b applicationProperties;
    private b context;
    private b featureFlags;
    private final ApplicationModule module;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
    }

    public final CastConnectionHelper get()
    {
        return module.provideCastConnectionHelper((Context)context.get(), (FeatureFlags)featureFlags.get(), (ApplicationProperties)applicationProperties.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(featureFlags);
        set.add(applicationProperties);
    }

    public (ApplicationModule applicationmodule)
    {
        super("com.soundcloud.android.cast.CastConnectionHelper", true, "com.soundcloud.android.ApplicationModule", "provideCastConnectionHelper");
        module = applicationmodule;
        setLibrary(true);
    }
}
