// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.HashMap;
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

final class b
{
    final class a extends X
    {

        final u.a a;

        public final void onCompleted()
        {
            boolean flag = false;
            Object obj = a.c;
            obj;
            JVM INSTR monitorenter ;
            a.d = true;
            Exception exception;
            if (a.g || a.f.isEmpty())
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                a.b.onCompleted();
                a.b.unsubscribe();
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
            a.b.onError(throwable);
            a.b.unsubscribe();
        }

        public final void onNext(Object obj)
        {
            int k;
            int l;
            synchronized (a.c)
            {
                u.a a1 = a;
                k = a1.e;
                a1.e = k + 1;
                a.f.put(Integer.valueOf(k), obj);
                l = a.h;
            }
            Object obj2;
            obj1 = (rx.b)a.j.c.call(obj);
            obj2 = new a(this, k);
            a.a.a(((rx.Y) (obj2)));
            ((rx.b) (obj1)).unsafeSubscribe(((X) (obj2)));
            obj2 = new ArrayList();
            obj1 = a.c;
            obj1;
            JVM INSTR monitorenter ;
            Iterator iterator1 = a.i.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (((Integer)entry.getKey()).intValue() < l)
                {
                    ((List) (obj2)).add(entry.getValue());
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
                obj3 = a.j.e.call(obj, obj3);
                a.b.onNext(obj3);
            }
              goto _L2
        }

        a()
        {
            a = u.a.this;
            super();
        }
    }

    final class a.a extends X
    {

        final int a;
        boolean b;
        final a c;

        public final void onCompleted()
        {
            Object obj1;
            boolean flag1;
            int k;
            flag1 = false;
            if (!b)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            b = false;
            obj1 = c;
            k = a;
            Object obj = ((a) (obj1)).a.c;
            obj;
            JVM INSTR monitorenter ;
            boolean flag = flag1;
            if (((a) (obj1)).a.f.remove(Integer.valueOf(k)) == null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (!((a) (obj1)).a.f.isEmpty())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((a) (obj1)).a.d)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            ((a) (obj1)).a.b.onCompleted();
            ((a) (obj1)).a.b.unsubscribe();
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            ((a) (obj1)).a.a.b(this);
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

        public a.a(a a1, int k)
        {
            c = a1;
            super();
            b = true;
            a = k;
        }
    }

    final class b extends X
    {

        final u.a a;

        public final void onCompleted()
        {
            boolean flag = false;
            Object obj = a.c;
            obj;
            JVM INSTR monitorenter ;
            a.g = true;
            Exception exception;
            if (a.d || a.i.isEmpty())
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                a.b.onCompleted();
                a.b.unsubscribe();
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
            a.b.onError(throwable);
            a.b.unsubscribe();
        }

        public final void onNext(Object obj)
        {
            int k;
            int l;
            synchronized (a.c)
            {
                u.a a1 = a;
                k = a1.h;
                a1.h = k + 1;
                a.i.put(Integer.valueOf(k), obj);
                l = a.e;
            }
            obj1 = new e();
            a.a.a(((rx.Y) (obj1)));
            Object obj2;
            obj1 = (rx.b)a.j.d.call(obj);
            obj2 = new a(this, k);
            a.a.a(((rx.Y) (obj2)));
            ((rx.b) (obj1)).unsafeSubscribe(((X) (obj2)));
            obj2 = new ArrayList();
            obj1 = a.c;
            obj1;
            JVM INSTR monitorenter ;
            Iterator iterator1 = a.f.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (((Integer)entry.getKey()).intValue() < l)
                {
                    ((List) (obj2)).add(entry.getValue());
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
                obj3 = a.j.e.call(obj3, obj);
                a.b.onNext(obj3);
            }
              goto _L2
        }

        b()
        {
            a = u.a.this;
            super();
        }
    }

    final class b.a extends X
    {

        final int a;
        boolean b;
        final b c;

        public final void onCompleted()
        {
            Object obj1;
            boolean flag1;
            int k;
            flag1 = false;
            if (!b)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            b = false;
            obj1 = c;
            k = a;
            Object obj = ((b) (obj1)).a.c;
            obj;
            JVM INSTR monitorenter ;
            boolean flag = flag1;
            if (((b) (obj1)).a.i.remove(Integer.valueOf(k)) == null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (!((b) (obj1)).a.i.isEmpty())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((b) (obj1)).a.g)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            ((b) (obj1)).a.b.onCompleted();
            ((b) (obj1)).a.b.unsubscribe();
            return;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            ((b) (obj1)).a.a.b(this);
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

        public b.a(b b1, int k)
        {
            c = b1;
            super();
            b = true;
            a = k;
        }
    }


    final rx.h.b a = new rx.h.b();
    final X b;
    final Object c = new Object();
    boolean d;
    int e;
    final Map f = new HashMap();
    boolean g;
    int h;
    final Map i = new HashMap();
    final u j;

    public b.a(u u1, X x)
    {
        j = u1;
        super();
        b = x;
    }
}
