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
//            c

public final class l extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private com.qihoo.security.engine.cloudscan.a.c a;
        private boolean b;

        static com.qihoo.security.engine.cloudscan.a.c a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        public a a(com.qihoo.security.engine.cloudscan.a.c c1)
        {
            a = c1;
            b = true;
            return this;
        }

        public l a()
        {
            return new l(this, null);
        }

        private a()
        {
            b = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final com.qihoo.security.engine.cloudscan.a.c b;
    private final boolean c;

    private l(a a1)
    {
        b = com.qihoo.security.engine.cloudscan.a.a.a(a1);
        c = com.qihoo.security.engine.cloudscan.a.a.b(a1);
    }

    l(a a1, l l1)
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

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int i)
        throws IOException
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            a1 = a1.f(1);
            break;
        }
        i = 0;
        do
        {
label0:
            {
                if (i >= a1.size())
                {
                    return true;
                }
                byte abyte0[] = (byte[])a1.elementAt(i);
                c.a a3 = com.qihoo.security.engine.cloudscan.a.c.a();
                net.jarlehansen.protobuf.javame.a.a a4 = new net.jarlehansen.protobuf.javame.a.a(abyte0, a);
                for (boolean flag = true; flag; flag = com.qihoo.security.engine.cloudscan.a.c.a(a4, a3, a(a4)))
                {
                    break label0;
                }

                a2.a(a3.a());
                i++;
            }
        } while (true);
    }

    private int c()
    {
        int i = 0;
        if (c)
        {
            i = 0 + net.jarlehansen.protobuf.javame.c.b(1, b.b());
        }
        return i;
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        if (c)
        {
            a1.b(1, b.b());
            b.a(a1);
        }
    }

    public int b()
    {
        return 0 + c();
    }

    public String toString()
    {
        String s1 = (new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString();
        String s = s1;
        if (c)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("up = ").append(b).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s))).append(")").toString();
    }

}
