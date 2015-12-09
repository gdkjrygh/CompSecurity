// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.k;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bc, j, bj, bk

public class i
{

    private static volatile k a;

    public static k a()
    {
        return a;
    }

    public static void a(k k1)
    {
        a = k1;
    }

    public static void a(String s)
    {
        j j1 = j.b();
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1.e(s);
_L4:
        k k1 = a;
        if (k1 != null)
        {
            k1.a(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)bj.c.a(), s);
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
        obj = a;
        if (obj != null)
        {
            ((k) (obj)).b(s);
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
            Log.e((String)bj.c.a(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(int l)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a() != null)
        {
            flag = flag1;
            if (a().a() <= l)
            {
                flag = true;
            }
        }
        return flag;
    }

    static 
    {
        a(new bc());
    }
}
