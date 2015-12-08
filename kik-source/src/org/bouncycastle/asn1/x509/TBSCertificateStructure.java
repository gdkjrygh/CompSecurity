// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509ObjectIdentifiers, AlgorithmIdentifier, X509Name, Time, 
//            SubjectPublicKeyInfo, X509Extensions

public class TBSCertificateStructure extends ASN1Encodable
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    DERInteger bA;
    AlgorithmIdentifier bB;
    X509Name bC;
    Time bD;
    Time bE;
    X509Name bF;
    SubjectPublicKeyInfo bG;
    DERBitString bH;
    DERBitString bI;
    X509Extensions bJ;
    ASN1Sequence by;
    DERInteger bz;

    private TBSCertificateStructure(ASN1Sequence asn1sequence)
    {
        Object obj;
        by = asn1sequence;
        int k;
        int l;
        if (asn1sequence.a(0) instanceof DERTaggedObject)
        {
            bz = DERInteger.a((ASN1TaggedObject)asn1sequence.a(0), true);
            k = 0;
        } else
        {
            bz = new DERInteger(0);
            k = -1;
        }
        bA = DERInteger.a(asn1sequence.a(k + 1));
        bB = AlgorithmIdentifier.b(asn1sequence.a(k + 2));
        bC = X509Name.a(asn1sequence.a(k + 3));
        obj = (ASN1Sequence)asn1sequence.a(k + 4);
        bD = Time.a(((ASN1Sequence) (obj)).a(0));
        bE = Time.a(((ASN1Sequence) (obj)).a(1));
        bF = X509Name.a(asn1sequence.a(k + 5));
        bG = SubjectPublicKeyInfo.a(asn1sequence.a(k + 6));
        l = asn1sequence.f() - (k + 6) - 1;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        obj = (DERTaggedObject)asn1sequence.a(k + 6 + l);
        switch (((DERTaggedObject) (obj)).e())
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            bI = DERBitString.a(((ASN1TaggedObject) (obj)));
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_256;
_L4:
        l--;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_157;
_L1:
        bH = DERBitString.a(((ASN1TaggedObject) (obj)));
        continue; /* Loop/switch isn't completed */
        bJ = X509Extensions.a(obj);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static TBSCertificateStructure a(Object obj)
    {
        if (obj instanceof TBSCertificateStructure)
        {
            return (TBSCertificateStructure)obj;
        }
        if (obj != null)
        {
            return new TBSCertificateStructure(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        return by;
    }

    public final AlgorithmIdentifier e()
    {
        return bB;
    }

    public final X509Name f()
    {
        return bC;
    }

    public final X509Name g()
    {
        return bF;
    }

    public final DERBitString h()
    {
        return bH;
    }

    public final DERBitString i()
    {
        return bI;
    }

    public final X509Extensions j()
    {
        return bJ;
    }
}
