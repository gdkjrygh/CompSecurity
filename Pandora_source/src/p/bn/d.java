// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bn;

import java.util.Vector;
import p.bm.e;

// Referenced classes of package p.bn:
//            e

public class d
{

    protected static Vector a = new Vector();
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;

    public static void a()
    {
        b = true;
        c = true;
        d = true;
    }

    public static void a(String s)
    {
        s = e(s);
        Boolean boolean1 = d(s);
        if (b && !boolean1.booleanValue())
        {
            p.bn.e.c("SyncProxy", s);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        String s1 = e(s);
        if (throwable != null)
        {
            s = d((new StringBuilder()).append(s1).append(" Exception String: ").append(throwable.toString()).toString());
        } else
        {
            s = d(s1);
        }
        if (b && !s.booleanValue())
        {
            p.bn.e.a("SyncProxy", s1, throwable);
        }
    }

    public static void a(String s, boolean flag)
    {
        String s1 = s;
        if (flag)
        {
            s1 = e(s);
        }
        s = d(s1);
        if (d && !s.booleanValue())
        {
            p.bn.e.a("SyncProxy", s1);
        }
    }

    public static void b()
    {
        b = true;
        c = false;
        d = false;
    }

    public static void b(String s)
    {
        s = e(s);
        Boolean boolean1 = d(s);
        if (c && !boolean1.booleanValue())
        {
            p.bn.e.b("SyncProxy", s);
        }
    }

    public static void c(String s)
    {
        s = e(s);
        Boolean boolean1 = d(s);
        if (d && !boolean1.booleanValue())
        {
            p.bn.e.a("SyncProxy", s);
        }
    }

    public static boolean c()
    {
        return c && d;
    }

    protected static Boolean d(String s)
    {
        p.bm.e.a();
        return p.bm.e.a(s);
    }

    private static String e(String s)
    {
        String s1 = s;
        if ("2.3.2" != null)
        {
            s1 = s;
            if (s != null)
            {
                s1 = (new StringBuilder()).append("2.3.2: ").append(s).toString();
            }
        }
        return s1;
    }

}
