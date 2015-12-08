// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Q;
import rx.R;
import rx.X;
import rx.Y;
import rx.b.e;
import rx.b.f;
import rx.c.b;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.f.l;

// Referenced classes of package rx.internal.a:
//            bU, bV, ca, cb, 
//            cc, bZ, bX, g, 
//            cd

public final class bT extends rx.c.b
{
    static class a extends AtomicReference
        implements d
    {

        final rx.internal.a.g a = rx.internal.a.g.a();
        c b;
        int c;

        private void a(c c1)
        {
            b.set(c1);
            b = c1;
            c = c + 1;
        }

        public final void a()
        {
            a(new c(b(rx.internal.a.g.b())));
            c();
        }

        public final void a(Object obj)
        {
            a(new c(b(rx.internal.a.g.a(obj))));
            b();
        }

        public final void a(Throwable throwable)
        {
            a(new c(b(rx.internal.a.g.a(throwable))));
            c();
        }

        public final void a(b b1)
        {
            b1;
            JVM INSTR monitorenter ;
            if (!b1.e)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            b1.f = true;
            b1;
            JVM INSTR monitorexit ;
            return;
            b1.e = true;
            b1;
            JVM INSTR monitorexit ;
_L4:
            Object obj;
            long l;
            long l1;
            if (b1.isUnsubscribed())
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = b1.get();
            c c1 = (c)b1.c;
            obj = c1;
            if (c1 == null)
            {
                obj = (c)get();
                b1.c = obj;
            }
            l = 0L;
_L2:
            Object obj1;
            if (l1 == 0L)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (c)((c) (obj)).get();
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = c(((c) (obj1)).a);
            try
            {
                if (rx.internal.a.g.a(b1.b, obj))
                {
                    b1.c = null;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                b1.c = null;
                Exceptions.throwIfFatal(((Throwable) (obj1)));
                b1.unsubscribe();
                if (!rx.internal.a.g.c(obj) && !rx.internal.a.g.b(obj))
                {
                    b1.b.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), rx.internal.a.g.e(obj)));
                    return;
                }
                break; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_161;
            obj;
            b1;
            JVM INSTR monitorexit ;
            throw obj;
            l++;
            if (b1.isUnsubscribed())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = obj1;
            if (true) goto _L2; else goto _L1
_L1:
            if (l != 0L)
            {
                b1.c = obj;
                if (l1 != 0x7fffffffffffffffL)
                {
                    b1.b(l);
                }
            }
            b1;
            JVM INSTR monitorenter ;
            if (b1.f)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            b1.e = false;
            b1;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            b1;
            JVM INSTR monitorexit ;
            throw exception;
            b1.f = false;
            b1;
            JVM INSTR monitorexit ;
            if (true) goto _L4; else goto _L3
_L3:
        }

        Object b(Object obj)
        {
            return obj;
        }

        void b()
        {
        }

        Object c(Object obj)
        {
            return obj;
        }

        void c()
        {
        }

        public a()
        {
            c c1 = new c(null);
            b = c1;
            set(c1);
        }
    }

    static final class b extends AtomicLong
        implements Q, Y
    {

        final e a;
        final X b;
        Object c;
        final AtomicLong d = new AtomicLong();
        boolean e;
        boolean f;

        public final void a(long l)
        {
            if (l >= 0L) goto _L2; else goto _L1
_L1:
            long l5;
            return;
_L2:
            long l1;
            do
            {
                if ((l5 = get()) == 0x8000000000000000L || l5 >= 0L && l == 0L)
                {
                    continue; /* Loop/switch isn't completed */
                }
                long l3 = l5 + l;
                l1 = l3;
                if (l3 < 0L)
                {
                    l1 = 0x7fffffffffffffffL;
                }
            } while (!compareAndSet(l5, l1));
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            long l2;
            long l6;
            do
            {
                l6 = d.get();
                long l4 = l6 + l;
                l2 = l4;
                if (l4 < 0L)
                {
                    l2 = 0x7fffffffffffffffL;
                }
            } while (!d.compareAndSet(l6, l2));
            a.b();
            a.a.a(this);
            return;
        }

        public final long b(long l)
        {
            if (l <= 0L)
            {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            long l1;
            long l2;
            do
            {
                l1 = get();
                if (l1 == 0x8000000000000000L)
                {
                    return 0x8000000000000000L;
                }
                l2 = l1 - l;
                if (l2 < 0L)
                {
                    throw new IllegalStateException((new StringBuilder("More produced (")).append(l).append(") than requested (").append(l1).append(")").toString());
                }
            } while (!compareAndSet(l1, l2));
            return l2;
        }

        public final boolean isUnsubscribed()
        {
            return get() == 0x8000000000000000L;
        }

        public final void unsubscribe()
        {
            if (get() == 0x8000000000000000L || getAndSet(0x8000000000000000L) == 0x8000000000000000L) goto _L2; else goto _L1
_L1:
            e e1 = a;
_L8:
            b ab1[] = (b[])e1.f.get();
            if (ab1 != e.d && ab1 != rx.internal.a.e.e) goto _L4; else goto _L3
_L3:
            a.b();
_L2:
            return;
_L4:
            int i;
            byte byte0;
            int k;
            byte0 = -1;
            k = ab1.length;
            i = 0;
_L9:
            int j;
            j = byte0;
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!ab1[i].equals(this)) goto _L6; else goto _L5
_L5:
            j = i;
            if (j < 0) goto _L3; else goto _L7
_L7:
            b ab[];
            if (k == 1)
            {
                ab = e.d;
            } else
            {
                ab = new b[k - 1];
                System.arraycopy(ab1, 0, ab, 0, j);
                System.arraycopy(ab1, j + 1, ab, j, k - j - 1);
            }
            if (!e1.f.compareAndSet(ab1, ab)) goto _L8; else goto _L3
_L6:
            i++;
              goto _L9
        }

        public b(e e1, X x)
        {
            a = e1;
            b = x;
        }
    }

    static final class c extends AtomicReference
    {

        final Object a;

        public c(Object obj)
        {
            a = obj;
        }
    }

    static interface d
    {

        public abstract void a();

        public abstract void a(Object obj);

        public abstract void a(Throwable throwable);

        public abstract void a(b b1);
    }

    static final class e extends X
        implements Y
    {

        static final b d[] = new b[0];
        static final b e[] = new b[0];
        final d a;
        final rx.internal.a.g b = rx.internal.a.g.a();
        boolean c;
        final AtomicReference f;
        final AtomicBoolean g = new AtomicBoolean();
        boolean h;
        boolean i;
        long j;
        long k;
        volatile Q l;

        private void c()
        {
            b ab[] = (b[])f.get();
            int j1 = ab.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                b b1 = ab[i1];
                a.a(b1);
            }

        }

        final void a()
        {
            add(rx.h.f.a(new cd(this)));
        }

        final void b()
        {
            if (!isUnsubscribed()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            this;
            JVM INSTR monitorenter ;
            if (!h)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            i = true;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            h = true;
            this;
            JVM INSTR monitorexit ;
_L10:
            Object obj;
            long l1;
            long l3;
            long l4;
            if (isUnsubscribed())
            {
                continue; /* Loop/switch isn't completed */
            }
            b ab[] = (b[])f.get();
            l3 = j;
            int j1 = ab.length;
            l1 = 0L;
            for (int i1 = 0; i1 < j1; i1++)
            {
                l1 = Math.max(l1, ab[i1].d.get());
            }

            l4 = k;
            obj = l;
            l3 = l1 - l3;
            if (l3 == 0L) goto _L4; else goto _L3
_L3:
            j = l1;
            if (obj == null) goto _L6; else goto _L5
_L5:
            if (l4 != 0L)
            {
                k = 0L;
                ((Q) (obj)).a(l4 + l3);
            } else
            {
                ((Q) (obj)).a(l3);
            }
_L8:
            this;
            JVM INSTR monitorenter ;
            if (i)
            {
                break; /* Loop/switch isn't completed */
            }
            h = false;
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L6:
            l3 = l4 + l3;
            long l2 = l3;
            if (l3 < 0L)
            {
                l2 = 0x7fffffffffffffffL;
            }
            k = l2;
            continue; /* Loop/switch isn't completed */
_L4:
            if (l4 != 0L && obj != null)
            {
                k = 0L;
                ((Q) (obj)).a(l4);
            }
            if (true) goto _L8; else goto _L7
_L7:
            i = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L10; else goto _L9
_L9:
            if (true) goto _L1; else goto _L11
_L11:
        }

        public final void onCompleted()
        {
            if (c)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            c = true;
            a.a();
            c();
            unsubscribe();
            return;
            Exception exception;
            exception;
            unsubscribe();
            throw exception;
        }

        public final void onError(Throwable throwable)
        {
            if (c)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            c = true;
            a.a(throwable);
            c();
            unsubscribe();
            return;
            throwable;
            unsubscribe();
            throw throwable;
        }

        public final void onNext(Object obj)
        {
            if (!c)
            {
                a.a(obj);
                c();
            }
        }

        public final void setProducer(Q q)
        {
            if (l != null)
            {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            } else
            {
                l = q;
                b();
                c();
                return;
            }
        }


        public e(d d1)
        {
            a = d1;
            f = new AtomicReference(d);
            request(0L);
        }
    }

    static final class f extends a
    {

        final R d;
        final long e;
        final int f;

        final Object b(Object obj)
        {
            return new l(System.currentTimeMillis(), obj);
        }

        final void b()
        {
            long l1 = System.currentTimeMillis();
            long l2 = e;
            c c2 = (c)get();
            c c1 = (c)c2.get();
            int i = 0;
            do
            {
                if (c1 == null)
                {
                    break;
                }
                if (c > f)
                {
                    i++;
                    c = c - 1;
                    c c3 = (c)c1.get();
                    c2 = c1;
                    c1 = c3;
                    continue;
                }
                if (((l)c1.a).a > l1 - l2)
                {
                    break;
                }
                i++;
                c = c - 1;
                c c4 = (c)c1.get();
                c2 = c1;
                c1 = c4;
            } while (true);
            if (i != 0)
            {
                set(c2);
            }
        }

        final Object c(Object obj)
        {
            return ((l)obj).b;
        }

        final void c()
        {
            long l1 = System.currentTimeMillis();
            long l2 = e;
            c c1 = (c)get();
            c c3 = (c)c1.get();
            int i = 0;
            c c5 = c1;
            for (c c2 = c3; c2 != null && c > 1 && ((l)c2.a).a <= l1 - l2;)
            {
                i++;
                c = c - 1;
                c5 = (c)c2.get();
                c c4 = c2;
                c2 = c5;
                c5 = c4;
            }

            if (i != 0)
            {
                set(c5);
            }
        }

        public f(int i, long l1, R r)
        {
            d = r;
            f = i;
            e = l1;
        }
    }

    static final class g extends a
    {

        final int d;

        final void b()
        {
            if (c > d)
            {
                c c1 = (c)((c)get()).get();
                if (c1 == null)
                {
                    throw new IllegalStateException("Empty list!");
                }
                super.c = super.c - 1;
                set(c1);
            }
        }

        public g(int i)
        {
            d = i;
        }
    }

    static final class h extends ArrayList
        implements d
    {

        final rx.internal.a.g a = rx.internal.a.g.a();
        volatile int b;

        public final void a()
        {
            add(rx.internal.a.g.b());
            b = b + 1;
        }

        public final void a(Object obj)
        {
            add(rx.internal.a.g.a(obj));
            b = b + 1;
        }

        public final void a(Throwable throwable)
        {
            add(rx.internal.a.g.a(throwable));
            b = b + 1;
        }

        public final void a(b b1)
        {
            b1;
            JVM INSTR monitorenter ;
            if (!b1.e)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            b1.f = true;
            b1;
            JVM INSTR monitorexit ;
            return;
            b1.e = true;
            b1;
            JVM INSTR monitorexit ;
_L2:
            int i;
            long l;
            long l2;
            if (b1.isUnsubscribed())
            {
                break; /* Loop/switch isn't completed */
            }
            int j = b;
            Integer integer = (Integer)b1.c;
            long l1;
            if (integer != null)
            {
                i = integer.intValue();
            } else
            {
                i = 0;
            }
            l2 = b1.get();
            l = 0L;
            l1 = l2;
            do
            {
                if (l1 == 0L || i >= j)
                {
                    break;
                }
                Object obj = get(i);
                boolean flag;
                try
                {
                    flag = rx.internal.a.g.a(b1.b, obj);
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    b1.unsubscribe();
                    if (!rx.internal.a.g.c(obj) && !rx.internal.a.g.b(obj))
                    {
                        b1.b.onError(OnErrorThrowable.addValueAsLastCause(throwable, rx.internal.a.g.e(obj)));
                        return;
                    }
                    break; /* Loop/switch isn't completed */
                }
                if (flag || b1.isUnsubscribed())
                {
                    break; /* Loop/switch isn't completed */
                }
                i++;
                l1--;
                l++;
            } while (true);
            break MISSING_BLOCK_LABEL_182;
            obj;
            b1;
            JVM INSTR monitorexit ;
            throw obj;
            if (l != 0L)
            {
                b1.c = Integer.valueOf(i);
                if (l2 != 0x7fffffffffffffffL)
                {
                    b1.b(l);
                }
            }
            b1;
            JVM INSTR monitorenter ;
            if (b1.f)
            {
                break MISSING_BLOCK_LABEL_236;
            }
            b1.e = false;
            b1;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            b1;
            JVM INSTR monitorexit ;
            throw exception;
            b1.f = false;
            b1;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public h()
        {
            super(16);
        }
    }


    static final rx.b.e d = new bU();
    final rx.b a;
    final AtomicReference b;
    final rx.b.e c;

    private bT(rx.b.f f1, rx.b b1, AtomicReference atomicreference, rx.b.e e1)
    {
        super(f1);
        a = b1;
        b = atomicreference;
        c = e1;
    }

    public static rx.b a(rx.b.e e1, rx.b.f f1)
    {
        return rx.b.create(new bV(e1, f1));
    }

    public static rx.c.b a(rx.b b1)
    {
        return a(b1, d);
    }

    public static rx.c.b a(rx.b b1, int i)
    {
        if (i == 0x7fffffff)
        {
            return a(b1, d);
        } else
        {
            return a(b1, ((rx.b.e) (new ca(i))));
        }
    }

    public static rx.c.b a(rx.b b1, long l, TimeUnit timeunit, R r)
    {
        return a(b1, l, timeunit, r, 0x7fffffff);
    }

    public static rx.c.b a(rx.b b1, long l, TimeUnit timeunit, R r, int i)
    {
        return a(b1, ((rx.b.e) (new cb(i, timeunit.toMillis(l), r))));
    }

    private static rx.c.b a(rx.b b1, rx.b.e e1)
    {
        AtomicReference atomicreference = new AtomicReference();
        return new bT(new cc(atomicreference, e1), b1, atomicreference, e1);
    }

    public static rx.c.b a(rx.c.b b1, R r)
    {
        return new bZ(new bX(b1.observeOn(r)), b1);
    }

    public final void a(rx.b.b b1)
    {
        e e1;
        e e2;
        do
        {
            e2 = (e)b.get();
            if (e2 != null)
            {
                e1 = e2;
                if (!e2.isUnsubscribed())
                {
                    break;
                }
            }
            e1 = new e((d)c.call());
            e1.a();
        } while (!b.compareAndSet(e2, e1));
        boolean flag;
        if (!e1.g.get() && e1.g.compareAndSet(false, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.call(e1);
        if (flag)
        {
            a.unsafeSubscribe(e1);
        }
    }

}
