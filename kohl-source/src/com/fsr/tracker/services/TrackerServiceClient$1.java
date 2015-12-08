// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.service.Callback;
import fs.org.slf4j.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.fsr.tracker.services:
//            TrackerServiceClient

class val.result
    implements com.fsr.tracker.tasks.syncCallback
{

    final TrackerServiceClient this$0;
    final Callback val$callback;
    final SortedMap val$result;
    final Map val$urlMap;

    public volatile void onComplete(Object obj)
    {
        onComplete((Map)obj);
    }

    public void onComplete(Map map)
    {
        Iterator iterator = map.keySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (String)iterator.next();
        boolean flag = false;
        Object obj1 = (String)map.get(obj);
        obj = (MeasureConfiguration)val$urlMap.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        String s;
        int i;
        try
        {
            i = Integer.parseInt(((String) (obj1)));
            obj1 = TrackerServiceClient.access$000(TrackerServiceClient.this);
            s = ((MeasureConfiguration) (obj)).getSurveyId();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            TrackerServiceClient.access$000(TrackerServiceClient.this).error("ForeSee Trigger Code", "Sampling check failed: response is invalid.");
            val$callback.onFailure(map);
            return;
        }
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Logger) (obj1)).debug("Sampling check for {} returned. In pool? {}", s, Boolean.valueOf(flag));
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        val$result.put(obj, Boolean.valueOf(flag));
        if (true) goto _L2; else goto _L1
_L1:
        val$callback.onComplete(val$result);
        return;
    }

    cCallback()
    {
        this$0 = final_trackerserviceclient;
        val$urlMap = map;
        val$callback = callback1;
        val$result = SortedMap.this;
        super();
    }
}
