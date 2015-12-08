// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ang.Object
    implements Runnable
{

    private bpm a;
    private String b;
    private String c;

    public final void run()
    {
        boo boo1;
        synchronized (bpm.e(a))
        {
            boo1 = (boo)bpm.e(a).get(b);
        }
        if (boo1 != null)
        {
            boo1.a(bpm.f(a), c);
            return;
        } else
        {
            bpm.g().a("Discarded message for unknown namespace '%s'", new Object[] {
                b
            });
            return;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (bpm bpm1, String s, String s1)
    {
        a = bpm1;
        b = s;
        c = s1;
        super();
    }
}
