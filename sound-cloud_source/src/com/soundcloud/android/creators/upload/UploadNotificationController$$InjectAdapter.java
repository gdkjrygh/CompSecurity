// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadNotificationController

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b context;
    private b navigator;
    private b notificationBuilderProvider;
    private b notificationManager;
    private b resources;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
        notificationManager = l1.a("android.app.NotificationManager", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
        notificationBuilderProvider = l1.a("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/creators/upload/UploadNotificationController, getClass().getClassLoader());
    }

    public final UploadNotificationController get()
    {
        return new UploadNotificationController((Context)context.get(), (Resources)resources.get(), (NotificationManager)notificationManager.get(), (Provider)notificationBuilderProvider.get(), (Navigator)navigator.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(resources);
        set.add(notificationManager);
        set.add(notificationBuilderProvider);
        set.add(navigator);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.creators.upload.UploadNotificationController", "members/com.soundcloud.android.creators.upload.UploadNotificationController", false, com/soundcloud/android/creators/upload/UploadNotificationController);
    }
}
