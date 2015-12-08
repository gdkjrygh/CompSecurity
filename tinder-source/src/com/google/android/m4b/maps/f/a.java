// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.f;

import com.google.android.m4b.maps.cu.b;
import com.google.android.m4b.maps.cu.g;
import java.nio.ByteBuffer;

public interface com.google.android.m4b.maps.f.a
{
    public static final class a extends b
        implements Cloneable
    {

        public int a;
        public String b;
        public int c;
        public String d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public String i;
        public int j;
        public boolean k;
        public int l;
        private long o;

        public final a a()
        {
            a a1;
            try
            {
                a1 = (a)super.c();
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new AssertionError(clonenotsupportedexception);
            }
            return a1;
        }

        public final void a(com.google.android.m4b.maps.cu.a a1)
        {
            if (a != 1)
            {
                a1.a(1, a);
            }
            if (!b.equals(""))
            {
                a1.a(2, b);
            }
            if (c != 0)
            {
                a1.a(3, c);
            }
            if (!d.equals(""))
            {
                a1.a(4, d);
            }
            if (e != 0)
            {
                a1.a(5, e);
            }
            if (f != 0)
            {
                a1.a(6, f);
            }
            if (g != 0)
            {
                a1.a(7, g);
            }
            if (h)
            {
                a1.a(8, h);
            }
            if (!i.equals(""))
            {
                a1.a(9, i);
            }
            if (j != 0)
            {
                a1.a(10, j);
            }
            if (0L != 0L)
            {
                a1.c(11, 1);
                if (a1.a.remaining() < 8)
                {
                    throw new com.google.android.m4b.maps.cu.a(a1.a.position(), a1.a.limit());
                }
                a1.a.putLong(0L);
            }
            if (k)
            {
                a1.a(12, k);
            }
            if (l != 0)
            {
                a1.a(13, l);
            }
            super.a(a1);
        }

        protected final int b()
        {
            int j1 = super.b();
            int i1 = j1;
            if (a != 1)
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(1, a);
            }
            j1 = i1;
            if (!b.equals(""))
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(2, b);
            }
            i1 = j1;
            if (c != 0)
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(3, c);
            }
            j1 = i1;
            if (!d.equals(""))
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(4, d);
            }
            i1 = j1;
            if (e != 0)
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(5, e);
            }
            j1 = i1;
            if (f != 0)
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(6, f);
            }
            i1 = j1;
            if (g != 0)
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(7, g);
            }
            j1 = i1;
            if (h)
            {
                j1 = i1 + (com.google.android.m4b.maps.cu.a.a(8) + 1);
            }
            i1 = j1;
            if (!i.equals(""))
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(9, i);
            }
            j1 = i1;
            if (j != 0)
            {
                j1 = i1 + com.google.android.m4b.maps.cu.a.b(10, j);
            }
            i1 = j1;
            if (0L != 0L)
            {
                i1 = j1 + (com.google.android.m4b.maps.cu.a.a(11) + 8);
            }
            j1 = i1;
            if (k)
            {
                j1 = i1 + (com.google.android.m4b.maps.cu.a.a(12) + 1);
            }
            i1 = j1;
            if (l != 0)
            {
                i1 = j1 + com.google.android.m4b.maps.cu.a.b(13, l);
            }
            return i1;
        }

        public final b c()
        {
            return a();
        }

        public final Object clone()
        {
            return a();
        }

        public final g d()
        {
            return a();
        }

        public a()
        {
            a = 1;
            b = "";
            c = 0;
            d = "";
            e = 0;
            f = 0;
            g = 0;
            h = false;
            i = "";
            j = 0;
            o = 0L;
            k = false;
            l = 0;
            m = null;
            n = -1;
        }
    }

}
