// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            f

final class g extends f
{

    int d;

    g()
    {
        a = 0.0F;
        b = Integer.TYPE;
    }

    g(float f1, int i)
    {
        a = f1;
        d = i;
        b = Integer.TYPE;
        c = true;
    }

    private g d()
    {
        g g1 = new g(super.a, d);
        g1.a(b());
        return g1;
    }

    public final Object a()
    {
        return Integer.valueOf(d);
    }

    public final void a(Object obj)
    {
        if (obj != null && obj.getClass() == java/lang/Integer)
        {
            d = ((Integer)obj).intValue();
            c = true;
        }
    }

    public final f c()
    {
        return d();
    }

    public final Object clone()
    {
        return d();
    }
}
