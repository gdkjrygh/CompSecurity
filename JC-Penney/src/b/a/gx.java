// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nh, op, gw, nc, 
//            oo

public final class gx
    implements Comparable
{

    private final int a;
    private final gw b;
    private final nh c;
    private final op d;

    public gx(int i, gw gw1, nh nh1)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("address < 0");
        }
        if (gw1 == null)
        {
            throw new NullPointerException("disposition == null");
        }
        try
        {
            if (nh1.g() == null)
            {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
        }
        // Misplaced declaration of an exception variable
        catch (gw gw1)
        {
            throw new NullPointerException("spec == null");
        }
        a = i;
        b = gw1;
        c = nh1;
        d = op.a(nh1.b());
    }

    private int b(gx gx1)
    {
        if (a >= gx1.a)
        {
            if (a > gx1.a)
            {
                return 1;
            }
            boolean flag = c();
            if (flag != gx1.c())
            {
                if (flag)
                {
                    return 1;
                }
            } else
            {
                return c.c(gx1.c);
            }
        }
        return -1;
    }

    public final int a()
    {
        return a;
    }

    public final gx a(gw gw1)
    {
        if (gw1 == b)
        {
            return this;
        } else
        {
            return new gx(a, gw1, c);
        }
    }

    public final boolean a(gx gx1)
    {
        return a(gx1.c);
    }

    public final boolean a(nh nh1)
    {
        return c.a(nh1);
    }

    public final gw b()
    {
        return b;
    }

    public final boolean c()
    {
        return b == gw.a;
    }

    public final int compareTo(Object obj)
    {
        return b((gx)obj);
    }

    public final oo d()
    {
        return c.g().a;
    }

    public final oo e()
    {
        return c.g().b;
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof gx) || b((gx)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final op f()
    {
        return d;
    }

    public final int g()
    {
        return c.e();
    }

    public final nh h()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(Integer.toHexString(a)).append(" ").append(b).append(" ").append(c).toString();
    }
}
