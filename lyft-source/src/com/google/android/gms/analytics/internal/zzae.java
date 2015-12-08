// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzs, zzaf, zzy

public class zzae
{

    private static volatile Logger a;

    public static Logger a()
    {
        return a;
    }

    public static void a(Logger logger)
    {
        a = logger;
    }

    public static void a(String s)
    {
        zzaf zzaf1 = zzaf.b();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.d(s);
_L4:
        Logger logger = a;
        if (logger != null)
        {
            logger.b(s);
        }
        return;
_L2:
        if (a(1))
        {
            Log.i((String)zzy.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        zzaf zzaf1 = zzaf.b();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.e(s, obj);
_L4:
        obj = a;
        if (obj != null)
        {
            ((Logger) (obj)).d(s);
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
            Log.e((String)zzy.c.a(), ((String) (obj)));
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
        zzaf zzaf1 = zzaf.b();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.b(s);
_L4:
        Logger logger = a;
        if (logger != null)
        {
            logger.a(s);
        }
        return;
_L2:
        if (a(0))
        {
            Log.v((String)zzy.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(String s)
    {
        zzaf zzaf1 = zzaf.b();
        if (zzaf1 == null) goto _L2; else goto _L1
_L1:
        zzaf1.e(s);
_L4:
        Logger logger = a;
        if (logger != null)
        {
            logger.c(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)zzy.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        a(new zzs());
    }
}
