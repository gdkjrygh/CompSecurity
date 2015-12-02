// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.c;

import android.content.Context;

// Referenced classes of package com.baidu.android.pushservice.c:
//            e, c

public class g extends e
{

    private static volatile g d;

    private g(Context context)
    {
        super(context, c.d);
    }

    public static g a(Context context)
    {
        com/baidu/android/pushservice/c/g;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        d = new g(context);
_L1:
        context = d;
        com/baidu/android/pushservice/c/g;
        JVM INSTR monitorexit ;
        return context;
        d.b = context.getApplicationContext();
          goto _L1
        context;
        throw context;
    }
}
