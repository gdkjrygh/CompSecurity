// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.tve;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import java.net.URLDecoder;

public class AuthenticationWebView extends WebView
{
    public static interface Callback
    {

        public abstract void onComplete();
    }


    private Callback callback;

    public AuthenticationWebView(Context context)
    {
        this(context, null);
    }

    public AuthenticationWebView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AuthenticationWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setWebViewClient(new WebViewClient() {

            final AuthenticationWebView this$0;

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.equals(URLDecoder.decode(AccessEnabler.ADOBEPASS_REDIRECT_URL)))
                {
                    callback.onComplete();
                    setVisibility(8);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = AuthenticationWebView.this;
                super();
            }
        });
        WebSettings websettings = getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setJavaScriptCanOpenWindowsAutomatically(true);
    }

    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

}
