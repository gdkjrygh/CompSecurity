// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.a;
import com.microsoft.advertising.android.a.c;
import com.microsoft.advertising.android.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            d, ae, av, AdControl

final class h
    implements a
{

    private final AdControl a;
    private final com.microsoft.advertising.android.a.a.a b;
    private final e c;
    private Map d;

    public h(AdControl adcontrol, com.microsoft.advertising.android.a.a.a a1)
    {
        this(adcontrol, a1, ((c) (null)), ((e) (null)), null);
    }

    private h(AdControl adcontrol, com.microsoft.advertising.android.a.a.a a1, c c1, e e, String s)
    {
        d = new TreeMap();
        a = adcontrol;
        b = a1;
        c = e;
        a("message", s);
        a("adLog", c1);
    }

    h(AdControl adcontrol, com.microsoft.advertising.android.a.a.a a1, e e, String s, String s1)
    {
        this(adcontrol, a1, ((c) (null)), e, s);
        a("errorReason", s1);
    }

    public h(AdControl adcontrol, com.microsoft.advertising.android.a.a.a a1, d d1)
    {
        if (d1 != null)
        {
            d1 = d1.c();
        } else
        {
            d1 = null;
        }
        this(adcontrol, a1, ((c) (d1)), ((e) (null)), null);
    }

    h(AdControl adcontrol, ae ae1)
    {
        this(adcontrol, com.microsoft.advertising.android.a.a.a.j);
        d.put("debugEvent", ae1);
    }

    public static h a(AdControl adcontrol, String s, Long long1)
    {
        adcontrol = new h(adcontrol, ae.n);
        adcontrol.a("metricName", s);
        adcontrol.a("metricValue", long1);
        return adcontrol;
    }

    public final AdControl a()
    {
        return a;
    }

    public final Object a(String s)
    {
        if (!"debugEventTag".equals(s))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        s = (ae)a("debugEvent");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        return s.a();
        s = ((String) (d.get(s)));
        return s;
        s;
        com.microsoft.advertising.android.av.a("AdEventImpl", "exception in getExtra()", s);
        return null;
    }

    public final void a(String s, Object obj)
    {
        d.put(s, obj);
    }

    public final com.microsoft.advertising.android.a.a.a b()
    {
        return b;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("type=").append(b);
        Iterator iterator = d.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return stringbuilder.toString();
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            stringbuilder.append(" ").append((String)entry.getKey()).append("=").append(entry.getValue());
        } while (true);
    }
}
