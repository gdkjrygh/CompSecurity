// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pi, nb, pe, my, 
//            nl, ph, pf

public final class mt
    implements pi
{

    public final int a;
    public final nb b;
    public final ph c;
    public final int d;

    public mt(int i, nb nb1, ph ph1, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("label < 0");
        }
        int l;
        try
        {
            nb1.g();
        }
        // Misplaced declaration of an exception variable
        catch (nb nb1)
        {
            throw new NullPointerException("insns == null");
        }
        l = ((pe) (nb1)).K.length;
        if (l == 0)
        {
            throw new IllegalArgumentException("insns.size() == 0");
        }
        for (int k = l - 2; k >= 0; k--)
        {
            if (nb1.a(k).b.c != 1)
            {
                throw new IllegalArgumentException((new StringBuilder("insns[")).append(k).append("] is a branch or can throw").toString());
            }
        }

        if (nb1.a(l - 1).b.c == 1)
        {
            throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
        }
        try
        {
            ph1.g();
        }
        // Misplaced declaration of an exception variable
        catch (nb nb1)
        {
            throw new NullPointerException("successors == null");
        }
        if (j < -1)
        {
            throw new IllegalArgumentException("primarySuccessor < -1");
        }
        if (j >= 0 && !ph1.d(j))
        {
            throw new IllegalArgumentException((new StringBuilder("primarySuccessor ")).append(j).append(" not in successors ").append(ph1).toString());
        } else
        {
            a = i;
            b = nb1;
            c = ph1;
            d = j;
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    public final int hashCode()
    {
        return System.identityHashCode(this);
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(pf.b(a)).append('}').toString();
    }
}
