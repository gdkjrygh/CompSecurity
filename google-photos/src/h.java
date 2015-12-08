// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class h
    implements Runnable
{

    private g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (g.a(a))
            {
                if (!g.b(a))
                {
                    break label0;
                }
            }
            return;
        }
        int i = g.c(a);
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj2;
        obj2 = g.d(a);
        g.a(a, 2);
        obj;
        JVM INSTR monitorexit ;
        boolean flag1;
        long l;
        long l1 = g.e(a).a(i, ((android.graphics.Bitmap) (obj2)), i - 2);
        l = l1;
        if (l1 < 20L)
        {
            l = 100L;
        }
        flag1 = false;
        obj2 = g.a(a);
        obj2;
        JVM INSTR monitorenter ;
        if (!g.b(a)) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = g.d(a);
        g.a(a, null);
        boolean flag = false;
_L4:
        l = g.h(a);
        obj2;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.scheduleSelf(a, l);
        }
        if (obj1 != null)
        {
            g.i(a).a(((android.graphics.Bitmap) (obj1)));
            return;
        } else
        {
            return;
        }
_L2:
        flag = flag1;
        if (g.c(a) < 0)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = flag1;
        if (g.f(a) != 2)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = true;
        g.a(a, l + g.g(a));
        g.a(a, 3);
        break MISSING_BLOCK_LABEL_250;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
