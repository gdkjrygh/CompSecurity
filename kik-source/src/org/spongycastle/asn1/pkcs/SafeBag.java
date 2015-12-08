// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DLSequence;
import org.spongycastle.asn1.DLTaggedObject;

public class SafeBag extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Encodable b;
    private ASN1Set c;

    public SafeBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable, ASN1Set asn1set)
    {
        a = asn1objectidentifier;
        b = asn1encodable;
        c = asn1set;
    }

    private SafeBag(ASN1Sequence asn1sequence)
    {
        a = (ASN1ObjectIdentifier)asn1sequence.a(0);
        b = ((ASN1TaggedObject)asn1sequence.a(1)).k();
        if (asn1sequence.e() == 3)
        {
            c = (ASN1Set)asn1sequence.a(2);
        }
    }

    public static SafeBag a(Object obj)
    {
        if (obj instanceof SafeBag)
        {
            return (SafeBag)obj;
        }
        if (obj != null)
        {
            return new SafeBag(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DLTaggedObject(true, 0, b));
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DLSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1Encodable d()
    {
        return b;
    }

    public final ASN1Set e()
    {
        return c;
    }
}
