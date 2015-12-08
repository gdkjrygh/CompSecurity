// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.content.Context;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            BigNotificationBuilder

public final class  extends b
    implements Provider
{

    private b context;
    private b imageOperations;
    private b remoteViewsFactory;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/notification/BigNotificationBuilder, getClass().getClassLoader());
        remoteViewsFactory = l1.a("com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews$Factory", com/soundcloud/android/playback/notification/BigNotificationBuilder, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/notification/BigNotificationBuilder, getClass().getClassLoader());
    }

    public final BigNotificationBuilder get()
    {
        return new BigNotificationBuilder((Context)context.get(), (com.soundcloud.android.playback.views.y)remoteViewsFactory.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(remoteViewsFactory);
        set.add(imageOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.notification.BigNotificationBuilder", "members/com.soundcloud.android.playback.notification.BigNotificationBuilder", false, com/soundcloud/android/playback/notification/BigNotificationBuilder);
    }
}
