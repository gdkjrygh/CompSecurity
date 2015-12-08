// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.asn1.tsp:
//            MessageImprint, Accuracy

public class TSTInfo extends ASN1Encodable
{

    DERInteger a;
    DERObjectIdentifier b;
    MessageImprint c;
    DERInteger d;
    DERGeneralizedTime e;
    Accuracy f;
    DERBoolean g;
    DERInteger h;
    GeneralName i;
    X509Extensions j;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        asn1encodablevector.a(e);
        if (f != null)
        {
            asn1encodablevector.a(f);
        }
        if (g != null && g.e())
        {
            asn1encodablevector.a(g);
        }
        if (h != null)
        {
            asn1encodablevector.a(h);
        }
        if (i != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, i));
        }
        if (j != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, j));
        }
        return new DERSequence(asn1encodablevector);
    }
}
