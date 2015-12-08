// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.localytics.android:
//            LocalyticsSession

public class LocalyticsActivity extends Activity
{

    protected LocalyticsSession mLocalyticsSession;

    public LocalyticsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mLocalyticsSession = new LocalyticsSession(this);
        mLocalyticsSession.open();
        mLocalyticsSession.upload();
    }

    public void onPause()
    {
        mLocalyticsSession.close();
        mLocalyticsSession.upload();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        mLocalyticsSession.open();
        mLocalyticsSession.upload();
    }
}
