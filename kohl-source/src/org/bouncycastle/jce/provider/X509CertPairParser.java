// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

public class X509CertPairParser extends X509StreamParserSpi
{

    private InputStream currentStream;

    public X509CertPairParser()
    {
        currentStream = null;
    }

    private X509CertificatePair readDERCrossCertificatePair(InputStream inputstream)
        throws IOException, CertificateParsingException
    {
        return new X509CertificatePair(CertificatePair.getInstance((ASN1Sequence)(new ASN1InputStream(inputstream)).readObject()));
    }

    public void engineInit(InputStream inputstream)
    {
        currentStream = inputstream;
        if (!currentStream.markSupported())
        {
            currentStream = new BufferedInputStream(currentStream);
        }
    }

    public Object engineRead()
        throws StreamParsingException
    {
        currentStream.mark(10);
        if (currentStream.read() == -1)
        {
            return null;
        }
        X509CertificatePair x509certificatepair;
        try
        {
            currentStream.reset();
            x509certificatepair = readDERCrossCertificatePair(currentStream);
        }
        catch (Exception exception)
        {
            throw new StreamParsingException(exception.toString(), exception);
        }
        return x509certificatepair;
    }

    public Collection engineReadAll()
        throws StreamParsingException
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            X509CertificatePair x509certificatepair = (X509CertificatePair)engineRead();
            if (x509certificatepair != null)
            {
                arraylist.add(x509certificatepair);
            } else
            {
                return arraylist;
            }
        } while (true);
    }
}
