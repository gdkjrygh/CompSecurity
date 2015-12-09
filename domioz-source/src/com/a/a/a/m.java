// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.a.a.a:
//            n, o

final class m
{

    public final o a;
    public final long b;
    public final n c;
    public final Map d;
    public final String e = null;
    public final Map f;
    private String g;

    private m(o o, long l, n n1, Map map, Map map1)
    {
        a = o;
        b = l;
        c = n1;
        d = map;
        f = map1;
    }

    public static m a(o o)
    {
        return a(o, n.j, Collections.emptyMap());
    }

    public static m a(o o, n n1, Activity activity)
    {
        return a(o, n1, Collections.singletonMap("activity", activity.getClass().getName()));
    }

    private static m a(o o, n n1, Map map)
    {
        Map map1 = Collections.emptyMap();
        return new m(o, System.currentTimeMillis(), n1, map, map1);
    }

    public static m a(o o, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return a(o, n.i, ((Map) (s)));
    }

    public final String toString()
    {
        if (g == null)
        {
            g = (new StringBuilder("[")).append(getClass().getSimpleName()).append(": timestamp=").append(b).append(", type=").append(c).append(", details=").append(d.toString()).append(", customType=").append(e).append(", customAttributes=").append(f.toString()).append(", metadata=[").append(a).append("]]").toString();
        }
        return g;
    }
}
