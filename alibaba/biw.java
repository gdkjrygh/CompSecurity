// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class biw
{

    private static biq a = null;

    public static void a(Context context, biq.b b)
    {
        biw;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new biq(context);
        a.a(b);
        a.start();
_L4:
        biw;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.a(b);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

}
