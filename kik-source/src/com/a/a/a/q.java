// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.a.a.a:
//            r

final class q
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        private static final a l[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/a/a/a/q$a, s);
        }

        public static a[] values()
        {
            return (a[])l.clone();
        }

        static 
        {
            a = new a("CREATE", 0);
            b = new a("START", 1);
            c = new a("RESUME", 2);
            d = new a("SAVE_INSTANCE_STATE", 3);
            e = new a("PAUSE", 4);
            f = new a("STOP", 5);
            g = new a("DESTROY", 6);
            h = new a("ERROR", 7);
            i = new a("CRASH", 8);
            j = new a("INSTALL", 9);
            k = new a("CUSTOM", 10);
            l = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    public final r a;
    public final long b;
    public final a c;
    public final Map d;
    public final String e = null;
    public final Map f;
    private String g;

    private q(r r, long l, a a1, Map map, Map map1)
    {
        a = r;
        b = l;
        c = a1;
        d = map;
        f = map1;
    }

    public static q a(r r)
    {
        return a(r, a.j, Collections.emptyMap());
    }

    public static q a(r r, a a1, Activity activity)
    {
        return a(r, a1, Collections.singletonMap("activity", activity.getClass().getName()));
    }

    private static q a(r r, a a1, Map map)
    {
        Map map1 = Collections.emptyMap();
        return new q(r, System.currentTimeMillis(), a1, map, map1);
    }

    public static q a(r r, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return a(r, a.h, ((Map) (s)));
    }

    public static q b(r r, String s)
    {
        s = Collections.singletonMap("sessionId", s);
        return a(r, a.i, s);
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
