// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cp;

import com.google.android.m4b.maps.cu.f;
import com.google.android.m4b.maps.cu.j;
import java.util.Arrays;

public interface com.google.android.m4b.maps.cp.a
{
    public static final class a extends com.google.android.m4b.maps.cu.b
    {

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            super.a(a1);
        }

        protected final int b()
        {
            return super.b();
        }
    }

    public static final class b extends com.google.android.m4b.maps.cu.b
    {

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            throw new NullPointerException();
        }

        protected final int b()
        {
            super.b();
            throw new NullPointerException();
        }
    }

    public static final class c extends com.google.android.m4b.maps.cu.b
    {

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            if (!Arrays.equals(null, j.a))
            {
                a1.a(1, null);
            }
            super.a(a1);
        }

        protected final int b()
        {
            int k = super.b();
            int i = k;
            if (!Arrays.equals(null, j.a))
            {
                i = k + com.google.android.m4b.maps.cu.a.b(1, null);
            }
            return i;
        }
    }

    public static final class d extends com.google.android.m4b.maps.cu.b
    {

        public long a;
        public byte b[];
        public long c;
        private long d;
        private String e;
        private int f;
        private int g;
        private boolean h;
        private e i[];
        private b j;
        private byte k[];
        private byte l[];
        private a o;
        private String p;
        private c q;
        private byte r[];

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            if (a != 0L)
            {
                a1.a(1, a);
            }
            if (!e.equals(""))
            {
                a1.a(2, e);
            }
            if (i != null && i.length > 0)
            {
                for (int i1 = 0; i1 < i.length; i1++)
                {
                    e e1 = i[i1];
                    if (e1 != null)
                    {
                        a1.c(3, 2);
                        a1.a(e1);
                    }
                }

            }
            if (!Arrays.equals(b, j.a))
            {
                a1.a(6, b);
            }
            if (!Arrays.equals(k, j.a))
            {
                a1.a(8, k);
            }
            if (!Arrays.equals(l, j.a))
            {
                a1.a(13, l);
            }
            if (!p.equals(""))
            {
                a1.a(14, p);
            }
            if (c != 0x2bf20L)
            {
                long l1 = c;
                a1.c(15, 0);
                a1.a(com.google.android.m4b.maps.cu.a.c(l1));
            }
            if (0L != 0L)
            {
                a1.a(17, 0L);
            }
            if (!Arrays.equals(r, j.a))
            {
                a1.a(18, r);
            }
            super.a(a1);
        }

        protected final int b()
        {
            int i1 = super.b();
            int j1 = i1;
            if (a != 0L)
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(1, a);
            }
            i1 = j1;
            if (!e.equals(""))
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(2, e);
            }
            j1 = i1;
            if (i != null)
            {
                j1 = i1;
                if (i.length > 0)
                {
                    for (j1 = 0; j1 < i.length;)
                    {
                        e e1 = i[j1];
                        int k1 = i1;
                        if (e1 != null)
                        {
                            k1 = i1 + com.google.android.m4b.maps.cu.a.a(3, e1);
                        }
                        j1++;
                        i1 = k1;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (!Arrays.equals(b, j.a))
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(6, b);
            }
            j1 = i1;
            if (!Arrays.equals(k, j.a))
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(8, k);
            }
            i1 = j1;
            if (!Arrays.equals(l, j.a))
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(13, l);
            }
            j1 = i1;
            if (!p.equals(""))
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(14, p);
            }
            i1 = j1;
            if (c != 0x2bf20L)
            {
                long l1 = c;
                i1 = j1 + (com.google.android.m4b.maps.cu.a.a(15) + com.google.android.m4b.maps.cu.a.b(com.google.android.m4b.maps.cu.a.c(l1)));
            }
            j1 = i1;
            if (0L != 0L)
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(17, 0L);
            }
            i1 = j1;
            if (!Arrays.equals(r, j.a))
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(18, r);
            }
            return i1;
        }

        public d()
        {
            a = 0L;
            d = 0L;
            e = "";
            f = 0;
            g = 0;
            h = false;
            i = e.a();
            j = null;
            b = j.a;
            k = j.a;
            l = j.a;
            o = null;
            p = "";
            c = 0x2bf20L;
            q = null;
            r = j.a;
            m = null;
            n = -1;
        }
    }

    public static final class e extends com.google.android.m4b.maps.cu.b
    {

        private static volatile e a[];
        private String b;
        private String c;

        public static e[] a()
        {
            if (a == null)
            {
                synchronized (f.a)
                {
                    if (a == null)
                    {
                        a = new e[0];
                    }
                }
            }
            return a;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            if (!b.equals(""))
            {
                a1.a(1, b);
            }
            if (!c.equals(""))
            {
                a1.a(2, c);
            }
            super.a(a1);
        }

        protected final int b()
        {
            int j = super.b();
            int i = j;
            if (!b.equals(""))
            {
                i = j + com.google.android.m4b.maps.cu.a.b(1, b);
            }
            j = i;
            if (!c.equals(""))
            {
                j = i + com.google.android.m4b.maps.cu.a.b(2, c);
            }
            return j;
        }

        public e()
        {
            b = "";
            c = "";
            m = null;
            n = -1;
        }
    }

}
