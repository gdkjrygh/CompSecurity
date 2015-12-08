// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.localytics.android.LocalyticsAmpSession;

public class AboutActivity extends FragmentActivity
{

    private static final String TAG = "AboutActivity";
    private HistoryHereApplication app;
    private LocalyticsAmpSession localyticsSession;
    private TextView versionText;

    public AboutActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030018);
        app = (HistoryHereApplication)getApplication();
        versionText = (TextView)findViewById(0x7f0a0052);
        versionText.setText((new StringBuilder()).append("version ").append(app.currentAppVersionName).toString());
        localyticsSession = new LocalyticsAmpSession(getApplicationContext(), app.getLocalyticsKey());
        localyticsSession.open();
        localyticsSession.tagScreen("HH:About");
        localyticsSession.upload();
    }

    public void onPause()
    {
        if (localyticsSession != null)
        {
            localyticsSession.detach();
            localyticsSession.close();
            localyticsSession.upload();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        localyticsSession.open();
        localyticsSession.upload();
        localyticsSession.attach(this);
    }
}
