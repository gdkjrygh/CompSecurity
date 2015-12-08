// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, Utils, AdMarvelActivity, AdMarvelAd, 
//            AdMarvelWebViewListener

private static class adMarvelAd
    implements Runnable
{

    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelWebViewReference;
    private String expand_url;

    public void run()
    {
        AdMarvelWebView admarvelwebview;
        for (admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get(); admarvelwebview == null || expand_url != null && URLUtil.isNetworkUrl(expand_url) && !Utils.isNetworkAvailable(admarvelwebview.getContext());)
        {
            return;
        }

        Intent intent = new Intent(admarvelwebview.getContext(), com/admarvel/android/ads/AdMarvelActivity);
        intent.addFlags(0x10000000);
        intent.putExtra("expand_url", expand_url);
        intent.putExtra("closeBtnEnabled", AdMarvelWebView.access$24(admarvelwebview));
        intent.putExtra("closeAreaEnabled", AdMarvelWebView.access$25(admarvelwebview));
        if (AdMarvelWebView.access$26(admarvelwebview))
        {
            intent.putExtra("orientationState", AdMarvelWebView.access$27(admarvelwebview));
        }
        intent.putExtra("isInterstitial", false);
        intent.putExtra("isInterstitialClick", false);
        intent.putExtra("source", AdMarvelWebView.access$4(admarvelwebview));
        intent.putExtra("GUID", admarvelwebview.GUID);
        adMarvelAd.removeNonStringEntriesTargetParam();
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(adMarvelAd);
            objectoutputstream.close();
            intent.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        admarvelwebview.getContext().startActivity(intent);
        if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
        {
            AdMarvelWebView.getListener(admarvelwebview.GUID).onExpand();
        }
        (new Utils(admarvelwebview.getContext(), AdMarvelWebView.access$1(admarvelwebview))).registerTrackingEvent(AdMarvelWebView.access$2(admarvelwebview));
    }

    public (AdMarvelWebView admarvelwebview, String s, AdMarvelAd admarvelad)
    {
        expand_url = null;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        expand_url = s;
        adMarvelAd = admarvelad;
    }
}
