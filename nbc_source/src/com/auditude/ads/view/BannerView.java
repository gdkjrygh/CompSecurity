// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.auditude.ads.core.APIBridge;
import com.auditude.ads.event.AdClickThroughEvent;
import com.auditude.ads.model.Click;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.AuditudeUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class BannerView extends WebView
{
    private class MyWebViewClient extends WebViewClient
    {

        private Boolean pageLoaded;
        final BannerView this$0;

        public void onLoadResource(WebView webview, String s)
        {
            if (pageLoaded.booleanValue())
            {
                webview.stopLoading();
                adClick(s);
            }
        }

        public void onPageFinished(WebView webview, String s)
        {
            pageLoaded = Boolean.valueOf(true);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            pageLoaded = Boolean.valueOf(false);
        }

        public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
        {
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            adClick(s);
            return true;
        }

        private MyWebViewClient()
        {
            this$0 = BannerView.this;
            super();
            pageLoaded = Boolean.valueOf(false);
        }

        MyWebViewClient(MyWebViewClient mywebviewclient)
        {
            this();
        }
    }


    private APIBridge api;
    private OnPageAsset banner;

    public BannerView(Context context)
    {
        super(context);
        init();
    }

    public BannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public BannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void adClick(String s)
    {
        Click click1 = (Click)banner.getClick();
        Click click = click1;
        if (click1 == null)
        {
            click = new Click(banner);
            banner.setClick(click);
        }
        click.setShouldAppendParState(false);
        click.setUrl(s);
        s = new AdClickThroughEvent("adClick", banner.getClick(), null);
        api.dispatchEvent("apiEvent", s);
        s = click.getTrackingEventByType("click");
        if (s == null || s.getTrackingUrls() == null || s.getTrackingUrls().size() <= 0) goto _L2; else goto _L1
_L1:
        s = s.getTrackingUrls().iterator();
_L5:
        if (s.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((TrackingUrl)s.next()).log(true, null);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void init()
    {
        getSettings().setJavaScriptEnabled(true);
        setWebViewClient(new MyWebViewClient(null));
    }

    private void pingImpression()
    {
        Object obj = banner.getTrackingEventByType("creativeview");
        if (obj == null || ((TrackingEvent) (obj)).getTrackingUrls() == null) goto _L2; else goto _L1
_L1:
        obj = ((TrackingEvent) (obj)).getTrackingUrls().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((TrackingUrl)((Iterator) (obj)).next()).log(false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void loadBanner(IOnPageAsset ionpageasset, APIBridge apibridge)
    {
        api = apibridge;
        banner = (OnPageAsset)ionpageasset;
        if (banner != null)
        {
            if (banner.getResourceType() == "static" || banner.getResourceType() == "html")
            {
                loadData(banner.getSource(), "text/html", null);
            } else
            if (banner.getResourceType() == "iframe")
            {
                loadUrl(AuditudeUtil.substituteTags(banner.getUrl()));
                pingImpression();
                return;
            }
        }
    }

}
