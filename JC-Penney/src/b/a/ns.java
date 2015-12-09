// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nr, mo

public final class ns extends nr
{

    private final mo a;

    protected final int b(nr nr1)
    {
        return a.a(((ns)nr1).a);
    }

    public final mo b()
    {
        return a;
    }

    public final String e()
    {
        return "annotation";
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ns))
        {
            return false;
        } else
        {
            return a.equals(((ns)obj).a);
        }
    }

    public final String h_()
    {
        return a.toString();
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
