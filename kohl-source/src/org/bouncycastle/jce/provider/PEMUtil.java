// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

public class PEMUtil
{

    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    PEMUtil(String s)
    {
        _header1 = (new StringBuilder()).append("-----BEGIN ").append(s).append("-----").toString();
        _header2 = (new StringBuilder()).append("-----BEGIN X509 ").append(s).append("-----").toString();
        _footer1 = (new StringBuilder()).append("-----END ").append(s).append("-----").toString();
        _footer2 = (new StringBuilder()).append("-----END X509 ").append(s).append("-----").toString();
    }

    private String readLine(InputStream inputstream)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i;
        do
        {
            do
            {
                i = inputstream.read();
                if (i == 13 || i == 10 || i < 0)
                {
                    break;
                }
                if (i != 13)
                {
                    stringbuffer.append((char)i);
                }
            } while (true);
        } while (i >= 0 && stringbuffer.length() == 0);
        if (i < 0)
        {
            return null;
        } else
        {
            return stringbuffer.toString();
        }
    }

    ASN1Sequence readPEMObject(InputStream inputstream)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s;
        do
        {
            s = readLine(inputstream);
        } while (s != null && !s.startsWith(_header1) && !s.startsWith(_header2));
        do
        {
            String s1 = readLine(inputstream);
            if (s1 == null || s1.startsWith(_footer1) || s1.startsWith(_footer2))
            {
                if (stringbuffer.length() != 0)
                {
                    inputstream = (new ASN1InputStream(Base64.decode(stringbuffer.toString()))).readObject();
                    if (!(inputstream instanceof ASN1Sequence))
                    {
                        throw new IOException("malformed PEM data encountered");
                    } else
                    {
                        return (ASN1Sequence)inputstream;
                    }
                } else
                {
                    return null;
                }
            }
            stringbuffer.append(s1);
        } while (true);
    }
}
