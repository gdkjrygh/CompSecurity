// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, Utils, AdMarvelInterstitialAds, AdMarvelAd, 
//            AdMarvelInterstitialAdListenerImpl, AdMarvelWebView, AdMarvelWebViewListener, AdMarvelVideoActivity

private static class adMarvelAd extends AsyncTask
{

    private final WeakReference adMarvelActivityReference;
    private final AdMarvelAd adMarvelAd;

    protected transient Object doInBackground(Object aobj[])
    {
        if (adMarvelActivityReference != null)
        {
            aobj = (AdMarvelActivity)adMarvelActivityReference.get();
        } else
        {
            aobj = null;
        }
        if (aobj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))) == null || Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelsdk") == adMarvelActivityReference)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (!AdMarvelActivity.access$22(((AdMarvelActivity) (aobj))) || AdMarvelInterstitialAds.getListener() == null) goto _L4; else goto _L3
_L3:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((android.content.Context) (aobj)), Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelsdk", "", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelsdk"), ((android.content.Context) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L6:
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        Exception exception;
        return null;
_L4:
        if (AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))) == null) goto _L6; else goto _L5
_L5:
        AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelsdk", "", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelsdk"), ((android.content.Context) (aobj))));
          goto _L6
        if (AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))) == null || Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelinternal") == adMarvelAd)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        if (!AdMarvelActivity.access$22(((AdMarvelActivity) (aobj)))) goto _L8; else goto _L7
_L7:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((android.content.Context) (aobj)), Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelinternal", "", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelinternal"), ((android.content.Context) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L10:
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        return null;
_L8:
        if (AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))) == null) goto _L10; else goto _L9
_L9:
        AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelinternal", "", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelinternal"), ((android.content.Context) (aobj))));
          goto _L10
        if (AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))) == null || Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelvideo") == adMarvelAd)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        if (!AdMarvelActivity.access$22(((AdMarvelActivity) (aobj)))) goto _L12; else goto _L11
_L11:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((android.content.Context) (aobj)), AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L14:
        String s = Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelvideo", "http://", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelvideo"), ((android.content.Context) (aobj)));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addFlags(0x10000000);
        intent2.setDataAndType(Uri.parse(s), "video/*");
        if (Utils.isIntentAvailable(((AdMarvelActivity) (aobj)).getBaseContext(), intent2))
        {
            ((AdMarvelActivity) (aobj)).startActivity(intent2);
        }
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        return null;
_L12:
        if (AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))) == null) goto _L14; else goto _L13
_L13:
        AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))).onClickAd(adMarvelAd, AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))));
          goto _L14
        if (AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))) == null || Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelcustomvideo") == adMarvelAd)
        {
            break MISSING_BLOCK_LABEL_725;
        }
        if (!AdMarvelActivity.access$22(((AdMarvelActivity) (aobj)))) goto _L16; else goto _L15
_L15:
        AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((android.content.Context) (aobj)), AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L18:
        Intent intent = new Intent(((android.content.Context) (aobj)), com/admarvel/android/ads/AdMarvelVideoActivity);
        intent.addFlags(0x10000000);
        intent.putExtra("url", AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))));
        intent.putExtra("isCustomUrl", true);
        intent.putExtra("xml", AdMarvelActivity.access$6(((AdMarvelActivity) (aobj))));
        intent.putExtra("source", AdMarvelActivity.access$23(((AdMarvelActivity) (aobj))));
        intent.putExtra("GUID", AdMarvelActivity.access$5(((AdMarvelActivity) (aobj))));
        ((AdMarvelActivity) (aobj)).startActivity(intent);
        (new Utils(((android.content.Context) (aobj)), AdMarvelActivity.access$7(((AdMarvelActivity) (aobj))))).registerTrackingEvent(AdMarvelActivity.access$6(((AdMarvelActivity) (aobj))));
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        return null;
_L16:
        if (AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))) == null) goto _L18; else goto _L17
_L17:
        AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))).onClickAd(adMarvelAd, AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))));
          goto _L18
        if (AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))) == null || Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelexternal") == adMarvelAd)
        {
            break MISSING_BLOCK_LABEL_841;
        }
        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelexternal", "", Utils.isPrivateProtocol(AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))), "admarvelexternal"), ((android.content.Context) (aobj)))));
        intent1.addFlags(0x10000000);
        if (Utils.isIntentAvailable(((AdMarvelActivity) (aobj)).getBaseContext(), intent1))
        {
            ((AdMarvelActivity) (aobj)).startActivity(intent1);
        }
        if (AdMarvelActivity.access$6(((AdMarvelActivity) (aobj))) != null)
        {
            (new Utils(((android.content.Context) (aobj)), AdMarvelActivity.access$7(((AdMarvelActivity) (aobj))))).registerTrackingEvent(AdMarvelActivity.access$6(((AdMarvelActivity) (aobj))));
        }
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        return null;
        if (!Utils.handledBySpecialIntents(((android.content.Context) (aobj)), AdMarvelActivity.access$11(((AdMarvelActivity) (aobj)))))
        {
            break MISSING_BLOCK_LABEL_912;
        }
        (new Utils(((android.content.Context) (aobj)), AdMarvelActivity.access$7(((AdMarvelActivity) (aobj))))).registerTrackingEvent(AdMarvelActivity.access$6(((AdMarvelActivity) (aobj))));
        AdMarvelActivity.access$19(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        if (AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))) == null) goto _L1; else goto _L19
_L19:
        AdMarvelWebView.getListener(AdMarvelActivity.access$5(((AdMarvelActivity) (aobj)))).onClickAd(adMarvelAd, AdMarvelActivity.access$11(((AdMarvelActivity) (aobj))));
        return null;
        try
        {
            AdMarvelActivity.access$24(((AdMarvelActivity) (aobj))).sendEmptyMessage(0);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
            ((AdMarvelActivity) (aobj)).finish();
            return null;
        }
        return null;
    }

    public I(AdMarvelActivity admarvelactivity, AdMarvelAd admarvelad)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelAd = admarvelad;
    }
}
