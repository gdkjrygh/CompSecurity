// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwz
    implements Comparable
{

    final Class a;
    public final Class b;
    public final Class c;
    final String d;
    public final int e;
    public final com.squareup.wire.Message.Datatype f;
    public final com.squareup.wire.Message.Label g;

    private int a(gwz gwz1)
    {
        if (gwz1 != this)
        {
            if (e != gwz1.e)
            {
                return e - gwz1.e;
            }
            if (f != gwz1.f)
            {
                return f.value - gwz1.f.value;
            }
            if (g != gwz1.g)
            {
                return g.value - gwz1.g.value;
            }
            if (a != null && !a.equals(gwz1.a))
            {
                return a.getName().compareTo(gwz1.a.getName());
            }
            if (b != null && !b.equals(gwz1.b))
            {
                return b.getName().compareTo(gwz1.b.getName());
            }
            if (c != null && !c.equals(gwz1.c))
            {
                return c.getName().compareTo(gwz1.c.getName());
            }
        }
        return 0;
    }

    public final int compareTo(Object obj)
    {
        return a((gwz)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof gwz) && a((gwz)obj) == 0;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = e;
        int l = f.value;
        int i1 = g.value;
        int j1 = a.hashCode();
        int i;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (i + (((k * 37 + l) * 37 + i1) * 37 + j1) * 37) * 37 + j;
    }

    public final String toString()
    {
        return String.format("[%s %s %s = %d]", new Object[] {
            g, f, d, Integer.valueOf(e)
        });
    }
}
