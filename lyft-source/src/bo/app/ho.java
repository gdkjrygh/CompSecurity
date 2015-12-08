// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.ListIterator;

// Referenced classes of package bo.app:
//            ga, hm, hp, gl, 
//            hy, gc, ic

final class ho extends ga
{

    private final gc b;
    private final gl c;

    private ho(gc gc, gl gl1)
    {
        b = gc;
        c = gl1;
    }

    ho(gc gc, Object aobj[])
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
            aobj1 = hm.b(aobj, i);
        }
        aobj = new hp(aobj1);
_L5:
        this(gc, ((gl) (aobj)));
        return;
_L2:
        aobj = gl.a;
        continue; /* Loop/switch isn't completed */
_L3:
        aobj = new hy(aobj[0]);
        if (true) goto _L5; else goto _L4
_L4:
    }

    final int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public final ic a(int i)
    {
        return c.a(i);
    }

    final gc c()
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
