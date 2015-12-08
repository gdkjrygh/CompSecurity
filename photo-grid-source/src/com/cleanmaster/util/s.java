// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.os.Handler;
import android.os.Looper;

public class s
{

    static final boolean a;
    private static final Object b = new Object();
    private static boolean c = false;
    private static Handler d = null;
    private static boolean e = true;

    public s()
    {
    }

    public static Handler a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (c)
        {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        d = new Handler(Looper.getMainLooper());
        Handler handler = d;
        obj;
        JVM INSTR monitorexit ;
        return handler;
    }

    public static void a(Runnable runnable)
    {
        a().post(runnable);
    }

    static 
    {
        boolean flag;
        if (!com/cleanmaster/util/s.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
