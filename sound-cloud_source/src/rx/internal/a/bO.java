// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Q;
import rx.X;
import rx.Y;
import rx.c.b;
import rx.exceptions.MissingBackpressureException;
import rx.h.f;
import rx.internal.util.g;
import rx.internal.util.p;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.a:
//            bP, g, bS

public final class bO extends rx.c.b
{
    static final class a extends AtomicLong
        implements Q, Y
    {

        final b a;
        final X b;

        public final void a(long l)
        {
            long l3;
            if (l >= 0L)
            {
                while ((l3 = get()) != 0x8000000000000000L && (l3 < 0L || l != 0L)) 
                {
                    long l1;
                    if (l3 == 0xc000000000000000L)
                    {
                        l1 = l;
                    } else
                    {
                        long l2 = l3 + l;
                        l1 = l2;
                        if (l2 < 0L)
                        {
                            l1 = 0x7fffffffffffffffL;
                        }
                    }
                    if (compareAndSet(l3, l1))
                    {
                        a.b();
                        return;
                    }
                }
            }
        }

        public final boolean isUnsubscribed()
        {
            return get() == 0x8000000000000000L;
        }

        public final void unsubscribe()
        {
            if (get() == 0x8000000000000000L || getAndSet(0x8000000000000000L) == 0x8000000000000000L) goto _L2; else goto _L1
_L1:
            b b1 = a;
_L8:
            a aa1[] = (a[])b1.g.get();
            if (aa1 != b.e && aa1 != rx.internal.a.b.f) goto _L4; else goto _L3
_L3:
            a.b();
_L2:
            return;
_L4:
            int i;
            byte byte0;
            int k;
            byte0 = -1;
            k = aa1.length;
            i = 0;
_L9:
            int j;
            j = byte0;
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!aa1[i].equals(this)) goto _L6; else goto _L5
_L5:
            j = i;
            if (j < 0) goto _L3; else goto _L7
_L7:
            a aa[];
            if (k == 1)
            {
                aa = b.e;
            } else
            {
                aa = new a[k - 1];
                System.arraycopy(aa1, 0, aa, 0, j);
                System.arraycopy(aa1, j + 1, aa, j, k - j - 1);
            }
            if (!b1.g.compareAndSet(aa1, aa)) goto _L8; else goto _L3
_L6:
            i++;
              goto _L9
        }

        public a(b b1, X x)
        {
            a = b1;
            b = x;
            lazySet(0xc000000000000000L);
        }
    }

    static final class b extends X
        implements Y
    {

        static final a e[] = new a[0];
        static final a f[] = new a[0];
        final Queue a;
        final rx.internal.a.g b = rx.internal.a.g.a();
        final AtomicReference c;
        volatile Object d;
        final AtomicReference g;
        final AtomicBoolean h = new AtomicBoolean();
        boolean i;
        boolean j;

        private boolean a(Object obj, boolean flag)
        {
            int k;
            int l;
            l = 0;
            k = 0;
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_165;
            }
            if (!rx.internal.a.g.b(obj))
            {
                break MISSING_BLOCK_LABEL_88;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_165;
            }
            c.compareAndSet(this, null);
            obj = (a[])g.getAndSet(f);
            l = obj.length;
_L2:
            if (k >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            ((a) (obj[k])).b.onCompleted();
            k++;
            if (true) goto _L2; else goto _L1
_L1:
            unsubscribe();
            return true;
            obj;
            unsubscribe();
            throw obj;
            obj = rx.internal.a.g.f(obj);
            c.compareAndSet(this, null);
            a aa[];
            int i1;
            aa = (a[])g.getAndSet(f);
            i1 = aa.length;
            k = l;
_L4:
            if (k >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            aa[k].b.onError(((Throwable) (obj)));
            k++;
            if (true) goto _L4; else goto _L3
_L3:
            unsubscribe();
            return true;
            obj;
            unsubscribe();
            throw obj;
            return false;
        }

        final void a()
        {
            add(rx.h.f.a(new bS(this)));
        }

        final void b()
        {
            this;
            JVM INSTR monitorenter ;
            if (!i)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            j = true;
            this;
            JVM INSTR monitorexit ;
            return;
            i = true;
            j = false;
            this;
            JVM INSTR monitorexit ;
            boolean flag = false;
_L11:
            Object obj;
            boolean flag1;
            obj = d;
            flag1 = a.isEmpty();
            if (a(obj, flag1)) goto _L2; else goto _L1
_L1:
            if (flag1) goto _L4; else goto _L3
_L3:
            int j1;
            obj = (a[])g.get();
            j1 = obj.length;
            long l1 = 0x7fffffffffffffffL;
            int k1 = obj.length;
            int k;
            int l;
            l = 0;
            k = 0;
_L6:
            if (k >= k1)
            {
                break MISSING_BLOCK_LABEL_181;
            }
            long l3 = obj[k].get();
            if (l3 < 0L)
            {
                break; /* Loop/switch isn't completed */
            }
            long l2 = Math.min(l1, l3);
            int i1 = l;
_L7:
            k++;
            l = i1;
            l1 = l2;
            if (true) goto _L6; else goto _L5
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L5:
            i1 = l;
            l2 = l1;
            if (l3 == 0x8000000000000000L)
            {
                i1 = l + 1;
                l2 = l1;
            }
              goto _L7
            if (j1 != l) goto _L9; else goto _L8
_L8:
            obj = d;
            if (a.poll() == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (a(obj, flag1)) goto _L2; else goto _L10
_L10:
            request(1L);
              goto _L11
            obj;
            k = ((flag) ? 1 : 0);
_L26:
            if (k != 0) goto _L13; else goto _L12
_L12:
            this;
            JVM INSTR monitorenter ;
            i = false;
            this;
            JVM INSTR monitorexit ;
_L13:
            throw obj;
_L9:
            k = 0;
_L29:
            if ((long)k >= l1) goto _L15; else goto _L14
_L14:
            Object obj1;
            Object obj2;
            obj1 = d;
            obj2 = a.poll();
            Exception exception;
            Throwable throwable;
            if (obj2 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (a(obj1, flag1)) goto _L2; else goto _L16
_L16:
            if (flag1) goto _L15; else goto _L17
_L17:
            obj1 = rx.internal.a.g.e(obj2);
            i1 = obj.length;
            l = 0;
_L28:
            if (l >= i1) goto _L19; else goto _L18
_L18:
            obj2 = obj[l];
            l2 = ((a) (obj2)).get();
            if (l2 <= 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            ((a) (obj2)).b.onNext(obj1);
            if (1L > 0L)
            {
                break MISSING_BLOCK_LABEL_381;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
            throwable;
            ((a) (obj2)).unsubscribe();
            ((a) (obj2)).b.onError(throwable);
            continue; /* Loop/switch isn't completed */
_L21:
            l2 = ((a) (obj2)).get();
            if (l2 != 0xc000000000000000L)
            {
                break MISSING_BLOCK_LABEL_406;
            }
            throw new IllegalStateException("Produced without request");
            if (l2 == 0x8000000000000000L)
            {
                continue; /* Loop/switch isn't completed */
            }
            l3 = l2 - 1L;
            if (l3 >= 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            throw new IllegalStateException((new StringBuilder("More produced (1) than requested (")).append(l2).append(")").toString());
            if (!((a) (obj2)).compareAndSet(l2, l3)) goto _L21; else goto _L20
_L20:
            continue; /* Loop/switch isn't completed */
_L15:
            if (k <= 0) goto _L23; else goto _L22
_L22:
            request(k);
              goto _L23
_L4:
            this;
            JVM INSTR monitorenter ;
            if (j) goto _L25; else goto _L24
_L24:
            i = false;
            l = 1;
            this;
            JVM INSTR monitorexit ;
            return;
_L27:
            l = k;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
              goto _L26
_L25:
            j = false;
            this;
            JVM INSTR monitorexit ;
            break; /* Loop/switch isn't completed */
            exception;
            k = 0;
              goto _L27
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            return;
              goto _L28
_L19:
            k++;
              goto _L29
_L23:
            if (l1 != 0L && !flag1) goto _L11; else goto _L4
            exception;
            k = l;
              goto _L27
        }

        public final void onCompleted()
        {
            if (d == null)
            {
                d = rx.internal.a.g.b();
                b();
            }
        }

        public final void onError(Throwable throwable)
        {
            if (d == null)
            {
                d = rx.internal.a.g.a(throwable);
                b();
            }
        }

        public final void onNext(Object obj)
        {
            if (!a.offer(rx.internal.a.g.a(obj)))
            {
                onError(new MissingBackpressureException());
                return;
            } else
            {
                b();
                return;
            }
        }

        public final void onStart()
        {
            request(g.c);
        }


        public b(AtomicReference atomicreference)
        {
            Object obj;
            if (UnsafeAccess.isUnsafeAvailable())
            {
                obj = new SpscArrayQueue(g.c);
            } else
            {
                obj = new p(g.c);
            }
            a = ((Queue) (obj));
            g = new AtomicReference(e);
            c = atomicreference;
        }
    }


    final rx.b a;
    final AtomicReference b;

    private bO(rx.b.f f, rx.b b1, AtomicReference atomicreference)
    {
        super(f);
        a = b1;
        b = atomicreference;
    }

    public static rx.c.b a(rx.b b1)
    {
        AtomicReference atomicreference = new AtomicReference();
        return new bO(new bP(atomicreference), b1, atomicreference);
    }

    public final void a(rx.b.b b1)
    {
        b b2;
        b b3;
        do
        {
            b3 = (b)b.get();
            if (b3 != null)
            {
                b2 = b3;
                if (!b3.isUnsubscribed())
                {
                    break;
                }
            }
            b2 = new b(b);
            b2.a();
        } while (!b.compareAndSet(b3, b2));
        boolean flag;
        if (!b2.h.get() && b2.h.compareAndSet(false, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.call(b2);
        if (flag)
        {
            a.unsafeSubscribe(b2);
        }
    }
}
