// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.tracking;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model.tracking:
//            TrackingUrl

public class TrackingEvent
{

    private ArrayList trackingUrls;
    private String type;

    public TrackingEvent(String s)
    {
        type = s;
    }

    public final void addTrackingUrl(TrackingUrl trackingurl)
    {
        if (trackingUrls == null)
        {
            trackingUrls = new ArrayList();
        }
        if (trackingurl != null)
        {
            trackingUrls.add(trackingurl);
        }
    }

    public final ArrayList getTrackingUrls()
    {
        return trackingUrls;
    }

    public final String getType()
    {
        return type;
    }

    public final void reset()
    {
        if (trackingUrls == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = trackingUrls.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((TrackingUrl)iterator.next()).setLogged(false);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
