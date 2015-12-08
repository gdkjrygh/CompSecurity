// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fe, fk, gv, gw, 
//            fc

class tt
    implements Runnable
{

    final fe tr;
    final fc tt;

    public void run()
    {
label0:
        {
            synchronized (fe.a(tr))
            {
                if (fe.c(tr).errorCode == -2)
                {
                    break label0;
                }
            }
            return;
        }
        fe.d(tr).du().a(tr);
        tt.b(fe.c(tr));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (fe fe1, fc fc1)
    {
        tr = fe1;
        tt = fc1;
        super();
    }
}
