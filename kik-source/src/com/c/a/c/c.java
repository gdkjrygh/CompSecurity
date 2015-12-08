// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.a.u;
import com.c.a.a.v;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.c.a.c:
//            d, g

public final class c
    implements v, Serializable
{
    static interface a
        extends Serializable
    {

        public abstract boolean a(Object obj, g g1, int i, d.a a1);

        public abstract boolean b(Object obj, g g1, int i, d.a a1);
    }


    private static final a e;
    private final d.a a;
    private final int b;
    private final g c;
    private final a d;

    private c(d.a a1, int i, g g1, a a2)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "numHashFunctions (%s) must be > 0", new Object[] {
            Integer.valueOf(i)
        });
        if (i <= 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "numHashFunctions (%s) must be <= 255", new Object[] {
            Integer.valueOf(i)
        });
        a = (d.a)u.a(a1);
        b = i;
        c = (g)u.a(g1);
        d = (a)u.a(a2);
    }

    public static c a(g g1)
    {
        return a(g1, e);
    }

    private static c a(g g1, a a1)
    {
        u.a(g1);
        u.a(true, "Expected insertions (%s) must be >= 0", new Object[] {
            Integer.valueOf(20000)
        });
        u.a(true, "False positive probability (%s) must be > 0.0", new Object[] {
            Double.valueOf(0.029999999999999999D)
        });
        u.a(true, "False positive probability (%s) must be < 1.0", new Object[] {
            Double.valueOf(0.029999999999999999D)
        });
        u.a(a1);
        long l = (long)((-20000D * Math.log(0.029999999999999999D)) / (Math.log(2D) * Math.log(2D)));
        int i = Math.max(1, (int)Math.round(((double)l / 20000D) * Math.log(2D)));
        try
        {
            g1 = new c(new d.a(l), i, g1, a1);
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new IllegalArgumentException((new StringBuilder(57)).append("Could not create BloomFilter of ").append(l).append(" bits").toString(), g1);
        }
        return g1;
    }

    public final boolean a(Object obj)
    {
        return b(obj);
    }

    public final boolean b(Object obj)
    {
        return d.b(obj, c, b, a);
    }

    public final boolean c(Object obj)
    {
        return d.a(obj, c, b, a);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof c)
            {
                if (b != ((c) (obj = (c)obj)).b || !c.equals(((c) (obj)).c) || !a.equals(((c) (obj)).a) || !d.equals(((c) (obj)).d))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), c, d, a
        });
    }

    static 
    {
        e = d.b;
    }
}
