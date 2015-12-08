// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package me.lyft.android.ui:
//            WebBrowserView

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (WebBrowserView)obj, obj1);
    }

    public void inject(butterknife.jector jector, WebBrowserView webbrowserview, Object obj)
    {
        webbrowserview.bottomShadow = (View)jector.hadow(obj, 0x7f0d0299, "field 'bottomShadow'");
        webbrowserview.webView = (WebView)jector.((View)jector.(obj, 0x7f0d0297, "field 'webView'"), 0x7f0d0297, "field 'webView'");
        webbrowserview.retryButton = (View)jector.tton(obj, 0x7f0d029a, "field 'retryButton'");
        webbrowserview.loadProgressIndicator = (View)jector.gressIndicator(obj, 0x7f0d0298, "field 'loadProgressIndicator'");
    }

    public volatile void reset(Object obj)
    {
        reset((WebBrowserView)obj);
    }

    public void reset(WebBrowserView webbrowserview)
    {
        webbrowserview.bottomShadow = null;
        webbrowserview.webView = null;
        webbrowserview.retryButton = null;
        webbrowserview.loadProgressIndicator = null;
    }

    public ()
    {
    }
}
