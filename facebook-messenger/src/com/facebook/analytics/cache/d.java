// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;

import com.facebook.analytics.a;
import com.facebook.analytics.b.c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics.cache:
//            c

public class d extends a
{

    public d(c c1)
    {
        super(c1);
    }

    protected String a()
    {
        return "cache_counters";
    }

    public void b()
    {
        Iterator iterator = d().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (!((String)entry.getKey()).contains(c.BYTES_COUNT.toString()))
            {
                a((String)entry.getKey());
            } else
            if (((Long)entry.getValue()).longValue() == 0L)
            {
                a((String)entry.getKey());
            }
        } while (true);
    }
}
