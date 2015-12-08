// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            gd

public class es
{

    private static final String a = com/flurry/sdk/es.getSimpleName();

    public es()
    {
    }

    public Map a(String s)
    {
        gd.a(3, a, "Parsing referrer map");
        if (s == null)
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        String as[] = s.split("&");
        int i = as.length;
        int j = as.length;
        i = 0;
        while (i < j) 
        {
            String s2 = as[i];
            String as1[] = s2.split("=");
            if (as1.length != 2)
            {
                gd.a(5, a, (new StringBuilder()).append("Invalid referrer Element: ").append(s2).append(" in referrer tag ").append(s).toString());
            } else
            {
                String s3 = URLDecoder.decode(as1[0]);
                String s1 = URLDecoder.decode(as1[1]);
                if (hashmap.get(s3) == null)
                {
                    hashmap.put(s3, new ArrayList());
                }
                ((List)hashmap.get(s3)).add(s1);
            }
            i++;
        }
        java.util.Map.Entry entry;
        for (s = hashmap.entrySet().iterator(); s.hasNext(); gd.a(3, a, (new StringBuilder()).append("entry: ").append((String)entry.getKey()).append("=").append(entry.getValue()).toString()))
        {
            entry = (java.util.Map.Entry)s.next();
        }

        s = new StringBuilder();
        if (hashmap.get("utm_source") == null)
        {
            s.append("Campaign Source is missing.\n");
        }
        if (hashmap.get("utm_medium") == null)
        {
            s.append("Campaign Medium is missing.\n");
        }
        if (hashmap.get("utm_campaign") == null)
        {
            s.append("Campaign Name is missing.\n");
        }
        if (s.length() > 0)
        {
            gd.a(5, a, (new StringBuilder()).append("Detected missing referrer keys : ").append(s.toString()).toString());
        }
        return hashmap;
    }

}
