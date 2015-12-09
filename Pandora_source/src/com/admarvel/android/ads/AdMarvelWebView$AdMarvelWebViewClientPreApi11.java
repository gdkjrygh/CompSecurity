// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admarvel.android.util.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelWebViewListener, Utils, AdMarvelInternalWebView, 
//            AdMarvelVideoActivity

class this._cls0 extends WebViewClient
{

    final AdMarvelWebView this$0;

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!AdMarvelWebView.access$9(AdMarvelWebView.this).get() && AdMarvelWebView.access$7(AdMarvelWebView.this).compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
        {
            AdMarvelWebView.getListener(GUID).onReceiveAd(AdMarvelWebView.this, AdMarvelWebView.access$3(AdMarvelWebView.this));
        }
        AdMarvelWebView.access$8(AdMarvelWebView.this).set(true);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        AdMarvelWebView.access$8(AdMarvelWebView.this).set(false);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        if (AdMarvelWebView.access$7(AdMarvelWebView.this).compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
        {
            AdMarvelWebView.getListener(GUID).onFailedToReceiveAd(AdMarvelWebView.this, AdMarvelWebView.access$3(AdMarvelWebView.this), 305, Utils.getErrorReason(305));
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s == null)
        {
            return false;
        }
        webview = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        if (webview == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (webview.isSignalShutdown())
        {
            return false;
        }
        if (Utils.isNoLink(s))
        {
            return true;
        }
        if (!AdMarvelWebView.access$0(AdMarvelWebView.this))
        {
            break MISSING_BLOCK_LABEL_712;
        }
        if (!Utils.handledBySpecialIntents(getContext(), s))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (Utils.isPrivateProtocol(s, "admarvelsdk") == this._fld0)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (AdMarvelWebView.getListener(GUID) != null)
        {
            AdMarvelWebView.getListener(GUID).onClickAd(AdMarvelWebView.access$3(AdMarvelWebView.this), Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), getContext()));
        }
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        if (Utils.isPrivateProtocol(s, "admarvelinternal") == this._fld0)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        if (AdMarvelWebView.getListener(GUID) != null)
        {
            AdMarvelWebView.getListener(GUID).onClickAd(AdMarvelWebView.access$3(AdMarvelWebView.this), Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), getContext()));
        }
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        if (Utils.isPrivateProtocol(s, "admarvelvideo") == this._fld0)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), getContext());
        s = new Intent("android.intent.action.VIEW");
        s.addFlags(0x10000000);
        s.setDataAndType(Uri.parse(webview), "video/*");
        if (Utils.isIntentAvailable(getContext(), s))
        {
            getContext().startActivity(s);
        }
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        if (Utils.isPrivateProtocol(s, "admarvelexternal") == this._fld0)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), getContext())));
        webview.addFlags(0x10000000);
        if (Utils.isIntentAvailable(getContext(), webview))
        {
            getContext().startActivity(webview);
        }
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        if (Utils.isPrivateProtocol(s, "admarvelcustomvideo") == this._fld0)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        webview = new Intent(getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
        webview.addFlags(0x10000000);
        webview.putExtra("url", s);
        webview.putExtra("isCustomUrl", true);
        webview.putExtra("xml", AdMarvelWebView.access$2(AdMarvelWebView.this));
        webview.putExtra("source", AdMarvelWebView.access$4(AdMarvelWebView.this));
        webview.putExtra("GUID", GUID);
        getContext().startActivity(webview);
        (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
        return true;
        try
        {
            if (AdMarvelWebView.access$5(AdMarvelWebView.this).get())
            {
                AdMarvelWebView.access$6(AdMarvelWebView.this, s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            Logging.log((new StringBuilder(String.valueOf(webview.getMessage()))).append("exception in shouldOverrideUrlLoading").toString());
        }
        return true;
    }

    ()
    {
        this$0 = AdMarvelWebView.this;
        super();
    }
}
