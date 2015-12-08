// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.layouts;

import android.content.Context;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class SurveyView extends LinearLayout
{

    private WebView webView;

    public SurveyView(Context context)
    {
        super(context);
        webView = new WebView(context);
        webView.setTag("fs_unmasked");
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        webView.setLayoutParams(context);
        addView(webView);
    }

    public WebView getWebView()
    {
        return webView;
    }
}
