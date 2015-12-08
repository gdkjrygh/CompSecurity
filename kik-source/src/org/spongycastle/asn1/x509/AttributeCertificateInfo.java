// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            Holder, AttCertIssuer, AlgorithmIdentifier, AttCertValidityPeriod, 
//            Extensions

public class AttributeCertificateInfo extends ASN1Object
{

    private ASN1Integer a;
    private Holder b;
    private AttCertIssuer c;
    private AlgorithmIdentifier d;
    private ASN1Integer e;
    private AttCertValidityPeriod f;
    private ASN1Sequence g;
    private DERBitString h;
    private Extensions i;

    private AttributeCertificateInfo(ASN1Sequence asn1sequence)
    {
        int j = 7;
        super();
        if (asn1sequence.e() < 7 || asn1sequence.e() > 9)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        a = ASN1Integer.a(asn1sequence.a(0));
        b = Holder.a(asn1sequence.a(1));
        c = AttCertIssuer.a(asn1sequence.a(2));
        d = AlgorithmIdentifier.a(asn1sequence.a(3));
        e = ASN1Integer.a(asn1sequence.a(4));
        f = AttCertValidityPeriod.a(asn1sequence.a(5));
        g = ASN1Sequence.a(asn1sequence.a(6));
        while (j < asn1sequence.e()) 
        {
            org.spongycastle.asn1.ASN1Encodable asn1encodable = asn1sequence.a(j);
            if (asn1encodable instanceof DERBitString)
            {
                h = DERBitString.a(asn1sequence.a(j));
            } else
            if ((asn1encodable instanceof ASN1Sequence) || (asn1encodable instanceof Extensions))
            {
                i = Extensions.a(asn1sequence.a(j));
            }
            j++;
        }
    }

    public static AttributeCertificateInfo a(Object obj)
    {
        if (obj instanceof AttributeCertificateInfo)
        {
            return (AttributeCertificateInfo)obj;
        }
        if (obj != null)
        {
            return new AttributeCertificateInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
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

    public final Holder c()
    {
        return b;
    }

    public final AttCertIssuer d()
    {
        return c;
    }

    public final ASN1Integer e()
    {
        return e;
    }

    public final AttCertValidityPeriod f()
    {
        return f;
    }

    public final ASN1Sequence g()
    {
        return g;
    }

    public final Extensions h()
    {
        return i;
    }
}
