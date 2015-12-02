// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics:
//            cb

public class cm
{

    public cm()
    {
    }

    public static cb a(String s, String s1, Map map, String s2, String s3)
    {
        s = new cb(s.toLowerCase());
        s.b("status", s1.toLowerCase());
        if (s2 != null)
        {
            s.f(s2);
        }
        if (s3 != null)
        {
            s.g(s3);
        }
        if (map != null)
        {
            for (s1 = map.entrySet().iterator(); s1.hasNext(); s.b((String)map.getKey(), (String)map.getValue()))
            {
                map = (java.util.Map.Entry)s1.next();
            }

        }
        return s;
    }
}
