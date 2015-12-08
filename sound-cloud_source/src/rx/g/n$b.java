// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.P;
import rx.internal.a.g;

// Referenced classes of package rx.g:
//            n

protected static final class a
    implements P
{

    final P a;
    boolean b;
    boolean c;
    List d;
    boolean e;
    protected volatile boolean f;
    volatile Object g;

    private void c(Object obj)
    {
        if (obj != null)
        {
            rx.internal.a.g.a(a, obj);
        }
    }

    protected final void a(Object obj)
    {
        if (e)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        this;
        JVM INSTR monitorenter ;
        b = false;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        e = true;
        rx.internal.a.g.a(a, obj);
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected final void b(Object obj)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        this;
        JVM INSTR monitorenter ;
        if (b && !c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b = false;
        Object obj1;
        boolean flag;
        boolean flag4;
        if (obj != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        c = flag4;
        this;
        JVM INSTR monitorexit ;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj1 = null;
        flag = true;
_L10:
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); c(((Iterator) (obj1)).next())) { }
          goto _L4
        obj;
        flag = flag3;
_L9:
        if (flag) goto _L6; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
_L6:
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        c(obj);
        flag1 = false;
        this;
        JVM INSTR monitorenter ;
        obj1 = d;
        d = null;
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        c = false;
        flag1 = flag2;
        this;
        JVM INSTR monitorexit ;
        return;
_L11:
        flag1 = flag;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
          goto _L9
_L8:
        this;
        JVM INSTR monitorexit ;
        flag = flag1;
          goto _L10
        obj;
        flag = false;
          goto _L11
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        return;
        obj;
        flag = flag1;
          goto _L11
    }

    public final void onCompleted()
    {
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a.onNext(obj);
    }

    public .Object(P p)
    {
        b = true;
        a = p;
    }
}
