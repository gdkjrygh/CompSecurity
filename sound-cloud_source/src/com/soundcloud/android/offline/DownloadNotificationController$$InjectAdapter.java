// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadNotificationController

public final class  extends b
    implements Provider
{

    private b context;
    private b notificationBuilderProvider;
    private b notificationManager;
    private b resources;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/offline/DownloadNotificationController, getClass().getClassLoader());
        notificationManager = l1.a("android.app.NotificationManager", com/soundcloud/android/offline/DownloadNotificationController, getClass().getClassLoader());
        notificationBuilderProvider = l1.a("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/soundcloud/android/offline/DownloadNotificationController, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/offline/DownloadNotificationController, getClass().getClassLoader());
    }

    public final DownloadNotificationController get()
    {
        return new DownloadNotificationController((Context)context.get(), (NotificationManager)notificationManager.get(), (Provider)notificationBuilderProvider.get(), (Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(notificationManager);
        set.add(notificationBuilderProvider);
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.offline.DownloadNotificationController", "members/com.soundcloud.android.offline.DownloadNotificationController", false, com/soundcloud/android/offline/DownloadNotificationController);
    }
}
