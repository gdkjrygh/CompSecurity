// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            X509ObjectIdentifiers, AlgorithmIdentifier, Time, SubjectPublicKeyInfo, 
//            X509Extensions

public class TBSCertificateStructure extends ASN1Object
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    ASN1Integer bA;
    ASN1Integer bB;
    AlgorithmIdentifier bC;
    X500Name bD;
    Time bE;
    Time bF;
    X500Name bG;
    SubjectPublicKeyInfo bH;
    DERBitString bI;
    DERBitString bJ;
    X509Extensions bK;
    ASN1Sequence bz;

    private TBSCertificateStructure(ASN1Sequence asn1sequence)
    {
        Object obj;
        bz = asn1sequence;
        int i;
        int j;
        if (asn1sequence.a(0) instanceof DERTaggedObject)
        {
            bA = ASN1Integer.a((ASN1TaggedObject)asn1sequence.a(0), true);
            i = 0;
        } else
        {
            bA = new ASN1Integer(0);
            i = -1;
        }
        bB = ASN1Integer.a(asn1sequence.a(i + 1));
        bC = AlgorithmIdentifier.a(asn1sequence.a(i + 2));
        bD = X500Name.a(asn1sequence.a(i + 3));
        obj = (ASN1Sequence)asn1sequence.a(i + 4);
        bE = Time.a(((ASN1Sequence) (obj)).a(0));
        bF = Time.a(((ASN1Sequence) (obj)).a(1));
        bG = X500Name.a(asn1sequence.a(i + 5));
        bH = SubjectPublicKeyInfo.a(asn1sequence.a(i + 6));
        j = asn1sequence.e() - (i + 6) - 1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        obj = (DERTaggedObject)asn1sequence.a(i + 6 + j);
        switch (((DERTaggedObject) (obj)).c())
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            bJ = DERBitString.a(((ASN1TaggedObject) (obj)));
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_256;
_L4:
        j--;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_157;
_L1:
        bI = DERBitString.a(((ASN1TaggedObject) (obj)));
        continue; /* Loop/switch isn't completed */
        bK = X509Extensions.a(obj);
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

    public final ASN1Primitive a()
    {
        return bz;
    }

    public final AlgorithmIdentifier c()
    {
        return bC;
    }

    public final X500Name d()
    {
        return bD;
    }

    public final X500Name e()
    {
        return bG;
    }

    public final DERBitString f()
    {
        return bI;
    }

    public final DERBitString g()
    {
        return bJ;
    }

    public final X509Extensions h()
    {
        return bK;
    }
}
