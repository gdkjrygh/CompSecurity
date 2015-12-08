// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Generator

public class BERGenerator extends ASN1Generator
{

    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected BERGenerator(OutputStream outputstream)
    {
        super(outputstream);
        _tagged = false;
    }

    public BERGenerator(OutputStream outputstream, int i, boolean flag)
    {
        super(outputstream);
        _tagged = false;
        _tagged = true;
        _isExplicit = flag;
        _tagNo = i;
    }

    private void writeHdr(int i)
        throws IOException
    {
        _out.write(i);
        _out.write(128);
    }

    public OutputStream getRawOutputStream()
    {
        return _out;
    }

    protected void writeBERBody(InputStream inputstream)
        throws IOException
    {
        do
        {
            int i = inputstream.read();
            if (i >= 0)
            {
                _out.write(i);
            } else
            {
                return;
            }
        } while (true);
    }

    protected void writeBEREnd()
        throws IOException
    {
        _out.write(0);
        _out.write(0);
        if (_tagged && _isExplicit)
        {
            _out.write(0);
            _out.write(0);
        }
    }

    protected void writeBERHeader(int i)
        throws IOException
    {
        if (_tagged)
        {
            int j = _tagNo | 0x80;
            if (_isExplicit)
            {
                writeHdr(j | 0x20);
                writeHdr(i);
                return;
            }
            if ((i & 0x20) != 0)
            {
                writeHdr(j | 0x20);
                return;
            } else
            {
                writeHdr(j);
                return;
            }
        } else
        {
            writeHdr(i);
            return;
        }
    }
}
