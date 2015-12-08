// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oo

public final class nc
    implements Comparable
{

    public final oo a;
    public final oo b;

    private static int a(oo oo1, oo oo2)
    {
        if (oo1 == oo2)
        {
            return 0;
        }
        if (oo1 == null)
        {
            return -1;
        }
        if (oo2 == null)
        {
            return 1;
        } else
        {
            return oo1.a(oo2);
        }
    }

    public final int a(nc nc1)
    {
        int i = a(a, nc1.a);
        if (i != 0)
        {
            return i;
        } else
        {
            return a(b, nc1.b);
        }
    }

    public final oo a()
    {
        return a;
    }

    public final oo b()
    {
        return b;
    }

    public final int compareTo(Object obj)
    {
        return a((nc)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof nc) || a((nc)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }

    public final String toString()
    {
        if (a != null && b == null)
        {
            return a.f();
        }
        if (a == null && b == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder("[");
        String s;
        if (a == null)
        {
            s = "";
        } else
        {
            s = a.f();
        }
        stringbuilder = stringbuilder.append(s).append("|");
        if (b == null)
        {
            s = "";
        } else
        {
            s = b.f();
        }
        return stringbuilder.append(s).toString();
    }
}
