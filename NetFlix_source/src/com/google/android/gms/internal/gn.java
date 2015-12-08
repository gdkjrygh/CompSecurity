// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gl

public final class gn
    implements gl
{

    private static gn Er;

    public gn()
    {
    }

    public static gl ft()
    {
        com/google/android/gms/internal/gn;
        JVM INSTR monitorenter ;
        gn gn1;
        if (Er == null)
        {
            Er = new gn();
        }
        gn1 = Er;
        com/google/android/gms/internal/gn;
        JVM INSTR monitorexit ;
        return gn1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }
}
