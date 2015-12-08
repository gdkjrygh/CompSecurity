// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AttributeContainer;
import com.skype.android.analytics.StatsType;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.AccountUtil;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class f
    implements AccountTask
{

    private static final Logger log = Logger.getLogger("ReportAccountStats");
    private Analytics analytics;
    private Context context;
    private SkyLib lib;
    private Provider userPrefsProvider;

    public f(Context context1, Analytics analytics1, Provider provider, SkyLib skylib)
    {
        analytics = analytics1;
        context = context1;
        userPrefsProvider = provider;
        lib = skylib;
    }

    private void reportDeviceInfo()
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        float f1 = (float)displaymetrics.densityDpi / 160F;
        boolean flag = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("keyboard=0&mouse=0&touch=");
        Object obj;
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("&screenwidth=");
        stringbuilder.append(displaymetrics.widthPixels);
        stringbuilder.append("&screenheight=");
        stringbuilder.append(displaymetrics.heightPixels);
        stringbuilder.append("&screenwidthDp=");
        stringbuilder.append((float)displaymetrics.widthPixels / f1);
        stringbuilder.append("&screenheightDp=");
        stringbuilder.append((float)displaymetrics.heightPixels / f1);
        stringbuilder.append("&sdk_version=");
        stringbuilder.append(android.os.Build.VERSION.SDK_INT);
        obj = new AttributeContainer();
        ((AttributeContainer) (obj)).put(1, Integer.valueOf(1));
        ((AttributeContainer) (obj)).put(2, "");
        ((AttributeContainer) (obj)).put(3, stringbuilder.toString());
        ((AttributeContainer) (obj)).put(4, "Android");
        ((AttributeContainer) (obj)).put(5, android.os.Build.VERSION.RELEASE);
        ((AttributeContainer) (obj)).put(6, Build.MANUFACTURER);
        ((AttributeContainer) (obj)).put(7, Build.MODEL);
        lib.reportStatsEvent(StatsType.b.a(), ((AttributeContainer) (obj)).serialize(), "");
    }

    public final void onLogin(Account account)
    {
        reportDeviceInfo();
        int i = lib.getConversationList(com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS).m_conversationObjectIDList.length;
        analytics.a(AnalyticsEvent.c, i);
        analytics.a(AnalyticsEvent.X, Analytics.a(account.getNrofAuthedBuddiesProp()));
        if (AccountUtil.c(account))
        {
            analytics.c(AnalyticsEvent.Z);
        }
        analytics.a(AnalyticsEvent.aj, Locale.getDefault().getDisplayName());
        ((UserPreferences)userPrefsProvider.get()).setLoginTimestamp(System.currentTimeMillis());
    }

    public final void onLogout(Account account)
    {
        account = (UserPreferences)userPrefsProvider.get();
        long l = account.getLoginTimestamp();
        if (l != 0L)
        {
            l = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - l);
            analytics.a(AnalyticsEvent.av, Analytics.d(l));
            account.setLoginTimestamp(0L);
            return;
        } else
        {
            log.warning("login time was not set (somehow). don't report the event");
            return;
        }
    }

}
