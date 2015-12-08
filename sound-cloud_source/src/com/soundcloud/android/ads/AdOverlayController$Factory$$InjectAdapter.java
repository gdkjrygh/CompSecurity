// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b context;
    private b deviceHelper;
    private b eventBus;
    private b imageOperations;
    private b playQueueManager;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
        context = l1.a("android.content.Context", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/ads/AdOverlayController$Factory, getClass().getClassLoader());
    }

    public final accountOperations get()
    {
        return new accountOperations((ImageOperations)imageOperations.get(), (Context)context.get(), (DeviceHelper)deviceHelper.get(), (EventBus)eventBus.get(), (PlayQueueManager)playQueueManager.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(context);
        set.add(deviceHelper);
        set.add(eventBus);
        set.add(playQueueManager);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdOverlayController$Factory", "members/com.soundcloud.android.ads.AdOverlayController$Factory", false, com/soundcloud/android/ads/AdOverlayController$Factory);
    }
}
