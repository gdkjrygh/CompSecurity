// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.a;

import android.content.Context;

// Referenced classes of package com.cmcm.adsdk.a:
//            a

public class b
{

    private static volatile b a;
    private a b;

    private b(Context context)
    {
        b = new a(context);
    }

    public static b a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/cmcm/adsdk/a/b;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new b(context);
        }
        com/cmcm/adsdk/a/b;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/cmcm/adsdk/a/b;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final a a()
    {
        return b;
    }
}
