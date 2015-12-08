// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.util.VersionCode;
import com.mopub.common.util.Views;
import com.mopub.mobileads.util.WebViews;

public class BaseWebView extends WebView
{

    private static boolean b = false;
    protected boolean a;

    public BaseWebView(Context context)
    {
        super(context.getApplicationContext());
        a(false);
        WebViews.setDisableJSChromeClient(this);
        if (!b)
        {
            context = getContext();
            if (android.os.Build.VERSION.SDK_INT == 19)
            {
                WebView webview = new WebView(context.getApplicationContext());
                webview.setBackgroundColor(0);
                webview.loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
                android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
                layoutparams.width = 1;
                layoutparams.height = 1;
                layoutparams.type = 2005;
                layoutparams.flags = 0x1000018;
                layoutparams.format = -2;
                layoutparams.gravity = 0x800033;
                ((WindowManager)context.getSystemService("window")).addView(webview, layoutparams);
            }
            b = true;
        }
    }

    protected final void a(boolean flag)
    {
        if (VersionCode.currentApiLevel().isAtLeast(VersionCode.JELLY_BEAN_MR2))
        {
            return;
        }
        if (flag)
        {
            getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
            return;
        } else
        {
            getSettings().setPluginState(android.webkit.WebSettings.PluginState.OFF);
            return;
        }
    }

    public void destroy()
    {
        a = true;
        Views.removeFromParent(this);
        removeAllViews();
        try
        {
            super.destroy();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            return;
        }
    }

}
