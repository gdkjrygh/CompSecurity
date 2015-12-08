// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            r

final class aj extends r
{

    final Object a;

    aj(Object obj)
    {
        a = obj;
        super();
    }

    public final void a()
    {
        synchronized (a)
        {
            a.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
