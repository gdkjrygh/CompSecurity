// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            aw

public final class av
    implements rx.b.g
{
    static final class a
    {

        int a;
        Object b;
        boolean c;
        boolean d;
        boolean e;

        public final int a(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            int i;
            b = obj;
            c = true;
            i = a + 1;
            a = i;
            this;
            JVM INSTR monitorexit ;
            return i;
            obj;
            throw obj;
        }

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
            a = a + 1;
            b = null;
            c = false;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void a(int i, X x, X x1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!e && c && i == a)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj = b;
            b = null;
            c = false;
            e = true;
            this;
            JVM INSTR monitorexit ;
            try
            {
                x.onNext(obj);
            }
            // Misplaced declaration of an exception variable
            catch (X x)
            {
                x1.onError(x);
                return;
            }
            this;
            JVM INSTR monitorenter ;
            if (d)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            e = false;
            this;
            JVM INSTR monitorexit ;
            return;
            x;
            this;
            JVM INSTR monitorexit ;
            throw x;
            x;
            this;
            JVM INSTR monitorexit ;
            throw x;
            this;
            JVM INSTR monitorexit ;
            x.onCompleted();
            return;
        }

        public final void a(X x, X x1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!e)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            d = true;
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            boolean flag;
            obj = b;
            flag = c;
            b = null;
            c = false;
            e = true;
            this;
            JVM INSTR monitorexit ;
            if (flag)
            {
                try
                {
                    x.onNext(obj);
                }
                // Misplaced declaration of an exception variable
                catch (X x)
                {
                    x1.onError(x);
                    return;
                }
            }
            x.onCompleted();
            return;
            x;
            this;
            JVM INSTR monitorexit ;
            throw x;
        }

        a()
        {
        }
    }


    final long a;
    final TimeUnit b;
    final R c;

    public av(long l, TimeUnit timeunit, R r)
    {
        a = l;
        b = timeunit;
        c = r;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        rx.R.a a1 = c.a();
        e e1 = new e(((X) (obj)));
        rx.h.e e2 = new rx.h.e();
        e1.add(a1);
        e1.add(e2);
        return new aw(this, ((X) (obj)), e2, a1, e1);
    }
}
