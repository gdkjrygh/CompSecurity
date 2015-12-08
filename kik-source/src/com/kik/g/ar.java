// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            k, e

public final class ar
{

    private boolean a;
    private k b;
    private final Object c = new Object();

    protected ar()
    {
        b = new k(this);
        a = true;
    }

    protected final e a()
    {
        return b.a();
    }

    public final boolean b()
    {
        return a;
    }

    public final void c()
    {
        synchronized (c)
        {
            if (a)
            {
                b.a(null);
            }
            a = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
