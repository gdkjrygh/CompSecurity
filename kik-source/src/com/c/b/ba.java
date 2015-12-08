// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.c.b:
//            f, cc, bo, g

class ba extends f
{
    private final class a
        implements f.a
    {

        final ba a;
        private int b;
        private final int c;

        public final byte a()
        {
            byte byte0;
            byte abyte0[];
            int j;
            try
            {
                abyte0 = a.c;
                j = b;
                b = j + 1;
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
            {
                throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
            }
            byte0 = abyte0[j];
            return byte0;
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
            a = ba.this;
            super();
            b = 0;
            c = ba.this.a();
        }

        a(byte byte0)
        {
            this();
        }
    }


    protected final byte c[];
    private int d;

    ba(byte abyte0[])
    {
        d = 0;
        c = abyte0;
    }

    private static int a(int j, byte abyte0[], int k, int l)
    {
        for (int i1 = k; i1 < k + l; i1++)
        {
            j = j * 31 + abyte0[i1];
        }

        return j;
    }

    static int b(byte abyte0[])
    {
        int k = a(abyte0.length, abyte0, 0, abyte0.length);
        int j = k;
        if (k == 0)
        {
            j = 1;
        }
        return j;
    }

    public byte a(int j)
    {
        return c[j];
    }

    public int a()
    {
        return c.length;
    }

    protected final int a(int j, int k, int l)
    {
        k = b() + k;
        return cc.a(j, c, k, k + l);
    }

    protected final String a(Charset charset)
    {
        return new String(c, b(), a(), charset);
    }

    final void a(OutputStream outputstream, int j, int k)
    {
        outputstream.write(c, b() + j, k);
    }

    protected void a(byte abyte0[], int j, int k, int l)
    {
        System.arraycopy(c, j, abyte0, k, l);
    }

    final boolean a(ba ba1, int j, int k)
    {
        if (k > ba1.a())
        {
            throw new IllegalArgumentException((new StringBuilder("Length too large: ")).append(k).append(a()).toString());
        }
        if (j + k > ba1.a())
        {
            throw new IllegalArgumentException((new StringBuilder("Ran off end of other: ")).append(j).append(", ").append(k).append(", ").append(ba1.a()).toString());
        }
        byte abyte0[] = c;
        byte abyte1[] = ba1.c;
        int i1 = b();
        int l = b();
        for (j = ba1.b() + j; l < i1 + k; j++)
        {
            if (abyte0[l] != abyte1[j])
            {
                return false;
            }
            l++;
        }

        return true;
    }

    protected int b()
    {
        return 0;
    }

    protected final int b(int j, int k, int l)
    {
        return a(j, c, b() + k, l);
    }

    public f.a c()
    {
        return new a((byte)0);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof f))
        {
            return false;
        }
        if (a() != ((f)obj).a())
        {
            return false;
        }
        if (a() == 0)
        {
            return true;
        }
        if (obj instanceof ba)
        {
            ba ba1 = (ba)obj;
            if (d != 0 && ba1.d != 0 && d != ba1.d)
            {
                return false;
            } else
            {
                return a((ba)obj, 0, a());
            }
        }
        if (obj instanceof bo)
        {
            return obj.equals(this);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Has a new type of ByteString been created? Found ")).append(obj.getClass()).toString());
        }
    }

    public final boolean g()
    {
        int j = b();
        return cc.a(c, j, a() + j);
    }

    public final g h()
    {
        return com.c.b.g.a(this);
    }

    public int hashCode()
    {
        int k = d;
        int j = k;
        if (k == 0)
        {
            j = a();
            int l = b(j, 0, j);
            j = l;
            if (l == 0)
            {
                j = 1;
            }
            d = j;
        }
        return j;
    }

    protected final int i()
    {
        return d;
    }

    public Iterator iterator()
    {
        return c();
    }
}
