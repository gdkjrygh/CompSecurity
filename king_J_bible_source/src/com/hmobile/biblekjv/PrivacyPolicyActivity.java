// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, HolyBibleApplication

public class PrivacyPolicyActivity extends BaseActivity
{

    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private TextView txtContentText;
    private TextView txtHeader;

    public PrivacyPolicyActivity()
    {
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030018);
        txtContentText = (TextView)findViewById(0x7f0e0089);
        txtHeader = (TextView)findViewById(0x7f0e0087);
        txtContentText.setText(Html.fromHtml(getString(0x7f070089)));
        txtHeader.setText(getString(0x7f070050));
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
        } else
        {
            hideAdView();
        }
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/PrivacyPolicy");
    }
}
