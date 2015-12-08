// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adJ
    implements aeQ
{

    public final int a;
    public final adO b;
    public final aeP c;
    public final int d;

    public adJ(int i, adO ado, aeP aep, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("label < 0");
        }
        int l;
        try
        {
            ado.g();
        }
        // Misplaced declaration of an exception variable
        catch (adO ado)
        {
            throw new NullPointerException("insns == null");
        }
        l = ((aeN) (ado)).K.length;
        if (l == 0)
        {
            throw new IllegalArgumentException("insns.size() == 0");
        }
        for (int k = l - 2; k >= 0; k--)
        {
            if (ado.a(k).b.c != 1)
            {
                throw new IllegalArgumentException((new StringBuilder("insns[")).append(k).append("] is a branch or can throw").toString());
            }
        }

        if (ado.a(l - 1).b.c == 1)
        {
            throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
        }
        try
        {
            aep.g();
        }
        // Misplaced declaration of an exception variable
        catch (adO ado)
        {
            throw new NullPointerException("successors == null");
        }
        if (j < -1)
        {
            throw new IllegalArgumentException("primarySuccessor < -1");
        }
        if (j >= 0 && !aep.c(j))
        {
            throw new IllegalArgumentException((new StringBuilder("primarySuccessor ")).append(j).append(" not in successors ").append(aep).toString());
        } else
        {
            a = i;
            b = ado;
            c = aep;
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
        return (new StringBuilder("{")).append(aeO.b(a)).append('}').toString();
    }
}
