// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.eac;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.eac:
//            PublicKeyDataObject, UnsignedInteger

public class RSAPublicKey extends PublicKeyDataObject
{

    private static int d = 1;
    private static int e = 2;
    private ASN1ObjectIdentifier a;
    private BigInteger b;
    private BigInteger c;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new UnsignedInteger(1, b));
        asn1encodablevector.a(new UnsignedInteger(2, c));
        return new DERSequence(asn1encodablevector);
    }

}
