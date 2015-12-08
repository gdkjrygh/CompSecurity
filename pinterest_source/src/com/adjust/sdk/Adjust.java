// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//            AdjustInstance, AdjustConfig, AdjustEvent

public class Adjust
{

    private static AdjustInstance a;

    public static AdjustInstance a()
    {
        com/adjust/sdk/Adjust;
        JVM INSTR monitorenter ;
        AdjustInstance adjustinstance;
        if (a == null)
        {
            a = new AdjustInstance();
        }
        adjustinstance = a;
        com/adjust/sdk/Adjust;
        JVM INSTR monitorexit ;
        return adjustinstance;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(AdjustConfig adjustconfig)
    {
        a().a(adjustconfig);
    }

    public static void a(AdjustEvent adjustevent)
    {
        a().a(adjustevent);
    }
}
