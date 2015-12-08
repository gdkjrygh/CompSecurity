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

    private final String a;
    private final String b;
    private final String c;
    private final String d;

    PEMUtil(String s)
    {
        a = (new StringBuilder("-----BEGIN ")).append(s).append("-----").toString();
        b = (new StringBuilder("-----BEGIN X509 ")).append(s).append("-----").toString();
        c = (new StringBuilder("-----END ")).append(s).append("-----").toString();
        d = (new StringBuilder("-----END X509 ")).append(s).append("-----").toString();
    }

    private static String b(InputStream inputstream)
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

    final ASN1Sequence a(InputStream inputstream)
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s;
        do
        {
            s = b(inputstream);
        } while (s != null && !s.startsWith(a) && !s.startsWith(b));
        do
        {
            String s1 = b(inputstream);
            if (s1 == null || s1.startsWith(c) || s1.startsWith(d))
            {
                break;
            }
            stringbuffer.append(s1);
        } while (true);
        if (stringbuffer.length() != 0)
        {
            inputstream = (new ASN1InputStream(Base64.a(stringbuffer.toString()))).a();
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
}
