// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.c;

import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Y;
import rx.b.a;
import rx.exceptions.OnErrorNotImplementedException;
import rx.h.b;
import rx.internal.util.o;

public final class d extends AtomicReference
    implements Runnable, Y
{
    private final class a
        implements Y
    {

        final d a;
        private final Future b;

        public final boolean isUnsubscribed()
        {
            return b.isCancelled();
        }

        public final void unsubscribe()
        {
            if (a.get() != Thread.currentThread())
            {
                b.cancel(true);
                return;
            } else
            {
                b.cancel(false);
                return;
            }
        }

        private a(Future future)
        {
            a = d.this;
            super();
            b = future;
        }

        a(Future future, byte byte0)
        {
            this(future);
        }
    }

    private static final class b extends AtomicBoolean
        implements Y
    {

        final d a;
        final rx.h.b b;

        public final boolean isUnsubscribed()
        {
            return a.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            if (compareAndSet(false, true))
            {
                b.b(a);
            }
        }

        public b(d d1, rx.h.b b1)
        {
            a = d1;
            b = b1;
        }
    }

    private static final class c extends AtomicBoolean
        implements Y
    {

        final d a;
        final o b;

        public final boolean isUnsubscribed()
        {
            return a.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            o o1;
            d d1;
            if (!compareAndSet(false, true))
            {
                break MISSING_BLOCK_LABEL_73;
            }
            o1 = b;
            d1 = a;
            if (o1.b)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            o1;
            JVM INSTR monitorenter ;
            LinkedList linkedlist = o1.a;
            if (!o1.b && linkedlist != null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            o1;
            JVM INSTR monitorexit ;
            return;
            boolean flag = linkedlist.remove(d1);
            o1;
            JVM INSTR monitorexit ;
            if (flag)
            {
                d1.unsubscribe();
                return;
            }
            break MISSING_BLOCK_LABEL_73;
            Exception exception;
            exception;
            o1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public c(d d1, o o1)
        {
            a = d1;
            b = o1;
        }
    }


    final o a;
    final rx.b.a b;

    public d(rx.b.a a1)
    {
        b = a1;
        a = new o();
    }

    public d(rx.b.a a1, rx.h.b b1)
    {
        b = a1;
        a = new o(new b(this, b1));
    }

    public d(rx.b.a a1, o o1)
    {
        b = a1;
        a = new o(new c(this, o1));
    }

    public final void a(Future future)
    {
        a.a(new a(future, (byte)0));
    }

    public final void a(Y y)
    {
        a.a(y);
    }

    public final void a(rx.h.b b1)
    {
        a.a(new b(this, b1));
    }

    public final boolean isUnsubscribed()
    {
        return a.isUnsubscribed();
    }

    public final void run()
    {
        lazySet(Thread.currentThread());
        b.call();
        unsubscribe();
        return;
        Object obj;
        obj;
        if (!(obj instanceof OnErrorNotImplementedException))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", ((Throwable) (obj)));
_L1:
        rx.e.d.a().b();
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, ((Throwable) (obj)));
        unsubscribe();
        return;
        obj = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", ((Throwable) (obj)));
          goto _L1
        obj;
        unsubscribe();
        throw obj;
    }

    public final void unsubscribe()
    {
        if (!a.isUnsubscribed())
        {
            a.unsubscribe();
        }
    }
}
