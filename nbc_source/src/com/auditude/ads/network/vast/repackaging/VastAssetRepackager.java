// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.repackaging;

import com.auditude.ads.network.vast.model.VASTLinearCreative;
import com.auditude.ads.network.vast.model.VASTMediaFile;
import com.auditude.ads.network.vast.model.VASTTrackingEvent;
import com.auditude.ads.network.vast.model.VASTTrackingUrl;
import com.auditude.creativerepackaging.AuditudeParameters;
import com.auditude.creativerepackaging.CreativeRepackagingService;
import com.auditude.creativerepackaging.RepackagingParameters;
import java.net.URL;

// Referenced classes of package com.auditude.ads.network.vast.repackaging:
//            VastAssetRepackagerInfo

public class VastAssetRepackager
    implements com.auditude.creativerepackaging.CreativeRepackagingService.CreativeRepackagingServiceListener
{
    public static interface VastAssetRepackagingCompletionListener
    {

        public abstract void onRepackagingComplete(VASTLinearCreative vastlinearcreative, boolean flag);
    }


    private static final String PLATFORM_HOST = "theplatform.com";
    private static final String PLATFORM_HOST_CREATIVEURL_QUERY_PARAM = "creativeurl";
    private String domain;
    private VASTLinearCreative linearAd;
    private VastAssetRepackagingCompletionListener listener;
    private String requiredFormat;
    private String rootAdId;
    private int zoneId;

    public VastAssetRepackager(VastAssetRepackagingCompletionListener vastassetrepackagingcompletionlistener, VASTLinearCreative vastlinearcreative, String s, VastAssetRepackagerInfo vastassetrepackagerinfo)
    {
        linearAd = null;
        rootAdId = null;
        requiredFormat = null;
        domain = null;
        zoneId = 0;
        listener = vastassetrepackagingcompletionlistener;
        linearAd = vastlinearcreative;
        rootAdId = s;
        if (vastassetrepackagerinfo != null)
        {
            requiredFormat = vastassetrepackagerinfo.requiredFormat;
            domain = vastassetrepackagerinfo.domain;
            zoneId = vastassetrepackagerinfo.zoneId;
        }
    }

    private String creativeUrlForSource(String s)
    {
        URL url;
        String as[];
        String as1[];
        int i;
        try
        {
            url = new URL(s);
        }
        catch (Exception exception)
        {
            return s;
        }
        if (url.getHost() == null || !url.getHost().contains("theplatform.com") || url.getQuery() == null) goto _L2; else goto _L1
_L1:
        as = url.getQuery().split("&");
        i = 0;
_L7:
        if (i >= as.length)
        {
            return s;
        }
        as1 = as[i].split("=");
        if (as1.length >= 1) goto _L4; else goto _L3
_L4:
        if (as1[0].compareToIgnoreCase("creativeurl") != 0) goto _L3; else goto _L5
_L5:
        i = as1.length;
        if (i < 2)
        {
            return "";
        } else
        {
            return as1[1];
        }
        Exception exception1;
        exception1;
        return s;
_L2:
        return s;
_L3:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onError(String s)
    {
        if (listener != null)
        {
            listener.onRepackagingComplete(linearAd, false);
        }
    }

    public void onURLAvaliable(String s, String s1)
    {
        if (linearAd != null)
        {
            VASTMediaFile vastmediafile = linearAd.getBestMediaFile();
            if (vastmediafile != null)
            {
                vastmediafile.url = s;
                vastmediafile.type = requiredFormat;
            }
        }
        VASTTrackingEvent vasttrackingevent = linearAd.getTrackingEventByType("creativeview");
        s = vasttrackingevent;
        if (vasttrackingevent == null)
        {
            s = new VASTTrackingEvent("creativeview");
            linearAd.addTrackingEvent(s);
        }
        s.addTrackingUrl(new VASTTrackingUrl(s1, "creativeview"));
        if (listener != null)
        {
            listener.onRepackagingComplete(linearAd, true);
        }
    }

    public void repackage()
    {
        AuditudeParameters auditudeparameters = new AuditudeParameters();
        auditudeparameters.setZoneId(zoneId);
        auditudeparameters.setDomain(domain);
        auditudeparameters.setAdId(rootAdId);
        auditudeparameters.setExternalAdId(linearAd.adId);
        RepackagingParameters repackagingparameters = new RepackagingParameters();
        repackagingparameters.setRequiredFormat(requiredFormat);
        VASTMediaFile vastmediafile = null;
        if (linearAd != null)
        {
            vastmediafile = linearAd.getBestMediaFile();
        }
        if (vastmediafile != null && vastmediafile.url != null)
        {
            repackagingparameters.setCreativeURL(creativeUrlForSource(vastmediafile.url));
            repackagingparameters.setVideoHeight(vastmediafile.height);
            repackagingparameters.setVideoWidth(vastmediafile.width);
        } else
        if (listener != null)
        {
            listener.onRepackagingComplete(linearAd, false);
            return;
        }
        new CreativeRepackagingService(auditudeparameters, repackagingparameters, this);
    }
}
