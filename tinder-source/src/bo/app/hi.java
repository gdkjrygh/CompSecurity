// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.ListIterator;

// Referenced classes of package bo.app:
//            fu, hg, hj, gf, 
//            hs, fw, hw

final class hi extends fu
{

    private final fw b;
    private final gf c;

    private hi(fw fw, gf gf1)
    {
        b = fw;
        c = gf1;
    }

    hi(fw fw, Object aobj[])
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
            aobj1 = hg.b(aobj, i);
        }
        aobj = new hj(aobj1);
_L5:
        this(fw, ((gf) (aobj)));
        return;
_L2:
        aobj = gf.a;
        continue; /* Loop/switch isn't completed */
_L3:
        aobj = new hs(aobj[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    final int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public final hw a(int i)
    {
        return c.a(i);
    }

    final fw c()
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
