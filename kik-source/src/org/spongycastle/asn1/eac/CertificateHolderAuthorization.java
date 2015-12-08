// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.util.Hashtable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;

// Referenced classes of package org.spongycastle.asn1.eac:
//            EACObjectIdentifiers, BidirectionalMap

public class CertificateHolderAuthorization extends ASN1Object
{

    public static final ASN1ObjectIdentifier c;
    static Hashtable d;
    static BidirectionalMap e;
    static Hashtable f = new Hashtable();
    ASN1ObjectIdentifier a;
    DERApplicationSpecific b;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERApplicationSpecific(76, asn1encodablevector);
    }

    static 
    {
        c = EACObjectIdentifiers.a.b("3.1.2.1");
        d = new Hashtable();
        e = new BidirectionalMap();
        d.put(new Integer(2), "RADG4");
        d.put(new Integer(1), "RADG3");
        e.put(new Integer(192), "CVCA");
        e.put(new Integer(128), "DV_DOMESTIC");
        e.put(new Integer(64), "DV_FOREIGN");
        e.put(new Integer(0), "IS");
    }
}
