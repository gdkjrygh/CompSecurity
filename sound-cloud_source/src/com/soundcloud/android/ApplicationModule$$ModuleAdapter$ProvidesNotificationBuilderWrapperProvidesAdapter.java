// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.Context;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.notification.NotificationBuilder;
import com.soundcloud.android.properties.ApplicationProperties;
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
    private b imageOperations;
    private final ApplicationModule module;
    private b remoteViewsFactory;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        remoteViewsFactory = l1.a("com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews$Factory", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
    }

    public final NotificationBuilder get()
    {
        return module.providesNotificationBuilderWrapper((Context)context.get(), (ApplicationProperties)applicationProperties.get(), (com.soundcloud.android.playback.views.erties)remoteViewsFactory.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(applicationProperties);
        set.add(remoteViewsFactory);
        set.add(imageOperations);
    }

    public (ApplicationModule applicationmodule)
    {
        super("com.soundcloud.android.playback.notification.NotificationBuilder", true, "com.soundcloud.android.ApplicationModule", "providesNotificationBuilderWrapper");
        module = applicationmodule;
        setLibrary(true);
    }
}
