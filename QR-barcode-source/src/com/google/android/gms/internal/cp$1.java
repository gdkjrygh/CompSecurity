// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cp, co

class qv
    implements Runnable
{

    final co qv;
    final cp qw;

    public void run()
    {
label0:
        {
            synchronized (cp.a(qw))
            {
                if (cp.b(qw) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        cp.a(qw, cp.c(qw));
        if (cp.d(qw) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        qw.j(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        qv.a(qw);
        cp.a(qw, qv);
        obj;
        JVM INSTR monitorexit ;
    }

    (cp cp1, co co1)
    {
        qw = cp1;
        qv = co1;
        super();
    }
}
