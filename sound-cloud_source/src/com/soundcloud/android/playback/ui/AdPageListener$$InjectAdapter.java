// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            AdPageListener, WhyAdsDialogPresenter

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b adsOperations;
    private b context;
    private b eventBus;
    private b playQueueManager;
    private b playSessionController;
    private b playSessionStateProvider;
    private b supertype;
    private b whyAdsPresenter;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        whyAdsPresenter = l1.a("com.soundcloud.android.playback.ui.WhyAdsDialogPresenter", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.playback.ui.PageListener", com/soundcloud/android/playback/ui/AdPageListener, getClass().getClassLoader(), false);
    }

    public final AdPageListener get()
    {
        AdPageListener adpagelistener = new AdPageListener((Context)context.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (PlaySessionController)playSessionController.get(), (PlayQueueManager)playQueueManager.get(), (EventBus)eventBus.get(), (AdsOperations)adsOperations.get(), (AccountOperations)accountOperations.get(), (WhyAdsDialogPresenter)whyAdsPresenter.get());
        injectMembers(adpagelistener);
        return adpagelistener;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(playSessionStateProvider);
        set.add(playSessionController);
        set.add(playQueueManager);
        set.add(eventBus);
        set.add(adsOperations);
        set.add(accountOperations);
        set.add(whyAdsPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(AdPageListener adpagelistener)
    {
        supertype.injectMembers(adpagelistener);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AdPageListener)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.AdPageListener", "members/com.soundcloud.android.playback.ui.AdPageListener", false, com/soundcloud/android/playback/ui/AdPageListener);
    }
}
