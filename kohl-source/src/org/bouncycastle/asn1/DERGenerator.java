// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Generator

public abstract class DERGenerator extends ASN1Generator
{

    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected DERGenerator(OutputStream outputstream)
    {
        super(outputstream);
        _tagged = false;
    }

    public DERGenerator(OutputStream outputstream, int i, boolean flag)
    {
        super(outputstream);
        _tagged = false;
        _tagged = true;
        _isExplicit = flag;
        _tagNo = i;
    }

    private void writeLength(OutputStream outputstream, int i)
        throws IOException
    {
        if (i > 127)
        {
            int j = 1;
            int k = i;
            do
            {
                k >>>= 8;
                if (k == 0)
                {
                    break;
                }
                j++;
            } while (true);
            outputstream.write((byte)(j | 0x80));
            for (j = (j - 1) * 8; j >= 0; j -= 8)
            {
                outputstream.write((byte)(i >> j));
            }

        } else
        {
            outputstream.write((byte)i);
        }
    }

    void writeDEREncoded(int i, byte abyte0[])
        throws IOException
    {
        if (_tagged)
        {
            int j = _tagNo | 0x80;
            if (_isExplicit)
            {
                j = _tagNo;
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                writeDEREncoded(((OutputStream) (bytearrayoutputstream)), i, abyte0);
                writeDEREncoded(_out, j | 0x20 | 0x80, bytearrayoutputstream.toByteArray());
                return;
            }
            if ((i & 0x20) != 0)
            {
                writeDEREncoded(_out, j | 0x20, abyte0);
                return;
            } else
            {
                writeDEREncoded(_out, j, abyte0);
                return;
            }
        } else
        {
            writeDEREncoded(_out, i, abyte0);
            return;
        }
    }

    void writeDEREncoded(OutputStream outputstream, int i, InputStream inputstream)
        throws IOException
    {
        writeDEREncoded(outputstream, i, Streams.readAll(inputstream));
    }

    void writeDEREncoded(OutputStream outputstream, int i, byte abyte0[])
        throws IOException
    {
        outputstream.write(i);
        writeLength(outputstream, abyte0.length);
        outputstream.write(abyte0);
    }
}
