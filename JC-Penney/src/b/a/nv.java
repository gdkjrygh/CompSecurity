// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ok, om, oo, or, 
//            os, op, nr, ot

public abstract class nv extends ok
{

    private final or c;
    private or d;

    nv(op op1, om om1)
    {
        super(op1, om1);
        c = or.a(super.b.c().h());
        d = null;
    }

    public final int a(boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = c;
        } else
        {
            if (d == null)
            {
                obj = super.a.f();
                d = c.a(((ot) (obj)));
            }
            obj = d;
        }
        return ((or) (obj)).b().b();
    }

    protected final int b(nr nr)
    {
        int i = super.b(nr);
        if (i != 0)
        {
            return i;
        } else
        {
            nr = (nv)nr;
            return c.a(((nv) (nr)).c);
        }
    }

    public final ot b()
    {
        return c.a();
    }

    public final or f()
    {
        return c;
    }
}
