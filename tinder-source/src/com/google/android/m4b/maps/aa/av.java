// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.c;
import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            w, aw, ab

public final class av extends w
{
    static final class a extends AbstractMap
        implements Serializable, ConcurrentMap
    {

        private static final long serialVersionUID = 0L;
        private final c a;
        private final b b;

        public final boolean containsKey(Object obj)
        {
            return false;
        }

        public final boolean containsValue(Object obj)
        {
            return false;
        }

        public final Set entrySet()
        {
            return Collections.emptySet();
        }

        public final Object get(Object obj)
        {
            return null;
        }

        public final Object put(Object obj, Object obj1)
        {
            com.google.android.m4b.maps.y.j.a(obj);
            com.google.android.m4b.maps.y.j.a(obj1);
            new d(obj, obj1, b);
            return null;
        }

        public final Object putIfAbsent(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public final Object remove(Object obj)
        {
            return null;
        }

        public final boolean remove(Object obj, Object obj1)
        {
            return false;
        }

        public final Object replace(Object obj, Object obj1)
        {
            com.google.android.m4b.maps.y.j.a(obj);
            com.google.android.m4b.maps.y.j.a(obj1);
            return null;
        }

        public final boolean replace(Object obj, Object obj1, Object obj2)
        {
            com.google.android.m4b.maps.y.j.a(obj);
            com.google.android.m4b.maps.y.j.a(obj2);
            return false;
        }

        a(av av1)
        {
            a = av1.e();
            b = av1.i;
        }
    }

    static class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b f[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/aa/av$b, s);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        static 
        {
            a = new b("EXPLICIT") {

            };
            b = new b("REPLACED") {

            };
            c = new b("COLLECTED") {

            };
            d = new b("EXPIRED") {

            };
            e = new b("SIZE") {

            };
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }

        b(String s, int k, byte byte0)
        {
            this(s, k);
        }
    }

    static interface c
    {
    }

    static final class d extends ab
    {

        private static final long serialVersionUID = 0L;
        private final b a;

        d(Object obj, Object obj1, b b1)
        {
            super(obj, obj1);
            a = b1;
        }
    }


    boolean a;
    int b;
    int c;
    int d;
    aw.p e;
    aw.p f;
    long g;
    long h;
    b i;
    e j;

    public av()
    {
        b = -1;
        c = -1;
        d = -1;
        g = -1L;
        h = -1L;
    }

    final int a()
    {
        if (b == -1)
        {
            return 16;
        } else
        {
            return b;
        }
    }

    final void a(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (g == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(g)
        });
        if (h == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.b(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(h)
        });
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l), timeunit
        });
    }

    final int b()
    {
        if (c == -1)
        {
            return 4;
        } else
        {
            return c;
        }
    }

    final aw.p c()
    {
        return (aw.p)com.google.android.m4b.maps.y.h.b(e, aw.p.a);
    }

    public final ConcurrentMap d()
    {
        if (!a)
        {
            return new ConcurrentHashMap(a(), 0.75F, b());
        }
        Object obj;
        if (i == null)
        {
            obj = new aw(this);
        } else
        {
            obj = new a(this);
        }
        return (ConcurrentMap)obj;
    }

    public final String toString()
    {
        com.google.android.m4b.maps.y.h.a a1 = com.google.android.m4b.maps.y.h.a(this);
        if (b != -1)
        {
            a1.a("initialCapacity", b);
        }
        if (c != -1)
        {
            a1.a("concurrencyLevel", c);
        }
        if (d != -1)
        {
            a1.a("maximumSize", d);
        }
        if (g != -1L)
        {
            a1.a("expireAfterWrite", (new StringBuilder()).append(g).append("ns").toString());
        }
        if (h != -1L)
        {
            a1.a("expireAfterAccess", (new StringBuilder()).append(h).append("ns").toString());
        }
        if (e != null)
        {
            a1.a("keyStrength", com.google.android.m4b.maps.y.c.a(e.toString()));
        }
        if (f != null)
        {
            a1.a("valueStrength", com.google.android.m4b.maps.y.c.a(f.toString()));
        }
        if (j != null)
        {
            a1.a("keyEquivalence");
        }
        if (k != null)
        {
            a1.a("removalListener");
        }
        return a1.toString();
    }
}
