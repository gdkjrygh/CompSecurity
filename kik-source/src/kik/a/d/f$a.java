// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.TimerTask;
import kik.a.h.d;

// Referenced classes of package kik.a.d:
//            f

private final class b extends TimerTask
{

    final f a;
    private final d b;

    public final void run()
    {
        synchronized (f.a(a))
        {
            if (f.b(a) == this)
            {
                f.c(a);
                kik.a.d.f.d(a);
                b.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public merTask(f f1, d d1)
    {
        a = f1;
        super();
        b = d1;
    }
}
