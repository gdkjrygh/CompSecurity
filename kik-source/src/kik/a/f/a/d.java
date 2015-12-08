// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.a;

import java.util.Map;

// Referenced classes of package kik.a.f.a:
//            a, b, g, c

final class d
    implements Runnable
{

    final g a;
    final Runnable b;
    final c c;

    d(c c1, g g1, Runnable runnable)
    {
        c = c1;
        a = g1;
        b = runnable;
        super();
    }

    public final void run()
    {
        if (a.d)
        {
            return;
        }
        try
        {
            System.currentTimeMillis();
            a.a();
            System.currentTimeMillis();
            b.run();
        }
        catch (a a1) { }
        catch (b b1) { }
        synchronized (c.b)
        {
            c.b.remove(a.c());
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
