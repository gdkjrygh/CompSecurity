// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

// Referenced classes of package com.c.b:
//            ba, au, g, h

public abstract class f
    implements Serializable, Iterable
{
    public static interface a
        extends Iterator
    {

        public abstract byte a();
    }

    static final class b
    {

        private final h a;
        private final byte b[];

        public final f a()
        {
            a.c();
            return new ba(b);
        }

        public final h b()
        {
            return a;
        }

        private b(int j)
        {
            b = new byte[j];
            a = com.c.b.h.a(b);
        }

        b(int j, byte byte0)
        {
            this(j);
        }
    }


    public static final f a = new ba(new byte[0]);
    static final boolean b;

    f()
    {
    }

    public static f a(String s)
    {
        return new ba(s.getBytes(au.a));
    }

    public static f a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static f a(byte abyte0[], int j, int k)
    {
        byte abyte1[] = new byte[k];
        System.arraycopy(abyte0, j, abyte1, 0, k);
        return new ba(abyte1);
    }

    static b b(int j)
    {
        return new b(j, (byte)0);
    }

    public abstract byte a(int j);

    public abstract int a();

    protected abstract int a(int j, int k, int l);

    protected abstract String a(Charset charset);

    abstract void a(OutputStream outputstream, int j, int k);

    protected abstract void a(byte abyte0[], int j, int k, int l);

    protected abstract int b(int j, int k, int l);

    public final void b(byte abyte0[], int j, int k, int l)
    {
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Source offset < 0: ")).append(j).toString());
        }
        if (k < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Target offset < 0: ")).append(k).toString());
        }
        if (l < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Length < 0: ")).append(l).toString());
        }
        if (j + l > a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Source end offset < 0: ")).append(j + l).toString());
        }
        if (k + l > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Target end offset < 0: ")).append(k + l).toString());
        }
        if (l > 0)
        {
            a(abyte0, j, k, l);
        }
    }

    public abstract a c();

    public final boolean d()
    {
        return a() == 0;
    }

    public final byte[] e()
    {
        int j = a();
        if (j == 0)
        {
            return au.c;
        } else
        {
            byte abyte0[] = new byte[j];
            a(abyte0, 0, 0, j);
            return abyte0;
        }
    }

    public abstract boolean equals(Object obj);

    public final String f()
    {
        Charset charset = au.a;
        if (a() == 0)
        {
            return "";
        } else
        {
            return a(charset);
        }
    }

    public abstract boolean g();

    public abstract g h();

    protected abstract int i();

    public Iterator iterator()
    {
        return c();
    }

    public String toString()
    {
        return String.format("<ByteString@%s size=%d>", new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())
        });
    }

    static 
    {
        boolean flag;
        if (!com/c/b/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
