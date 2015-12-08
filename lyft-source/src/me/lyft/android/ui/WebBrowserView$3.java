// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.webkit.WebView;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui:
//            WebBrowserView

class this._cls0 extends AsyncCall
{

    final WebBrowserView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        WebBrowserView.access$000(WebBrowserView.this);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        setTargetUrl(s);
        setShouldSignUrl(false);
        webView.loadUrl(s);
    }

    ()
    {
        this$0 = WebBrowserView.this;
        super();
    }
}
