// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.a.u;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.c.a.c:
//            e, f

abstract class d extends Enum
    implements c.a
{
    static final class a
    {

        final long a[];
        long b;

        final long a()
        {
            return (long)a.length * 64L;
        }

        final boolean a(long l)
        {
            if (!b(l))
            {
                long al[] = a;
                int i = (int)(l >>> 6);
                al[i] = al[i] | 1L << (int)l;
                b = b + 1L;
                return true;
            } else
            {
                return false;
            }
        }

        final boolean b(long l)
        {
            return (a[(int)(l >>> 6)] & 1L << (int)l) != 0L;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                obj = (a)obj;
                return Arrays.equals(a, ((a) (obj)).a);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(a);
        }

        a(long l)
        {
            this(new long[com.c.a.g.a.a(com.c.a.e.a.a(l, RoundingMode.CEILING))]);
        }

        private a(long al[])
        {
            int i = 0;
            super();
            long l;
            boolean flag;
            if (al.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag, "data length is zero!");
            a = al;
            l = 0L;
            for (int j = al.length; i < j; i++)
            {
                l += Long.bitCount(al[i]);
            }

            b = l;
        }
    }


    public static final d a;
    public static final d b;
    private static final d c[];

    private d(String s, int i)
    {
        super(s, i);
    }

    d(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/c/a/c/d, s);
    }

    public static d[] values()
    {
        return (d[])c.clone();
    }

    static 
    {
        a = new e("MURMUR128_MITZ_32");
        b = new f("MURMUR128_MITZ_64");
        c = (new d[] {
            a, b
        });
    }
}
