// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;

public class LinkActivity extends Activity
{
    private class SimpleWebViewClient extends WebViewClient
    {

        final LinkActivity this$0;

        public boolean shouldOverrideUrlLoading(WebView webview1, String s)
        {
            if (s.equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getTermsandConditionUrl()))
            {
                mPageTitle = getResources().getString(0x7f0804fd);
                webview1.loadUrl(s);
                setUpActionBar();
                return true;
            }
            if (s.equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getFaqUrl()))
            {
                mPageTitle = getResources().getString(0x7f080200);
                webview1.loadUrl(s);
                setUpActionBar();
                return true;
            } else
            {
                hideActionBar();
                webview1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(webview1);
                return true;
            }
        }

        private SimpleWebViewClient()
        {
            this$0 = LinkActivity.this;
            super();
        }

    }


    private String mPageTitle;
    private WebView webview;

    public LinkActivity()
    {
    }

    protected void hideActionBar()
    {
        getActionBar().hide();
    }

    public void onBackPressed()
    {
        if (webview.copyBackForwardList().getCurrentIndex() <= 0) goto _L2; else goto _L1
_L1:
        webview.goBack();
        if (!mPageTitle.equalsIgnoreCase(getResources().getString(0x7f080200))) goto _L4; else goto _L3
_L3:
        mPageTitle = getResources().getString(0x7f08051a);
_L5:
        setUpActionBar();
        return;
_L4:
        if (mPageTitle.equalsIgnoreCase(getResources().getString(0x7f08051a)))
        {
            mPageTitle = getResources().getString(0x7f080200);
        }
        if (true) goto _L5; else goto _L2
_L2:
        super.onBackPressed();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030010);
        mPageTitle = getIntent().getStringExtra("pagetitle");
        setUpActionBar();
        ((ImageView)findViewById(0x7f0d005f)).setVisibility(8);
        webview = (WebView)findViewById(0x7f0d0060);
        webview.loadUrl(getIntent().getStringExtra("linkurl"));
        bundle = webview.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setSupportZoom(true);
        bundle.setBuiltInZoomControls(false);
        bundle.setDomStorageEnabled(true);
        bundle.setLoadWithOverviewMode(true);
        bundle.setTextZoom(100);
        webview.setWebViewClient(new SimpleWebViewClient());
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayShowHomeEnabled(false);
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setDisplayShowTitleEnabled(false);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.setHomeButtonEnabled(false);
            actionbar.setIcon(0x106000d);
            actionbar.setDisplayShowTitleEnabled(true);
            actionbar.setTitle(mPageTitle);
            actionbar.show();
        }
    }


/*
    static String access$102(LinkActivity linkactivity, String s)
    {
        linkactivity.mPageTitle = s;
        return s;
    }

*/
}
