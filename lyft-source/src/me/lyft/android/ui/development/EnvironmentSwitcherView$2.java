// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.facebook.FacebookSdk;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.s3.ConfigDTO;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.development:
//            EnvironmentSwitcherView

class this._cls0
    implements android.widget.tener
{

    final EnvironmentSwitcherView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Keyboard.hideKeyboard(searchEditText);
        adapterview = (ConfigDTO)EnvironmentSwitcherView.access$300(EnvironmentSwitcherView.this).getItem(i);
        FacebookSdk.setApplicationId(adapterview.getFacebookAppId());
        analyticsService.setAnalyticsUrl(adapterview.getAnalyticsUrl());
        EnvironmentSwitcherView.access$400(EnvironmentSwitcherView.this, adapterview);
        logoutService.logout("environment_switch");
        appFlow.goTo(new me.lyft.android.ui.landing.nScreen("environment_switch"));
        EnvironmentSwitcherView.access$500(EnvironmentSwitcherView.this);
    }

    een()
    {
        this$0 = EnvironmentSwitcherView.this;
        super();
    }
}
