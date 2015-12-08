// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ok, om, oo, op, 
//            nr, ot

public final class ob extends ok
{

    public ob(op op, om om1)
    {
        super(op, om1);
    }

    protected final int b(nr nr)
    {
        int i = super.b(nr);
        if (i != 0)
        {
            return i;
        } else
        {
            nr = (ob)nr;
            return super.b.c().a(((ok) (nr)).b.c());
        }
    }

    public final ot b()
    {
        return super.b.d();
    }

    public final String e()
    {
        return "field";
    }
}
