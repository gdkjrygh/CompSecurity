// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.h;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Map;

// Referenced classes of package com.tinder.h:
//            a

public class b extends WebView
{
    public final class a
    {

        final b a;

        public a()
        {
            a = b.this;
            super();
        }
    }


    private boolean addedJavascriptInterface;
    private com.tinder.h.a videoEnabledWebChromeClient;

    public b(Context context)
    {
        super(context);
        addedJavascriptInterface = false;
    }

    public b(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        addedJavascriptInterface = false;
    }

    public b(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        addedJavascriptInterface = false;
    }

    private void addJavascriptInterface()
    {
        if (!addedJavascriptInterface)
        {
            addJavascriptInterface(new a(), "_VideoEnabledWebView");
            addedJavascriptInterface = true;
        }
    }

    public boolean isVideoFullscreen()
    {
        return videoEnabledWebChromeClient != null && videoEnabledWebChromeClient.isVideoFullscreen();
    }

    public void loadData(String s, String s1, String s2)
    {
        addJavascriptInterface();
        super.loadData(s, s1, s2);
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        addJavascriptInterface();
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
    }

    public void loadUrl(String s)
    {
        addJavascriptInterface();
        super.loadUrl(s);
    }

    public void loadUrl(String s, Map map)
    {
        addJavascriptInterface();
        super.loadUrl(s, map);
    }

    public void setWebChromeClient(WebChromeClient webchromeclient)
    {
        getSettings().setJavaScriptEnabled(true);
        if (webchromeclient instanceof com.tinder.h.a)
        {
            videoEnabledWebChromeClient = (com.tinder.h.a)webchromeclient;
        }
        super.setWebChromeClient(webchromeclient);
    }

}
