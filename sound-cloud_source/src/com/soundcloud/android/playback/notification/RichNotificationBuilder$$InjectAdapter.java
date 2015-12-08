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
//            RichNotificationBuilder

public final class Y extends b
    implements Provider
{

    private b context;
    private b imageOperations;
    private b remoteViewsFactory;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/notification/RichNotificationBuilder, getClass().getClassLoader());
        remoteViewsFactory = l1.a("com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews$Factory", com/soundcloud/android/playback/notification/RichNotificationBuilder, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/notification/RichNotificationBuilder, getClass().getClassLoader());
    }

    public final RichNotificationBuilder get()
    {
        return new RichNotificationBuilder((Context)context.get(), (com.soundcloud.android.playback.views.)remoteViewsFactory.get(), (ImageOperations)imageOperations.get());
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

    public Y()
    {
        super("com.soundcloud.android.playback.notification.RichNotificationBuilder", "members/com.soundcloud.android.playback.notification.RichNotificationBuilder", false, com/soundcloud/android/playback/notification/RichNotificationBuilder);
    }
}
