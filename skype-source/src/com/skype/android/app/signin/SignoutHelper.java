// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.l;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.settings.UserPreferences;

// Referenced classes of package com.skype.android.app.signin:
//            SignoutEducationActivity, SignOutActivity

public class SignoutHelper
{

    private Analytics analytics;
    private UserPreferences userPreferences;

    public SignoutHelper(Analytics analytics1, UserPreferences userpreferences)
    {
        analytics = analytics1;
        userPreferences = userpreferences;
    }

    private void sendAnalytics(AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.e, "phone");
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    public void performSignout(Activity activity, l l, boolean flag)
    {
        int i = userPreferences.getSignoutEducationScreenCount();
        if (flag && i < 2)
        {
            userPreferences.setSignoutEducatonScreenCount(i + 1);
            l = com/skype/android/app/signin/SignoutEducationActivity;
        } else
        {
            if (i >= 2)
            {
                sendAnalytics(AnalyticsEvent.cJ);
                userPreferences.setSignoutEducatonScreenCount(i + 1);
            }
            l = com/skype/android/app/signin/SignOutActivity;
        }
        l = new Intent(activity, l);
        l.setFlags(32768);
        activity.startActivity(l);
        activity.finish();
    }
}
