// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.e;

// Referenced classes of package com.cm.kinfoc:
//            q, ag

final class r extends Thread
{

    private static final Object a = new Object();

    private r()
    {
    }

    r(byte byte0)
    {
        this();
    }

    public final void run()
    {
label0:
        {
            synchronized (a)
            {
                if (!q.d())
                {
                    break label0;
                }
            }
            return;
        }
        q.a(e.a().e());
        if (ag.a(e.a().b()))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        q.b(false);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!ag.a())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        q.b(true);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        q.b(false);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
