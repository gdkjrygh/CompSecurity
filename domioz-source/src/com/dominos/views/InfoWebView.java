// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class InfoWebView extends WebView
{

    public InfoWebView(Context context)
    {
        super(context);
        initializeInfoWebView();
    }

    public InfoWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initializeInfoWebView();
    }

    public InfoWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initializeInfoWebView();
    }

    private void initializeInfoWebView()
    {
        getSettings().setJavaScriptEnabled(true);
    }
}
