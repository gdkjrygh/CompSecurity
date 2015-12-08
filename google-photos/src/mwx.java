// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class mwx
    implements opn, opv
{

    private ArrayList a;
    private boolean b;

    public mwx(opd opd1)
    {
        a = new ArrayList();
        b = true;
        opd1.a(this);
    }

    static void a(mwx mwx1, mwz mwz1)
    {
        mwx1.b(mwz1);
    }

    static void b(mwx mwx1, mwz mwz1)
    {
        mwx1.c(mwz1);
    }

    private void b(mwz mwz1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(mwz1);
        this;
        JVM INSTR monitorexit ;
        return;
        mwz1;
        throw mwz1;
    }

    private void c(mwz mwz1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(mwz1);
        this;
        JVM INSTR monitorexit ;
        return;
        mwz1;
        throw mwz1;
    }

    public final mwz a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        runnable = a(runnable, 0L);
        this;
        JVM INSTR monitorexit ;
        return runnable;
        runnable;
        throw runnable;
    }

    public final mwz a(Runnable runnable, long l)
    {
        this;
        JVM INSTR monitorenter ;
        mxa mxa1 = null;
        if (b)
        {
            mxa1 = new mxa(this, runnable, l);
            a.add(mxa1);
            mxa1.a();
        }
        this;
        JVM INSTR monitorexit ;
        return mxa1;
        runnable;
        throw runnable;
    }

    public final void a(mwz mwz1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mwz1 == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        mwz1.b();
        this;
        JVM INSTR monitorexit ;
        return;
        mwz1;
        throw mwz1;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        int i = 0;
_L2:
        if (i >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((mwz)a.get(i)).b();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
