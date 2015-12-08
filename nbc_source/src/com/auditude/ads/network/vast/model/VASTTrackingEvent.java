// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTTrackingUrl

public class VASTTrackingEvent
{

    private ArrayList trackingUrls;
    public String type;

    public VASTTrackingEvent(String s)
    {
        type = s;
    }

    public final void addTrackingUrl(VASTTrackingUrl vasttrackingurl)
    {
        if (vasttrackingurl == null || !StringUtil.isNotNullOrEmpty(vasttrackingurl.getUrl()))
        {
            return;
        }
        if (trackingUrls == null)
        {
            trackingUrls = new ArrayList();
        }
        trackingUrls.add(vasttrackingurl);
    }

    public final ArrayList getTrackingUrls()
    {
        return trackingUrls;
    }
}
