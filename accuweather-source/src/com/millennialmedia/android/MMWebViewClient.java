// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView, MMLog, MMCommand, HttpRedirection

abstract class MMWebViewClient extends WebViewClient
{
    static abstract class MMWebViewClientListener
    {

        void onPageFinished(String s)
        {
        }

        void onPageStarted(String s)
        {
        }

        MMWebViewClientListener()
        {
        }
    }


    private static final String TAG = "MMWebViewClient";
    private ExecutorService cachedExecutor;
    boolean isLastMMCommandResize;
    MMWebViewClientListener mmWebViewClientListener;
    HttpRedirection.RedirectionListenerImpl redirectListenerImpl;

    MMWebViewClient(MMWebViewClientListener mmwebviewclientlistener, HttpRedirection.RedirectionListenerImpl redirectionlistenerimpl)
    {
        cachedExecutor = Executors.newCachedThreadPool();
        mmWebViewClientListener = mmwebviewclientlistener;
        redirectListenerImpl = redirectionlistenerimpl;
    }

    public void onPageFinished(WebView webview, String s)
    {
        MMWebView mmwebview = (MMWebView)webview;
        if (!mmwebview.isOriginalUrl(s))
        {
            mmWebViewClientListener.onPageFinished(s);
            mmwebview.setAdProperties();
            setMraidState(mmwebview);
            MMLog.d("MMWebViewClient", (new StringBuilder()).append("onPageFinished webview: ").append(mmwebview.toString()).append("url is ").append(s).toString());
        }
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        MMLog.d("MMWebViewClient", String.format("onPageStarted: %s", new Object[] {
            s
        }));
        mmWebViewClientListener.onPageStarted(s);
        MMWebView mmwebview = (MMWebView)webview;
        mmwebview.mraidState = "loading";
        mmwebview.requiresPreAdSizeFix = false;
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        MMLog.e("MMWebViewClient", String.format("Error: %s %s %s", new Object[] {
            Integer.valueOf(i), s, s1
        }));
    }

    abstract void setMraidState(MMWebView mmwebview);

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        MMWebView mmwebview;
label0:
        {
            mmwebview = (MMWebView)webview;
            if (!mmwebview.isOriginalUrl(s))
            {
                MMLog.v("MMWebViewClient", (new StringBuilder()).append("@@@@@@@@@@SHOULDOVERRIDELOADING@@@@@@@@@@@@@ Url is ").append(s).append(" for ").append(webview).toString());
                if (!s.substring(0, 6).equalsIgnoreCase("mmsdk:"))
                {
                    break label0;
                }
                MMLog.v("MMWebViewClient", (new StringBuilder()).append("Running JS bridge command: ").append(s).toString());
                webview = new MMCommand((MMWebView)webview, s);
                isLastMMCommandResize = webview.isResizeCommand();
                cachedExecutor.execute(webview);
            }
            return true;
        }
        if (redirectListenerImpl.isExpandingToUrl())
        {
            return false;
        } else
        {
            redirectListenerImpl.url = s;
            redirectListenerImpl.weakContext = new WeakReference(webview.getContext());
            redirectListenerImpl.creatorAdImplInternalId = mmwebview.creatorAdImplId;
            HttpRedirection.startActivityFromUri(redirectListenerImpl);
            return true;
        }
    }
}
