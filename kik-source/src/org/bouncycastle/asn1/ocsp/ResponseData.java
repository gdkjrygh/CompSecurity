// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            ResponderID

public class ResponseData extends ASN1Encodable
{

    private static final DERInteger a = new DERInteger(0);
    private boolean b;
    private DERInteger c;
    private ResponderID d;
    private DERGeneralizedTime e;
    private ASN1Sequence f;
    private X509Extensions g;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (b || !c.equals(a))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, c));
        }
        asn1encodablevector.a(d);
        asn1encodablevector.a(e);
        asn1encodablevector.a(f);
        if (g != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, g));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final X509Extensions e()
    {
        return g;
    }

}
