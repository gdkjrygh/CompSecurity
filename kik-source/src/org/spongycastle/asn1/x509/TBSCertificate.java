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
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AlgorithmIdentifier, Time, SubjectPublicKeyInfo, Extensions

public class TBSCertificate extends ASN1Object
{

    ASN1Sequence a;
    ASN1Integer b;
    ASN1Integer c;
    AlgorithmIdentifier d;
    X500Name e;
    Time f;
    Time g;
    X500Name h;
    SubjectPublicKeyInfo i;
    DERBitString j;
    DERBitString k;
    Extensions l;

    private TBSCertificate(ASN1Sequence asn1sequence)
    {
        Object obj;
        a = asn1sequence;
        int i1;
        int j1;
        if (asn1sequence.a(0) instanceof DERTaggedObject)
        {
            b = ASN1Integer.a((ASN1TaggedObject)asn1sequence.a(0), true);
            i1 = 0;
        } else
        {
            b = new ASN1Integer(0);
            i1 = -1;
        }
        c = ASN1Integer.a(asn1sequence.a(i1 + 1));
        d = AlgorithmIdentifier.a(asn1sequence.a(i1 + 2));
        e = X500Name.a(asn1sequence.a(i1 + 3));
        obj = (ASN1Sequence)asn1sequence.a(i1 + 4);
        f = Time.a(((ASN1Sequence) (obj)).a(0));
        g = Time.a(((ASN1Sequence) (obj)).a(1));
        h = X500Name.a(asn1sequence.a(i1 + 5));
        i = SubjectPublicKeyInfo.a(asn1sequence.a(i1 + 6));
        j1 = asn1sequence.e() - (i1 + 6) - 1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        obj = (DERTaggedObject)asn1sequence.a(i1 + 6 + j1);
        switch (((DERTaggedObject) (obj)).c())
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            k = DERBitString.a(((ASN1TaggedObject) (obj)));
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_256;
_L4:
        j1--;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_157;
_L1:
        j = DERBitString.a(((ASN1TaggedObject) (obj)));
        continue; /* Loop/switch isn't completed */
        l = Extensions.a(ASN1Sequence.a(((ASN1TaggedObject) (obj)), true));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static TBSCertificate a(Object obj)
    {
        if (obj instanceof TBSCertificate)
        {
            return (TBSCertificate)obj;
        }
        if (obj != null)
        {
            return new TBSCertificate(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }
}
