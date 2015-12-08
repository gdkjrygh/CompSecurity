// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.k;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ba, j, bh, bi

public final class i
{

    private static volatile k a = new ba();

    public static k a()
    {
        return a;
    }

    public static void a(String s)
    {
        j j1 = j.b();
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1.e(s);
_L4:
        s = a;
        return;
_L2:
        if (a(2))
        {
            Log.w((String)bh.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        j j1 = j.b();
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1.e(s, obj);
_L4:
        s = a;
        return;
_L2:
        if (a(3))
        {
            String s1 = s;
            if (obj != null)
            {
                s1 = (new StringBuilder()).append(s).append(":").append(obj).toString();
            }
            Log.e((String)bh.c.a(), s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean a(int l)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.a() <= l)
            {
                flag = true;
            }
        }
        return flag;
    }

}
