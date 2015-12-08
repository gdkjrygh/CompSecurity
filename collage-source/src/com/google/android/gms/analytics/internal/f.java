// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ag, g, am

public class f
{

    private static volatile e a;

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
        g1.d(s);
_L4:
        e e1 = a;
        if (e1 != null)
        {
            e1.b(s);
        }
        return;
_L2:
        if (a(1))
        {
            Log.i((String)am.c.a(), s);
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
            ((e) (obj)).d(s);
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
            Log.e((String)am.c.a(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a() != null)
        {
            flag = flag1;
            if (a().a() <= i)
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
        g1.b(s);
_L4:
        e e1 = a;
        if (e1 != null)
        {
            e1.a(s);
        }
        return;
_L2:
        if (a(0))
        {
            Log.v((String)am.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(String s)
    {
        g g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.e(s);
_L4:
        e e1 = a;
        if (e1 != null)
        {
            e1.c(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)am.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        a(new ag());
    }
}
