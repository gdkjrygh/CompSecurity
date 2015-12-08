// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gwq extends hff
{

    private static final Object b = new Object();
    final hfc a = new hfc() {

        private gwq a;

        public final void a(long l)
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder("requested ")).append(l).append(" < 0").toString());
            }
            if (l != 0L) goto _L2; else goto _L1
_L1:
            return;
_L2:
            gwq gwq1 = a;
            gwq1;
            JVM INSTR monitorenter ;
            Object obj;
            long l2;
            obj = gwq.a(a);
            l2 = gwq.b(a);
            if (0x7fffffffffffffffL - l > l2) goto _L4; else goto _L3
_L3:
            gwq.a(a, 0x7fffffffffffffffL);
_L5:
            gwq1;
            JVM INSTR monitorexit ;
            if (obj != gwq.a())
            {
                gwq.c(a).onNext(obj);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            long l1 = l;
            if (obj != gwq.a())
            {
                l1 = l - 1L;
            }
            gwq.a(a, l2 + l1);
              goto _L5
            Exception exception;
            exception;
            gwq1;
            JVM INSTR monitorexit ;
            throw exception;
            if (true) goto _L1; else goto _L6
_L6:
        }

            
            {
                a = gwq.this;
                super();
            }
    };
    private final hff c;
    private Object d;
    private long e;

    public gwq(hff hff1)
    {
        d = b;
        c = hff1;
    }

    static long a(gwq gwq1, long l)
    {
        gwq1.e = l;
        return l;
    }

    static Object a()
    {
        return b;
    }

    static Object a(gwq gwq1)
    {
        return gwq1.d;
    }

    static long b(gwq gwq1)
    {
        return gwq1.e;
    }

    static hff c(gwq gwq1)
    {
        return gwq1.c;
    }

    public final void onCompleted()
    {
        c.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        c.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        long l = e;
        if (l != 0x7fffffffffffffffL) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c.onNext(obj);
        }
        return;
_L2:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        e = l - 1L;
        continue; /* Loop/switch isn't completed */
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        d = obj;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }

}
