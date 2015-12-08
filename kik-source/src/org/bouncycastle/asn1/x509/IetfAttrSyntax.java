// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class IetfAttrSyntax extends ASN1Encodable
{

    GeneralNames a;
    Vector b;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(0, a));
        }
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (Enumeration enumeration = b.elements(); enumeration.hasMoreElements(); asn1encodablevector1.a((ASN1Encodable)enumeration.nextElement())) { }
        asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
