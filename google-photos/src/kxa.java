// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class kxa
    implements Runnable
{

    private Context a;
    private kwz b;

    kxa(kwz kwz1, Context context)
    {
        b = kwz1;
        a = context;
        super();
    }

    public final void run()
    {
        synchronized (kwz.a(b))
        {
            kwz.a(b, kwz.a(a));
            kwz.a(b).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
