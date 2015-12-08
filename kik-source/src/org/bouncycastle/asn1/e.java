// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            g

final class e extends g
{

    private int b;
    private int c;
    private boolean d;
    private boolean e;

    e(InputStream inputstream, int i)
    {
        super(inputstream, i);
        d = false;
        e = true;
        b = inputstream.read();
        c = inputstream.read();
        if (c < 0)
        {
            throw new EOFException();
        } else
        {
            b();
            return;
        }
    }

    private boolean b()
    {
        if (!d && e && b == 0 && c == 0)
        {
            d = true;
            c();
        }
        return d;
    }

    final void a(boolean flag)
    {
        e = flag;
        b();
    }

    public final int read()
    {
        if (b())
        {
            return -1;
        }
        int i = a.read();
        if (i < 0)
        {
            throw new EOFException();
        } else
        {
            int j = b;
            b = c;
            c = i;
            return j;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (e || j < 3)
        {
            return super.read(abyte0, i, j);
        }
        if (d)
        {
            return -1;
        }
        j = a.read(abyte0, i + 2, j - 2);
        if (j < 0)
        {
            throw new EOFException();
        }
        abyte0[i] = (byte)b;
        abyte0[i + 1] = (byte)c;
        b = a.read();
        c = a.read();
        if (c < 0)
        {
            throw new EOFException();
        } else
        {
            return j + 2;
        }
    }
}
