// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTTrackingEvent, VASTTrackingUrl

public class VASTAdCreativeBase
{

    public static final String HTML = "html";
    public static final String IFRAME = "iframe";
    public static final String OTHER = "other";
    public static final String SCRIPT = "script";
    public static final String STATIC = "static";
    public String adId;
    public String adParameters;
    public String altText;
    public String apiFramework;
    public String clickThroughUrl;
    public ArrayList clickTrackingUrls;
    public String creativeType;
    public int expandedHeight;
    public int expandedWidth;
    public int height;
    public String id;
    public boolean maintainAspectRatio;
    public String resourceType;
    public boolean scalable;
    public int sequence;
    private ArrayList trackingEvents;
    public String url;
    public int width;

    public VASTAdCreativeBase()
    {
        width = 0;
        height = 0;
        expandedWidth = 0;
        expandedHeight = 0;
    }

    public final void addClickTrakingUrl(String s)
    {
        if (clickTrackingUrls == null)
        {
            clickTrackingUrls = new ArrayList();
        }
        clickTrackingUrls.add(s);
    }

    public final void addTrackingEvent(VASTTrackingEvent vasttrackingevent)
    {
        if (vasttrackingevent != null && !StringUtil.isNullOrEmpty(vasttrackingevent.type)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (trackingEvents == null)
        {
            trackingEvents = new ArrayList();
        }
        VASTTrackingEvent vasttrackingevent1 = getTrackingEventByType(vasttrackingevent.type);
        if (vasttrackingevent1 == null)
        {
            trackingEvents.add(vasttrackingevent);
            return;
        }
        if (vasttrackingevent.getTrackingUrls() != null)
        {
            vasttrackingevent = vasttrackingevent.getTrackingUrls().iterator();
            while (vasttrackingevent.hasNext()) 
            {
                vasttrackingevent1.addTrackingUrl((VASTTrackingUrl)vasttrackingevent.next());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final ArrayList getClickTrackingUrls()
    {
        return clickTrackingUrls;
    }

    public final VASTTrackingEvent getTrackingEventByType(String s)
    {
        if (StringUtil.isNullOrEmpty(s) || trackingEvents == null)
        {
            return null;
        }
        Iterator iterator = trackingEvents.iterator();
        VASTTrackingEvent vasttrackingevent;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            vasttrackingevent = (VASTTrackingEvent)iterator.next();
        } while (!vasttrackingevent.type.toLowerCase().equals(s.toLowerCase()));
        return vasttrackingevent;
    }

    public final ArrayList getTrackingEvents()
    {
        return trackingEvents;
    }

    public final void setTrackingEvents(ArrayList arraylist)
    {
        trackingEvents = arraylist;
    }
}
