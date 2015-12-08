// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ik

public final class im
    implements ik
{

    private static im Hs;

    public im()
    {
    }

    public static ik fW()
    {
        com/google/android/gms/internal/im;
        JVM INSTR monitorenter ;
        im im1;
        if (Hs == null)
        {
            Hs = new im();
        }
        im1 = Hs;
        com/google/android/gms/internal/im;
        JVM INSTR monitorexit ;
        return im1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }
}
