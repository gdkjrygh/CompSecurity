// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.net.Uri;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.AnalyticsUtil;
import org.androidannotations.api.c.d;

// Referenced classes of package com.dominos.activities:
//            LandingActivity

class ertActionCallback extends com.dominos.utils.ionAlertActionCallback
{

    final LandingActivity this$0;

    public void onNegativeButtonClicked()
    {
        prefs.firstTimePebbleDetected().b(Boolean.valueOf(false));
        mAnalyticsUtil.postDownloadPebbleAppDecline();
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        mAnalyticsUtil.postDownloadPebbleAppAccept();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("pebble://appstore/5425b1b2f8ab4100cb0000e1"));
        startActivity(intent);
    }

    ominosPrefs_()
    {
        this$0 = LandingActivity.this;
        super();
    }
}
