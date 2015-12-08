// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class jwn
    implements Runnable
{

    private jwh a;
    private String b;
    private String c;

    jwn(jwj jwj, jwh jwh1, String s, String s1)
    {
        a = jwh1;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        jup jup1;
        synchronized (jwh.d(a))
        {
            jup1 = (jup)jwh.d(a).get(b);
        }
        if (jup1 != null)
        {
            jwh.e(a);
            jup1.a(b, c);
            return;
        } else
        {
            jwh.g().a("Discarded message for unknown namespace '%s'", new Object[] {
                b
            });
            return;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
