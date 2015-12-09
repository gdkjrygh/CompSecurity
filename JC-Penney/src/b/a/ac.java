// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.location.Location;

public final class ac
{

    private static Location a;

    public static Location a()
    {
        b/a/ac;
        JVM INSTR monitorenter ;
        Location location = a;
        b/a/ac;
        JVM INSTR monitorexit ;
        return location;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean b()
    {
        b/a/ac;
        JVM INSTR monitorenter ;
        Location location = a;
        boolean flag;
        if (location != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b/a/ac;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
