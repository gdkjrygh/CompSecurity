// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ig

public final class ih
    implements ig
{

    private static ih a;

    public ih()
    {
    }

    public static ig b()
    {
        com/google/android/gms/internal/ih;
        JVM INSTR monitorenter ;
        ih ih1;
        if (a == null)
        {
            a = new ih();
        }
        ih1 = a;
        com/google/android/gms/internal/ih;
        JVM INSTR monitorexit ;
        return ih1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long a()
    {
        return System.currentTimeMillis();
    }
}
