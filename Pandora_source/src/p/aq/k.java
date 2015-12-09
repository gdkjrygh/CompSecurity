// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import android.content.Context;
import com.comscore.utils.o;
import java.util.HashMap;
import p.as.d;

// Referenced classes of package p.aq:
//            b

public class k
{

    private static b a = new b();

    public static void a()
    {
        a.v();
    }

    public static void a(int i, boolean flag)
    {
        a.a(i, flag, true);
    }

    public static void a(Context context)
    {
        a.a(context);
    }

    public static void a(o o)
    {
        a.a(o, true);
    }

    public static void a(String s)
    {
        a.c(s, true);
    }

    public static void a(String s, String s1)
    {
        a.a(s, s1, true);
    }

    public static void b()
    {
        a.w();
    }

    public static void b(String s)
    {
        a.a(s, true);
    }

    public static void c()
    {
        a.x();
    }

    public static void d()
    {
        a.y();
    }

    public static void e()
    {
        a.a(d.e, new HashMap(), true);
    }

    public static String f()
    {
        return a.X();
    }

    public static b g()
    {
        return a;
    }

}
