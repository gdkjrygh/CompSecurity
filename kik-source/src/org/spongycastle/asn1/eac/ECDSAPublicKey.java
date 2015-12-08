// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.eac:
//            PublicKeyDataObject, UnsignedInteger

public class ECDSAPublicKey extends PublicKeyDataObject
{

    private ASN1ObjectIdentifier a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private byte e[];
    private BigInteger f;
    private byte g[];
    private BigInteger h;
    private int i;

    public final ASN1Primitive a()
    {
        Object obj1 = null;
        Object obj = a;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(((org.spongycastle.asn1.ASN1Encodable) (obj)));
        if ((i & 1) != 0)
        {
            obj = b;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new UnsignedInteger(1, ((BigInteger) (obj))));
        if ((i & 2) != 0)
        {
            obj = c;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new UnsignedInteger(2, ((BigInteger) (obj))));
        if ((i & 4) != 0)
        {
            obj = d;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new UnsignedInteger(3, ((BigInteger) (obj))));
        if ((i & 8) != 0)
        {
            obj = e;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new DERTaggedObject(false, 4, new DEROctetString(((byte []) (obj)))));
        if ((i & 0x10) != 0)
        {
            obj = f;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new UnsignedInteger(5, ((BigInteger) (obj))));
        if ((i & 0x20) != 0)
        {
            obj = g;
        } else
        {
            obj = null;
        }
        asn1encodablevector.a(new DERTaggedObject(false, 6, new DEROctetString(((byte []) (obj)))));
        obj = obj1;
        if ((i & 0x40) != 0)
        {
            obj = h;
        }
        asn1encodablevector.a(new UnsignedInteger(7, ((BigInteger) (obj))));
        return new DERSequence(asn1encodablevector);
    }
}
