// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Holder, AttCertIssuer, AlgorithmIdentifier, AttCertValidityPeriod, 
//            X509Extensions

public class AttributeCertificateInfo extends ASN1Encodable
{

    private DERInteger a;
    private Holder b;
    private AttCertIssuer c;
    private AlgorithmIdentifier d;
    private DERInteger e;
    private AttCertValidityPeriod f;
    private ASN1Sequence g;
    private DERBitString h;
    private X509Extensions i;

    private AttributeCertificateInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() < 7 || asn1sequence.f() > 9)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        a = DERInteger.a(asn1sequence.a(0));
        b = Holder.a(asn1sequence.a(1));
        c = AttCertIssuer.a(asn1sequence.a(2));
        d = AlgorithmIdentifier.b(asn1sequence.a(3));
        e = DERInteger.a(asn1sequence.a(4));
        f = AttCertValidityPeriod.a(asn1sequence.a(5));
        g = ASN1Sequence.a(asn1sequence.a(6));
        int k = 7;
        while (k < asn1sequence.f()) 
        {
            ASN1Encodable asn1encodable = (ASN1Encodable)asn1sequence.a(k);
            if (asn1encodable instanceof DERBitString)
            {
                h = DERBitString.a(asn1sequence.a(k));
            } else
            if ((asn1encodable instanceof ASN1Sequence) || (asn1encodable instanceof X509Extensions))
            {
                i = X509Extensions.a(asn1sequence.a(k));
            }
            k++;
        }
    }

    public static AttributeCertificateInfo a(Object obj)
    {
        if (obj instanceof AttributeCertificateInfo)
        {
            return (AttributeCertificateInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AttributeCertificateInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        asn1encodablevector.a(e);
        asn1encodablevector.a(f);
        asn1encodablevector.a(g);
        if (h != null)
        {
            asn1encodablevector.a(h);
        }
        if (i != null)
        {
            asn1encodablevector.a(i);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final Holder e()
    {
        return b;
    }

    public final AttCertIssuer f()
    {
        return c;
    }

    public final DERInteger g()
    {
        return e;
    }

    public final AttCertValidityPeriod h()
    {
        return f;
    }

    public final ASN1Sequence i()
    {
        return g;
    }

    public final X509Extensions j()
    {
        return i;
    }
}
