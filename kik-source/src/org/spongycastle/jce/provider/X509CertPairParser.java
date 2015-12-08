// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.x509.CertificatePair;
import org.spongycastle.x509.X509CertificatePair;
import org.spongycastle.x509.X509StreamParserSpi;
import org.spongycastle.x509.util.StreamParsingException;

public class X509CertPairParser extends X509StreamParserSpi
{

    private InputStream a;

    public X509CertPairParser()
    {
        a = null;
    }

    public final Object a()
    {
        a.mark(10);
        if (a.read() == -1)
        {
            return null;
        }
        X509CertificatePair x509certificatepair;
        try
        {
            a.reset();
            x509certificatepair = new X509CertificatePair(CertificatePair.a((ASN1Sequence)(new ASN1InputStream(a)).b()));
        }
        catch (Exception exception)
        {
            throw new StreamParsingException(exception.toString(), exception);
        }
        return x509certificatepair;
    }

    public final void a(InputStream inputstream)
    {
        a = inputstream;
        if (!a.markSupported())
        {
            a = new BufferedInputStream(a);
        }
    }
}
