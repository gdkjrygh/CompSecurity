// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1StreamParser, ASN1OctetStringParser

class ConstructedOctetStream extends InputStream
{

    private InputStream _currentStream;
    private boolean _first;
    private final ASN1StreamParser _parser;

    ConstructedOctetStream(ASN1StreamParser asn1streamparser)
    {
        _first = true;
        _parser = asn1streamparser;
    }

    public int read()
        throws IOException
    {
        if (_currentStream != null) goto _L2; else goto _L1
_L1:
        if (_first) goto _L4; else goto _L3
_L3:
        int i = -1;
_L6:
        return i;
_L4:
        ASN1OctetStringParser asn1octetstringparser = (ASN1OctetStringParser)_parser.readObject();
        if (asn1octetstringparser == null)
        {
            return -1;
        }
        _first = false;
        _currentStream = asn1octetstringparser.getOctetStream();
_L2:
        do
        {
            int j = _currentStream.read();
            i = j;
            if (j >= 0)
            {
                continue;
            }
            ASN1OctetStringParser asn1octetstringparser1 = (ASN1OctetStringParser)_parser.readObject();
            if (asn1octetstringparser1 == null)
            {
                _currentStream = null;
                return -1;
            }
            _currentStream = asn1octetstringparser1.getOctetStream();
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k;
        boolean flag;
        flag = false;
        k = ((flag) ? 1 : 0);
        if (_currentStream != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (_first) goto _L2; else goto _L1
_L1:
        ASN1OctetStringParser asn1octetstringparser;
        return -1;
_L2:
        if ((asn1octetstringparser = (ASN1OctetStringParser)_parser.readObject()) == null) goto _L1; else goto _L3
_L3:
        _first = false;
        _currentStream = asn1octetstringparser.getOctetStream();
        k = ((flag) ? 1 : 0);
        do
        {
            int l = _currentStream.read(abyte0, i + k, j - k);
            if (l >= 0)
            {
                l += k;
                k = l;
                if (l == j)
                {
                    return l;
                }
            } else
            {
                ASN1OctetStringParser asn1octetstringparser1 = (ASN1OctetStringParser)_parser.readObject();
                if (asn1octetstringparser1 == null)
                {
                    _currentStream = null;
                    i = k;
                    if (k < 1)
                    {
                        i = -1;
                    }
                    return i;
                }
                _currentStream = asn1octetstringparser1.getOctetStream();
            }
        } while (true);
    }
}
