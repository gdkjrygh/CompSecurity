// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            p, l, e, f

public abstract class d
    implements Serializable, Iterable
{
    public static interface a
        extends Iterator
    {

        public abstract byte a();
    }

    static final class b
    {

        final f a;
        final byte b[];

        private b(int i)
        {
            b = new byte[i];
            a = com.google.android.m4b.maps.ct.f.a(b);
        }

        b(int i, byte byte0)
        {
            this(i);
        }
    }


    public static final d a = new p(new byte[0]);

    d()
    {
    }

    static b a(int i)
    {
        return new b(i, (byte)0);
    }

    public static d a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new p(abyte1);
    }

    protected abstract int a(int i, int j, int k);

    public abstract a a();

    public final void a(byte abyte0[], int i, int j, int k)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Source offset < 0: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(30)).append("Target offset < 0: ").append(j).toString());
        }
        if (k < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(23)).append("Length < 0: ").append(k).toString());
        }
        if (i + k > b())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Source end offset < 0: ").append(i + k).toString());
        }
        if (j + k > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(34)).append("Target end offset < 0: ").append(j + k).toString());
        }
        if (k > 0)
        {
            b(abyte0, i, j, k);
        }
    }

    public abstract int b();

    protected abstract void b(byte abyte0[], int i, int j, int k);

    public final byte[] c()
    {
        int i = b();
        if (i == 0)
        {
            return l.b;
        } else
        {
            byte abyte0[] = new byte[i];
            b(abyte0, 0, 0, i);
            return abyte0;
        }
    }

    public abstract e d();

    protected abstract int e();

    protected abstract boolean f();

    protected abstract int g();

    public Iterator iterator()
    {
        return a();
    }

    public String toString()
    {
        return String.format("<ByteString@%s size=%d>", new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())
        });
    }

}
