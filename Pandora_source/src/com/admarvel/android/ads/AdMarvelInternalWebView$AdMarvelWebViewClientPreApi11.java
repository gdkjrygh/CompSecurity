// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, FullScreenControls, AdMarvelActivity, Utils, 
//            AdMarvelInterstitialAds, AdMarvelAd, AdMarvelInterstitialAdListenerImpl, AdMarvelWebView, 
//            AdMarvelWebViewListener, AdMarvelVideoActivity, Version, CheckIfDownloadFromMarketURLPostAPI4

private static class adMarvelAd extends WebViewClient
{

    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference contextReference;

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
        AdMarvelInternalWebView admarvelinternalwebview;
        for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || AdMarvelInternalWebView.access$2(admarvelinternalwebview) || !AdMarvelInternalWebView.access$7(admarvelinternalwebview) || !s.contains("mraid.js");)
        {
            return;
        }

        webview.loadUrl("javascript: (function() { var script=document.createElement('script');script.type='text/javascript';script.src='http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js';document.getElementsByTagName('head').item(0).appendChild(script);})()");
        AdMarvelInternalWebView.access$8(admarvelinternalwebview, false);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        break MISSING_BLOCK_LABEL_17;
        if (webview != null && !AdMarvelInternalWebView.access$2(webview))
        {
            s = (Context)contextReference.get();
            if (s != null && !AdMarvelInternalWebView.access$2(webview))
            {
                AdMarvelInternalWebView.access$9(webview).post(new contextReference(webview, s));
                return;
            }
        }
        return;
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        bitmap = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        break MISSING_BLOCK_LABEL_11;
        if (bitmap != null && !AdMarvelInternalWebView.access$2(bitmap) && AdMarvelInternalWebView.access$5(bitmap).get())
        {
            s = null;
            webview = s;
            if (bitmap.getParent() != null)
            {
                webview = s;
                if (bitmap.getParent() instanceof RelativeLayout)
                {
                    webview = (FullScreenControls)((RelativeLayout)bitmap.getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("CONTROLS").toString());
                }
            }
            if (webview != null && AdMarvelInternalWebView.access$6(bitmap).get())
            {
                webview.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("PROGRESS_BAR").toString()).setVisibility(0);
                return;
            }
        }
        return;
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        webview = (Context)contextReference.get();
        if (webview != null && (webview instanceof Activity))
        {
            webview = (Activity)webview;
            if (webview != null && (webview instanceof AdMarvelActivity))
            {
                webview = (AdMarvelActivity)webview;
                if (webview != null)
                {
                    webview.closeActivity();
                }
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        AdMarvelInternalWebView admarvelinternalwebview;
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null)
        {
            return false;
        }
        if (AdMarvelInternalWebView.access$2(admarvelinternalwebview))
        {
            return false;
        }
        AdMarvelInternalWebView.access$11(admarvelinternalwebview, AdMarvelInternalWebView.access$10(admarvelinternalwebview) + 1);
        webview = (Context)contextReference.get();
        if (webview == null || !(webview instanceof Activity)) goto _L2; else goto _L1
_L1:
        Activity activity = (Activity)webview;
        if (activity == null || !(activity instanceof AdMarvelActivity)) goto _L2; else goto _L3
_L3:
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)activity;
        if (admarvelactivity == null) goto _L2; else goto _L4
_L4:
        if (admarvelactivity.progressDialogReference != null)
        {
            webview = (contextReference)admarvelactivity.progressDialogReference.get();
        } else
        {
            webview = null;
        }
        if (webview != null && webview.contextReference() && webview.contextReference() >= 10 && AdMarvelInternalWebView.access$10(admarvelinternalwebview) > 2 && AdMarvelInternalWebView.access$12(admarvelinternalwebview).get())
        {
            AdMarvelInternalWebView.access$9(admarvelinternalwebview).post(new contextReference(admarvelinternalwebview, activity));
        }
        if (Utils.handledBySpecialIntents(admarvelinternalwebview.getContext(), s))
        {
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
            if (!admarvelactivity.isInterstitial())
            {
                admarvelactivity.closeActivity();
            }
            return true;
        }
        if (admarvelactivity.isInterstitial()) goto _L6; else goto _L5
_L5:
        if (s == null || Utils.isPrivateProtocol(s, "admarvelsdk") == contextReference) goto _L8; else goto _L7
_L7:
        if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L10; else goto _L9
_L9:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L11:
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        admarvelactivity.closeActivity();
        return true;
_L10:
        if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
        {
            AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()));
        }
        if (true) goto _L11; else goto _L8
_L8:
        if (s == null || Utils.isPrivateProtocol(s, "admarvelinternal") == adMarvelAd) goto _L13; else goto _L12
_L12:
        if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L15; else goto _L14
_L14:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L16:
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        admarvelactivity.closeActivity();
        return true;
_L15:
        if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
        {
            AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()));
        }
        if (true) goto _L16; else goto _L13
_L13:
        if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == adMarvelAd) goto _L18; else goto _L17
_L17:
        if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L20; else goto _L19
_L19:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L21:
        webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
        s = new Intent("android.intent.action.VIEW");
        s.addFlags(0x10000000);
        s.setDataAndType(Uri.parse(webview), "video/*");
        admarvelinternalwebview.getContext().startActivity(s);
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        admarvelactivity.closeActivity();
        return true;
_L20:
        if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
        {
            AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
        }
        if (true) goto _L21; else goto _L18
_L18:
        if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == adMarvelAd) goto _L23; else goto _L22
_L22:
        if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L25; else goto _L24
_L24:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L38:
        webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
        webview.addFlags(0x10000000);
        webview.putExtra("url", s);
        webview.putExtra("isCustomUrl", true);
        webview.putExtra("xml", AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        webview.putExtra("GUID", admarvelinternalwebview.GUID);
        admarvelinternalwebview.getContext().startActivity(webview);
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        admarvelactivity.closeActivity();
_L2:
        return Version.getAndroidSDKVersion() >= 4 && CheckIfDownloadFromMarketURLPostAPI4.handleUrl(s, admarvelinternalwebview.getContext());
_L25:
        if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
        {
            AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
        }
        continue; /* Loop/switch isn't completed */
_L23:
        if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != adMarvelAd)
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
            webview.addFlags(0x10000000);
            if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
            {
                admarvelinternalwebview.getContext().startActivity(webview);
            }
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
            admarvelactivity.closeActivity();
        }
          goto _L2
_L6:
        if (!admarvelactivity.isInterstitial()) goto _L2; else goto _L26
_L26:
        if (!AdMarvelInterstitialAds.getEnableClickRedirect()) goto _L28; else goto _L27
_L27:
        if (s != null && Utils.isPrivateProtocol(s, "admarvelsdk") != adMarvelAd)
        {
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
            return true;
        }
        if (s != null && Utils.isPrivateProtocol(s, "admarvelinternal") != adMarvelAd)
        {
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
            return true;
        }
        if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == adMarvelAd) goto _L30; else goto _L29
_L29:
        if (adMarvelAd != null)
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
        }
        webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x10000000);
        intent.setDataAndType(Uri.parse(webview), "video/*");
        if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), intent))
        {
            admarvelinternalwebview.getContext().startActivity(intent);
        }
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
_L28:
        if (adMarvelAd != null)
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
        }
        return true;
_L30:
        if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == adMarvelAd) goto _L32; else goto _L31
_L31:
        if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L34; else goto _L33
_L33:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L35:
        webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
        webview.addFlags(0x10000000);
        webview.putExtra("url", s);
        webview.putExtra("isCustomUrl", true);
        webview.putExtra("isInterstitial", false);
        webview.putExtra("isInterstitialClick", true);
        webview.putExtra("xml", AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        webview.putExtra("GUID", admarvelinternalwebview.GUID);
        admarvelinternalwebview.getContext().startActivity(webview);
        (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        continue; /* Loop/switch isn't completed */
_L34:
        if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
        {
            AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
        }
        if (true) goto _L35; else goto _L32
_L32:
        if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != adMarvelAd)
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
            webview.addFlags(0x10000000);
            if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
            {
                admarvelinternalwebview.getContext().startActivity(webview);
            }
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        } else
        if (AdMarvelInternalWebView.access$14(admarvelinternalwebview).get() && s != null && s.length() > 0)
        {
            webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isInterstitial", false);
            webview.putExtra("isInterstitialClick", true);
            webview.putExtra("xml", AdMarvelInternalWebView.access$13(admarvelinternalwebview));
            webview.putExtra("GUID", admarvelinternalwebview.GUID);
            adMarvelAd.removeNonStringEntriesTargetParam();
            try
            {
                if (adMarvelAd != null)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
                    objectoutputstream.writeObject(adMarvelAd);
                    objectoutputstream.close();
                    webview.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
                }
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            if (admarvelactivity.getSource() != null)
            {
                webview.putExtra("source", admarvelactivity.getSource());
            }
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), AdMarvelInternalWebView.access$9(admarvelinternalwebview))).registerTrackingEvent(AdMarvelInternalWebView.access$13(admarvelinternalwebview));
        }
        if (true) goto _L28; else goto _L36
_L36:
        if (true) goto _L38; else goto _L37
_L37:
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, Context context, AdMarvelAd admarvelad)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        contextReference = new WeakReference(context);
        adMarvelAd = admarvelad;
    }
}
