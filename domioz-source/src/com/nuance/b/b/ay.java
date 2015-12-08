// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import android.os.HandlerThread;

public final class ay extends HandlerThread
{

    public ay(String s)
    {
        super(s);
    }

    public final Handler a()
    {
        this;
        JVM INSTR monitorenter ;
        Handler handler = new Handler(getLooper());
        this;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }
}
