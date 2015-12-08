// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509CertificateStructure

public class CertificatePair extends ASN1Encodable
{

    private X509CertificateStructure a;
    private X509CertificateStructure b;

    private CertificatePair(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 1 && asn1sequence.f() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        for (asn1sequence = asn1sequence.e(); asn1sequence.hasMoreElements();)
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.a(asn1sequence.nextElement());
            if (asn1taggedobject.e() == 0)
            {
                a = X509CertificateStructure.a(asn1taggedobject);
            } else
            if (asn1taggedobject.e() == 1)
            {
                b = X509CertificateStructure.a(asn1taggedobject);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad tag number: ")).append(asn1taggedobject.e()).toString());
            }
        }

    }

    public CertificatePair(X509CertificateStructure x509certificatestructure, X509CertificateStructure x509certificatestructure1)
    {
        a = x509certificatestructure;
        b = x509certificatestructure1;
    }

    public static CertificatePair a(Object obj)
    {
        if (obj == null || (obj instanceof CertificatePair))
        {
            return (CertificatePair)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new CertificatePair((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(1, b));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final X509CertificateStructure e()
    {
        return a;
    }

    public final X509CertificateStructure f()
    {
        return b;
    }
}
