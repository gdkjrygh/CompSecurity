// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nr, nu, pe

public final class nt extends nr
{

    private final nu a;

    public nt(nu nu1)
    {
        if (nu1 == null)
        {
            throw new NullPointerException("list == null");
        } else
        {
            nu1.g();
            a = nu1;
            return;
        }
    }

    protected final int b(nr nr1)
    {
        return a.a(((nt)nr1).a);
    }

    public final nu b()
    {
        return a;
    }

    public final String e()
    {
        return "array";
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof nt))
        {
            return false;
        } else
        {
            return a.equals(((nt)obj).a);
        }
    }

    public final String h_()
    {
        return a.a("{", ", ", "}");
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.a("array{", ", ", "}", false);
    }
}
