// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.repackaging;

import com.auditude.ads.model.Asset;
import com.auditude.ads.model.BaseElement;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.creativerepackaging.AuditudeParameters;
import com.auditude.creativerepackaging.CreativeRepackagingService;
import com.auditude.creativerepackaging.RepackagingParameters;
import java.net.URL;
import java.util.ArrayList;

public class AssetRepackager
    implements com.auditude.creativerepackaging.CreativeRepackagingService.CreativeRepackagingServiceListener
{
    public static interface AssetRepackagingCompletionListener
    {

        public abstract void onRepackagingComplete(Asset asset1, boolean flag);
    }


    private static final String EMPTY_EXTERNAL_AD_ID = "0";
    private static final String PLATFORM_HOST = "theplatform.com";
    private static final String PLATFORM_HOST_CREATIVEURL_QUERY_PARAM = "creativeurl";
    private Asset asset;
    private String domain;
    private AssetRepackagingCompletionListener listener;
    private String requiredFormat;
    private int zoneId;

    public AssetRepackager(AssetRepackagingCompletionListener assetrepackagingcompletionlistener, Asset asset1, String s, String s1, int i)
    {
        asset = asset1;
        requiredFormat = s;
        domain = s1;
        zoneId = i;
        listener = assetrepackagingcompletionlistener;
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
            listener.onRepackagingComplete(asset, false);
        }
    }

    public void onURLAvaliable(String s, String s1)
    {
        MediaFile mediafile1 = asset.getBestMediaFile();
        MediaFile mediafile = mediafile1;
        if (mediafile1 == null)
        {
            mediafile = mediafile1;
            if (asset.getMediaFiles().size() > 0)
            {
                mediafile = asset.getMediaFile();
            }
        }
        if (mediafile != null)
        {
            mediafile.source = s;
            mediafile.mimeType = requiredFormat;
        }
        s = new TrackingUrl(s1, "creativeview");
        asset.addTrackingUrlForType(s, "creativeview");
        if (listener != null)
        {
            listener.onRepackagingComplete(asset, true);
        }
    }

    public void repackage()
    {
        AuditudeParameters auditudeparameters = new AuditudeParameters();
        auditudeparameters.setZoneId(zoneId);
        auditudeparameters.setAdId(asset.getParent().getID());
        RepackagingParameters repackagingparameters;
        MediaFile mediafile;
        if (asset.isNetworkAd())
        {
            auditudeparameters.setExternalAdId(asset.getNetworkAdId());
        } else
        {
            auditudeparameters.setExternalAdId("0");
        }
        auditudeparameters.setDomain(domain);
        repackagingparameters = new RepackagingParameters();
        repackagingparameters.setRequiredFormat(requiredFormat);
        mediafile = asset.getBestMediaFile();
        if (mediafile != null && mediafile.source != null)
        {
            repackagingparameters.setCreativeURL(creativeUrlForSource(mediafile.source));
            repackagingparameters.setVideoHeight(mediafile.height);
            repackagingparameters.setVideoWidth(mediafile.width);
        } else
        if (listener != null)
        {
            listener.onRepackagingComplete(asset, false);
            return;
        }
        new CreativeRepackagingService(auditudeparameters, repackagingparameters, this);
    }
}
