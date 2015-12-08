// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.layouts.InviteView;
import com.fsr.tracker.layouts.InviteViewParams;
import com.fsr.tracker.layouts.SurveyInviteClickHandler;
import com.fsr.tracker.layouts.SurveyInviteView;

// Referenced classes of package com.fsr.tracker.app:
//            TrackingContext

public class SurveyInviteActivity extends Activity
    implements SurveyInviteClickHandler
{

    protected Configuration configuration;
    protected ConnectivityManager connectivityManager;
    protected InviteView inviteView;
    protected MeasureConfiguration measureConfiguration;
    protected StringsProvider stringsProvider;

    public SurveyInviteActivity()
    {
    }

    protected SurveyInviteView getInviteView(Configuration configuration1, SurveyInviteClickHandler surveyinviteclickhandler)
    {
        return new SurveyInviteView(this, new InviteViewParams(getWindowManager().getDefaultDisplay(), getResources().getConfiguration()), configuration1.getCustomLogoPath(), this, stringsProvider);
    }

    public void onAccept()
    {
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable())
        {
            TrackingContext.Instance().acceptInvitation();
            finish();
            return;
        } else
        {
            TrackingContext.Instance().onNetworkDisconnected(this);
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        TrackingContext.Instance().declineInvitation();
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration1)
    {
        super.onConfigurationChanged(configuration1);
        inviteView.onOrientationChanged(configuration1.orientation);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        connectivityManager = (ConnectivityManager)getSystemService("connectivity");
        measureConfiguration = (MeasureConfiguration)getIntent().getSerializableExtra("MEASURE_CONFIG");
        configuration = (Configuration)getIntent().getSerializableExtra("CONTEXT_CONFIG");
        TrackingContext.start(getApplication(), configuration);
        stringsProvider = TrackingContext.Instance().getStringsProvider();
        inviteView = getInviteView(configuration, this);
        setContentView(inviteView);
        onCreated();
        getWindow().setSoftInputMode(32);
    }

    public void onCreated()
    {
    }

    public void onDecline()
    {
        TrackingContext.Instance().declineInvitation();
        finish();
    }
}
