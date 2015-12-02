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
//            i, j

public final class f extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private Vector a;
        private boolean b;
        private Vector c;
        private boolean d;

        static Vector a(a a1)
        {
            return a1.a;
        }

        static Vector b(a a1)
        {
            return a1.c;
        }

        public a a(i k)
        {
            if (!b)
            {
                b = true;
            }
            a.addElement(k);
            return this;
        }

        public a a(j j1)
        {
            if (!d)
            {
                d = true;
            }
            c.addElement(j1);
            return this;
        }

        public f a()
        {
            return new f(this, null);
        }

        private a()
        {
            a = new Vector();
            b = false;
            c = new Vector();
            d = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final Vector b;
    private final Vector c;

    private f(a a1)
    {
        b = com.qihoo.security.engine.cloudscan.a.a.a(a1);
        c = com.qihoo.security.engine.cloudscan.a.a.b(a1);
    }

    f(a a1, f f1)
    {
        this(a1);
    }

    public static a a()
    {
        return new a(null);
    }

    static f a(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        int k = b(a1);
        a a2 = a();
        do
        {
            if (k <= 0)
            {
                return a2.a();
            }
            if (!a(a1, a2, k))
            {
                a1.b();
            }
            k = b(a1);
        } while (true);
    }

    public static f a(byte abyte0[])
        throws IOException
    {
        return a(new net.jarlehansen.protobuf.javame.a.a(abyte0, a));
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int k)
        throws IOException
    {
        k;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 26
    //                   2 112;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        a1 = a1.f(1);
        k = 0;
_L6:
        Object obj;
        net.jarlehansen.protobuf.javame.a.a a3;
        boolean flag;
        if (k >= a1.size())
        {
            return true;
        }
        byte abyte0[] = (byte[])a1.elementAt(k);
        obj = com.qihoo.security.engine.cloudscan.a.i.a();
        a3 = new net.jarlehansen.protobuf.javame.a.a(abyte0, a);
        flag = true;
_L7:
        if (flag) goto _L5; else goto _L4
_L4:
        a2.a(((i.a) (obj)).a());
        k++;
          goto _L6
_L5:
        flag = com.qihoo.security.engine.cloudscan.a.i.a(a3, ((i.a) (obj)), b(a3));
          goto _L7
_L3:
        a1 = a1.f(2);
        k = 0;
_L10:
        if (k >= a1.size())
        {
            return true;
        }
        byte abyte1[] = (byte[])a1.elementAt(k);
        obj = com.qihoo.security.engine.cloudscan.a.j.a();
        abyte1 = new net.jarlehansen.protobuf.javame.a.a(abyte1, a);
        flag = true;
_L11:
        if (flag) goto _L9; else goto _L8
_L8:
        a2.a(((j.a) (obj)).a());
        k++;
          goto _L10
_L9:
        flag = com.qihoo.security.engine.cloudscan.a.j.a(abyte1, ((j.a) (obj)), b(abyte1));
          goto _L11
    }

    static int b(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        return a1.a();
    }

    private int e()
    {
        return 0 + net.jarlehansen.protobuf.javame.c.a(1, 8, b) + net.jarlehansen.protobuf.javame.c.a(2, 8, c);
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        a1.a(1, 8, b);
        a1.a(2, 8, c);
    }

    public int b()
    {
        return 0 + e();
    }

    public Vector c()
    {
        return b;
    }

    public Vector d()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("sections = ").append(b).append("   ").toString()))).append("kvmap = ").append(c).append("   ").toString()))).append(")").toString();
    }

}
