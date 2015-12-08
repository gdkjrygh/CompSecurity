// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import p.aw.a;

// Referenced classes of package p.aq:
//            b

public class c
    implements Runnable
{

    final b a;

    public c(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
label0:
        {
            synchronized (a)
            {
                if (p.aq.b.a(a))
                {
                    break label0;
                }
            }
            return;
        }
        if (a.X != null)
        {
            a.f.b(a.X);
            a.X = null;
            a.z();
        }
        b1;
        JVM INSTR monitorexit ;
        return;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
