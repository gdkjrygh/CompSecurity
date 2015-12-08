// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.io.UnsupportedEncodingException;

public class CertificateHolderReference
{

    private static final String ReferenceEncoding = "ISO-8859-1";
    private String countryCode;
    private String holderMnemonic;
    private String sequenceNumber;

    public CertificateHolderReference(String s, String s1, String s2)
    {
        countryCode = s;
        holderMnemonic = s1;
        sequenceNumber = s2;
    }

    CertificateHolderReference(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, "ISO-8859-1");
            countryCode = abyte0.substring(0, 2);
            holderMnemonic = abyte0.substring(2, abyte0.length() - 5);
            sequenceNumber = abyte0.substring(abyte0.length() - 5);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalStateException(abyte0.toString());
        }
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public byte[] getEncoded()
    {
        String s = (new StringBuilder()).append(countryCode).append(holderMnemonic).append(sequenceNumber).toString();
        byte abyte0[];
        try
        {
            abyte0 = s.getBytes("ISO-8859-1");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new IllegalStateException(unsupportedencodingexception.toString());
        }
        return abyte0;
    }

    public String getHolderMnemonic()
    {
        return holderMnemonic;
    }

    public String getSequenceNumber()
    {
        return sequenceNumber;
    }
}
