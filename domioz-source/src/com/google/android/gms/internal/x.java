// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fi, t, y, ah

public final class x
{

    private static final Object a;
    private static x b;
    private final fi c = new fi();
    private final t d = new t();
    private final y e = new y();
    private final ah f = new ah();

    protected x()
    {
    }

    public static fi a()
    {
        return b().c;
    }

    private static x b()
    {
        x x1;
        synchronized (a)
        {
            x1 = b;
        }
        return x1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        x x1 = new x();
        synchronized (a)
        {
            b = x1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
