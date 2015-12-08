// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.smime;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;

public class SMIMECapability extends ASN1Object
{

    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    private ASN1ObjectIdentifier j;
    private ASN1Encodable k;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(j);
        if (k != null)
        {
            asn1encodablevector.a(k);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        a = PKCSObjectIdentifiers.ao;
        b = PKCSObjectIdentifiers.ap;
        c = PKCSObjectIdentifiers.aq;
        e = PKCSObjectIdentifiers.B;
        f = PKCSObjectIdentifiers.C;
        g = NISTObjectIdentifiers.h;
        h = NISTObjectIdentifiers.o;
        i = NISTObjectIdentifiers.v;
    }
}
