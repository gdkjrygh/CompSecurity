// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;

import android.util.Log;
import com.auditude.ads.loader.DataLoader;
import com.auditude.ads.util.MD5;
import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.StringUtil;
import java.net.URLEncoder;

// Referenced classes of package com.auditude.creativerepackaging:
//            UrlNormalizingRules, AuditudeParameters, RepackagingParameters, Cache

public class CreativeRepackagingService
    implements com.auditude.ads.loader.DataLoader.DataLoaderListener, UrlNormalizingRules.UrlNormalizingRulesListener
{
    public static interface CreativeRepackagingServiceListener
    {

        public abstract void onError(String s);

        public abstract void onURLAvaliable(String s, String s1);
    }


    private static final String CDN_URL = "http://cdn2.auditude.com/assets/3p/v";
    private static final int ERROR_1401 = 1401;
    private static final int ERROR_1403 = 1403;
    private static final String HTTP_HEAD_EXCEPTION = "Service unavailable";
    private static final String LOG_CATEGORY = "CreativeRepackagingService";
    private static final String NULL_LISTENER = "RepackageCreativeListener must not be null";
    private static final String PARAM_MISSING = "Required parameters missing";
    private static final int SERVICE_VERSION = 1;
    private static final String START_TRANSCODE = "Begin to transcode video";
    private static final int TIMEOUT = 10;
    private AuditudeParameters audParams;
    private String cdnURL;
    private CreativeRepackagingServiceListener creativeRepackagingServiceListener;
    private UrlNormalizingRules urlNormalizingRules;
    private RepackagingParameters vidParams;

    public CreativeRepackagingService(AuditudeParameters auditudeparameters, RepackagingParameters repackagingparameters, CreativeRepackagingServiceListener creativerepackagingservicelistener)
    {
        audParams = auditudeparameters;
        vidParams = repackagingparameters;
        creativeRepackagingServiceListener = creativerepackagingservicelistener;
        urlNormalizingRules = UrlNormalizingRules.getInstance();
        init();
    }

    private String getErrorURL(int i)
    {
        return (new StringBuilder(String.valueOf(getPlayerErrorURL()))).append("&errorId=").append(i).append("&z=").append(audParams.getZoneId()).append("&a=").append(audParams.getAdId()).append("&f=").append(vidParams.getRequiredFormat()).append("&tp=").append(audParams.getExternalAdId()).append("&tv=").append(1).append("&url=").append(URLEncoder.encode(vidParams.getCreativeURL())).append("&vw=").append(vidParams.getVideoWidth()).append("&vh=").append(vidParams.getVideoHeight()).toString();
    }

    private String getPlayerErrorURL()
    {
        if (StringUtil.isNotNullOrEmpty(audParams.getDomain()))
        {
            return (new StringBuilder("http://ad.")).append(audParams.getDomain()).append("/adserver/e?type=playererror").toString();
        } else
        {
            return "http://ad.auditude.com/adserver/e?type=playererror";
        }
    }

    private String getRequiredVideoURL(String s, String s1)
    {
        String s2 = urlNormalizingRules.normalize(s);
        s = (new StringBuffer(s2)).reverse();
        s2 = MD5.GetMd5String(s2);
        return (new StringBuilder("http://cdn2.auditude.com/assets/3p/v1/")).append(s2.substring(0, 10)).append("/").append(s2).append("_").append(MD5.GetMd5String(s.toString())).append(".").append(s1).toString();
    }

    private void init()
    {
        if (creativeRepackagingServiceListener == null)
        {
            throw new NullPointerException("RepackageCreativeListener must not be null");
        } else
        {
            urlNormalizingRules.addEventListener(this);
            urlNormalizingRules.loadRules();
            return;
        }
    }

    private void repackage()
    {
        if (StringUtil.isNotNullOrEmpty(validateParams()))
        {
            creativeRepackagingServiceListener.onError(validateParams());
            return;
        }
        cdnURL = getRequiredVideoURL(vidParams.getCreativeURL(), vidParams.getRequiredFormat());
        if (StringUtil.isNotNullOrEmpty(Cache.playlistFromCacheForId(vidParams.getCreativeURL())))
        {
            creativeRepackagingServiceListener.onURLAvaliable(cdnURL, getErrorURL(1403));
            return;
        } else
        {
            DataLoader dataloader = new DataLoader();
            dataloader.setDataLoaderListener(this);
            Log.d("CreativeRepackagingService", (new StringBuilder("Sending Request for repackaged url availability to: ")).append(cdnURL).toString());
            dataloader.load(cdnURL, null, 10, Boolean.valueOf(true));
            return;
        }
    }

    private String validateParams()
    {
        if (StringUtil.isNullOrEmpty(audParams.getAdId()))
        {
            return "Required parameters missing: adId";
        }
        if (StringUtil.isNullOrEmpty(audParams.getExternalAdId()))
        {
            return "Required parameters missing: externalAdId";
        }
        if (StringUtil.isNullOrEmpty(vidParams.getCreativeURL()))
        {
            return "Required parameters missing: creativeURL";
        }
        if (StringUtil.isNullOrEmpty(vidParams.getRequiredFormat()))
        {
            return "Required parameters missing: requiredFormat";
        } else
        {
            return null;
        }
    }

    public void onRequestComplete(String s)
    {
        if (s.equals("true"))
        {
            Log.d("CreativeRepackagingService", (new StringBuilder("Received repackaged url: ")).append(cdnURL).toString());
            s = getErrorURL(1403);
            Cache.addPlaylistToCache(s, vidParams.getCreativeURL());
            creativeRepackagingServiceListener.onURLAvaliable(cdnURL, s);
            return;
        } else
        {
            Log.d("CreativeRepackagingService", (new StringBuilder("Sending Request for repackaging to: ")).append(getErrorURL(1401)).toString());
            PingUtil.pingUrl(getErrorURL(1401));
            creativeRepackagingServiceListener.onError("Begin to transcode video");
            return;
        }
    }

    public void onRequestFailed(Throwable throwable)
    {
        creativeRepackagingServiceListener.onError("Service unavailable");
    }

    public void onRulesLoaded(Boolean boolean1)
    {
        urlNormalizingRules.removeEventListener(this);
        repackage();
    }
}
