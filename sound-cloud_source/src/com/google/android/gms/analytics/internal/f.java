// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.g;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            S, g, Z

public final class f
{

    private static volatile g a = new S();

    public static g a()
    {
        return a;
    }

    public static void a(String s, Object obj)
    {
        com.google.android.gms.analytics.internal.g g1;
        boolean flag1;
        flag1 = false;
        g1 = g.b();
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g1.d(s, obj);
_L4:
        s = a;
        return;
_L2:
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.a() <= 3)
            {
                flag = true;
            }
        }
        if (flag)
        {
            if (obj != null)
            {
                (new StringBuilder()).append(s).append(":").append(obj);
            }
            Z.c.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
