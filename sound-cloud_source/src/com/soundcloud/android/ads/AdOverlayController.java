// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.AdOverlayTrackingEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayPresenter, AdOverlayProperty

public class AdOverlayController
    implements AdOverlayPresenter.Listener
{
    public static interface AdOverlayListener
    {

        public abstract void onAdOverlayHidden(boolean flag);

        public abstract void onAdOverlayShown(boolean flag);
    }

    public static class Factory
    {

        private final AccountOperations accountOperations;
        private final Context context;
        private final DeviceHelper deviceHelper;
        private final EventBus eventBus;
        private final ImageOperations imageOperations;
        private final PlayQueueManager playQueueManager;

        public AdOverlayController create(View view, AdOverlayListener adoverlaylistener)
        {
            return new AdOverlayController(view, adoverlaylistener, imageOperations, context, deviceHelper, eventBus, playQueueManager, accountOperations);
        }

        Factory(ImageOperations imageoperations, Context context1, DeviceHelper devicehelper, EventBus eventbus, PlayQueueManager playqueuemanager, AccountOperations accountoperations)
        {
            imageOperations = imageoperations;
            context = context1;
            deviceHelper = devicehelper;
            eventBus = eventbus;
            playQueueManager = playqueuemanager;
            accountOperations = accountoperations;
        }
    }


    private final AccountOperations accountOperations;
    private final Context context;
    private PropertySet data;
    private final DeviceHelper deviceHelper;
    private final EventBus eventBus;
    private final ImageOperations imageOperations;
    private boolean isExpanded;
    private final AdOverlayListener listener;
    private final PlayQueueManager playQueueManager;
    private AdOverlayPresenter presenter;
    private final View trackView;

    AdOverlayController(View view, AdOverlayListener adoverlaylistener, ImageOperations imageoperations, Context context1, DeviceHelper devicehelper, EventBus eventbus, PlayQueueManager playqueuemanager, 
            AccountOperations accountoperations)
    {
        trackView = view;
        listener = adoverlaylistener;
        imageOperations = imageoperations;
        context = context1;
        deviceHelper = devicehelper;
        eventBus = eventbus;
        playQueueManager = playqueuemanager;
        accountOperations = accountoperations;
    }

    private void onAdVisible()
    {
        if (presenter != null)
        {
            presenter.onAdVisible(playQueueManager.getCurrentPlayQueueItem(), data, playQueueManager.getCurrentTrackSourceInfo());
            listener.onAdOverlayShown(presenter.isFullScreen());
        }
    }

    private void resetMetaData()
    {
        if (data != null)
        {
            data.put(AdOverlayProperty.META_AD_COMPLETED, Boolean.valueOf(false));
            data.put(AdOverlayProperty.META_AD_CLICKED, Boolean.valueOf(false));
        }
    }

    private void sendTrackingEvent()
    {
        Object obj = playQueueManager.getCurrentPlayQueueItem();
        obj = AdOverlayTrackingEvent.forClick(((PlayQueueItem) (obj)).getMetaData(), ((PlayQueueItem) (obj)).getUrn(), accountOperations.getLoggedInUserUrn(), playQueueManager.getCurrentTrackSourceInfo());
        eventBus.publish(EventQueue.TRACKING, obj);
    }

    private void setAdNotVisible()
    {
        if (presenter != null)
        {
            presenter.onAdNotVisible();
        }
    }

    private void setOverlayDismissed()
    {
        if (data != null)
        {
            data.put(AdOverlayProperty.META_AD_DISMISSED, Boolean.valueOf(true));
        }
    }

    private boolean shouldDisplayAdOverlay(boolean flag)
    {
        boolean flag1 = true;
        if (data == null)
        {
            return false;
        }
        if (deviceHelper.getCurrentOrientation() != 1)
        {
            flag1 = false;
        }
        return presenter.shouldDisplayOverlay(data, isExpanded, flag1, flag);
    }

    private void startActivity(Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.setFlags(0x10000000);
        context.startActivity(uri);
    }

    public void clear()
    {
        resetMetaData();
        if (presenter != null)
        {
            setOverlayDismissed();
            boolean flag = presenter.isFullScreen();
            presenter.clear();
            presenter = null;
            data = null;
            listener.onAdOverlayHidden(flag);
        }
    }

    public void initialize(PropertySet propertyset)
    {
        data = propertyset;
        presenter = AdOverlayPresenter.create(propertyset, trackView, this, eventBus, context.getResources(), imageOperations);
        setAdNotVisible();
    }

    public boolean isNotVisible()
    {
        return presenter == null || presenter.isNotVisible();
    }

    public boolean isVisibleInFullscreen()
    {
        return !isNotVisible() && presenter.isFullScreen();
    }

    public void onAdImageLoaded()
    {
        onAdVisible();
    }

    public void onCloseButtonClick()
    {
        clear();
    }

    public void onImageClick()
    {
        startActivity((Uri)data.get(AdOverlayProperty.CLICK_THROUGH_URL));
        sendTrackingEvent();
        clear();
    }

    public void setCollapsed()
    {
        isExpanded = false;
    }

    public void setExpanded()
    {
        isExpanded = true;
    }

    public void show()
    {
        show(false);
    }

    public void show(boolean flag)
    {
        if (shouldDisplayAdOverlay(flag))
        {
            presenter.bind(data);
            resetMetaData();
        }
    }
}
