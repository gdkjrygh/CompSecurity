// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.richpush.RichPushMessageJavaScript;
import com.urbanairship.richpush.RichPushUser;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

public class RichPushMessageView extends WebView
{

    public RichPushMessageView(Context context)
    {
        super(context);
        configureWebView();
    }

    public RichPushMessageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        configureWebView();
    }

    public RichPushMessageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        configureWebView();
    }

    private RichPushMessageJavaScript createRichPushMessageJavaScript(String s)
    {
        Class class1;
        class1 = RichPushManager.getJsInterface();
        if (class1 == null)
        {
            return null;
        }
        s = (RichPushMessageJavaScript)class1.getConstructor(new Class[] {
            android/view/View, java/lang/String
        }).newInstance(new Object[] {
            this, s
        });
        return s;
        s;
        Logger.error((new StringBuilder()).append("Failed to add the js interface, the rich push javascript interface implementation does not define a constructor: ").append(s.getMessage()).toString());
_L2:
        return null;
        s;
        Logger.error("Failed to add the js interface, the rich push javascript interface implementation constructor threw an exception", s);
        continue; /* Loop/switch isn't completed */
        s;
        Logger.error("Failed to add the js interface, the rich push javascript interface implementation cannot be instantiated", s);
        continue; /* Loop/switch isn't completed */
        s;
        Logger.error((new StringBuilder()).append("Failed to add the js interface, the rich push javascript interface implementation's constructor is not accesible: ").append(s.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void configureWebView()
    {
        WebSettings websettings = getSettings();
        if (android.os.Build.VERSION.SDK_INT >= 7)
        {
            websettings.setAppCacheEnabled(true);
            websettings.setAppCachePath(UAirship.shared().getApplicationContext().getCacheDir().getAbsolutePath());
            websettings.setAppCacheMaxSize(0x800000L);
            websettings.setDomStorageEnabled(true);
        }
        websettings.setAllowFileAccess(true);
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(1);
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() {

            final RichPushMessageView this$0;

            public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
            {
                webview = RichPushManager.shared().getRichPushUser();
                httpauthhandler.proceed(webview.getId(), webview.getPassword());
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return false;
            }

            
            {
                this$0 = RichPushMessageView.this;
                super();
            }
        });
    }

    public void loadRichPushMessage(RichPushMessage richpushmessage)
    {
        if (richpushmessage == null)
        {
            Logger.warn("Unable to load null message into RichPushMessageView");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            removeJavascriptInterface(RichPushManager.getJsIdentifier());
        }
        RichPushMessageJavaScript richpushmessagejavascript = createRichPushMessageJavaScript(richpushmessage.getMessageId());
        if (richpushmessagejavascript != null)
        {
            addJavascriptInterface(richpushmessagejavascript, RichPushManager.getJsIdentifier());
        }
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            Object obj = RichPushManager.shared().getRichPushUser();
            obj = BasicScheme.authenticate(new UsernamePasswordCredentials(((RichPushUser) (obj)).getId(), ((RichPushUser) (obj)).getPassword()), "UTF-8", false);
            HashMap hashmap = new HashMap();
            hashmap.put(((Header) (obj)).getName(), ((Header) (obj)).getValue());
            loadUrl(richpushmessage.getMessageBodyUrl(), hashmap);
            return;
        } else
        {
            loadUrl(richpushmessage.getMessageBodyUrl());
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            int i = getScrollY();
            int j = getScrollX();
            onScrollChanged(j, i, j, i);
        }
        return super.onTouchEvent(motionevent);
    }
}
