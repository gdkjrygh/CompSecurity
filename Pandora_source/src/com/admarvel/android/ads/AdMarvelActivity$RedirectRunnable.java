// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInterstitialAds, Utils, AdMarvelAd, 
//            AdMarvelInterstitialAdListenerImpl

private static class adMarvelAd
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final AdMarvelAd adMarvelAd;
    private String url;

    public void run()
    {
        AdMarvelActivity admarvelactivity;
        if (adMarvelActivityReference != null)
        {
            admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        } else
        {
            admarvelactivity = null;
        }
        if (admarvelactivity == null)
        {
            return;
        }
        if (!AdMarvelInterstitialAds.getEnableClickRedirect()) goto _L2; else goto _L1
_L1:
        if (url == null || !AdMarvelInterstitialAds.enableOfflineSDK || Utils.checkIfPrivateProtocol(url)) goto _L4; else goto _L3
_L3:
        Exception exception;
        if (URLUtil.isNetworkUrl(url) && Utils.handledBySpecialIntents(admarvelactivity, url))
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            return;
        }
          goto _L5
_L2:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
        return;
_L5:
        String s = adMarvelAd.getOfflinekeyUrl();
        if (Utils.handledBySpecialIntents(admarvelactivity, (new StringBuilder(String.valueOf(s.substring(0, s.lastIndexOf("/"))))).append("/").append(url).toString()))
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            return;
        }
          goto _L6
_L4:
        if (url != null && !Utils.checkIfPrivateProtocol(url) && Utils.handledBySpecialIntents(admarvelactivity, url))
        {
            (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            return;
        }
_L6:
        if (url != null && Utils.isPrivateProtocol(url, "admarvelsdk") != url)
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(url, "admarvelsdk", "", Utils.isPrivateProtocol(url, "admarvelsdk"), admarvelactivity), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
            return;
        }
        if (url != null && Utils.isPrivateProtocol(url, "admarvelinternal") != url)
        {
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(url, "admarvelinternal", "", Utils.isPrivateProtocol(url, "admarvelinternal"), admarvelactivity), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
            return;
        }
        try
        {
label0:
            {
                if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || Utils.isPrivateProtocol(url, "admarvelvideo") == url)
                {
                    break label0;
                }
                String s1 = Utils.parsePrivateProtocol(url, "admarvelvideo", "http://", Utils.isPrivateProtocol(url, "admarvelvideo"), admarvelactivity);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(0x10000000);
                intent2.setDataAndType(Uri.parse(s1), "video/*");
                if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent2))
                {
                    admarvelactivity.startActivity(intent2);
                }
                (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Logging.log((new StringBuilder(String.valueOf(exception.getMessage()))).append("Exception in RedirectRunnable ").toString());
        }
          goto _L2
        if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || Utils.isPrivateProtocol(url, "admarvelexternal") == url) goto _L8; else goto _L7
_L7:
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(url, "admarvelexternal", "", Utils.isPrivateProtocol(url, "admarvelexternal"), admarvelactivity)));
        intent.addFlags(0x10000000);
        if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent))
        {
            admarvelactivity.startActivity(intent);
        }
        (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
          goto _L2
_L8:
        if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || url.length() <= 0) goto _L2; else goto _L9
_L9:
        Intent intent1;
        intent1 = new Intent(admarvelactivity.getBaseContext(), com/admarvel/android/ads/AdMarvelActivity);
        intent1.addFlags(0x10000000);
        intent1.putExtra("url", url);
        intent1.putExtra("isInterstitial", false);
        intent1.putExtra("isInterstitialClick", true);
        intent1.putExtra("xml", AdMarvelActivity.access$6(admarvelactivity));
        intent1.putExtra("GUID", AdMarvelActivity.access$5(admarvelactivity));
        adMarvelAd.removeNonStringEntriesTargetParam();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(adMarvelAd);
        objectoutputstream.close();
        intent1.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
_L10:
        if (admarvelactivity.getSource() != null)
        {
            intent1.putExtra("source", AdMarvelActivity.access$23(admarvelactivity));
        }
        admarvelactivity.startActivity(intent1);
        (new Utils(admarvelactivity, AdMarvelActivity.access$7(admarvelactivity))).registerTrackingEvent(AdMarvelActivity.access$6(admarvelactivity));
          goto _L2
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
          goto _L10
    }

    public (String s, AdMarvelActivity admarvelactivity, AdMarvelAd admarvelad)
    {
        url = s;
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelAd = admarvelad;
    }
}
