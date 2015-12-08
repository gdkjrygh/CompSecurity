// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;

// Referenced classes of package org.bouncycastle.asn1.isismtt.x509:
//            NamingAuthority

public class Admissions extends ASN1Encodable
{

    private GeneralName a;
    private NamingAuthority b;
    private ASN1Sequence c;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b));
        }
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }
}
