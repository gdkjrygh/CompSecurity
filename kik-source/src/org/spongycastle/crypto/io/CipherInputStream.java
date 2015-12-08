// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.StreamCipher;

public class CipherInputStream extends FilterInputStream
{

    private BufferedBlockCipher a;
    private StreamCipher b;
    private byte c[];
    private byte d[];
    private int e;
    private int f;
    private boolean g;

    private int a()
    {
_L6:
        int i;
        int j = super.available();
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        if (i > d.length)
        {
            i = super.read(d, 0, d.length);
        } else
        {
            i = super.read(d, 0, i);
        }
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (g)
        {
            return -1;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        f = a.a(c, 0);
_L4:
        e = 0;
        g = true;
        if (e == f)
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            f = 0;
        }
        catch (Exception exception)
        {
            throw new IOException((new StringBuilder("error processing stream: ")).append(exception.toString()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        e = 0;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        f = a.a(d, 0, i, c, 0);
_L7:
        if (f == 0) goto _L6; else goto _L5
_L5:
        return f;
        try
        {
            b.a(d, 0, i, c, 0);
            f = i;
        }
        catch (Exception exception1)
        {
            throw new IOException((new StringBuilder("error processing stream: ")).append(exception1.toString()).toString());
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public int available()
    {
        return f - e;
    }

    public void close()
    {
        super.close();
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        if (e == f && a() < 0)
        {
            return -1;
        } else
        {
            byte abyte0[] = c;
            int i = e;
            e = i + 1;
            return abyte0[i] & 0xff;
        }
    }

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (e == f && a() < 0)
        {
            return -1;
        }
        int k = f - e;
        if (j > k)
        {
            System.arraycopy(c, e, abyte0, i, k);
            e = f;
            return k;
        } else
        {
            System.arraycopy(c, e, abyte0, i, j);
            e = e + j;
            return j;
        }
    }

    public long skip(long l)
    {
        if (l <= 0L)
        {
            return 0L;
        }
        int i = f - e;
        if (l > (long)i)
        {
            e = f;
            return (long)i;
        } else
        {
            e = e + (int)l;
            return (long)(int)l;
        }
    }
}
