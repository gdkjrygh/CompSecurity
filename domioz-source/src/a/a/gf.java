// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.ListIterator;

// Referenced classes of package a.a:
//            eq, gd, gg, fb, 
//            gp, es, gt

final class gf extends eq
{

    private final es b;
    private final fb c;

    private gf(es es, fb fb1)
    {
        b = es;
        c = fb1;
    }

    gf(es es, Object aobj[])
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
            aobj1 = gd.b(aobj, i);
        }
        aobj = new gg(aobj1);
_L5:
        this(es, ((fb) (aobj)));
        return;
_L2:
        aobj = fb.a;
        continue; /* Loop/switch isn't completed */
_L3:
        aobj = new gp(aobj[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    final int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public final gt a(int i)
    {
        return c.a(i);
    }

    final es c()
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
