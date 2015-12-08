// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, RequestBuilder

final class AnalyticsTrackState
{

    AnalyticsTrackState()
    {
    }

    protected static void trackState(String s, Map map)
    {
        HashMap hashmap = new HashMap();
        if (s == null || s.length() <= 0)
        {
            s = StaticMethods.getApplicationID();
        }
        hashmap.put("pageName", s);
        RequestBuilder.buildAndSendRequest(map, hashmap, StaticMethods.getTimeSince1970());
    }
}
