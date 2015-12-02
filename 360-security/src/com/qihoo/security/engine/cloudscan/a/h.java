// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            g

public final class h extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private int a;
        private boolean b;
        private long c;
        private boolean d;
        private g e;
        private boolean f;
        private net.jarlehansen.protobuf.javame.b g;
        private boolean h;

        static int a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        static long c(a a1)
        {
            return a1.c;
        }

        static boolean d(a a1)
        {
            return a1.d;
        }

        static g e(a a1)
        {
            return a1.e;
        }

        static boolean f(a a1)
        {
            return a1.f;
        }

        static net.jarlehansen.protobuf.javame.b g(a a1)
        {
            return a1.g;
        }

        static boolean h(a a1)
        {
            return a1.h;
        }

        public a a(int j)
        {
            a = j;
            b = true;
            return this;
        }

        public a a(long l)
        {
            c = l;
            d = true;
            return this;
        }

        public a a(g g1)
        {
            e = g1;
            f = true;
            return this;
        }

        public a a(net.jarlehansen.protobuf.javame.b b1)
        {
            g = b1;
            h = true;
            return this;
        }

        public h a()
        {
            return new h(this, null);
        }

        private a()
        {
            b = false;
            d = false;
            f = false;
            h = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final int b;
    private final boolean c;
    private final long d;
    private final boolean e;
    private final g f;
    private final boolean g;
    private final net.jarlehansen.protobuf.javame.b h;
    private final boolean i;

    private h(a a1)
    {
        b = com.qihoo.security.engine.cloudscan.a.a.a(a1);
        c = com.qihoo.security.engine.cloudscan.a.a.b(a1);
        d = com.qihoo.security.engine.cloudscan.a.a.c(a1);
        e = a.d(a1);
        f = a.e(a1);
        g = a.f(a1);
        h = a.g(a1);
        i = a.h(a1);
    }

    h(a a1, h h1)
    {
        this(a1);
    }

    public static a a()
    {
        return new a(null);
    }

    static h a(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        int j = b(a1);
        a a2 = a();
        do
        {
            if (j <= 0)
            {
                return a2.a();
            }
            if (!a(a1, a2, j))
            {
                a1.b();
            }
            j = b(a1);
        } while (true);
    }

    public static h a(byte abyte0[])
        throws IOException
    {
        return a(new net.jarlehansen.protobuf.javame.a.a(abyte0, a));
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int j)
        throws IOException
    {
        j;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 34
    //                   2 46
    //                   3 58
    //                   4 144;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        a2.a(a1.a(j));
        return true;
_L3:
        a2.a(a1.d(j));
        return true;
_L4:
        a1 = a1.f(3);
        j = 0;
_L7:
        if (j >= a1.size())
        {
            return true;
        }
        byte abyte0[] = (byte[])a1.elementAt(j);
        g.a a3 = com.qihoo.security.engine.cloudscan.a.g.a();
        net.jarlehansen.protobuf.javame.a.a a4 = new net.jarlehansen.protobuf.javame.a.a(abyte0, a);
        boolean flag = true;
        do
        {
            if (!flag)
            {
                a2.a(a3.a());
                j++;
                continue; /* Loop/switch isn't completed */
            }
            flag = com.qihoo.security.engine.cloudscan.a.g.a(a4, a3, b(a4));
        } while (true);
_L5:
        a2.a(a1.e(j));
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static int b(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        return a1.a();
    }

    private int d()
    {
        int j = 0;
        if (g)
        {
            j = 0 + net.jarlehansen.protobuf.javame.c.b(3, f.b());
        }
        return j;
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        if (c)
        {
            a1.a(1, b);
        }
        if (e)
        {
            a1.a(2, d);
        }
        if (g)
        {
            a1.b(3, f.b());
            f.a(a1);
        }
        if (i)
        {
            a1.a(4, h);
        }
    }

    public int b()
    {
        int k = 0;
        if (c)
        {
            k = 0 + net.jarlehansen.protobuf.javame.c.a(1, b);
        }
        int j = k;
        if (e)
        {
            j = k + net.jarlehansen.protobuf.javame.c.a(2, d);
        }
        k = j;
        if (i)
        {
            k = j + net.jarlehansen.protobuf.javame.c.a(4, h);
        }
        return k + d();
    }

    public g c()
    {
        return f;
    }

    public String toString()
    {
        String s1 = (new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString();
        String s = s1;
        if (c)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("type = ").append(b).append("   ").toString();
        }
        s1 = s;
        if (e)
        {
            s1 = (new StringBuilder(String.valueOf(s))).append("flags = ").append(d).append("   ").toString();
        }
        s = s1;
        if (g)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("file_info = ").append(f).append("   ").toString();
        }
        s1 = s;
        if (i)
        {
            s1 = (new StringBuilder(String.valueOf(s))).append("stream = ").append(h).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s1))).append(")").toString();
    }

}
