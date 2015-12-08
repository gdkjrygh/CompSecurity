// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.utils;


public class RuntimeInfo
{

    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415 = 88;
    public static int b041504150415041504150415;
    private boolean a;

    public RuntimeInfo()
    {
        int i = b041504150415041504150415;
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
            // fall through

        case 0: // '\0'
            super();
            break;
        }
        a = true;
    }

    public static int b041504150415041504150415()
    {
        return 53;
    }

    public boolean areHapticsEnabled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 88;
            b041504150415041504150415 = 88;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void mute()
    {
        this;
        JVM INSTR monitorenter ;
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
        a = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void unmute()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
