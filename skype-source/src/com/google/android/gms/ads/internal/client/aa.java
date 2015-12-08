// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            n

public final class aa
{
    public static final class a
    {

        private final HashSet a = new HashSet();
        private final Bundle b = new Bundle();
        private final HashMap c = new HashMap();
        private final HashSet d = new HashSet();
        private final Bundle e = new Bundle();
        private final HashSet f = new HashSet();
        private Date g;
        private String h;
        private int i;
        private Location j;
        private boolean k;
        private String l;
        private String m;
        private int n;

        static Date a(a a1)
        {
            return a1.g;
        }

        static String b(a a1)
        {
            return a1.h;
        }

        static int c(a a1)
        {
            return a1.i;
        }

        static HashSet d(a a1)
        {
            return a1.a;
        }

        static Location e(a a1)
        {
            return a1.j;
        }

        static boolean f(a a1)
        {
            return a1.k;
        }

        static Bundle g(a a1)
        {
            return a1.b;
        }

        static HashMap h(a a1)
        {
            return a1.c;
        }

        static String i(a a1)
        {
            return a1.l;
        }

        static String j(a a1)
        {
            return a1.m;
        }

        static int k(a a1)
        {
            return a1.n;
        }

        static HashSet l(a a1)
        {
            return a1.d;
        }

        static Bundle m(a a1)
        {
            return a1.e;
        }

        static HashSet n(a a1)
        {
            return a1.f;
        }

        public final void a(int i1)
        {
            i = i1;
        }

        public final void a(Location location)
        {
            j = location;
        }

        public final void a(Class class1, Bundle bundle)
        {
            b.putBundle(class1.getName(), bundle);
        }

        public final void a(String s)
        {
            a.add(s);
        }

        public final void a(Date date)
        {
            g = date;
        }

        public final void a(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            n = i1;
        }

        public final void b(String s)
        {
            d.add(s);
        }

        public final void c(String s)
        {
            d.remove(s);
        }

        public a()
        {
            i = -1;
            k = false;
            n = -1;
        }
    }


    public static final String a = com.google.android.gms.ads.internal.util.client.a.a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map i;
    private final String j;
    private final String k;
    private final com.google.android.gms.ads.search.a l;
    private final int m;
    private final Set n;
    private final Bundle o;
    private final Set p;

    public aa(a a1)
    {
        this(a1, (byte)0);
    }

    private aa(a a1, byte byte0)
    {
        b = com.google.android.gms.ads.internal.client.a.a(a1);
        c = a.b(a1);
        d = a.c(a1);
        e = Collections.unmodifiableSet(a.d(a1));
        f = a.e(a1);
        g = a.f(a1);
        h = a.g(a1);
        i = Collections.unmodifiableMap(a.h(a1));
        j = a.i(a1);
        k = a.j(a1);
        l = null;
        m = a.k(a1);
        n = Collections.unmodifiableSet(a.l(a1));
        o = a.m(a1);
        p = Collections.unmodifiableSet(a.n(a1));
    }

    public final Bundle a(Class class1)
    {
        return h.getBundle(class1.getName());
    }

    public final Date a()
    {
        return b;
    }

    public final boolean a(Context context)
    {
        Set set = n;
        com.google.android.gms.ads.internal.client.n.a();
        return set.contains(com.google.android.gms.ads.internal.util.client.a.a(context));
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final Set d()
    {
        return e;
    }

    public final Location e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final String g()
    {
        return j;
    }

    public final String h()
    {
        return k;
    }

    public final com.google.android.gms.ads.search.a i()
    {
        return l;
    }

    public final Map j()
    {
        return i;
    }

    public final Bundle k()
    {
        return h;
    }

    public final int l()
    {
        return m;
    }

    public final Bundle m()
    {
        return o;
    }

    public final Set n()
    {
        return p;
    }

    static 
    {
        com.google.android.gms.ads.internal.client.n.a();
    }
}
