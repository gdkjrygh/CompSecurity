// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oq, op, om, oo, 
//            nr

public abstract class ok extends oq
{

    public final op a;
    public final om b;

    ok(op op1, om om1)
    {
        if (op1 == null)
        {
            throw new NullPointerException("definingClass == null");
        }
        if (om1 == null)
        {
            throw new NullPointerException("nat == null");
        } else
        {
            a = op1;
            b = om1;
            return;
        }
    }

    protected int b(nr nr)
    {
        nr = (ok)nr;
        int i = a.a(((ok) (nr)).a);
        if (i != 0)
        {
            return i;
        } else
        {
            return b.b().a(((ok) (nr)).b.b());
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            if (a.equals(((ok) (obj = (ok)obj)).a) && b.equals(((ok) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final op g()
    {
        return a;
    }

    public final om h()
    {
        return b;
    }

    public final String h_()
    {
        return (new StringBuilder()).append(a.h_()).append('.').append(b.h_()).toString();
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 ^ b.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(e()).append('{').append(h_()).append('}').toString();
    }
}
