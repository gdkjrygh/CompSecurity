// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public final class cwr
{

    final Object a = new Object();
    Object b;
    boolean c;
    private final Context d;
    private final Intent e;
    private ServiceConnection f;

    public cwr(Context context, Intent intent)
    {
        b = null;
        c = false;
        f = new cws(this);
        d = context;
        e = intent;
    }

    public final void a()
    {
        boolean flag = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (c)
        {
            flag = false;
        }
        c.a(flag, "already trying to connect");
        c.b(b, "mBinder", "already connected");
        c = d.bindService(e, f, 1);
        b = null;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (a)
        {
            c = false;
            b = null;
            d.unbindService(f);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        while (c) 
        {
            a.wait();
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        if (b == null)
        {
            throw new cwt();
        }
        obj1 = b;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }

    public final Object d()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!c && b == null)
        {
            throw new cwt();
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1 = b;
        obj;
        JVM INSTR monitorexit ;
        return obj1;
    }
}
