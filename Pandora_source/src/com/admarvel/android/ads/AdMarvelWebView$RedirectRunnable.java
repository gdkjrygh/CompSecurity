// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelView, Utils, AdMarvelWebViewListener, 
//            AdMarvelAd, AdMarvelVideoActivity, AdMarvelActivity

private static class adMarvelAd
    implements Runnable
{

    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelWebViewReference;
    private String url;

    public void run()
    {
        Object obj;
        Object obj1;
        try
        {
            obj = (AdMarvelWebView)adMarvelWebViewReference.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log((new StringBuilder(String.valueOf(((Exception) (obj)).getMessage()))).append(" Exception in RedirectRunnable ").toString());
            return;
        }
        if (obj == null)
        {
            return;
        }
        if (!AdMarvelWebView.access$0(((AdMarvelWebView) (obj)))) goto _L2; else goto _L1
_L1:
        obj1 = ((AdMarvelWebView) (obj)).getContext();
        if (!AdMarvelView.enableOfflineSDK || Utils.checkIfPrivateProtocol(url)) goto _L4; else goto _L3
_L3:
        if (!URLUtil.isNetworkUrl(url) || !Utils.handledBySpecialIntents(((Context) (obj1)), url)) goto _L6; else goto _L5
_L5:
        if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
        {
            AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
            return;
        }
          goto _L7
_L6:
        String s = ((AdMarvelWebView) (obj)).getAdMarvelAd().getOfflinekeyUrl();
        if (!Utils.handledBySpecialIntents(((Context) (obj1)), (new StringBuilder(String.valueOf(s.substring(0, s.lastIndexOf("/"))))).append("/").append(url).toString())) goto _L9; else goto _L8
_L8:
        if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
        {
            AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
            return;
        }
          goto _L7
_L4:
        if (Utils.checkIfPrivateProtocol(url) || !Utils.handledBySpecialIntents(((AdMarvelWebView) (obj)).getContext(), url)) goto _L9; else goto _L10
_L10:
        (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
        if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
        {
            AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
            return;
        }
          goto _L7
_L9:
        if (url != null && Utils.isPrivateProtocol(url, "admarvelsdk") != url)
        {
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(url, "admarvelsdk", "", Utils.isPrivateProtocol(url, "admarvelsdk"), ((AdMarvelWebView) (obj)).getContext()));
            }
            (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
            return;
        }
        if (url != null && Utils.isPrivateProtocol(url, "admarvelinternal") != url)
        {
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(url, "admarvelinternal", "", Utils.isPrivateProtocol(url, "admarvelinternal"), ((AdMarvelWebView) (obj)).getContext()));
            }
            (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
            return;
        }
        if (!Utils.isNetworkAvailable(((Context) (obj1))) || url == null || Utils.isPrivateProtocol(url, "admarvelvideo") == url) goto _L12; else goto _L11
_L11:
        obj1 = Utils.parsePrivateProtocol(url, "admarvelvideo", "http://", Utils.isPrivateProtocol(url, "admarvelvideo"), ((AdMarvelWebView) (obj)).getContext());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x10000000);
        intent.setDataAndType(Uri.parse(((String) (obj1))), "video/*");
        if (Utils.isIntentAvailable(((AdMarvelWebView) (obj)).getContext(), intent))
        {
            ((AdMarvelWebView) (obj)).getContext().startActivity(intent);
        }
        (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
_L2:
        if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
        {
            AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
            return;
        }
          goto _L7
_L12:
        if (Utils.isNetworkAvailable(((Context) (obj1))) && url != null && Utils.isPrivateProtocol(url, "admarvelexternal") != url)
        {
            obj1 = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(url, "admarvelexternal", "", Utils.isPrivateProtocol(url, "admarvelexternal"), ((AdMarvelWebView) (obj)).getContext())));
            ((Intent) (obj1)).addFlags(0x10000000);
            if (Utils.isIntentAvailable(((AdMarvelWebView) (obj)).getContext(), ((Intent) (obj1))))
            {
                ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
            }
            (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        if (Utils.isNetworkAvailable(((Context) (obj1))) && url != null && Utils.isPrivateProtocol(url, "admarvelcustomvideo") != url)
        {
            obj1 = new Intent(((AdMarvelWebView) (obj)).getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            ((Intent) (obj1)).addFlags(0x10000000);
            ((Intent) (obj1)).putExtra("url", url);
            ((Intent) (obj1)).putExtra("isCustomUrl", true);
            ((Intent) (obj1)).putExtra("xml", AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
            ((Intent) (obj1)).putExtra("source", AdMarvelWebView.access$4(((AdMarvelWebView) (obj))));
            ((Intent) (obj1)).putExtra("GUID", ((AdMarvelWebView) (obj)).GUID);
            ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
            (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        if (!Utils.isNetworkAvailable(((Context) (obj1))) || url == null || url.length() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new Intent(((AdMarvelWebView) (obj)).getContext(), com/admarvel/android/ads/AdMarvelActivity);
        ((Intent) (obj1)).addFlags(0x10000000);
        ((Intent) (obj1)).putExtra("url", url);
        ((Intent) (obj1)).putExtra("isInterstitial", false);
        ((Intent) (obj1)).putExtra("isInterstitialClick", false);
        ((Intent) (obj1)).putExtra("xml", AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
        ((Intent) (obj1)).putExtra("source", AdMarvelWebView.access$4(((AdMarvelWebView) (obj))));
        ((Intent) (obj1)).putExtra("GUID", ((AdMarvelWebView) (obj)).GUID);
        adMarvelAd.removeNonStringEntriesTargetParam();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(adMarvelAd);
        objectoutputstream.close();
        ((Intent) (obj1)).putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
_L13:
        ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
        (new Utils(((AdMarvelWebView) (obj)).getContext(), AdMarvelWebView.access$1(((AdMarvelWebView) (obj))))).registerTrackingEvent(AdMarvelWebView.access$2(((AdMarvelWebView) (obj))));
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L13; else goto _L7
_L7:
        return;
        if (true) goto _L2; else goto _L14
_L14:
    }

    public (String s, AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad)
    {
        url = s;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        adMarvelAd = admarvelad;
    }
}
