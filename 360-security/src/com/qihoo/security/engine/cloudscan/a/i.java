// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            j

public final class i extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private String a;
        private boolean b;
        private Vector c;
        private boolean d;

        static boolean a(a a1)
        {
            return a1.b;
        }

        static String b(a a1)
        {
            return a1.a;
        }

        static Vector c(a a1)
        {
            return a1.c;
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

        public a a(String s)
        {
            a = s;
            b = true;
            return this;
        }

        public i a()
        {
            return new i(this, null);
        }

        private a()
        {
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
    private final String b;
    private final Vector c;

    private i(a a1)
    {
        if (com.qihoo.security.engine.cloudscan.a.a.a(a1))
        {
            b = com.qihoo.security.engine.cloudscan.a.a.b(a1);
            c = com.qihoo.security.engine.cloudscan.a.a.c(a1);
            return;
        } else
        {
            throw new UninitializedMessageException((new StringBuilder("Not all required fields were included (false = not included in message),  key:")).append(com.qihoo.security.engine.cloudscan.a.a.a(a1)).toString());
        }
    }

    i(a a1, i k)
    {
        this(a1);
    }

    static int a(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        return a1.a();
    }

    public static a a()
    {
        return new a(null);
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int k)
        throws IOException
    {
        switch (k)
        {
        default:
            return false;

        case 1: // '\001'
            a2.a(a1.b(k));
            return true;

        case 2: // '\002'
            a1 = a1.f(2);
            break;
        }
        k = 0;
        do
        {
label0:
            {
                if (k >= a1.size())
                {
                    return true;
                }
                byte abyte0[] = (byte[])a1.elementAt(k);
                j.a a3 = com.qihoo.security.engine.cloudscan.a.j.a();
                net.jarlehansen.protobuf.javame.a.a a4 = new net.jarlehansen.protobuf.javame.a.a(abyte0, a);
                for (boolean flag = true; flag; flag = com.qihoo.security.engine.cloudscan.a.j.a(a4, a3, a(a4)))
                {
                    break label0;
                }

                a2.a(a3.a());
                k++;
            }
        } while (true);
    }

    private int e()
    {
        return 0 + net.jarlehansen.protobuf.javame.c.a(2, 8, c);
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        a1.a(1, b);
        a1.a(2, 8, c);
    }

    public int b()
    {
        return 0 + net.jarlehansen.protobuf.javame.c.a(1, b) + e();
    }

    public String c()
    {
        return b;
    }

    public Vector d()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("key = ").append(b).append("   ").toString()))).append("kvmap = ").append(c).append("   ").toString()))).append(")").toString();
    }

}
