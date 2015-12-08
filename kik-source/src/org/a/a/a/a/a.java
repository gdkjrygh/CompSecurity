// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public final class a extends OutputStream
{

    private static final byte a[] = new byte[0];
    private List b;
    private int c;
    private int d;
    private byte e[];
    private int f;

    public a()
    {
        this((byte)0);
    }

    private a(byte byte0)
    {
        b = new ArrayList();
        b(1024);
    }

    private byte[] a(int i)
    {
        return (byte[])b.get(i);
    }

    private void b(int i)
    {
        if (c < b.size() - 1)
        {
            d = d + e.length;
            c = c + 1;
            e = a(c);
            return;
        }
        if (e == null)
        {
            d = 0;
        } else
        {
            i = Math.max(e.length << 1, i - d);
            d = d + e.length;
        }
        c = c + 1;
        e = new byte[i];
        b.add(e);
    }

    public final byte[] a()
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        int i = f;
        if (i != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        byte abyte1[] = new byte[i];
        int k = 0;
_L6:
        abyte0 = abyte1;
        if (j >= b.size()) goto _L4; else goto _L3
_L3:
        int l;
        abyte0 = a(j);
        l = Math.min(abyte0.length, i);
        System.arraycopy(abyte0, 0, abyte1, k, l);
        k += l;
        i -= l;
        abyte0 = abyte1;
        if (i == 0) goto _L4; else goto _L5
_L5:
        j++;
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }

    public final void close()
    {
    }

    public final String toString()
    {
        return new String(a());
    }

    public final void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int k = f - d;
        int j = k;
        if (k != e.length)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        b(f + 1);
        j = 0;
        e[j] = (byte)i;
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        if (i < 0 || i > abyte0.length || j < 0 || i + j > abyte0.length || i + j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        int j1;
        j1 = f + j;
        l = f - d;
        int k = j;
_L2:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        i1 = Math.min(k, e.length - l);
        System.arraycopy(abyte0, (i + j) - k, e, l, i1);
        i1 = k - i1;
        k = i1;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        b(j1);
        l = 0;
        k = i1;
        if (true) goto _L2; else goto _L1
_L1:
        f = j1;
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

}
