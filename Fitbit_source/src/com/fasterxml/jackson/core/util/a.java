// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public final class a extends OutputStream
{

    static final int a = 40;
    private static final byte b[] = new byte[0];
    private static final int c = 500;
    private static final int d = 0x40000;
    private final BufferRecycler e;
    private final LinkedList f;
    private int g;
    private byte h[];
    private int i;

    public a()
    {
        this(((BufferRecycler) (null)));
    }

    public a(int j)
    {
        this(null, j);
    }

    public a(BufferRecycler bufferrecycler)
    {
        this(bufferrecycler, 500);
    }

    public a(BufferRecycler bufferrecycler, int j)
    {
        f = new LinkedList();
        e = bufferrecycler;
        if (bufferrecycler == null)
        {
            h = new byte[j];
            return;
        } else
        {
            h = bufferrecycler.a(BufferRecycler.ByteBufferType.c);
            return;
        }
    }

    private void h()
    {
        int j = 0x40000;
        g = g + h.length;
        int k = Math.max(g >> 1, 1000);
        if (k <= 0x40000)
        {
            j = k;
        }
        f.add(h);
        h = new byte[j];
        i = 0;
    }

    public void a()
    {
        g = 0;
        i = 0;
        if (!f.isEmpty())
        {
            f.clear();
        }
    }

    public void a(int j)
    {
        if (i >= h.length)
        {
            h();
        }
        byte abyte0[] = h;
        int k = i;
        i = k + 1;
        abyte0[k] = (byte)j;
    }

    public void b()
    {
        a();
        if (e != null && h != null)
        {
            e.a(BufferRecycler.ByteBufferType.c, h);
            h = null;
        }
    }

    public void b(int j)
    {
        if (i + 1 < h.length)
        {
            byte abyte0[] = h;
            int k = i;
            i = k + 1;
            abyte0[k] = (byte)(j >> 8);
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = (byte)j;
            return;
        } else
        {
            a(j >> 8);
            a(j);
            return;
        }
    }

    public void c(int j)
    {
        if (i + 2 < h.length)
        {
            byte abyte0[] = h;
            int k = i;
            i = k + 1;
            abyte0[k] = (byte)(j >> 16);
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = (byte)(j >> 8);
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = (byte)j;
            return;
        } else
        {
            a(j >> 16);
            a(j >> 8);
            a(j);
            return;
        }
    }

    public byte[] c()
    {
        int k = g + i;
        if (k == 0)
        {
            return b;
        }
        byte abyte0[] = new byte[k];
        Iterator iterator = f.iterator();
        int j;
        int l;
        for (j = 0; iterator.hasNext(); j += l)
        {
            byte abyte1[] = (byte[])iterator.next();
            l = abyte1.length;
            System.arraycopy(abyte1, 0, abyte0, j, l);
        }

        System.arraycopy(h, 0, abyte0, j, i);
        j = i + j;
        if (j != k)
        {
            throw new RuntimeException((new StringBuilder()).append("Internal error: total len assumed to be ").append(k).append(", copied ").append(j).append(" bytes").toString());
        }
        if (!f.isEmpty())
        {
            a();
        }
        return abyte0;
    }

    public void close()
    {
    }

    public byte[] d()
    {
        a();
        return h;
    }

    public byte[] d(int j)
    {
        i = j;
        return c();
    }

    public void e(int j)
    {
        i = j;
    }

    public byte[] e()
    {
        h();
        return h;
    }

    public byte[] f()
    {
        return h;
    }

    public void flush()
    {
    }

    public int g()
    {
        return i;
    }

    public void write(int j)
    {
        a(j);
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int j, int k)
    {
        int l = j;
        do
        {
            int j1 = Math.min(h.length - i, k);
            int i1 = l;
            j = k;
            if (j1 > 0)
            {
                System.arraycopy(abyte0, l, h, i, j1);
                i1 = l + j1;
                i = i + j1;
                j = k - j1;
            }
            if (j <= 0)
            {
                return;
            }
            h();
            l = i1;
            k = j;
        } while (true);
    }

}
