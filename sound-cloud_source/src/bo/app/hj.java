// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.ListIterator;

// Referenced classes of package bo.app:
//            fv, hh, hk, gg, 
//            ht, fx, hx

final class hj extends fv
{

    private final fx b;
    private final gg c;

    private hj(fx fx, gg gg1)
    {
        b = fx;
        c = gg1;
    }

    hj(fx fx, Object aobj[])
    {
        int i = aobj.length;
        i;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 60
    //                   1 67;
           goto _L1 _L2 _L3
_L1:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = hh.b(aobj, i);
        }
        aobj = new hk(aobj1);
_L5:
        this(fx, ((gg) (aobj)));
        return;
_L2:
        aobj = gg.a;
        continue; /* Loop/switch isn't completed */
_L3:
        aobj = new ht(aobj[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    final int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public final hx a(int i)
    {
        return c.a(i);
    }

    final fx c()
    {
        return b;
    }

    public final Object get(int i)
    {
        return c.get(i);
    }

    public final ListIterator listIterator(int i)
    {
        return a(i);
    }
}
