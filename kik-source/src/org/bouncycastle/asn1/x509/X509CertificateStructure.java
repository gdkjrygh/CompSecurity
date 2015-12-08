// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509ObjectIdentifiers, TBSCertificateStructure, AlgorithmIdentifier, X509Name, 
//            Time, SubjectPublicKeyInfo

public class X509CertificateStructure extends ASN1Encodable
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    AlgorithmIdentifier bA;
    DERBitString bB;
    ASN1Sequence by;
    TBSCertificateStructure bz;

    private X509CertificateStructure(ASN1Sequence asn1sequence)
    {
        by = asn1sequence;
        if (asn1sequence.f() == 3)
        {
            bz = TBSCertificateStructure.a(asn1sequence.a(0));
            bA = AlgorithmIdentifier.b(asn1sequence.a(1));
            bB = DERBitString.a(asn1sequence.a(2));
            return;
        } else
        {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
    }

    public static X509CertificateStructure a(Object obj)
    {
        if (obj instanceof X509CertificateStructure)
        {
            return (X509CertificateStructure)obj;
        }
        if (obj != null)
        {
            return new X509CertificateStructure(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public static X509CertificateStructure a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, true));
    }

    public final DERObject d()
    {
        return by;
    }

    public final TBSCertificateStructure e()
    {
        return bz;
    }

    public final int f()
    {
        return bz.bz.e().intValue() + 1;
    }

    public final DERInteger g()
    {
        return bz.bA;
    }

    public final X509Name h()
    {
        return bz.bC;
    }

    public final Time i()
    {
        return bz.bD;
    }

    public final Time j()
    {
        return bz.bE;
    }

    public final X509Name k()
    {
        return bz.bF;
    }

    public final SubjectPublicKeyInfo l()
    {
        return bz.bG;
    }

    public final AlgorithmIdentifier m()
    {
        return bA;
    }

    public final DERBitString n()
    {
        return bB;
    }
}
