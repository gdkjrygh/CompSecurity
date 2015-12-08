// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ij

public final class il
    implements ij
{

    private static il Hv;

    public il()
    {
    }

    public static ij gb()
    {
        com/google/android/gms/internal/il;
        JVM INSTR monitorenter ;
        il il1;
        if (Hv == null)
        {
            Hv = new il();
        }
        il1 = Hv;
        com/google/android/gms/internal/il;
        JVM INSTR monitorexit ;
        return il1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }
}
