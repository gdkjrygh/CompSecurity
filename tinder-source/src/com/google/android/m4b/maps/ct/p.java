// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            d, e, u

class p extends d
{
    final class a
        implements d.a
    {

        private int a;
        private final int b;
        private p c;

        public final byte a()
        {
            byte byte0;
            byte abyte0[];
            int i;
            try
            {
                abyte0 = c.b;
                i = a;
                a = i + 1;
            }
            catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
            {
                throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
            }
            byte0 = abyte0[i];
            return byte0;
        }

        public final boolean hasNext()
        {
            return a < b;
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
            c = p.this;
            super();
            a = 0;
            b = p.this.b();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final long serialVersionUID = 1L;
    protected final byte b[];
    private int c;

    p(byte abyte0[])
    {
        c = 0;
        b = abyte0;
    }

    protected static int h()
    {
        return 0;
    }

    protected final int a(int i, int j, int k)
    {
        byte abyte0[] = b;
        int l = j + 0;
        for (j = l; j < l + k; j++)
        {
            i = i * 31 + abyte0[j];
        }

        return i;
    }

    public final d.a a()
    {
        return new a((byte)0);
    }

    final boolean a(p p1, int i, int j)
    {
        if (j > p1.b.length)
        {
            i = b.length;
            throw new IllegalArgumentException((new StringBuilder(40)).append("Length too large: ").append(j).append(i).toString());
        }
        if (i + j > p1.b.length)
        {
            int k = p1.b.length;
            throw new IllegalArgumentException((new StringBuilder(59)).append("Ran off end of other: ").append(i).append(", ").append(j).append(", ").append(k).toString());
        }
        byte abyte0[] = b;
        p1 = p1.b;
        i += 0;
        for (int l = 0; l < j + 0;)
        {
            if (abyte0[l] != p1[i])
            {
                return false;
            }
            l++;
            i++;
        }

        return true;
    }

    public final byte b(int i)
    {
        return b[i];
    }

    public final int b()
    {
        return b.length;
    }

    protected final void b(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(b, i, abyte0, j, k);
    }

    public final e d()
    {
        return com.google.android.m4b.maps.ct.e.a(this);
    }

    protected final int e()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof d))
        {
            return false;
        }
        if (b.length != ((d)obj).b())
        {
            return false;
        }
        if (b.length == 0)
        {
            return true;
        }
        if (obj instanceof p)
        {
            p p1 = (p)obj;
            if (c != 0 && p1.c != 0 && c != p1.c)
            {
                return false;
            } else
            {
                return a((p)obj, 0, b.length);
            }
        }
        if (obj instanceof u)
        {
            return obj.equals(this);
        } else
        {
            obj = String.valueOf(obj.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 49)).append("Has a new type of ByteString been created? Found ").append(((String) (obj))).toString());
        }
    }

    protected final boolean f()
    {
        return true;
    }

    protected final int g()
    {
        return c;
    }

    public int hashCode()
    {
        int j = c;
        int i = j;
        if (j == 0)
        {
            i = b.length;
            int k = a(i, 0, i);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            c = i;
        }
        return i;
    }

    public Iterator iterator()
    {
        return a();
    }
}
