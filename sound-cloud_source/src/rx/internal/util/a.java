// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Q;

public final class rx.internal.util.a
    implements Q
{
    public static interface a
    {

        public abstract Object a();

        public abstract void a(Throwable throwable);

        public abstract boolean a(Object obj);

        public abstract Object b();
    }


    protected static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(rx/internal/util/a, "a");
    protected volatile long a;
    protected boolean c;
    protected volatile boolean d;
    protected Throwable e;
    protected final a f;

    public rx.internal.util.a(a a1)
    {
        f = a1;
    }

    public final void a()
    {
        d = true;
        b();
    }

    public final void a(long l)
    {
        if (l != 0L)
        {
            do
            {
                long l2 = a;
                boolean flag;
                long l1;
                if (l2 == 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (l2 == 0x7fffffffffffffffL)
                {
                    break;
                }
                if (l == 0x7fffffffffffffffL)
                {
                    l1 = l;
                    flag = true;
                } else
                if (l2 > 0x7fffffffffffffffL - l)
                {
                    l1 = 0x7fffffffffffffffL;
                } else
                {
                    l1 = l2 + l;
                }
            } while (!b.compareAndSet(this, l2, l1));
            if (flag)
            {
                b();
                return;
            }
        }
    }

    public final void a(Throwable throwable)
    {
        if (!d)
        {
            e = throwable;
            d = true;
            b();
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag3;
        c = true;
        flag3 = d;
        this;
        JVM INSTR monitorexit ;
        int i;
        boolean flag1;
        boolean flag2;
        long l;
        l = a;
        flag2 = false;
        flag1 = false;
        i = ((flag1) ? 1 : 0);
        Object obj = f;
          goto _L1
_L13:
        if (!flag3) goto _L3; else goto _L2
_L2:
        i = ((flag1) ? 1 : 0);
        if (((a) (obj)).a() != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        i = 1;
        ((a) (obj)).a(e);
        return;
        obj;
        if (i != 0) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
_L5:
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (l == 0L) goto _L6; else goto _L3
_L3:
        i = ((flag1) ? 1 : 0);
        Object obj1 = ((a) (obj)).b();
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        i = ((flag1) ? 1 : 0);
        Exception exception1;
        int j;
        boolean flag;
        long l1;
        if (!((a) (obj)).a(obj1))
        {
            l--;
            j++;
        } else
        {
            return;
        }
          goto _L8
_L6:
        i = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag2) ? 1 : 0);
        flag3 = d;
        i = ((flag2) ? 1 : 0);
        Exception exception;
        if (((a) (obj)).a() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag2) ? 1 : 0);
        if (a != 0x7fffffffffffffffL) goto _L10; else goto _L9
_L9:
        if (flag || flag3)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        j = 1;
        i = j;
        c = false;
        i = j;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        l = 0x7fffffffffffffffL;
_L12:
        i = ((flag2) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
_L10:
        i = ((flag2) ? 1 : 0);
        l1 = b.addAndGet(this, -j);
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        l = l1;
        if (flag) goto _L12; else goto _L11
_L15:
        j = 1;
        i = j;
        c = false;
        i = j;
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
_L1:
        j = 0;
_L8:
        if (l <= 0L && !flag3) goto _L6; else goto _L13
_L11:
        if (!flag3) goto _L15; else goto _L14
_L14:
        l = l1;
        if (!flag) goto _L12; else goto _L15
    }

}
