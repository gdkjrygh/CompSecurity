// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util.org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package ezvcard.util.org.apache.commons.codec.binary:
//            BaseNCodec

public class BaseNCodecOutputStream extends FilterOutputStream
{

    private final BaseNCodec baseNCodec;
    private final boolean doEncode;
    private final byte singleByte[] = new byte[1];

    public BaseNCodecOutputStream(OutputStream outputstream, BaseNCodec basencodec, boolean flag)
    {
        super(outputstream);
        baseNCodec = basencodec;
        doEncode = flag;
    }

    private void flush(boolean flag)
        throws IOException
    {
        int i = baseNCodec.available();
        if (i > 0)
        {
            byte abyte0[] = new byte[i];
            i = baseNCodec.readResults(abyte0, 0, i);
            if (i > 0)
            {
                out.write(abyte0, 0, i);
            }
        }
        if (flag)
        {
            out.flush();
        }
    }

    public void close()
        throws IOException
    {
        if (doEncode)
        {
            baseNCodec.encode(singleByte, 0, -1);
        } else
        {
            baseNCodec.decode(singleByte, 0, -1);
        }
        flush();
        out.close();
    }

    public void flush()
        throws IOException
    {
        flush(true);
    }

    public void write(int i)
        throws IOException
    {
        singleByte[0] = (byte)i;
        write(singleByte, 0, 1);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (i > abyte0.length || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j > 0)
        {
            if (doEncode)
            {
                baseNCodec.encode(abyte0, i, j);
            } else
            {
                baseNCodec.decode(abyte0, i, j);
            }
            flush(false);
        }
    }
}
