// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.tracking;

import com.auditude.ads.model.BaseElement;
import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.model.tracking:
//            TrackingEvent, TrackingUrl, Submission

public class Submissions extends BaseElement
{

    public Submissions()
    {
        super(null);
    }

    public Submission getSubmissionById(String s)
    {
        Object obj = null;
        TrackingEvent trackingevent = getTrackingEventByType(s);
        s = obj;
        if (trackingevent != null)
        {
            s = obj;
            if (trackingevent.getTrackingUrls().size() > 0)
            {
                s = (TrackingUrl)trackingevent.getTrackingUrls().get(0);
                if (!(s instanceof Submission))
                {
                    s = null;
                }
                s = (Submission)s;
            }
        }
        return s;
    }
}
