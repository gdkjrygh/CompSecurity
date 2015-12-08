// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIFreeText

public class PKIHeader extends ASN1Encodable
{

    public static final GeneralName a = new GeneralName(X500Name.a(new DERSequence()));
    private DERInteger b;
    private GeneralName c;
    private GeneralName d;
    private DERGeneralizedTime e;
    private AlgorithmIdentifier f;
    private ASN1OctetString g;
    private ASN1OctetString h;
    private ASN1OctetString i;
    private ASN1OctetString j;
    private ASN1OctetString k;
    private PKIFreeText l;
    private ASN1Sequence m;

    private static void a(ASN1EncodableVector asn1encodablevector, int i1, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, i1, asn1encodable));
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        a(asn1encodablevector, 0, e);
        a(asn1encodablevector, 1, f);
        a(asn1encodablevector, 2, g);
        a(asn1encodablevector, 3, h);
        a(asn1encodablevector, 4, i);
        a(asn1encodablevector, 5, j);
        a(asn1encodablevector, 6, k);
        a(asn1encodablevector, 7, l);
        a(asn1encodablevector, 8, m);
        return new DERSequence(asn1encodablevector);
    }

}
