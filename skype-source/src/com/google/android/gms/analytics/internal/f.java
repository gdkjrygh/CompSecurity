// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            af, g, al

public final class f
{

    private static volatile e a = new af();

    public static e a()
    {
        return a;
    }

    public static void a(e e1)
    {
        a = e1;
    }

    public static void a(String s)
    {
        g g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.e(s);
_L4:
        e e1 = a;
        if (e1 != null)
        {
            e1.a(s);
        }
        return;
_L2:
        if (a(1))
        {
            Log.i((String)al.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        g g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.e(s, obj);
_L4:
        obj = a;
        if (obj != null)
        {
            ((e) (obj)).c(s);
        }
        return;
_L2:
        if (a(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)al.c.a(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.b() <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static void b(String s)
    {
        g g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.c(s);
_L4:
        s = a;
        if (s != null)
        {
            s.a();
        }
        return;
_L2:
        if (a(0))
        {
            al.c.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(String s)
    {
        g g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.f(s);
_L4:
        e e1 = a;
        if (e1 != null)
        {
            e1.b(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)al.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
