// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class AccessDescription extends ASN1Encodable
{

    public static final DERObjectIdentifier a = new DERObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final DERObjectIdentifier b = new DERObjectIdentifier("1.3.6.1.5.5.7.48.1");
    DERObjectIdentifier c;
    GeneralName d;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        return (new StringBuilder("AccessDescription: Oid(")).append(c.e()).append(")").toString();
    }

}
