// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.StreamCipher;

public class CipherInputStream extends FilterInputStream
{

    private static final int INPUT_BUF_SIZE = 2048;
    private byte buf[];
    private int bufOff;
    private BufferedBlockCipher bufferedBlockCipher;
    private boolean finalized;
    private byte inBuf[];
    private int maxBuf;
    private StreamCipher streamCipher;

    public CipherInputStream(InputStream inputstream, BufferedBlockCipher bufferedblockcipher)
    {
        super(inputstream);
        bufferedBlockCipher = bufferedblockcipher;
        buf = new byte[bufferedblockcipher.getOutputSize(2048)];
        inBuf = new byte[2048];
    }

    public CipherInputStream(InputStream inputstream, StreamCipher streamcipher)
    {
        super(inputstream);
        streamCipher = streamcipher;
        buf = new byte[2048];
        inBuf = new byte[2048];
    }

    private int nextChunk()
        throws IOException
    {
        int i;
        int j = super.available();
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        if (i > inBuf.length)
        {
            i = super.read(inBuf, 0, inBuf.length);
        } else
        {
            i = super.read(inBuf, 0, i);
        }
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (finalized)
        {
            return -1;
        }
        if (bufferedBlockCipher == null) goto _L4; else goto _L3
_L3:
        maxBuf = bufferedBlockCipher.doFinal(buf, 0);
_L6:
        bufOff = 0;
        finalized = true;
        if (bufOff == maxBuf)
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            maxBuf = 0;
        }
        catch (Exception exception)
        {
            throw new IOException((new StringBuilder()).append("error processing stream: ").append(exception.toString()).toString());
        }
        if (true) goto _L6; else goto _L5
_L2:
        bufOff = 0;
        if (bufferedBlockCipher == null) goto _L8; else goto _L7
_L7:
        maxBuf = bufferedBlockCipher.processBytes(inBuf, 0, i, buf, 0);
_L9:
        if (maxBuf == 0)
        {
            return nextChunk();
        }
        break; /* Loop/switch isn't completed */
_L8:
        try
        {
            streamCipher.processBytes(inBuf, 0, i, buf, 0);
            maxBuf = i;
        }
        catch (Exception exception1)
        {
            throw new IOException((new StringBuilder()).append("error processing stream: ").append(exception1.toString()).toString());
        }
        if (true) goto _L9; else goto _L5
_L5:
        return maxBuf;
    }

    public int available()
        throws IOException
    {
        return maxBuf - bufOff;
    }

    public void close()
        throws IOException
    {
        super.close();
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        if (bufOff == maxBuf && nextChunk() < 0)
        {
            return -1;
        } else
        {
            byte abyte0[] = buf;
            int i = bufOff;
            bufOff = i + 1;
            return abyte0[i] & 0xff;
        }
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (bufOff == maxBuf && nextChunk() < 0)
        {
            return -1;
        }
        int k = maxBuf - bufOff;
        if (j > k)
        {
            System.arraycopy(buf, bufOff, abyte0, i, k);
            bufOff = maxBuf;
            return k;
        } else
        {
            System.arraycopy(buf, bufOff, abyte0, i, j);
            bufOff = bufOff + j;
            return j;
        }
    }

    public long skip(long l)
        throws IOException
    {
        if (l <= 0L)
        {
            return 0L;
        }
        int i = maxBuf - bufOff;
        if (l > (long)i)
        {
            bufOff = maxBuf;
            return (long)i;
        } else
        {
            bufOff = bufOff + (int)l;
            return (long)(int)l;
        }
    }
}
