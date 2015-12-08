// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bh, ap, bd, g, 
//            f, aq

static final class a
    implements ect
{

    private final h a;

    private Object c(ect ect)
    {
        return a.b(ect);
    }

    public final int a()
    {
        return a.a;
    }

    public final a.a a(ap ap1, a.a a1, int i)
    {
        return ap1.a(a1, i);
    }

    public final ect a(ect ect, Object obj)
    {
        a.b(ect, obj);
        return this;
    }

    public final Object a(f f, aq aq, ect ect, bd bd1)
    {
        if (bd1 != null)
        {
            bd1 = bd1.u();
        } else
        {
            bd1 = a.c(ect);
        }
        if (!ect.o())
        {
            ect = (bd)c(ect);
            if (ect != null)
            {
                bd1.c(ect);
            }
        }
        bd1.b(f, aq);
        return bd1.h();
    }

    public final Object a(g g1, aq aq, h h, bd bd1)
    {
        if (bd1 != null)
        {
            bd1 = bd1.u();
        } else
        {
            bd1 = a.c(h);
        }
        if (!h.o())
        {
            bd bd2 = (bd)c(h);
            if (bd2 != null)
            {
                bd1.c(bd2);
            }
        }
        g1.a(h.e(), bd1, aq);
        return bd1.h();
    }

    public final boolean a(h h)
    {
        return a.a(h);
    }

    public final ect b(ect ect, Object obj)
    {
        a.a(ect, obj);
        return this;
    }

    public final ect b(ect ect)
    {
        if (ect.k())
        {
            return b;
        }
        if (!ect.o() && (a instanceof a))
        {
            return c;
        } else
        {
            return a;
        }
    }

    public final Object b(g g1, aq aq, a a1, bd bd1)
    {
        if (bd1 != null)
        {
            bd1 = bd1.u();
        } else
        {
            bd1 = a.c(a1);
        }
        if (!a1.o())
        {
            a1 = (bd)c(a1);
            if (a1 != null)
            {
                bd1.c(a1);
            }
        }
        g1.a(bd1, aq);
        return bd1.h();
    }

    public ect(ect ect)
    {
        a = ect;
    }
}
