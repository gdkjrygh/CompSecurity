// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Appboy;
import com.appboy.AppboyUser;
import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.managers.ImageLoader;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.infrastructure.appboy:
//            IAppboyService

public class AppboyService extends ActivityService
    implements IInAppMessageManagerListener, IAppboyService
{

    boolean appboyRefreshData;
    IInAppMessage cachedMessage;
    DialogFlow dialogFlow;
    IGcmIdService gcmIdService;
    ImageLoader imageLoader;
    InAppNotificationService inAppNotificationService;
    boolean inappNoteDisplayEnabled;
    private Action1 onUserUpdate;
    IUserProvider userProvider;
    private Subscription userSubscription;

    public AppboyService(IUserProvider iuserprovider, IGcmIdService igcmidservice, DialogFlow dialogflow, ImageLoader imageloader, InAppNotificationService inappnotificationservice)
    {
        inappNoteDisplayEnabled = false;
        userSubscription = Subscriptions.empty();
        onUserUpdate = new Action1() {

            final AppboyService this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                updateUserId(user);
                updateGcmId();
            }

            
            {
                this$0 = AppboyService.this;
                super();
            }
        };
        userProvider = iuserprovider;
        gcmIdService = igcmidservice;
        dialogFlow = dialogflow;
        imageLoader = imageloader;
        inAppNotificationService = inappnotificationservice;
    }

    private boolean cacheImageForInAppMessage(IInAppMessage iinappmessage)
    {
        String s = iinappmessage.getImageUrl();
        if (!Strings.isNullOrBlank(s))
        {
            imageLoader.load(s).fetch();
            cachedMessage = iinappmessage;
        }
        if (inappNoteDisplayEnabled)
        {
            displayCachedMessage();
            return true;
        } else
        {
            return false;
        }
    }

    private void displayCachedMessage()
    {
        me.lyft.android.ui.AppboyScreens.AppBoyInappDialog appboyinappdialog = new me.lyft.android.ui.AppboyScreens.AppBoyInappDialog(cachedMessage);
        dialogFlow.show(appboyinappdialog);
        cachedMessage = null;
    }

    private void startAppboySession(Activity activity)
    {
        if (Appboy.getInstance(activity).openSession(activity))
        {
            appboyRefreshData = true;
        }
        updateUserId(userProvider.getUser());
        updateGcmId();
    }

    private void updateGcmId()
    {
        String s = gcmIdService.getRegistrationId();
        if (s != null && !s.equals(Appboy.getInstance(getCurrentActivity()).getAppboyPushMessageRegistrationId()))
        {
            Appboy.getInstance(getCurrentActivity()).registerAppboyPushMessages(s);
        }
    }

    private void updateUserId(User user)
    {
        user = user.getId();
        String s = Appboy.getInstance(getCurrentActivity()).getCurrentUser().getUserId();
        if (!Strings.isNullOrEmpty(user) && !user.equals(s))
        {
            Appboy.getInstance(getCurrentActivity()).changeUser(user);
        }
    }

    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iinappmessage)
    {
        if (!inappNoteDisplayEnabled && !inAppNotificationService.didShowNotificationForSession())
        {
            return InAppMessageOperation.DISPLAY_LATER;
        }
        if (cachedMessage != null)
        {
            displayCachedMessage();
            return InAppMessageOperation.DISCARD;
        }
        cachedMessage = iinappmessage;
        if (cacheImageForInAppMessage(cachedMessage))
        {
            return InAppMessageOperation.DISCARD;
        } else
        {
            return InAppMessageOperation.DISPLAY_LATER;
        }
    }

    public void disableInappNoteDisplay()
    {
        inappNoteDisplayEnabled = false;
    }

    public void enableInappNoteDisplay()
    {
        inappNoteDisplayEnabled = true;
        AppboyInAppMessageManager.getInstance().requestDisplayInAppMessage();
    }

    public void onActivityPaused(Activity activity)
    {
        userSubscription.unsubscribe();
        super.onActivityPaused(activity);
        AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        userSubscription = userProvider.observeUserUpdates().subscribe(onUserUpdate);
        AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
        AppboyInAppMessageManager.getInstance().setCustomInAppMessageManagerListener(this);
        if (appboyRefreshData)
        {
            Appboy.getInstance(activity).requestInAppMessageRefresh();
        }
        if (activity.getIntent().hasExtra("cid"))
        {
            String s = activity.getIntent().getExtras().getString("cid");
            Appboy.getInstance(activity).logPushNotificationOpened(s);
            UiAnalytics.trackTap(UiElement.APPBOY_PUSH_NOTIFICATION, Category.APPBOY, s);
        }
    }

    public void onActivityStarted(Activity activity)
    {
        super.onActivityStarted(activity);
        startAppboySession(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        Appboy.getInstance(activity).closeSession(activity);
        super.onActivityStopped(activity);
    }

    public boolean onInAppMessageButtonClicked(MessageButton messagebutton, InAppMessageCloser inappmessagecloser)
    {
        return false;
    }

    public boolean onInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
    {
        return false;
    }

    public void onInAppMessageDismissed(IInAppMessage iinappmessage)
    {
    }

    public boolean onInAppMessageReceived(IInAppMessage iinappmessage)
    {
        return false;
    }


}
