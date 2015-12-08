// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.stations.StartStationPresenter;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPageMenuController

static class shareOperations
{

    private final EventBus eventBus;
    private final FeatureFlags featureFlags;
    private final PlayQueueManager playQueueManager;
    private final com.soundcloud.android.view.menu.y.shareOperations popupMenuWrapperFactory;
    private final RepostOperations repostOperations;
    private final ShareOperations shareOperations;
    private final StartStationPresenter startStationPresenter;

    TrackPageMenuController create(View view)
    {
        FragmentActivity fragmentactivity = (FragmentActivity)view.getContext();
        return new TrackPageMenuController(featureFlags, playQueueManager, repostOperations, fragmentactivity, popupMenuWrapperFactory.popupMenuWrapperFactory(fragmentactivity, view), startStationPresenter, eventBus, shareOperations, null);
    }

    (FeatureFlags featureflags, PlayQueueManager playqueuemanager, RepostOperations repostoperations, com.soundcloud.android.view.menu.y y, StartStationPresenter startstationpresenter, EventBus eventbus, ShareOperations shareoperations)
    {
        featureFlags = featureflags;
        playQueueManager = playqueuemanager;
        repostOperations = repostoperations;
        popupMenuWrapperFactory = y;
        startStationPresenter = startstationpresenter;
        eventBus = eventbus;
        shareOperations = shareoperations;
    }
}
