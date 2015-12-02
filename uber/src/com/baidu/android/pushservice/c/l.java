// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.c;

import android.content.Context;

// Referenced classes of package com.baidu.android.pushservice.c:
//            e, c

public class l extends e
{

    private static volatile l d;

    private l(Context context)
    {
        super(context, c.c);
    }

    public static l a(Context context)
    {
        com/baidu/android/pushservice/c/l;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        d = new l(context);
_L1:
        context = d;
        com/baidu/android/pushservice/c/l;
        JVM INSTR monitorexit ;
        return context;
        d.b = context.getApplicationContext();
          goto _L1
        context;
        throw context;
    }
}
