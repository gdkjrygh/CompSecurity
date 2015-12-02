// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.d;

import com.google.common.a.kl;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.common.d:
//            e, d

public abstract class a
    implements e
{

    private boolean a;
    private Set b;

    public a()
    {
        a = false;
        b = null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c())
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b();
        a = true;
        this;
        JVM INSTR monitorexit ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((d)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        b = null;
    }

    public final void a(d d1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!c()) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d1.a(this);
        }
        return;
_L2:
        if (b == null)
        {
            b = kl.a();
        }
        b.add(d1);
        if (true) goto _L4; else goto _L3
_L3:
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
    }

    protected abstract void b();

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
