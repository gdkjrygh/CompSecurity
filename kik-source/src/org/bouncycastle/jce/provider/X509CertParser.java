// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.util.StreamParsingException;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PEMUtil, X509CertificateObject, ProviderUtil

public class X509CertParser extends X509StreamParserSpi
{

    private static final PEMUtil a = new PEMUtil("CERTIFICATE");
    private ASN1Set b;
    private int c;
    private InputStream d;

    public X509CertParser()
    {
        b = null;
        c = 0;
        d = null;
    }

    private Certificate b()
    {
        if (b != null)
        {
            while (c < b.f()) 
            {
                Object obj = b;
                int i = c;
                c = i + 1;
                obj = ((ASN1Set) (obj)).a(i);
                if (obj instanceof ASN1Sequence)
                {
                    return new X509CertificateObject(X509CertificateStructure.a(obj));
                }
            }
        }
        return null;
    }

    public final Object a()
    {
        Object obj1 = null;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (c != b.f())
        {
            return b();
        }
        b = null;
        c = 0;
        Exception exception;
        return null;
        Object obj;
        int i;
        try
        {
            d.mark(10);
            i = d.read();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw new StreamParsingException(exception.toString(), exception);
        }
        obj = obj1;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (i == 48)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ASN1Sequence asn1sequence;
        d.reset();
        obj = d;
        asn1sequence = a.a(((InputStream) (obj)));
        obj = obj1;
        if (asn1sequence == null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        return new X509CertificateObject(X509CertificateStructure.a(asn1sequence));
        d.reset();
        obj = d;
        obj = (ASN1Sequence)(new ASN1InputStream(((InputStream) (obj)), ProviderUtil.a(((InputStream) (obj))))).a();
        if (((ASN1Sequence) (obj)).f() > 1 && (((ASN1Sequence) (obj)).a(0) instanceof DERObjectIdentifier) && ((ASN1Sequence) (obj)).a(0).equals(PKCSObjectIdentifiers.N))
        {
            b = (new SignedData(ASN1Sequence.a((ASN1TaggedObject)((ASN1Sequence) (obj)).a(1), true))).e();
            return b();
        }
        obj = new X509CertificateObject(X509CertificateStructure.a(obj));
        return obj;
    }

    public final void a(InputStream inputstream)
    {
        d = inputstream;
        b = null;
        c = 0;
        if (!d.markSupported())
        {
            d = new BufferedInputStream(d);
        }
    }

}
