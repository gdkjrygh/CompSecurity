// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.model.tracking.Submission;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BaseElement
{

    public String errorUrl;
    private String id;
    private BaseElement parent;
    private HashMap state;
    private ArrayList trackingEvents;

    public BaseElement(BaseElement baseelement)
    {
        trackingEvents = new ArrayList();
        parent = baseelement;
    }

    public final void addTrackingUrlForType(TrackingUrl trackingurl, String s)
    {
        s = getTrackingEventByType(s, true);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getTrackingUrls() != null) goto _L4; else goto _L3
_L3:
        s.addTrackingUrl(trackingurl);
_L2:
        return;
_L4:
        int i = 0;
        do
        {
            if (i >= s.getTrackingUrls().size())
            {
                s.addTrackingUrl(trackingurl);
                return;
            }
            TrackingUrl trackingurl1 = (TrackingUrl)s.getTrackingUrls().get(i);
            if (trackingurl1 != null && trackingurl1.getUrl() != null && trackingurl1.getUrl().equalsIgnoreCase(trackingurl.getUrl()))
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void copyTrackingEventsTo(BaseElement baseelement, String s, String s1)
    {
        TrackingEvent trackingevent = getTrackingEventByType(s);
        if (trackingevent == null || trackingevent.getTrackingUrls() == null) goto _L2; else goto _L1
_L1:
        baseelement = baseelement.getTrackingEventByType(s, true);
        s = trackingevent.getTrackingUrls().iterator();
_L5:
        if (s.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        TrackingUrl trackingurl = ((TrackingUrl)s.next()).duplicate();
        if (trackingurl instanceof Submission)
        {
            ((Submission)trackingurl).externalUrl = s1;
        }
        baseelement.addTrackingUrl(trackingurl);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void dispose()
    {
        trackingEvents = null;
        state = null;
        parent = null;
    }

    public final String getID()
    {
        return id;
    }

    public final BaseElement getParent()
    {
        return parent;
    }

    public final HashMap getState()
    {
        return state;
    }

    public final TrackingEvent getTrackingEventByType(String s)
    {
        return getTrackingEventByType(s, false);
    }

    public final TrackingEvent getTrackingEventByType(String s, boolean flag)
    {
        if (trackingEvents == null || StringUtil.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < trackingEvents.size()) goto _L3; else goto _L2
_L2:
        if (flag && !StringUtil.isNullOrEmpty(s))
        {
            s = new TrackingEvent(s.toLowerCase());
            trackingEvents.add(s);
            return s;
        } else
        {
            return null;
        }
_L3:
        if (((TrackingEvent)trackingEvents.get(i)).getType().equalsIgnoreCase(s.toLowerCase()))
        {
            return (TrackingEvent)trackingEvents.get(i);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final ArrayList getTrackingEvents()
    {
        return trackingEvents;
    }

    public final void resetTrackingEvents()
    {
        if (trackingEvents != null && !trackingEvents.isEmpty())
        {
            Iterator iterator = trackingEvents.iterator();
            while (iterator.hasNext()) 
            {
                ((TrackingEvent)iterator.next()).reset();
            }
        }
    }

    public final void setID(String s)
    {
        id = s;
    }

    public final void setState(HashMap hashmap)
    {
        state = hashmap;
    }

    public final void setTrackingEvents(ArrayList arraylist)
    {
        trackingEvents = arraylist;
    }
}
