// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.ads.LeaveBehindProperty;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PageListener, WhyAdsDialogPresenter

class AdPageListener extends PageListener
{

    private final AccountOperations accountOperations;
    private final AdsOperations adsOperations;
    private final Context context;
    private final PlayQueueManager playQueueManager;
    private final WhyAdsDialogPresenter whyAdsPresenter;

    public AdPageListener(Context context1, PlaySessionStateProvider playsessionstateprovider, PlaySessionController playsessioncontroller, PlayQueueManager playqueuemanager, EventBus eventbus, AdsOperations adsoperations, AccountOperations accountoperations, 
            WhyAdsDialogPresenter whyadsdialogpresenter)
    {
        super(playsessioncontroller, playsessionstateprovider, eventbus);
        context = context1;
        playQueueManager = playqueuemanager;
        adsOperations = adsoperations;
        accountOperations = accountoperations;
        whyAdsPresenter = whyadsdialogpresenter;
    }

    private void startActivity(Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.setFlags(0x10000000);
        context.startActivity(uri);
    }

    public void onAboutAds(Context context1)
    {
        whyAdsPresenter.show(context1);
    }

    public void onClickThrough()
    {
        Object obj = playQueueManager.getCurrentPlayQueueItem();
        PropertySet propertyset = ((PlayQueueItem) (obj)).getMetaData();
        obj = ((PlayQueueItem) (obj)).getUrn();
        startActivity((Uri)propertyset.get(AdProperty.CLICK_THROUGH_LINK));
        adsOperations.getMonetizableTrackMetaData().put(LeaveBehindProperty.META_AD_CLICKED, Boolean.valueOf(true));
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromAudioAdClick(propertyset, ((com.soundcloud.android.model.Urn) (obj)), accountOperations.getLoggedInUserUrn(), playQueueManager.getCurrentTrackSourceInfo()));
    }

    public void onNext()
    {
        playSessionController.nextTrack();
        eventBus.publish(EventQueue.TRACKING, PlayControlEvent.skip("full_player"));
    }

    public void onPrevious()
    {
        playSessionController.previousTrack();
        eventBus.publish(EventQueue.TRACKING, PlayControlEvent.previous("full_player"));
    }

    public void onSkipAd()
    {
        playSessionController.nextTrack();
        eventBus.publish(EventQueue.TRACKING, PlayControlEvent.skipAd());
    }
}
