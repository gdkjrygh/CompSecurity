// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralName

public class AccessDescription extends ASN1Object
{

    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final ASN1ObjectIdentifier b = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
    ASN1ObjectIdentifier c;
    GeneralName d;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        return (new StringBuilder("AccessDescription: Oid(")).append(c.c()).append(")").toString();
    }

}
