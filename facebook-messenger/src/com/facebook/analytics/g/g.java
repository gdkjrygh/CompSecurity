// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.g;

import com.facebook.analytics.am;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.analytics.g:
//            e

public class g
    implements e
{

    private ConcurrentHashMap a;
    private a b;

    public g(a a1)
    {
        a = new ConcurrentHashMap();
        b = a1;
    }

    public boolean a(am am1)
    {
        if (am1.a("throttle_key") && am1.a("throttle_duration"))
        {
            String s = am1.b("throttle_key");
            long l;
            long l1;
            try
            {
                l = Long.parseLong(am1.b("throttle_duration"));
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                com.facebook.debug.log.b.a("Invalid throttle duration tag.", am1);
                return false;
            }
            l1 = b.a();
            am1 = (Long)a.get(s);
            if (am1 == null || l1 - am1.longValue() > l)
            {
                a.put(s, Long.valueOf(l1));
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }
}
