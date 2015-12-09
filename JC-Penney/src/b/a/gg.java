// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pn, gd

public final class gg
    implements Comparable
{

    public final gd a;
    private final int b;
    private final int c;

    public gg(int i, int j, gd gd1)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("start < 0");
        }
        if (j <= i)
        {
            throw new IllegalArgumentException("end <= start");
        }
        if (((pn) (gd1)).L)
        {
            throw new IllegalArgumentException("handlers.isMutable()");
        } else
        {
            b = i;
            c = j;
            a = gd1;
            return;
        }
    }

    public final int a()
    {
        return b;
    }

    public final int a(gg gg1)
    {
        if (b >= gg1.b)
        {
            if (b > gg1.b)
            {
                return 1;
            }
            if (c >= gg1.c)
            {
                if (c > gg1.c)
                {
                    return 1;
                } else
                {
                    return a.a(gg1.a);
                }
            }
        }
        return -1;
    }

    public final int b()
    {
        return c;
    }

    public final gd c()
    {
        return a;
    }

    public final int compareTo(Object obj)
    {
        return a((gg)obj);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gg)
        {
            flag = flag1;
            if (a((gg)obj) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (b * 31 + c) * 31 + a.hashCode();
    }
}
