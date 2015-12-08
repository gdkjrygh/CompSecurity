// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.accounts.AccountPlaybackController;
import com.soundcloud.android.accounts.UserRemovedController;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.analytics.AnalyticsConnector;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.image.ImageOperationsController;
import com.soundcloud.android.playback.notification.PlaybackNotificationController;
import com.soundcloud.android.policies.PolicyUpdateController;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.main:
//            ScActivity, ActivityLifeCyclePublisher, NetworkConnectivityController, ScreenStateProvider

public final class s extends b
    implements a
{

    private b accountOperations;
    private b accountPlaybackController;
    private b actionMenuController;
    private b activityLifeCyclePublisher;
    private b analyticsConnector;
    private b applicationProperties;
    private b castConnectionHelper;
    private b eventBus;
    private b imageOperationsController;
    private b networkConnectivityController;
    private b playbackNotificationController;
    private b policyUpdateController;
    private b screenStateProvider;
    private b supertype;
    private b unauthorisedRequestLightCycle;
    private b userRemovedController;

    public final void attach(l l1)
    {
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        activityLifeCyclePublisher = l1.a("com.soundcloud.android.main.ActivityLifeCyclePublisher", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        networkConnectivityController = l1.a("com.soundcloud.android.main.NetworkConnectivityController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        unauthorisedRequestLightCycle = l1.a("com.soundcloud.android.receiver.UnauthorisedRequestReceiver$LightCycle", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        userRemovedController = l1.a("com.soundcloud.android.accounts.UserRemovedController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        imageOperationsController = l1.a("com.soundcloud.android.image.ImageOperationsController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        accountPlaybackController = l1.a("com.soundcloud.android.accounts.AccountPlaybackController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        screenStateProvider = l1.a("com.soundcloud.android.main.ScreenStateProvider", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        policyUpdateController = l1.a("com.soundcloud.android.policies.PolicyUpdateController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        playbackNotificationController = l1.a("com.soundcloud.android.playback.notification.PlaybackNotificationController", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        actionMenuController = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        analyticsConnector = l1.a("com.soundcloud.android.analytics.AnalyticsConnector", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/main/ScActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleAppCompatActivity", com/soundcloud/android/main/ScActivity, getClass().getClassLoader(), false);
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(castConnectionHelper);
        set1.add(activityLifeCyclePublisher);
        set1.add(networkConnectivityController);
        set1.add(unauthorisedRequestLightCycle);
        set1.add(userRemovedController);
        set1.add(imageOperationsController);
        set1.add(accountPlaybackController);
        set1.add(screenStateProvider);
        set1.add(policyUpdateController);
        set1.add(playbackNotificationController);
        set1.add(actionMenuController);
        set1.add(analyticsConnector);
        set1.add(applicationProperties);
        set1.add(eventBus);
        set1.add(accountOperations);
        set1.add(supertype);
    }

    public final void injectMembers(ScActivity scactivity)
    {
        scactivity.castConnectionHelper = (CastConnectionHelper)castConnectionHelper.get();
        scactivity.activityLifeCyclePublisher = (ActivityLifeCyclePublisher)activityLifeCyclePublisher.get();
        scactivity.networkConnectivityController = (NetworkConnectivityController)networkConnectivityController.get();
        scactivity.unauthorisedRequestLightCycle = (com.soundcloud.android.receiver.r.LightCycle)unauthorisedRequestLightCycle.get();
        scactivity.userRemovedController = (UserRemovedController)userRemovedController.get();
        scactivity.imageOperationsController = (ImageOperationsController)imageOperationsController.get();
        scactivity.accountPlaybackController = (AccountPlaybackController)accountPlaybackController.get();
        scactivity.screenStateProvider = (ScreenStateProvider)screenStateProvider.get();
        scactivity.policyUpdateController = (PolicyUpdateController)policyUpdateController.get();
        scactivity.playbackNotificationController = (PlaybackNotificationController)playbackNotificationController.get();
        scactivity.actionMenuController = (ActionBarHelper)actionMenuController.get();
        scactivity.analyticsConnector = (AnalyticsConnector)analyticsConnector.get();
        scactivity.applicationProperties = (ApplicationProperties)applicationProperties.get();
        scactivity.eventBus = (EventBus)eventBus.get();
        scactivity.accountOperations = (AccountOperations)accountOperations.get();
        supertype.injectMembers(scactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ScActivity)obj);
    }

    public s()
    {
        super(null, "members/com.soundcloud.android.main.ScActivity", false, com/soundcloud/android/main/ScActivity);
    }
}
