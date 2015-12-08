// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.localytics.android:
//            LocalyticsAmpSession

public class LocalyticsAmpActivity extends FragmentActivity
{

    protected LocalyticsAmpSession mLocalyticsSession;

    public LocalyticsAmpActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mLocalyticsSession = new LocalyticsAmpSession(this);
        mLocalyticsSession.open();
        mLocalyticsSession.handleIntent(getIntent());
        mLocalyticsSession.handleNotificationReceived(getIntent());
        mLocalyticsSession.handlePushReceived(getIntent());
        mLocalyticsSession.upload();
    }

    public void onPause()
    {
        mLocalyticsSession.detach();
        mLocalyticsSession.close();
        mLocalyticsSession.upload();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        mLocalyticsSession.open();
        mLocalyticsSession.handleIntent(getIntent());
        mLocalyticsSession.handleNotificationReceived(getIntent());
        mLocalyticsSession.handlePushReceived(getIntent());
        mLocalyticsSession.upload();
        mLocalyticsSession.attach(this);
    }
}
