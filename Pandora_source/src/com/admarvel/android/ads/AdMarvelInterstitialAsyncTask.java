// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInterstitialAds, AdFetcher, AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, 
//            AdMarvelAd, AdMarvelAdapterInstances, AdMarvelAdapter, Utils, 
//            AdMarvelInterstitialAdListenerImpl

class AdMarvelInterstitialAsyncTask extends AsyncTask
{

    private AdMarvelInterstitialAds adMarvelInterstitialAds;
    private final WeakReference contextReference;
    private Map targetParams;

    public AdMarvelInterstitialAsyncTask(Context context)
    {
        contextReference = new WeakReference(context);
    }

    protected transient AdMarvelAd doInBackground(Object aobj[])
    {
        Object obj;
        Object obj1;
        String s;
        String s1;
        Context context;
        String s2;
        Handler handler;
        AdFetcher adfetcher;
        int i;
        int j;
        targetParams = (Map)aobj[0];
        obj = (String)aobj[1];
        obj1 = (String)aobj[2];
        s = (String)aobj[3];
        i = ((Integer)aobj[4]).intValue();
        s1 = (String)aobj[5];
        adMarvelInterstitialAds = (AdMarvelInterstitialAds)aobj[6];
        j = ((Integer)aobj[7]).intValue();
        s2 = (String)aobj[8];
        handler = (Handler)aobj[9];
        context = (Context)contextReference.get();
        adfetcher = new AdFetcher();
        if (context != null) goto _L2; else goto _L1
_L1:
        aobj = null;
_L4:
        return ((AdMarvelAd) (aobj));
_L2:
        try
        {
            aobj = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context).getEnhancedTargetParams(((String) (obj1)), targetParams);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            aobj = null;
        }
        if (aobj != null)
        {
            if (targetParams != null)
            {
                targetParams.putAll(((Map) (aobj)));
            } else
            {
                targetParams = ((Map) (aobj));
            }
        }
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
            aobj = adfetcher.fetchOfflineAd(AdFetcher.Adtype.INTERSTITIAL, context, s, i, s1, targetParams, ((String) (obj)), ((String) (obj1)), j, s2, false, handler, false, adMarvelInterstitialAds.isAutoScalingEnabled());
        } else
        {
            aobj = adfetcher.fetchAd(AdFetcher.Adtype.INTERSTITIAL, context, s, i, s1, targetParams, ((String) (obj)), ((String) (obj1)), j, s2, false, handler, false, adMarvelInterstitialAds.isAutoScalingEnabled());
        }
        obj = new AdMarvelAd(((String) (aobj)), targetParams, ((String) (obj)), ((String) (obj1)), s, i, s1, false, context.getPackageName());
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
            obj1 = context.getSharedPreferences("admarvel_preferences", 0);
            s = ((SharedPreferences) (obj1)).getString("banner_folder", "NULL");
            ((AdMarvelAd) (obj)).setOfflineBaseUrl((new StringBuilder("file://")).append(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")).append("/").append(s).toString());
            ((AdMarvelAd) (obj)).setOfflinekeyUrl((new StringBuilder(String.valueOf(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")))).append("/").append(s).toString());
        }
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_523;
        }
        try
        {
            obj1 = ((AdMarvelAd) (obj)).loadAd(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            try
            {
                Logging.log(Log.getStackTraceString(((Throwable) (aobj))));
                ((AdMarvelAd) (obj)).setAdType(AdMarvelAd.AdType.ERROR);
                ((AdMarvelAd) (obj)).setErrorCode(303);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((AdMarvelAd) (obj)).setAdType(AdMarvelAd.AdType.ERROR);
                ((AdMarvelAd) (obj)).setErrorCode(303);
                return ((AdMarvelAd) (obj));
            }
            return ((AdMarvelAd) (obj));
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        aobj = ((Object []) (obj));
        if (((AdMarvelAd) (obj)).getSdkNetwork() == null) goto _L4; else goto _L3
_L3:
        i = ((AdMarvelAd) (obj)).getSdkNetwork().length();
        aobj = ((Object []) (obj));
        if (i <= 0) goto _L4; else goto _L5
_L5:
        aobj = AdMarvelAdapterInstances.getInstance(((AdMarvelAd) (obj)).getSdkNetwork()).loadAd(((AdMarvelAd) (obj)), ((AdMarvelXMLReader) (obj1)));
        return ((AdMarvelAd) (aobj));
        aobj;
        Logging.log(Log.getStackTraceString(((Throwable) (aobj))));
        ((AdMarvelAd) (obj)).setAdType(AdMarvelAd.AdType.ERROR);
        ((AdMarvelAd) (obj)).setErrorCode(303);
        return ((AdMarvelAd) (obj));
        ((AdMarvelAd) (obj)).setAdType(AdMarvelAd.AdType.ERROR);
        ((AdMarvelAd) (obj)).setErrorCode(303);
        return ((AdMarvelAd) (obj));
        ((AdMarvelAd) (obj)).setAdType(AdMarvelAd.AdType.ERROR);
        ((AdMarvelAd) (obj)).setErrorCode(303);
        return ((AdMarvelAd) (obj));
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Object[])aobj);
    }

    protected void onPostExecute(AdMarvelAd admarvelad)
    {
        Object obj;
        Context context;
        int i;
        super.onPostExecute(admarvelad);
        if (admarvelad.getAdType() != AdMarvelAd.AdType.ERROR)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = Utils.getErrorReason(admarvelad.getErrorCode());
        i = Utils.getErrorCode(((AdMarvelUtils.ErrorReason) (obj)));
        context = (Context)contextReference.get();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        try
        {
            AdMarvelInterstitialAds.getListener().onFailedToReceiveInterstitialAd(context, null, null, i, ((AdMarvelUtils.ErrorReason) (obj)), admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
        break MISSING_BLOCK_LABEL_127;
        if (admarvelad.getAdType() != AdMarvelAd.AdType.SDKCALL)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (admarvelad.getSdkNetwork() != null)
        {
            obj = (Context)contextReference.get();
            adMarvelInterstitialAds.requestPendingAdapterAd(targetParams, admarvelad, admarvelad.getSdkNetwork(), ((Context) (obj)));
            return;
        }
        break MISSING_BLOCK_LABEL_184;
        exception = Utils.getErrorReason(303);
        int j = Utils.getErrorCode(exception);
        context = (Context)contextReference.get();
        if (context != null)
        {
            AdMarvelInterstitialAds.getListener().onFailedToReceiveInterstitialAd(context, null, null, j, exception, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }
        break MISSING_BLOCK_LABEL_266;
        if (!admarvelad.isDisableAdrequest())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        exception = admarvelad.getDisableAdDuration();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        context = (Context)contextReference.get();
        if (adMarvelInterstitialAds == null || context == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        adMarvelInterstitialAds.disableAdRequest(exception, admarvelad, context);
        return;
        if (contextReference == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        exception = (Context)contextReference.get();
_L1:
        adMarvelInterstitialAds.requestPendingAdMarvelAd(admarvelad, exception);
        return;
        exception = null;
          goto _L1
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((AdMarvelAd)obj);
    }
}
