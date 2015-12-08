// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;

public class WalletUsageInfoActivity extends Activity
{

    public WalletUsageInfoActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        setUpActionBar();
        if (getCallingActivity() != null && getCallingActivity().getClassName().equalsIgnoreCase(com/kohls/mcommerce/opal/framework/view/activity/HomeActivity.getSimpleName()))
        {
            ((TextView)findViewById(0x7f0d011f)).setVisibility(0);
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("help_bundle")))
        {
            bundle = (WebView)findViewById(0x7f0d00cb);
            bundle.getSettings().setJavaScriptEnabled(true);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                bundle.getSettings().setMixedContentMode(0);
            }
            bundle.loadUrl(getIntent().getStringExtra("help_bundle"));
            findViewById(0x7f0d011f).setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(getIntent().getStringExtra("info_bundle")))
        {
            ((TextView)findViewById(0x7f0d011f)).setText(Html.fromHtml(getResources().getString(0x7f08055e)));
        } else
        {
            ((TextView)findViewById(0x7f0d011f)).setText(Html.fromHtml(getIntent().getStringExtra("info_bundle")));
        }
        findViewById(0x7f0d011f).setVisibility(8);
        ((TextView)findViewById(0x7f0d011f)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }
}
