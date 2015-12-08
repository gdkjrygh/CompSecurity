// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public abstract class WebDialogFragment extends DialogFragment
{

    protected static final String ARG_URL = "ARG_URL";
    private WebView mWebView;
    private View mWebViewLayout;

    public WebDialogFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, 0x7f0a0021);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mWebViewLayout = layoutinflater.inflate(0x7f04004b, viewgroup, false);
        layoutinflater = (WebView)mWebViewLayout.findViewById(0x7f0f006f);
        viewgroup = layoutinflater.getSettings();
        viewgroup.setJavaScriptEnabled(true);
        viewgroup.setLoadWithOverviewMode(true);
        viewgroup.setUseWideViewPort(false);
        viewgroup.setBuiltInZoomControls(true);
        layoutinflater.setWebViewClient(new WebViewClient() {

            final WebDialogFragment this$0;

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return onShouldOverrideUrlLoading(webview, s);
            }

            
            {
                this$0 = WebDialogFragment.this;
                super();
            }
        });
        layoutinflater.loadUrl(getArguments().getString("ARG_URL"));
        return mWebViewLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (mWebView != null)
        {
            mWebView.clearHistory();
            mWebView.clearCache(true);
        }
        mWebViewLayout = null;
        mWebView = null;
    }

    public abstract boolean onShouldOverrideUrlLoading(WebView webview, String s);
}
