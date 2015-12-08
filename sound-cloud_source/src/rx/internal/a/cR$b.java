// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.List;
import rx.Q;
import rx.X;
import rx.d.e;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            cR, g

private static final class c extends X
{

    private final int a;
    private final a b;
    private final b c;

    public final void onCompleted()
    {
label0:
        {
            obj1 = c;
            int i = a;
            synchronized (((a) (obj1)).c)
            {
                if (i == ((c) (obj1)).f)
                {
                    break label0;
                }
            }
            return;
        }
        obj1.g = false;
        if (((g) (obj1)).h)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (!((h) (obj1)).j)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (((j) (obj1)).i == null)
        {
            obj1.i = new ArrayList();
        }
        (() (obj1)).i.add(g.b());
        obj;
        JVM INSTR monitorexit ;
        return;
        List list;
        list = ((i) (obj1)).i;
        obj1.i = null;
        obj1.j = true;
        obj;
        JVM INSTR monitorexit ;
        ((j) (obj1)).a(list);
        ((a) (obj1)).a.onCompleted();
        ((a) (obj1)).unsubscribe();
        return;
    }

    public final void onError(Throwable throwable)
    {
         ;
label0:
        {
             = c;
            int i = a;
            synchronized (.c)
            {
                if (i == .f)
                {
                    break label0;
                }
            }
            return;
        }
        if (!.j)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (.i == null)
        {
            .i = new ArrayList();
        }
        .i.add(rx.internal.a.g.a(throwable));
        obj;
        JVM INSTR monitorexit ;
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
        List list;
        list = .i;
        .i = null;
        .j = true;
        obj;
        JVM INSTR monitorexit ;
        .a(list);
        .a.onError(throwable);
        .unsubscribe();
        return;
    }

    public final void onNext(Object obj)
    {
        unsubscribe unsubscribe;
        boolean flag2;
        boolean flag3;
        boolean flag4;
label0:
        {
            flag4 = true;
            flag2 = true;
            flag3 = false;
            unsubscribe = c;
            int i = a;
            synchronized (unsubscribe.c)
            {
                if (i == unsubscribe.f)
                {
                    break label0;
                }
            }
            return;
        }
        if (!unsubscribe.j)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (unsubscribe.i == null)
        {
            unsubscribe.i = new ArrayList();
        }
        unsubscribe.i.add(obj);
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        List list;
        list = unsubscribe.i;
        unsubscribe.i = null;
        unsubscribe.j = true;
        obj2;
        JVM INSTR monitorexit ;
        boolean flag = true;
_L4:
        unsubscribe.a(list);
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        unsubscribe.a.onNext(obj);
        unsubscribe.e.a();
        flag1 = false;
        Object obj3 = unsubscribe.c;
        obj3;
        JVM INSTR monitorenter ;
        list = unsubscribe.i;
        unsubscribe.i = null;
        if (list != null) goto _L2; else goto _L1
_L1:
        unsubscribe.j = false;
        flag1 = flag4;
        obj3;
        JVM INSTR monitorexit ;
        flag = flag2;
_L5:
        boolean flag5;
        if (!flag)
        {
            synchronized (unsubscribe.c)
            {
                unsubscribe.j = false;
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj3;
        JVM INSTR monitorexit ;
        flag5 = unsubscribe.a.isUnsubscribed();
        flag = flag1;
        if (!flag5) goto _L4; else goto _L3
_L3:
        flag = false;
          goto _L5
        obj;
        flag = false;
_L9:
        flag1 = flag;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L7:
        if (!flag)
        {
            synchronized (unsubscribe.c)
            {
                unsubscribe.j = false;
            }
        }
        throw obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        flag = flag3;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        flag = flag1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void setProducer(Q q)
    {
        b.a(q);
    }

    (int i, a a1,  )
    {
        a = i;
        b = a1;
        c = ;
    }
}
