// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.squareup.okhttp.internal:
//            AbstractOutputStream, Util

public abstract class FaultRecoveringOutputStream extends AbstractOutputStream
{

    private final int maxReplayBufferLength;
    private OutputStream out;
    private ByteArrayOutputStream replayBuffer;

    public FaultRecoveringOutputStream(int i, OutputStream outputstream)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            maxReplayBufferLength = i;
            replayBuffer = new ByteArrayOutputStream(i);
            out = outputstream;
            return;
        }
    }

    private boolean recover(IOException ioexception)
    {
        Object obj = ioexception;
        if (replayBuffer != null) goto _L2; else goto _L1
_L1:
        return false;
        obj;
        Util.closeQuietly(ioexception);
_L2:
        ioexception = null;
        obj = replacementStream(((IOException) (obj)));
        if (obj == null) goto _L1; else goto _L3
_L3:
        ioexception = ((IOException) (obj));
        replaceStream(((OutputStream) (obj)));
        return true;
    }

    public final void close()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        do
        {
            try
            {
                out.close();
                closed = true;
                return;
            }
            catch (IOException ioexception)
            {
                if (!recover(ioexception))
                {
                    throw ioexception;
                }
            }
        } while (true);
    }

    public final void flush()
        throws IOException
    {
        if (closed)
        {
            return;
        }
        do
        {
            try
            {
                out.flush();
                return;
            }
            catch (IOException ioexception)
            {
                if (!recover(ioexception))
                {
                    throw ioexception;
                }
            }
        } while (true);
    }

    public boolean isRecoverable()
    {
        return replayBuffer != null;
    }

    public final void replaceStream(OutputStream outputstream)
        throws IOException
    {
        if (!isRecoverable())
        {
            throw new IllegalStateException();
        }
        if (out == outputstream)
        {
            return;
        } else
        {
            replayBuffer.writeTo(outputstream);
            Util.closeQuietly(out);
            out = outputstream;
            return;
        }
    }

    protected abstract OutputStream replacementStream(IOException ioexception)
        throws IOException;

    public final void write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("stream closed");
        }
        Util.checkOffsetAndCount(abyte0.length, i, j);
_L2:
        out.write(abyte0, i, j);
        if (replayBuffer == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (replayBuffer.size() + j > maxReplayBufferLength)
        {
            replayBuffer = null;
            return;
        }
        try
        {
            replayBuffer.write(abyte0, i, j);
            return;
        }
        catch (IOException ioexception)
        {
            if (!recover(ioexception))
            {
                throw ioexception;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
