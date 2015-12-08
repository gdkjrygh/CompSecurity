// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class SocialFeedFragment extends BaseFragment
{

    private ProgressBar mProgressBar;
    private WebView socialWebView;

    public SocialFeedFragment()
    {
    }

    public WebView getWebView()
    {
        return socialWebView;
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        mProgressBar = (ProgressBar)getFragmentView().findViewById(0x7f0d0497);
        socialWebView = (WebView)getFragmentView().findViewById(0x7f0d002f);
    /* block-local class not found */
    class SocialFeedWebClient {}

        socialWebView.setWebViewClient(new SocialFeedWebClient());
        bundle = socialWebView.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setSupportZoom(false);
        bundle.setBuiltInZoomControls(false);
        bundle.setDomStorageEnabled(true);
        bundle.setLoadWithOverviewMode(true);
        socialWebView.loadUrl(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getTIntSocialFeedUrl());
    }

    protected int intializaLayoutId()
    {
        return 0x7f030105;
    }

    protected void loadContent()
    {
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }

}
