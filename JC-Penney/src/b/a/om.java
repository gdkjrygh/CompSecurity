// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nr, oo, ot

public final class om extends nr
{

    public static final om a = new om(new oo("TYPE"), new oo("Ljava/lang/Class;"));
    private final oo b;
    private final oo c;

    public om(oo oo1, oo oo2)
    {
        if (oo1 == null)
        {
            throw new NullPointerException("name == null");
        }
        if (oo2 == null)
        {
            throw new NullPointerException("descriptor == null");
        } else
        {
            b = oo1;
            c = oo2;
            return;
        }
    }

    protected final int b(nr nr1)
    {
        nr1 = (om)nr1;
        int i = b.a(((om) (nr1)).b);
        if (i != 0)
        {
            return i;
        } else
        {
            return c.a(((om) (nr1)).c);
        }
    }

    public final oo b()
    {
        return b;
    }

    public final oo c()
    {
        return c;
    }

    public final ot d()
    {
        return ot.a(c.h());
    }

    public final String e()
    {
        return "nat";
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof om)
        {
            if (b.equals(((om) (obj = (om)obj)).b) && c.equals(((om) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final String h_()
    {
        return (new StringBuilder()).append(b.h_()).append(':').append(c.h_()).toString();
    }

    public final int hashCode()
    {
        return b.hashCode() * 31 ^ c.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("nat{")).append(h_()).append('}').toString();
    }

}
