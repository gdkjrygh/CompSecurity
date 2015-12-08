// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.main.ScrollContent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineSettingsOperations;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.android.users.UserRepository;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.you:
//            YouView, YouFragment, YouViewFactory

public class YouPresenter extends DefaultSupportFragmentLightCycle
    implements ScrollContent, YouView.Listener
{
    private class YouSubscriber extends DefaultSubscriber
    {

        final YouPresenter this$0;

        public void onError(Throwable throwable)
        {
            youOpt = Optional.absent();
        }

        public void onNext(PropertySet propertyset)
        {
            youOpt = Optional.of(propertyset);
            bindUserIfPresent();
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private YouSubscriber()
        {
            this$0 = YouPresenter.this;
            super();
        }

        YouSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final AccountOperations accountOperations;
    private final ApplicationProperties appProperties;
    private final BugReporter bugReporter;
    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private final ImageOperations imageOperations;
    private final Navigator navigator;
    private final OfflineSettingsOperations offlineSettingsOperations;
    private final Resources resources;
    private final UserRepository userRepository;
    private Optional youOpt;
    private final YouViewFactory youViewFactory;
    private Optional youViewOpt;

    public YouPresenter(YouViewFactory youviewfactory, UserRepository userrepository, AccountOperations accountoperations, ImageOperations imageoperations, Resources resources1, EventBus eventbus, FeatureOperations featureoperations, 
            OfflineSettingsOperations offlinesettingsoperations, Navigator navigator1, BugReporter bugreporter, ApplicationProperties applicationproperties)
    {
        youViewOpt = Optional.absent();
        youOpt = Optional.absent();
        youViewFactory = youviewfactory;
        userRepository = userrepository;
        accountOperations = accountoperations;
        imageOperations = imageoperations;
        resources = resources1;
        eventBus = eventbus;
        featureOperations = featureoperations;
        offlineSettingsOperations = offlinesettingsoperations;
        navigator = navigator1;
        bugReporter = bugreporter;
        appProperties = applicationproperties;
    }

    private void bindUser(YouView youview, PropertySet propertyset)
    {
        youview.setUsername((String)propertyset.get(UserProperty.USERNAME));
        imageOperations.displayCircularWithPlaceholder((Urn)propertyset.get(UserProperty.URN), ApiImageSize.getFullImageSize(resources), youview.getProfileImageView());
    }

    private void bindUserIfPresent()
    {
        if (youViewOpt.isPresent() && youOpt.isPresent())
        {
            bindUser((YouView)youViewOpt.get(), (PropertySet)youOpt.get());
        }
    }

    private void setupFeedback(YouView youview)
    {
        if (appProperties.shouldAllowFeedback())
        {
            youview.showReportBug();
        }
    }

    private void setupOfflineSync(YouView youview)
    {
        if (featureOperations.isOfflineContentEnabled() || offlineSettingsOperations.hasOfflineContent())
        {
            youview.showOfflineSettings();
            return;
        }
        if (featureOperations.upsellMidTier())
        {
            youview.showOfflineSettings();
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forSettingsImpression());
            return;
        } else
        {
            youview.hideOfflineSettings();
            return;
        }
    }

    public void onActivitiesClicked(View view)
    {
        navigator.openActivities(view.getContext());
    }

    public void onBasicSettingsClicked(View view)
    {
        navigator.openSettings(view.getContext());
    }

    public volatile void onCreate(Fragment fragment, Bundle bundle)
    {
        onCreate((YouFragment)fragment, bundle);
    }

    public void onCreate(YouFragment youfragment, Bundle bundle)
    {
        super.onCreate(youfragment, bundle);
        userRepository.userInfo(accountOperations.getLoggedInUserUrn()).observeOn(a.a()).subscribe(new YouSubscriber(null));
    }

    public volatile void onDestroyView(Fragment fragment)
    {
        onDestroyView((YouFragment)fragment);
    }

    public void onDestroyView(YouFragment youfragment)
    {
        if (youViewOpt.isPresent())
        {
            ((YouView)youViewOpt.get()).unbind();
        }
        super.onDestroyView(youfragment);
    }

    public void onExploreClicked(View view)
    {
        navigator.openExplore(view.getContext(), Screen.YOU);
    }

    public void onHelpCenterClicked(View view)
    {
        navigator.openHelpCenter(view.getContext());
    }

    public void onLegalClicked(View view)
    {
        navigator.openLegal(view.getContext());
    }

    public void onNotificationSettingsClicked(View view)
    {
        navigator.openNotificationSettings(view.getContext());
    }

    public void onOfflineSettingsClicked(View view)
    {
        navigator.openOfflineSettings(view.getContext());
        if (featureOperations.upsellMidTier())
        {
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forSettingsClick());
        }
    }

    public void onProfileClicked(View view)
    {
        navigator.openProfile(view.getContext(), accountOperations.getLoggedInUserUrn());
    }

    public void onRecordClicked(View view)
    {
        navigator.openRecord(view.getContext(), Screen.YOU);
    }

    public void onReportBugClicked(View view)
    {
        bugReporter.showGeneralFeedbackDialog(view.getContext());
    }

    public void onSignOutClicked(final View view)
    {
        android.support.v7.app.AlertDialog.Builder builder = (new android.support.v7.app.AlertDialog.Builder(view.getContext())).setTitle(0x7f0701eb);
        int i;
        if (offlineSettingsOperations.hasOfflineContent())
        {
            i = 0x7f07030e;
        } else
        {
            i = 0x7f0701ea;
        }
        builder.setMessage(i).setPositiveButton(0x104000a, new _cls1()).show();
    }

    public volatile void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        onViewCreated((YouFragment)fragment, view, bundle);
    }

    public void onViewCreated(YouFragment youfragment, View view, Bundle bundle)
    {
        super.onViewCreated(youfragment, view, bundle);
        youfragment = youViewFactory.create(view, this);
        youViewOpt = Optional.of(youfragment);
        setupOfflineSync(youfragment);
        setupFeedback(youfragment);
        bindUserIfPresent();
    }

    public void resetScroll()
    {
        if (youViewOpt.isPresent())
        {
            ((YouView)youViewOpt.get()).resetScroll();
        }
    }


/*
    static Optional access$102(YouPresenter youpresenter, Optional optional)
    {
        youpresenter.youOpt = optional;
        return optional;
    }

*/


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final YouPresenter this$0;
        final View val$view;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            LogoutActivity.start(view.getContext());
        }

        _cls1()
        {
            this$0 = YouPresenter.this;
            view = view1;
            super();
        }
    }

}
