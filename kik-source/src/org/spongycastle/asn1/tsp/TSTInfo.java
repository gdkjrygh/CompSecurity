// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.tsp;

import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;

// Referenced classes of package org.spongycastle.asn1.tsp:
//            MessageImprint, Accuracy

public class TSTInfo extends ASN1Object
{

    private ASN1Integer a;
    private ASN1ObjectIdentifier b;
    private MessageImprint c;
    private ASN1Integer d;
    private ASN1GeneralizedTime e;
    private Accuracy f;
    private ASN1Boolean g;
    private ASN1Integer h;
    private GeneralName i;
    private Extensions j;

    public final ASN1Primitive a()
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
        if (g != null && g.d())
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
