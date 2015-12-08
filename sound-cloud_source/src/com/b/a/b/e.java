// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.b.a.a.a.b;
import com.b.a.b.a.g;
import com.b.a.b.g.a;
import com.b.a.c.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

// Referenced classes of package com.b.a.b:
//            c

public final class e
{
    public static final class a
    {

        public static final int a;
        public Context b;
        public Executor c;
        public Executor d;
        public boolean e;
        public boolean f;
        public int g;
        public int h;
        public boolean i;
        public int j;
        public int k;
        public long l;
        public int m;
        public com.b.a.a.b.a n;
        public com.b.a.a.a.b o;
        public com.b.a.a.a.b.a p;
        public com.b.a.b.d.b q;
        public com.b.a.b.b.b r;
        public com.b.a.b.c s;
        public boolean t;
        private int u;
        private int v;
        private int w;
        private int x;
        private com.b.a.b.g.a y;

        static Context a(a a1)
        {
            return a1.b;
        }

        static int b(a a1)
        {
            return a1.u;
        }

        static int c(a a1)
        {
            return a1.v;
        }

        static int d(a a1)
        {
            return a1.w;
        }

        static int e(a a1)
        {
            return a1.x;
        }

        static com.b.a.b.g.a f(a a1)
        {
            return a1.y;
        }

        static Executor g(a a1)
        {
            return a1.c;
        }

        static Executor h(a a1)
        {
            return a1.d;
        }

        static int i(a a1)
        {
            return a1.g;
        }

        static int j(a a1)
        {
            return a1.h;
        }

        static int k(a a1)
        {
            return a1.j;
        }

        static com.b.a.a.a.b l(a a1)
        {
            return a1.o;
        }

        static com.b.a.a.b.a m(a a1)
        {
            return a1.n;
        }

        static com.b.a.b.c n(a a1)
        {
            return a1.s;
        }

        static com.b.a.b.d.b o(a a1)
        {
            return a1.q;
        }

        static com.b.a.b.b.b p(a a1)
        {
            return a1.r;
        }

        static boolean q(a a1)
        {
            return a1.e;
        }

        static boolean r(a a1)
        {
            return a1.f;
        }

        static boolean s(a a1)
        {
            return a1.t;
        }

        static 
        {
            a = g.a;
        }

        public a(Context context)
        {
            u = 0;
            v = 0;
            w = 0;
            x = 0;
            y = null;
            c = null;
            d = null;
            e = false;
            f = false;
            g = 3;
            h = 4;
            i = false;
            j = a;
            k = 0;
            l = 0L;
            m = 0;
            n = null;
            o = null;
            p = null;
            q = null;
            s = null;
            t = false;
            b = context.getApplicationContext();
        }
    }

    private static final class b
        implements com.b.a.b.d.b
    {

        private final com.b.a.b.d.b a;

        public final InputStream a(String s1, Object obj)
            throws IOException
        {
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.b.a.b.d.b.a.values().length];
                    try
                    {
                        a[com.b.a.b.d.b.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.b.a.b.d.b.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.b.a.b._cls1.a[com.b.a.b.d.b.a.a(s1).ordinal()])
            {
            default:
                return a.a(s1, obj);

            case 1: // '\001'
            case 2: // '\002'
                throw new IllegalStateException();
            }
        }

        public b(com.b.a.b.d.b b1)
        {
            a = b1;
        }
    }

    private static final class c
        implements com.b.a.b.d.b
    {

        private final com.b.a.b.d.b a;

        public final InputStream a(String s1, Object obj)
            throws IOException
        {
            obj = a.a(s1, obj);
            switch (com.b.a.b._cls1.a[com.b.a.b.d.b.a.a(s1).ordinal()])
            {
            default:
                return ((InputStream) (obj));

            case 1: // '\001'
            case 2: // '\002'
                return new com.b.a.b.a.c(((InputStream) (obj)));
            }
        }

        public c(com.b.a.b.d.b b1)
        {
            a = b1;
        }
    }


    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final com.b.a.b.g.a f;
    final Executor g;
    final Executor h;
    final boolean i;
    final boolean j;
    final int k;
    final int l;
    final int m;
    public final com.b.a.a.b.a n;
    public final com.b.a.a.a.b o;
    final com.b.a.b.d.b p;
    final com.b.a.b.b.b q;
    final com.b.a.b.c r;
    final com.b.a.b.d.b s;
    final com.b.a.b.d.b t;

    private e(a a1)
    {
        a = com.b.a.b.a.a(a1).getResources();
        b = com.b.a.b.a.b(a1);
        c = com.b.a.b.a.c(a1);
        d = a.d(a1);
        e = a.e(a1);
        f = a.f(a1);
        g = com.b.a.b.a.g(a1);
        h = a.h(a1);
        k = a.i(a1);
        l = a.j(a1);
        m = a.k(a1);
        o = a.l(a1);
        n = a.m(a1);
        r = a.n(a1);
        p = a.o(a1);
        q = a.p(a1);
        i = a.q(a1);
        j = a.r(a1);
        s = new b(p);
        t = new c(p);
        com.b.a.c.c.a(a.s(a1));
    }

    public e(a a1, byte byte0)
    {
        this(a1);
    }

    final com.b.a.b.a.e a()
    {
        DisplayMetrics displaymetrics = a.getDisplayMetrics();
        int j1 = b;
        int i1 = j1;
        if (j1 <= 0)
        {
            i1 = displaymetrics.widthPixels;
        }
        int k1 = c;
        j1 = k1;
        if (k1 <= 0)
        {
            j1 = displaymetrics.heightPixels;
        }
        return new com.b.a.b.a.e(i1, j1);
    }
}
