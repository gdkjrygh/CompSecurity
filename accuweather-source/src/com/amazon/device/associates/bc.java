// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

class bc
{

    private static volatile Map a = new HashMap();
    private static volatile Handler b = null;

    bc()
    {
    }

    static Handler a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/associates/bc;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new Handler(Looper.getMainLooper());
        }
        com/amazon/device/associates/bc;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/amazon/device/associates/bc;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
