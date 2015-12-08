// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflineLikesDialog;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;
import rx.a.b.a;
import rx.b;

class LikesMenuPresenter
{
    private final class UpdatePopupMenuOptionsSubscriber extends DefaultSubscriber
    {

        private final Menu menu;
        final LikesMenuPresenter this$0;

        private void showOfflineDownloadOption(Menu menu1)
        {
            menu1.findItem(0x7f0f02b7).setVisible(true);
            menu1.findItem(0x7f0f02b8).setVisible(false);
        }

        private void showOfflineRemovalOption(Menu menu1)
        {
            menu1.findItem(0x7f0f02b7).setVisible(false);
            menu1.findItem(0x7f0f02b8).setVisible(true);
        }

        public final void onNext(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                showOfflineRemovalOption(menu);
                return;
            } else
            {
                showOfflineDownloadOption(menu);
                return;
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Boolean)obj);
        }

        UpdatePopupMenuOptionsSubscriber(Menu menu1)
        {
            this$0 = LikesMenuPresenter.this;
            super();
            menu = menu1;
        }
    }


    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private final Navigator navigator;
    private final OfflineContentOperations offlineOperations;
    private final ScreenProvider screenProvider;
    private final Provider syncLikesDialogProvider;

    public LikesMenuPresenter(FeatureOperations featureoperations, OfflineContentOperations offlinecontentoperations, Provider provider, ScreenProvider screenprovider, Navigator navigator1, EventBus eventbus)
    {
        featureOperations = featureoperations;
        offlineOperations = offlinecontentoperations;
        syncLikesDialogProvider = provider;
        screenProvider = screenprovider;
        navigator = navigator1;
        eventBus = eventbus;
    }

    private void configureOfflineContentMenu(Menu menu)
    {
        offlineOperations.isOfflineLikedTracksEnabled().observeOn(a.a()).subscribe(new UpdatePopupMenuOptionsSubscriber(menu));
    }

    public boolean onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100002, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem, Context context, FragmentManager fragmentmanager)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131690167: 
            if (featureOperations.isOfflineContentEnabled())
            {
                ((OfflineLikesDialog)syncLikesDialogProvider.get()).show(fragmentmanager);
            } else
            {
                navigator.openUpgrade(context);
                eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forLikesClick());
            }
            return true;

        case 2131690168: 
            DefaultSubscriber.fireAndForget(offlineOperations.disableOfflineLikedTracks());
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromRemoveOfflineLikes(screenProvider.getLastScreenTag()));
            return true;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        if (featureOperations.isOfflineContentOrUpsellEnabled())
        {
            configureOfflineContentMenu(menu);
            if (featureOperations.upsellMidTier())
            {
                eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forLikesImpression());
            }
        }
    }
}
