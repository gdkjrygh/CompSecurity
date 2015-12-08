// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.StreamCipher;

public class CipherOutputStream extends FilterOutputStream
{

    private BufferedBlockCipher a;
    private StreamCipher b;
    private byte c[];
    private byte d[];

    public void close()
    {
        byte abyte0[];
        int i;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        abyte0 = new byte[a.b(0)];
        i = a.a(abyte0, 0);
        if (i != 0)
        {
            try
            {
                out.write(abyte0, 0, i);
            }
            catch (Exception exception)
            {
                throw new IOException((new StringBuilder("Error closing stream: ")).append(exception.toString()).toString());
            }
        }
        flush();
        super.close();
        return;
    }

    public void flush()
    {
        super.flush();
    }

    public void write(int i)
    {
        c[0] = (byte)i;
        if (a != null)
        {
            i = a.a(c, 0, 1, d, 0);
            if (i != 0)
            {
                out.write(d, 0, i);
            }
            return;
        } else
        {
            out.write(b.a((byte)i));
            return;
        }
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (a != null)
        {
            byte abyte1[] = new byte[a.b(j)];
            i = a.a(abyte0, i, j, abyte1, 0);
            if (i != 0)
            {
                out.write(abyte1, 0, i);
            }
            return;
        } else
        {
            byte abyte2[] = new byte[j];
            b.a(abyte0, i, j, abyte2, 0);
            out.write(abyte2, 0, j);
            return;
        }
    }
}
