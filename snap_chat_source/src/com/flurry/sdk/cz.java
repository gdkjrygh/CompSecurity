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
//            el

public class cz
{

    private static final String a = com/flurry/sdk/cz.getSimpleName();

    public cz()
    {
    }

    public Map a(String s)
    {
        el.a(3, a, "Parsing referrer map");
        if (s == null)
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        String as[] = s.split("&");
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String as1[] = as[i].split("=");
            if (as1.length != 2)
            {
                el.a(5, a, (new StringBuilder("Invalid referrer Element: ")).append(as[i]).append(" in referrer tag ").append(s).toString());
            } else
            {
                String s1 = URLDecoder.decode(as1[0]);
                String s2 = URLDecoder.decode(as1[1]);
                if (hashmap.get(s1) == null)
                {
                    hashmap.put(s1, new ArrayList());
                }
                ((List)hashmap.get(s1)).add(s2);
            }
            i++;
        }
        java.util.Map.Entry entry;
        for (s = hashmap.entrySet().iterator(); s.hasNext(); el.a(3, a, (new StringBuilder("entry: ")).append((String)entry.getKey()).append("=").append(entry.getValue()).toString()))
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
            el.a(5, a, (new StringBuilder("Detected missing referrer keys : ")).append(s.toString()).toString());
        }
        return hashmap;
    }

}
