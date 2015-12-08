// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            BERGenerator, DEROutputStream, DEROctetString

public class BEROctetStringGenerator extends BERGenerator
{
    private class BufferedBEROctetStream extends OutputStream
    {

        private byte _buf[];
        private DEROutputStream _derOut;
        private int _off;
        final BEROctetStringGenerator this$0;

        public void close()
            throws IOException
        {
            if (_off != 0)
            {
                byte abyte0[] = new byte[_off];
                System.arraycopy(_buf, 0, abyte0, 0, _off);
                DEROctetString.encode(_derOut, abyte0);
            }
            writeBEREnd();
        }

        public void write(int i)
            throws IOException
        {
            byte abyte0[] = _buf;
            int j = _off;
            _off = j + 1;
            abyte0[j] = (byte)i;
            if (_off == _buf.length)
            {
                DEROctetString.encode(_derOut, _buf);
                _off = 0;
            }
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            do
            {
                int k;
label0:
                {
                    if (j > 0)
                    {
                        k = Math.min(j, _buf.length - _off);
                        System.arraycopy(abyte0, i, _buf, _off, k);
                        _off = _off + k;
                        if (_off >= _buf.length)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                DEROctetString.encode(_derOut, _buf);
                _off = 0;
                i += k;
                j -= k;
            } while (true);
        }

        BufferedBEROctetStream(byte abyte0[])
        {
            this$0 = BEROctetStringGenerator.this;
            super();
            _buf = abyte0;
            _off = 0;
            _derOut = new DEROutputStream(_out);
        }
    }


    public BEROctetStringGenerator(OutputStream outputstream)
        throws IOException
    {
        super(outputstream);
        writeBERHeader(36);
    }

    public BEROctetStringGenerator(OutputStream outputstream, int i, boolean flag)
        throws IOException
    {
        super(outputstream, i, flag);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream()
    {
        return getOctetOutputStream(new byte[1000]);
    }

    public OutputStream getOctetOutputStream(byte abyte0[])
    {
        return new BufferedBEROctetStream(abyte0);
    }
}
