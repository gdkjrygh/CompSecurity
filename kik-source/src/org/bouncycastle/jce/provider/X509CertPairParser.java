// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

// Referenced classes of package org.bouncycastle.jce.provider:
//            ProviderUtil

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
        Object obj;
        try
        {
            a.reset();
            obj = a;
            obj = new X509CertificatePair(CertificatePair.a((ASN1Sequence)(new ASN1InputStream(((InputStream) (obj)), ProviderUtil.a(((InputStream) (obj))))).a()));
        }
        catch (Exception exception)
        {
            throw new StreamParsingException(exception.toString(), exception);
        }
        return obj;
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
