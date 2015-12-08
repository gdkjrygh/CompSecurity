// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        boolean flag = false;
        if (!s.equals("http://baseurl.admarvel.com/mraid.js")) goto _L2; else goto _L1
_L1:
        Object obj;
        byte abyte0[];
        byte abyte1[];
        this._cls0 _lcls0_1;
        int i;
        int k;
        int l;
        try
        {
            obj = (HttpURLConnection)(new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js")).openConnection();
            ((HttpURLConnection) (obj)).setRequestMethod("GET");
            ((HttpURLConnection) (obj)).setDoOutput(false);
            ((HttpURLConnection) (obj)).setDoInput(true);
            ((HttpURLConnection) (obj)).setUseCaches(false);
            ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            ((HttpURLConnection) (obj)).setRequestProperty("Content-Length", "0");
            ((HttpURLConnection) (obj)).setConnectTimeout(2000);
            ((HttpURLConnection) (obj)).setReadTimeout(10000);
            i = ((HttpURLConnection) (obj)).getResponseCode();
            int j = ((HttpURLConnection) (obj)).getContentLength();
            Logging.log((new StringBuilder("mraid Error Code: ")).append(i).toString());
            Logging.log((new StringBuilder("mraid Content Length: ")).append(j).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return super.shouldInterceptRequest(webview, s);
        }
        if (i != 200) goto _L4; else goto _L3
_L3:
        abyte0 = (InputStream)((HttpURLConnection) (obj)).getContent();
        obj = new ArrayList();
        k = 0;
        i = 8192;
_L10:
        if (i != '\uFFFF') goto _L6; else goto _L5
_L5:
        abyte0.close();
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        abyte0 = new byte[k];
        i = 0;
        k = ((flag) ? 1 : 0);
_L11:
        if (i < ((List) (obj)).size()) goto _L8; else goto _L7
_L7:
        obj = new String(abyte0);
        webview = ((WebView) (obj));
_L12:
        return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(webview.getBytes()));
_L6:
        abyte1 = new byte[8192];
        l = abyte0.read(abyte1, 0, 8192);
        i = l;
        if (l <= 0) goto _L10; else goto _L9
_L9:
        _lcls0_1 = new this._cls0(null);
        _lcls0_1._fld0 = abyte1;
        _lcls0_1._fld0 = l;
        k += l;
        ((List) (obj)).add(_lcls0_1);
        i = l;
          goto _L10
_L8:
        this._cls0 _lcls0 = (this._cls0)((List) (obj)).get(i);
        System.arraycopy(_lcls0._fld0, 0, abyte0, k, _lcls0._fld0);
        k += _lcls0._fld0;
        i++;
          goto _L11
_L4:
        obj = super.shouldInterceptRequest(webview, s);
        return ((WebResourceResponse) (obj));
_L2:
        return super.shouldInterceptRequest(webview, s);
        webview = "";
          goto _L12
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        if (webview != null && webview.isSignalShutdown())
        {
            return false;
        }
        if (Utils.isNoLink(s))
        {
            return true;
        }
        if (AdMarvelWebView.access$0(AdMarvelWebView.this))
        {
            if (Utils.handledBySpecialIntents(getContext(), s))
            {
                (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelsdk") != this._fld0)
            {
                if (AdMarvelWebView.getListener(GUID) != null)
                {
                    AdMarvelWebView.getListener(GUID).onClickAd(AdMarvelWebView.access$3(AdMarvelWebView.this), Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), getContext()));
                }
                (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelinternal") != this._fld0)
            {
                if (AdMarvelWebView.getListener(GUID) != null)
                {
                    AdMarvelWebView.getListener(GUID).onClickAd(AdMarvelWebView.access$3(AdMarvelWebView.this), Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), getContext()));
                }
                (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelvideo") != this._fld0)
            {
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
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != this._fld0)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), getContext())));
                webview.addFlags(0x10000000);
                if (Utils.isIntentAvailable(getContext(), webview))
                {
                    getContext().startActivity(webview);
                }
                (new Utils(getContext(), AdMarvelWebView.access$1(AdMarvelWebView.this))).registerTrackingEvent(AdMarvelWebView.access$2(AdMarvelWebView.this));
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelcustomvideo") != this._fld0)
            {
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
            }
        }
        if (AdMarvelWebView.access$5(AdMarvelWebView.this).get())
        {
            AdMarvelWebView.access$6(AdMarvelWebView.this, s);
        }
        return true;
    }

    ()
    {
        this$0 = AdMarvelWebView.this;
        super();
    }
}
