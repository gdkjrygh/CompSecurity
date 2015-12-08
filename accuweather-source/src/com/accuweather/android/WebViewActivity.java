// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

public class WebViewActivity extends SherlockFragmentActivity
{

    private static final String DEBUG_TAG = "WebViewContainer";
    private String mTitleString;
    private String mUrl;
    private WebView mWebView;

    public WebViewActivity()
    {
    }

    private Data getData()
    {
        return Data.getInstance(getApplication());
    }

    private void init()
    {
        mWebView = (WebView)findViewById(R.id.settings_webview);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(mUrl);
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getActionBarBackground());
            actionbar.setTitle(mTitleString);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(true);
        }
    }

    protected Drawable getActionBarBackground()
    {
        return getResources().getDrawable(R.drawable.action_bar_gradient);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.settings_wv);
        bundle = getIntent().getExtras();
        mTitleString = bundle.getString("title");
        mUrl = bundle.getString("url");
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            Logger.i(this);
            getData().clearTaskQueue();
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        init();
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            initActionBar();
        }
    }

    public void onStop()
    {
        super.onStop();
    }
}
