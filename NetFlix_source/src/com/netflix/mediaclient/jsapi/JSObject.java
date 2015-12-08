// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.jsapi;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.netflix.mediaclient.util.ThreadUtils;

public abstract class JSObject
{

    protected Context context;
    protected Handler mainHandler;
    protected WebView webview;

    protected JSObject(Context context1, WebView webview1)
    {
        ThreadUtils.assertOnMain();
        if (context1 == null || webview1 == null)
        {
            throw new IllegalArgumentException("Can not create a JSObject a null context or webview.");
        } else
        {
            mainHandler = new Handler();
            context = context1;
            webview = webview1;
            webview1.addJavascriptInterface(this, getInterfaceName());
            return;
        }
    }

    public abstract String getInterfaceName();

    protected void injectJavaScript(final String javascriptToInject)
    {
        if (javascriptToInject == null)
        {
            return;
        } else
        {
            mainHandler.post(new Runnable() {

                final JSObject this$0;
                final String val$javascriptToInject;

                public void run()
                {
                    webview.loadUrl(javascriptToInject);
                }

            
            {
                this$0 = JSObject.this;
                javascriptToInject = s;
                super();
            }
            });
            return;
        }
    }

    public void release()
    {
        webview.removeJavascriptInterface(getInterfaceName());
        webview = null;
        context = null;
    }
}
