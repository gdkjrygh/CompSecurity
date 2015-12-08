// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

public class PWebView extends WebView
{

    public PWebView(Context context)
    {
        this(context, null, 0);
    }

    public PWebView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context.getApplicationContext(), attributeset, i);
    }
}
