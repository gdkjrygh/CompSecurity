// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx.X;
import rx.b.f;
import rx.b.g;
import rx.h.b;
import rx.h.e;

// Referenced classes of package rx.internal.a:
//            u

final class a extends X
{
    final class a extends X
    {

        final int a;
        boolean b;
        final u.a.b c;

        public final void onCompleted()
        {
            Object obj1;
            boolean flag1;
            int i;
            flag1 = false;
            if (!b)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            b = false;
            obj1 = c;
            i = a;
            Object obj = ((u.a.b) (obj1)).a.c;
            obj;
            JVM INSTR monitorenter ;
            boolean flag = flag1;
            if (((u.a.b) (obj1)).a.i.remove(Integer.valueOf(i)) == null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (!((u.a.b) (obj1)).a.i.isEmpty())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((u.a.b) (obj1)).a.g)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            ((u.a.b) (obj1)).a.b.onCompleted();
            ((u.a.b) (obj1)).a.b.unsubscribe();
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            ((u.a.b) (obj1)).a.a.b(this);
            return;
        }

        public final void onError(Throwable throwable)
        {
            c.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            onCompleted();
        }

        public a(int i)
        {
            c = u.a.b.this;
            super();
            b = true;
            a = i;
        }
    }


    final a a;

    public final void onCompleted()
    {
        boolean flag = false;
        Object obj = a.a;
        obj;
        JVM INSTR monitorenter ;
        a.a = true;
        Exception exception;
        if (a.a || a.a.isEmpty())
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.a.onCompleted();
            a.a.unsubscribe();
            return;
        } else
        {
            a.a.b(this);
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        a.a.onError(throwable);
        a.a.unsubscribe();
    }

    public final void onNext(Object obj)
    {
        int i;
        int j;
        synchronized (a.a)
        {
            a a1 = a;
            i = a1.a;
            a1.a = i + 1;
            a.a.put(Integer.valueOf(i), obj);
            j = a.a;
        }
        obj1 = new e();
        a.a.a(((rx.Y) (obj1)));
        Object obj2;
        obj1 = (rx.b)a.a.d.call(obj);
        obj2 = new a(i);
        a.a.a(((rx.Y) (obj2)));
        ((rx.b) (obj1)).unsafeSubscribe(((X) (obj2)));
        obj2 = new ArrayList();
        obj1 = a.a;
        obj1;
        JVM INSTR monitorenter ;
        Iterator iterator1 = a.a.entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.try try1 = (java.util.try)iterator1.next();
            if (((Integer)try1.getKey()).intValue() < j)
            {
                ((List) (obj2)).add(try1.getValue());
            }
        } while (true);
          goto _L1
        obj;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
_L2:
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L1:
        obj1;
        JVM INSTR monitorexit ;
        Iterator iterator = ((List) (obj2)).iterator();
        while (iterator.hasNext()) 
        {
            Object obj3 = iterator.next();
            obj3 = a.a.e.call(obj3, obj);
            a.a.onNext(obj3);
        }
          goto _L2
    }

    a.a(a.a a1)
    {
        a = a1;
        super();
    }
}
