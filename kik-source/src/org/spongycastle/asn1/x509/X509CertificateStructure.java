// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            X509ObjectIdentifiers, TBSCertificateStructure, AlgorithmIdentifier, Time, 
//            SubjectPublicKeyInfo

public class X509CertificateStructure extends ASN1Object
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    TBSCertificateStructure bA;
    AlgorithmIdentifier bB;
    DERBitString bC;
    ASN1Sequence bz;

    private X509CertificateStructure(ASN1Sequence asn1sequence)
    {
        bz = asn1sequence;
        if (asn1sequence.e() == 3)
        {
            bA = TBSCertificateStructure.a(asn1sequence.a(0));
            bB = AlgorithmIdentifier.a(asn1sequence.a(1));
            bC = DERBitString.a(asn1sequence.a(2));
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

    public final ASN1Primitive a()
    {
        return bz;
    }

    public final TBSCertificateStructure c()
    {
        return bA;
    }

    public final int d()
    {
        return bA.bA.c().intValue() + 1;
    }

    public final ASN1Integer e()
    {
        return bA.bB;
    }

    public final X500Name f()
    {
        return bA.bD;
    }

    public final Time g()
    {
        return bA.bE;
    }

    public final Time h()
    {
        return bA.bF;
    }

    public final X500Name i()
    {
        return bA.bG;
    }

    public final SubjectPublicKeyInfo j()
    {
        return bA.bH;
    }

    public final AlgorithmIdentifier k()
    {
        return bB;
    }

    public final DERBitString l()
    {
        return bC;
    }
}
