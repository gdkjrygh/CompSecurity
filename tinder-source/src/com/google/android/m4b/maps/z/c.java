// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.q;
import com.google.android.m4b.maps.y.s;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.z:
//            e, o, l, d

public final class c
{
    static final class a extends Enum
        implements l
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/z/c$a, s1);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s1)
        {
            super(s1, 0);
        }
    }

    static final class b extends Enum
        implements o
    {

        public static final b a;
        private static final b b[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/z/c$b, s1);
        }

        public static b[] values()
        {
            return (b[])b.clone();
        }

        static 
        {
            a = new b("INSTANCE");
            b = (new b[] {
                a
            });
        }

        private b(String s1)
        {
            super(s1, 0);
        }
    }


    static final s a = new s() {

        public final long a()
        {
            return 0L;
        }

    };
    private static q q = new com.google.android.m4b.maps.y.r.a(new a.b() {

        public final void a()
        {
        }

        public final void a(long l1)
        {
        }

        public final void b()
        {
        }

        public final void b(long l1)
        {
        }

        public final void c()
        {
        }

    });
    private static com.google.android.m4b.maps.z.e r = new com.google.android.m4b.maps.z.e();
    private static q s = new q() {

        public final Object a()
        {
            return new a.a();
        }

    };
    private static final Logger t = Logger.getLogger(com/google/android/m4b/maps/z/c.getName());
    boolean b;
    int c;
    int d;
    long e;
    long f;
    o g;
    g.s h;
    long i;
    long j;
    long k;
    e l;
    e m;
    l n;
    s o;
    q p;
    private g.s u;

    c()
    {
        b = true;
        c = -1;
        d = -1;
        e = -1L;
        f = -1L;
        i = -1L;
        j = -1L;
        k = -1L;
        p = q;
    }

    public static c a()
    {
        return new c();
    }

    public final f a(d d1)
    {
        d();
        return new g.l(this, d1);
    }

    public final c a(g.s s1)
    {
        boolean flag;
        if (u == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "Key strength was already set to %s", new Object[] {
            u
        });
        u = (g.s)com.google.android.m4b.maps.y.j.a(s1);
        return this;
    }

    final g.s b()
    {
        return (g.s)com.google.android.m4b.maps.y.h.b(u, g.s.a);
    }

    final g.s c()
    {
        return (g.s)com.google.android.m4b.maps.y.h.b(h, g.s.a);
    }

    final void d()
    {
        boolean flag2 = true;
        boolean flag = true;
        if (g == null)
        {
            if (f != -1L)
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "maximumWeight requires weigher");
        } else
        {
            if (b)
            {
                boolean flag1;
                if (f != -1L)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                com.google.android.m4b.maps.y.j.b(flag1, "weigher requires maximumWeight");
                return;
            }
            if (f == -1L)
            {
                t.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                return;
            }
        }
    }

    public final String toString()
    {
        com.google.android.m4b.maps.y.h.a a1 = com.google.android.m4b.maps.y.h.a(this);
        if (c != -1)
        {
            a1.a("initialCapacity", c);
        }
        if (d != -1)
        {
            a1.a("concurrencyLevel", d);
        }
        if (e != -1L)
        {
            a1.a("maximumSize", e);
        }
        if (f != -1L)
        {
            a1.a("maximumWeight", f);
        }
        if (i != -1L)
        {
            a1.a("expireAfterWrite", (new StringBuilder()).append(i).append("ns").toString());
        }
        if (j != -1L)
        {
            a1.a("expireAfterAccess", (new StringBuilder()).append(j).append("ns").toString());
        }
        if (u != null)
        {
            a1.a("keyStrength", com.google.android.m4b.maps.y.c.a(u.toString()));
        }
        if (h != null)
        {
            a1.a("valueStrength", com.google.android.m4b.maps.y.c.a(h.toString()));
        }
        if (l != null)
        {
            a1.a("keyEquivalence");
        }
        if (m != null)
        {
            a1.a("valueEquivalence");
        }
        if (n != null)
        {
            a1.a("removalListener");
        }
        return a1.toString();
    }

}
