// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adP
    implements Comparable
{

    public final aey a;
    public final aey b;

    private static int a(aey aey1, aey aey2)
    {
        if (aey1 == aey2)
        {
            return 0;
        }
        if (aey1 == null)
        {
            return -1;
        }
        if (aey2 == null)
        {
            return 1;
        } else
        {
            return aey1.a(aey2);
        }
    }

    public final int a(adP adp)
    {
        int i = a(a, adp.a);
        if (i != 0)
        {
            return i;
        } else
        {
            return a(b, adp.b);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((adP)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof adP) || a((adP)obj) != 0) 
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
