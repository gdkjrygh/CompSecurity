// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import java.util.Map;

// Referenced classes of package com.b.a.a:
//            aa, z

final class x
{

    public final aa a;
    public final long b;
    public final z c;
    public final Map d;
    public final String e;
    public final Map f;
    public final String g;
    public final Map h;
    private String i;

    private x(aa aa, long l, z z, Map map, String s, Map map1, 
            String s1, Map map2)
    {
        a = aa;
        b = l;
        c = z;
        d = map;
        e = s;
        f = map1;
        g = s1;
        h = map2;
    }

    x(aa aa, long l, z z, Map map, String s, Map map1, 
            String s1, Map map2, byte byte0)
    {
        this(aa, l, z, map, s, map1, s1, map2);
    }

    public final String toString()
    {
        if (i == null)
        {
            i = (new StringBuilder("[")).append(getClass().getSimpleName()).append(": timestamp=").append(b).append(", type=").append(c).append(", details=").append(d.toString()).append(", customType=").append(e).append(", customAttributes=").append(f.toString()).append(", predefinedType=").append(g).append(", predefinedAttributes=").append(h.toString()).append(", metadata=[").append(a).append("]]").toString();
        }
        return i;
    }
}
