// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.a.a.a:
//            C

final class B
{
    public static final class a
    {

        final b a;
        final long b = System.currentTimeMillis();
        public Map c;
        String d;
        Map e;
        String f;
        Map g;

        public a(b b1)
        {
            a = b1;
            c = Collections.emptyMap();
            d = null;
            e = Collections.emptyMap();
            f = null;
            g = Collections.emptyMap();
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        private static final b m[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/a/a/a/B$b, s);
        }

        public static b[] values()
        {
            return (b[])m.clone();
        }

        static 
        {
            a = new b("CREATE", 0);
            b = new b("START", 1);
            c = new b("RESUME", 2);
            d = new b("SAVE_INSTANCE_STATE", 3);
            e = new b("PAUSE", 4);
            f = new b("STOP", 5);
            g = new b("DESTROY", 6);
            h = new b("ERROR", 7);
            i = new b("CRASH", 8);
            j = new b("INSTALL", 9);
            k = new b("CUSTOM", 10);
            l = new b("PREDEFINED", 11);
            m = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    public final C a;
    public final long b;
    public final b c;
    public final Map d;
    public final String e;
    public final Map f;
    public final String g;
    public final Map h;
    private String i;

    private B(C c1, long l, b b1, Map map, String s, Map map1, 
            String s1, Map map2)
    {
        a = c1;
        b = l;
        c = b1;
        d = map;
        e = s;
        f = map1;
        g = s1;
        h = map2;
    }

    B(C c1, long l, b b1, Map map, String s, Map map1, 
            String s1, Map map2, byte byte0)
    {
        this(c1, l, b1, map, s, map1, s1, map2);
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
