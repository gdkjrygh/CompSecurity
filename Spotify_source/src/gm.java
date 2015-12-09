// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.CancellationSignal;

public final class gm
{

    public boolean a;
    public Object b;

    public gm()
    {
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object b()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return null;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (b == null)
        {
            b = new CancellationSignal();
            if (a)
            {
                ((CancellationSignal)b).cancel();
            }
        }
        obj = b;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
