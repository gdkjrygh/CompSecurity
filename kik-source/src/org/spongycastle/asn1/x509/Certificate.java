// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            TBSCertificate, AlgorithmIdentifier

public class Certificate extends ASN1Object
{

    ASN1Sequence a;
    TBSCertificate b;
    AlgorithmIdentifier c;
    DERBitString d;

    private Certificate(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
        if (asn1sequence.e() == 3)
        {
            b = TBSCertificate.a(asn1sequence.a(0));
            c = AlgorithmIdentifier.a(asn1sequence.a(1));
            d = DERBitString.a(asn1sequence.a(2));
            return;
        } else
        {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
    }

    public static Certificate a(Object obj)
    {
        if (obj != null)
        {
            return new Certificate(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final X500Name c()
    {
        return b.e;
    }
}
