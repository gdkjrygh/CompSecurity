// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.c.b:
//            ba

final class e extends ba
{
    private final class a
        implements f.a
    {

        final e a;
        private int b;
        private final int c;

        public final byte a()
        {
            if (b >= c)
            {
                throw new NoSuchElementException();
            } else
            {
                byte abyte0[] = a.c;
                int i = b;
                b = i + 1;
                return abyte0[i];
            }
        }

        public final boolean hasNext()
        {
            return b < c;
        }

        public final Object next()
        {
            return Byte.valueOf(a());
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private a()
        {
            a = e.this;
            super();
            b = e.this.b();
            c = b + e.this.a();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final int d;
    private final int e;

    e(byte abyte0[], int i, int j)
    {
        super(abyte0);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Offset too small: ")).append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Length too small: ")).append(i).toString());
        }
        if ((long)i + (long)j > (long)abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder("Offset+Length too large: ")).append(i).append("+").append(j).toString());
        } else
        {
            d = i;
            e = j;
            return;
        }
    }

    public final byte a(int i)
    {
        if (i < 0)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Index too small: ")).append(i).toString());
        }
        if (i >= e)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Index too large: ")).append(i).append(", ").append(e).toString());
        } else
        {
            return c[d + i];
        }
    }

    public final int a()
    {
        return e;
    }

    protected final void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(c, d + i, abyte0, j, k);
    }

    protected final int b()
    {
        return d;
    }

    public final f.a c()
    {
        return new a((byte)0);
    }

    public final Iterator iterator()
    {
        return c();
    }
}
