// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.mobile:
//            MobileConfig, StaticMethods, MobilePrivacyStatus, VisitorIDService, 
//            Lifecycle, Messages, AnalyticsWorker

final class RequestBuilder
{

    private static final String PRIVACY_MODE_KEY = "a.privacy.mode";
    private static final String VAR_ESCAPE_PREFIX = "&&";

    RequestBuilder()
    {
    }

    protected static void buildAndSendRequest(Map map, Map map1, long l)
    {
        if (!MobileConfig.getInstance().mobileUsingAnalytics())
        {
            return;
        }
        Iterator iterator;
        long l1;
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = new HashMap();
        }
        map.putAll(StaticMethods.getDefaultData());
        l1 = StaticMethods.getTimeSinceLaunch();
        if (l1 > 0L)
        {
            map.put("a.TimeSinceLaunch", String.valueOf(l1));
        }
        if (MobileConfig.getInstance().getPrivacyStatus() == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_UNKNOWN)
        {
            map.put("a.privacy.mode", "unknown");
        }
        if (map1 != null)
        {
            map1 = new HashMap(map1);
        } else
        {
            map1 = new HashMap();
        }
        if (MobileConfig.getInstance().getVisitorIdServiceEnabled())
        {
            map1.putAll(VisitorIDService.sharedInstance().getAnalyticsParameters());
        }
        if (StaticMethods.getAID() != null)
        {
            map1.put("aid", StaticMethods.getAID());
        }
        if (StaticMethods.getVisitorID() != null)
        {
            map1.put("vid", StaticMethods.getVisitorID());
        }
        map1.put("ce", MobileConfig.getInstance().getCharacterSet());
        if (MobileConfig.getInstance().getOfflineTrackingEnabled())
        {
            map1.put("ts", Long.toString(l));
        }
        map1.put("t", StaticMethods.getTimestampString());
        iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s = (String)entry.getKey();
            if (s == null)
            {
                iterator.remove();
            } else
            if (s.startsWith("&&"))
            {
                map1.put(s.substring("&&".length()), entry.getValue());
                iterator.remove();
            }
        } while (true);
        Messages.checkForInAppMessage(new HashMap(map1), new HashMap(map), new HashMap(Lifecycle.getContextDataLowercase()));
        map1.put("c", StaticMethods.translateContextData(map));
        map = new StringBuilder(2048);
        map.append("ndh=1");
        map.append(StaticMethods.serializeToQueryString(map1));
        StaticMethods.logDebugFormat("Analytics - Attempting to send request parameters(%s)", new Object[] {
            map
        });
        AnalyticsWorker.sharedInstance().queue(map.toString(), l);
    }
}
