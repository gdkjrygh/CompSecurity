// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

// Referenced classes of package org.spongycastle.asn1:
//            i

final class f extends i
{

    private int b;
    private int c;
    private boolean d;
    private boolean e;

    f(InputStream inputstream, int j)
    {
        super(inputstream, j);
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
        int j = a.read();
        if (j < 0)
        {
            throw new EOFException();
        } else
        {
            int k = b;
            b = c;
            c = j;
            return k;
        }
    }

    public final int read(byte abyte0[], int j, int k)
    {
        if (e || k < 3)
        {
            return super.read(abyte0, j, k);
        }
        if (d)
        {
            return -1;
        }
        k = a.read(abyte0, j + 2, k - 2);
        if (k < 0)
        {
            throw new EOFException();
        }
        abyte0[j] = (byte)b;
        abyte0[j + 1] = (byte)c;
        b = a.read();
        c = a.read();
        if (c < 0)
        {
            throw new EOFException();
        } else
        {
            return k + 2;
        }
    }
}
