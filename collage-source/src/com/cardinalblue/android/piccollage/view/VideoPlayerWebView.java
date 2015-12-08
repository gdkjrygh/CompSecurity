// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VideoPlayerWebView extends WebView
{

    private WebChromeClient a;
    private WebViewClient b;

    public VideoPlayerWebView(Context context)
    {
        super(context);
        a = new WebChromeClient();
        b = new WebViewClient();
        a();
    }

    public VideoPlayerWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new WebChromeClient();
        b = new WebViewClient();
        a();
    }

    public VideoPlayerWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new WebChromeClient();
        b = new WebViewClient();
        a();
    }

    protected void a()
    {
        setBackgroundColor(0xff000000);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setUseWideViewPort(true);
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        setInitialScale(100);
        setWebViewClient(b);
        setWebChromeClient(a);
    }

    public void b()
    {
        Method method = null;
        Method method1 = android/webkit/WebView.getMethod("onResume", new Class[0]);
        method = method1;
_L2:
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        method.invoke(this, new Object[0]);
        return;
        Object obj;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void c()
    {
        Method method = null;
        Method method1 = android/webkit/WebView.getMethod("onPause", new Class[0]);
        method = method1;
_L2:
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        method.invoke(this, new Object[0]);
        return;
        Object obj;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
