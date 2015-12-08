// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.network.vast.model.VASTDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class VMAPAdBreak
{

    private String allowMultipleAds;
    private String followRedirects;
    private int repeatAfter;
    private int startTime;
    private ArrayList trackingUrls;
    private ArrayList vastDocuments;

    public VMAPAdBreak(int i)
    {
        startTime = 0;
        repeatAfter = 0;
        trackingUrls = new ArrayList();
        vastDocuments = new ArrayList();
        startTime = i;
    }

    public void addTrackingUrl(String s, String s1)
    {
        TrackingUrl trackingurl = null;
        if (!s.equalsIgnoreCase("breakStart") && !s.equalsIgnoreCase("start")) goto _L2; else goto _L1
_L1:
        trackingurl = new TrackingUrl(s1, "start");
_L4:
        if (trackingurl != null)
        {
            trackingUrls.add(trackingurl);
        }
        return;
_L2:
        if (s.equalsIgnoreCase("breakEnd") || s.equalsIgnoreCase("complete"))
        {
            trackingurl = new TrackingUrl(s1, "complete");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addVastDocument(VASTDocument vastdocument)
    {
        vastDocuments.add(vastdocument);
    }

    public String getAllowMultipleAds()
    {
        return allowMultipleAds;
    }

    public VMAPAdBreak getCopy(int i)
    {
        VMAPAdBreak vmapadbreak;
        Iterator iterator;
        vmapadbreak = new VMAPAdBreak(i);
        vmapadbreak.setAllowMultipleAds(allowMultipleAds);
        vmapadbreak.setFollowRedirects(followRedirects);
        iterator = trackingUrls.iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = vastDocuments.iterator();
_L4:
        if (!iterator.hasNext())
        {
            return vmapadbreak;
        }
        break MISSING_BLOCK_LABEL_89;
_L2:
        TrackingUrl trackingurl = (TrackingUrl)iterator.next();
        vmapadbreak.addTrackingUrl(trackingurl.getType(), trackingurl.getUrl());
          goto _L3
        vmapadbreak.addVastDocument((VASTDocument)iterator.next());
          goto _L4
    }

    public Boolean getFollowRedirects()
    {
        if (followRedirects != null)
        {
            return Boolean.valueOf(followRedirects.equalsIgnoreCase("true"));
        } else
        {
            return Boolean.valueOf(true);
        }
    }

    public int getRepeatAfter()
    {
        return repeatAfter;
    }

    public int getStartTime()
    {
        return startTime;
    }

    public ArrayList getTrackingUrls()
    {
        return trackingUrls;
    }

    public ArrayList getVastDocuments()
    {
        return vastDocuments;
    }

    public void setAllowMultipleAds(String s)
    {
        allowMultipleAds = s;
    }

    public void setFollowRedirects(String s)
    {
        followRedirects = s;
    }

    public void setRepeatAfter(int i)
    {
        repeatAfter = i;
    }
}
