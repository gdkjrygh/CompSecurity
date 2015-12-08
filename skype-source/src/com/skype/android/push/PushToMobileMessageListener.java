// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.skype.Account;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AttributeContainer;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.inject.AccountProvider;
import com.skype.android.wakeup.ForegroundState;
import java.util.EnumSet;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            PushMessageListener, PushToMobileMessage, DisplayResult, PushMessage

public class PushToMobileMessageListener
    implements PushMessageListener
{

    private static final int NOTIFICATION_ID = 48;
    private static Logger log = Logger.getLogger("PushToMobileMessageListener");
    private AccountProvider accountProvider;
    private Analytics analytics;
    private Context context;
    private ForegroundState foregroundState;
    private Navigation navigation;
    private NotificationManager notificationManager;
    private Provider userPrefsProvider;

    public PushToMobileMessageListener(AccountProvider accountprovider, Context context1, Provider provider, ForegroundState foregroundstate, NotificationManager notificationmanager, BackgroundNavigation backgroundnavigation, Analytics analytics1)
    {
        accountProvider = accountprovider;
        context = context1;
        navigation = backgroundnavigation;
        userPrefsProvider = provider;
        foregroundState = foregroundstate;
        notificationManager = notificationmanager;
        analytics = analytics1;
    }

    private boolean canShowNotification()
    {
        return !foregroundState.c() && getUserPreferences().isNewMessageNotificationEnabled();
    }

    private void constructSingleNotification(String s)
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        String s1;
        String s2;
        char c;
        if (getUserPreferences().isNotificationLightEnabled())
        {
            c = '\u05DC';
        } else
        {
            c = '\0';
        }
        d.b(c, c);
        s1 = context.getString(0x7f080309);
        s2 = context.getString(0x7f080308);
        d.a(s1);
        d.b((new StringBuilder()).append(s2).append(s).toString());
        d.a(0x7f0201c1);
        d.g = BitmapFactory.decodeResource(context.getResources(), 0x7f0201c1);
        d.a(getContentIntent(s));
        d.a(Uri.parse((new StringBuilder("android.resource://")).append(context.getPackageName()).append("/2131165194").toString()));
        d.c(true);
        notificationManager.cancel(48);
        notificationManager.notify(48, d.e());
    }

    private PendingIntent getContentIntent(String s)
    {
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.addFlags(0x10000000);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("com.skype.identitiy", s);
        intent.setData(Uri.parse((new StringBuilder("tel:")).append(s).toString()));
        int i;
        if (s != null)
        {
            i = s.hashCode();
        } else
        {
            i = 0;
        }
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    private UserPreferences getUserPreferences()
    {
        return (UserPreferences)userPrefsProvider.get();
    }

    public AttributeContainer getPushMessagePayloadAttributes(PushToMobileMessage pushtomobilemessage)
    {
        AttributeContainer attributecontainer = new AttributeContainer();
        attributecontainer.put(1, pushtomobilemessage.getPhoneNumber());
        attributecontainer.put(2, pushtomobilemessage.getPayload());
        attributecontainer.put(3, pushtomobilemessage.getSkypeId());
        return attributecontainer;
    }

    public EnumSet getSupportedEventTypes()
    {
        return PushMessageFactory.a.C2C.supportedTypes;
    }

    public void onPushMessage(PushMessage pushmessage)
    {
        Account account;
        AttributeContainer attributecontainer;
        String s;
        account = accountProvider.get();
        boolean flag;
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN || account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pushmessage = (PushToMobileMessage)pushmessage;
        attributecontainer = getPushMessagePayloadAttributes(pushmessage);
        analytics.a(AnalyticsEvent.cZ, attributecontainer);
        if (!flag || !pushmessage.getSkypeId().equals(account.getSkypenameProp())) goto _L2; else goto _L1
_L1:
        s = pushmessage.getPhoneNumber();
        log.info((new StringBuilder("handlePhoneMessage: ")).append(s).toString());
        if (!canShowNotification()) goto _L4; else goto _L3
_L3:
        log.info("handlePhoneMessage: build notification");
        constructSingleNotification(s);
        analytics.a(AnalyticsEvent.db, attributecontainer);
_L5:
        pushmessage.onMessageConsumed(DisplayResult.SUCCESS);
        return;
_L4:
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            log.info("handlePhoneMessage: show dialer UI");
            navigation.dialWithNumber(s);
            analytics.a(AnalyticsEvent.da, attributecontainer);
        }
        if (true) goto _L5; else goto _L2
_L2:
        log.info("ignoring incoming push message since not logged in");
        analytics.a(AnalyticsEvent.dc, attributecontainer);
        pushmessage.onMessageConsumed(DisplayResult.DIFFERENT_USER);
        return;
    }

}
