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
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdFetcher, AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, 
//            AdMarvelAd, AdMarvelAdapterInstances, AdMarvelAdapter, Utils, 
//            AdMarvelViewListenerImpl

class AdMarvelViewAsyncTask extends AsyncTask
{

    private WeakReference adMarvelViewReference;
    private final WeakReference contextReference;
    private final File storage;
    private Map targetParams;

    public AdMarvelViewAsyncTask(File file, Context context)
    {
        storage = file;
        contextReference = new WeakReference(context);
    }

    protected transient AdMarvelAd doInBackground(Object aobj[])
    {
        Object obj;
        targetParams = (Map)aobj[0];
        obj = (String)aobj[1];
        Object obj1 = (String)aobj[2];
        String s = (String)aobj[3];
        int i = ((Integer)aobj[4]).intValue();
        String s1 = (String)aobj[5];
        adMarvelViewReference = new WeakReference((AdMarvelView)aobj[6]);
        int j = ((Integer)aobj[7]).intValue();
        String s2 = (String)aobj[8];
        Handler handler = (Handler)aobj[9];
        Boolean boolean1 = (Boolean)aobj[10];
        Boolean boolean2 = (Boolean)aobj[11];
        AdFetcher adfetcher = new AdFetcher();
        Context context = (Context)contextReference.get();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_567;
        }
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
        if (AdMarvelView.enableOfflineSDK)
        {
            aobj = adfetcher.fetchOfflineAd(AdFetcher.Adtype.BANNER, context, s, i, s1, targetParams, ((String) (obj)), ((String) (obj1)), j, s2, false, handler, boolean1.booleanValue(), boolean2.booleanValue());
        } else
        {
            aobj = adfetcher.fetchAd(AdFetcher.Adtype.BANNER, context, s, i, s1, targetParams, ((String) (obj)), ((String) (obj1)), j, s2, false, handler, boolean1.booleanValue(), boolean2.booleanValue());
        }
        obj = new AdMarvelAd(((String) (aobj)), targetParams, ((String) (obj)), ((String) (obj1)), s, i, s1, false, context.getPackageName());
        if (AdMarvelView.enableOfflineSDK)
        {
            obj1 = context.getSharedPreferences("admarvel_preferences", 0);
            s = ((SharedPreferences) (obj1)).getString("banner_folder", "NULL");
            ((AdMarvelAd) (obj)).setOfflineBaseUrl((new StringBuilder("file://")).append(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")).append("/").append(s).toString());
            ((AdMarvelAd) (obj)).setOfflinekeyUrl((new StringBuilder(String.valueOf(((SharedPreferences) (obj1)).getString("childDirectory", "NULL")))).append("/").append(s).toString());
        }
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_551;
        }
        try
        {
            obj1 = ((AdMarvelAd) (obj)).loadAd(storage);
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
            break MISSING_BLOCK_LABEL_535;
        }
        aobj = ((Object []) (obj));
        if (((AdMarvelAd) (obj)).getSdkNetwork() == null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        i = ((AdMarvelAd) (obj)).getSdkNetwork().length();
        aobj = ((Object []) (obj));
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_411;
        }
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
        return null;
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Object[])aobj);
    }

    protected void onPostExecute(AdMarvelAd admarvelad)
    {
        super.onPostExecute(admarvelad);
        if (admarvelad != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Object obj = (AdMarvelView)adMarvelViewReference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        AdMarvelUtils.ErrorReason errorreason1;
        int j;
        try
        {
            AdMarvelUtils.ErrorReason errorreason = Utils.getErrorReason(303);
            int i = Utils.getErrorCode(errorreason);
            ((AdMarvelView) (obj)).getListenerImpl().onFailedToReceiveAd(((AdMarvelView) (obj)).getContext(), ((AdMarvelView) (obj)), i, errorreason, null, 0, null, "");
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
        break MISSING_BLOCK_LABEL_137;
        if (admarvelad.getAdType() != AdMarvelAd.AdType.ERROR)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = (AdMarvelView)adMarvelViewReference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        errorreason1 = Utils.getErrorReason(admarvelad.getErrorCode());
        j = Utils.getErrorCode(errorreason1);
        ((AdMarvelView) (obj)).getListenerImpl().onFailedToReceiveAd(((AdMarvelView) (obj)).getContext(), ((AdMarvelView) (obj)), j, errorreason1, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
        return;
        exception = Utils.getErrorReason(303);
        int k = Utils.getErrorCode(exception);
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview != null)
        {
            admarvelview.getListenerImpl().onFailedToReceiveAd(admarvelview.getContext(), admarvelview, k, exception, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }
        break MISSING_BLOCK_LABEL_336;
        Object obj1;
        if (admarvelad.getAdType() != AdMarvelAd.AdType.SDKCALL)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        if (admarvelad.getSdkNetwork() == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        exception = (AdMarvelView)adMarvelViewReference.get();
        obj1 = (Context)contextReference.get();
        if (exception == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        exception.requestPendingAd(targetParams, admarvelad, admarvelad.getSdkNetwork(), ((Context) (obj1)));
        return;
        if (!admarvelad.isDisableAdrequest())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        exception = admarvelad.getDisableAdDuration();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        Context context;
        obj1 = (AdMarvelView)adMarvelViewReference.get();
        context = (Context)contextReference.get();
        if (obj1 == null || context == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        ((AdMarvelView) (obj1)).disableAdRequest(exception, admarvelad, context);
        return;
        exception = (AdMarvelView)adMarvelViewReference.get();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        exception.requestInternalPendingAd(admarvelad);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((AdMarvelAd)obj);
    }
}
