// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.settings.NotificationSettingsFragment;
import com.skype.android.app.settings.SettingsActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.skype.android.app.signin:
//            SignOutActivity

public class SignoutEducationActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    AccessibilityUtil accessibilityUtil;
    Analytics analytics;
    TextView beforeYouGoDesc;
    TextView beforeYouGoLabel;
    Button cancelButton;
    LayoutExperience layoutExperience;
    TextView manageNotifications;
    Button signOutButton;
    UserPreferences userPreferences;

    public SignoutEducationActivity()
    {
    }

    private String getDeviceType()
    {
        if (layoutExperience.isMultipane())
        {
            return "tablet";
        } else
        {
            return "phone";
        }
    }

    private void handleAccessibility()
    {
        if (accessibilityUtil.a())
        {
            accessibilityUtil.b(beforeYouGoLabel, 12);
            accessibilityUtil.b(beforeYouGoDesc, 12);
            accessibilityUtil.b(manageNotifications, 12);
            accessibilityUtil.b(cancelButton, 12);
            accessibilityUtil.b(signOutButton, 12);
        }
    }

    private void reportAnalytics(AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.e, getDeviceType());
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    private void reportAnalytics(String s, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.l, s);
        analyticsparametercontainer.a(AnalyticsParameter.e, getDeviceType());
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        reportAnalytics("back_button", AnalyticsEvent.cI);
        userPreferences.setSignoutEducatonScreenCount(2);
        setResult(0);
        finish();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131756324: 
        case 2131756325: 
        default:
            return;

        case 2131756326: 
            reportAnalytics("manage_notifications_link", AnalyticsEvent.cI);
            view = new Intent(this, com/skype/android/app/settings/SettingsActivity);
            view.putExtra("android.intent.extra.TITLE", 0x7f0802f0);
            view.putExtra("fragmentClass", com/skype/android/app/settings/NotificationSettingsFragment);
            startActivity(view);
            return;

        case 2131756322: 
            reportAnalytics("cancel_button", AnalyticsEvent.cI);
            userPreferences.setSignoutEducatonScreenCount(2);
            finish();
            return;

        case 2131756323: 
            reportAnalytics("signout_button", AnalyticsEvent.cI);
            view = new Intent(this, com/skype/android/app/signin/SignOutActivity);
            view.setFlags(32768);
            startActivity(view);
            finish();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        ViewUtil.a(this, new View[] {
            cancelButton, signOutButton, beforeYouGoDesc, beforeYouGoLabel, manageNotifications
        });
        reportAnalytics(AnalyticsEvent.cH);
        handleAccessibility();
    }
}
