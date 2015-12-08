// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.b.b;

// Referenced classes of package com.jcp.activities:
//            an, bk

public class SameDayPickUpCustomerServiceWebView extends an
{

    private ProgressDialog a;
    protected TextView headerTitle;
    protected WebView mWebView;

    public SameDayPickUpCustomerServiceWebView()
    {
    }

    static ProgressDialog a(SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview)
    {
        return samedaypickupcustomerservicewebview.a;
    }

    static ProgressDialog a(SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview, ProgressDialog progressdialog)
    {
        samedaypickupcustomerservicewebview.a = progressdialog;
        return progressdialog;
    }

    protected String a()
    {
        return "SAMEDAYPICKUPCUSTOMERSERVICEWEBVIEW";
    }

    public void onBackPressed()
    {
        if (mWebView.canGoBack())
        {
            mWebView.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03005c);
        ButterKnife.inject(this);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        mWebView.setVisibility(8);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new bk(this, null));
        if (getIntent().getExtras().getInt("ITEM_OPTION", 1) == 1)
        {
            headerTitle.setText(getResources().getString(0x7f070420));
            mWebView.loadUrl(b.R());
            return;
        } else
        {
            headerTitle.setText(getResources().getString(0x7f0701cf));
            mWebView.loadUrl(b.S());
            return;
        }
    }
}
