// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.P;
import rx.X;
import rx.b.b;
import rx.b.d;
import rx.h.f;
import rx.internal.a.g;

// Referenced classes of package rx.g:
//            o

final class n
    implements rx.b.f
{
    protected static final class a
    {

        static final b c[];
        static final a d;
        static final a e;
        final boolean a;
        final b b[];

        static 
        {
            c = new b[0];
            d = new a(true, c);
            e = new a(false, c);
        }

        public a(boolean flag, b ab[])
        {
            a = flag;
            b = ab;
        }
    }

    protected static final class b
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

        public b(P p)
        {
            b = true;
            a = p;
        }
    }


    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(rx/g/n, rx/g/n$a, "a");
    static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(rx/g/n, java/lang/Object, "c");
    volatile a a;
    volatile Object c;
    boolean e;
    rx.b.b f;
    rx.b.b g;
    rx.b.b h;
    public final g i = rx.internal.a.g.a();

    n()
    {
        a = a.e;
        e = true;
        f = rx.b.d.a();
        g = rx.b.d.a();
        h = rx.b.d.a();
    }

    final void a(b b1)
    {
_L2:
        Object obj;
        a a1;
        b ab[];
        int i1;
        a1 = a;
        if (a1.a)
        {
            return;
        }
        ab = a1.b;
        i1 = ab.length;
        if (i1 != 1 || ab[0] != b1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a.e;
_L3:
        if (obj == a1 || b.compareAndSet(this, a1, obj))
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (i1 != 0)
            {
                break label0;
            }
            obj = a1;
        }
          goto _L3
        int j;
        int k;
        obj = new b[i1 - 1];
        k = 0;
        j = 0;
_L6:
        if (k >= i1) goto _L5; else goto _L4
_L4:
        b b2;
label1:
        {
            b2 = ab[k];
            if (b2 == b1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (j != i1 - 1)
            {
                break label1;
            }
            obj = a1;
        }
          goto _L3
        int l = j + 1;
        obj[j] = b2;
        j = l;
        k++;
          goto _L6
_L5:
        if (j == 0)
        {
            obj = a.e;
        } else
        {
            if (j < i1 - 1)
            {
                b ab1[] = new b[j];
                System.arraycopy(obj, 0, ab1, 0, j);
                obj = ab1;
            }
            obj = new a(a1.a, ((b []) (obj)));
        }
          goto _L3
    }

    final b[] a(Object obj)
    {
        c = obj;
        e = false;
        if (a.a)
        {
            return a.c;
        } else
        {
            return ((a)b.getAndSet(this, rx.g.a.d)).b;
        }
    }

    public final void call(Object obj)
    {
        b b1;
        boolean flag;
        flag = false;
        obj = (X)obj;
        b1 = new b(((P) (obj)));
        ((X) (obj)).add(rx.h.f.a(new o(this, b1)));
        f.call(b1);
        if (((X) (obj)).isUnsubscribed()) goto _L2; else goto _L1
_L1:
        a a1 = a;
        if (a1.a)
        {
            h.call(b1);
        } else
        {
            int j = a1.b.length;
            b ab[] = new b[j + 1];
            System.arraycopy(a1.b, 0, ab, 0, j);
            ab[j] = b1;
            a a2 = new a(a1.a, ab);
            if (!b.compareAndSet(this, a1, a2))
            {
                continue; /* Loop/switch isn't completed */
            }
            g.call(b1);
            flag = true;
        }
        if (flag && ((X) (obj)).isUnsubscribed())
        {
            a(b1);
        }
_L2:
        return;
        if (true) goto _L1; else goto _L3
_L3:
    }

}
