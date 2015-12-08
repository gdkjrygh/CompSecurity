// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bxu extends bxh
{

    private bxr a;

    transient bxu(bxr bxr1, bmb bmb, bxg abxg[])
    {
        a = bxr1;
        super(bmb, abxg);
    }

    public final void b()
    {
        c();
        cyt cyt1 = c.c(bxr.b(a));
        java.util.List list1 = c.b.D;
        java.util.List list;
        if (list1 == null)
        {
            list = null;
        } else
        {
            list = b.b(list1);
        }
        synchronized (cyt1.b)
        {
            if (!b.e(list1, cyt1.i))
            {
                cyt1.i = list;
                cyt1.a(cys.a);
            }
        }
        bxr.h(a);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
