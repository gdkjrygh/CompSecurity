// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.GeneralName;

// Referenced classes of package org.spongycastle.asn1.cmp:
//            PKIFreeText

public class PKIHeader extends ASN1Object
{

    public static final GeneralName a = new GeneralName(X500Name.a(new DERSequence()));
    private ASN1Integer b;
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

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        a(asn1encodablevector, 0, ((ASN1Encodable) (e)));
        a(asn1encodablevector, 1, ((ASN1Encodable) (f)));
        a(asn1encodablevector, 2, ((ASN1Encodable) (g)));
        a(asn1encodablevector, 3, ((ASN1Encodable) (h)));
        a(asn1encodablevector, 4, ((ASN1Encodable) (i)));
        a(asn1encodablevector, 5, ((ASN1Encodable) (j)));
        a(asn1encodablevector, 6, ((ASN1Encodable) (k)));
        a(asn1encodablevector, 7, ((ASN1Encodable) (l)));
        a(asn1encodablevector, 8, ((ASN1Encodable) (m)));
        return new DERSequence(asn1encodablevector);
    }

}
