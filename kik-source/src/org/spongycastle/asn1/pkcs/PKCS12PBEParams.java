// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

public class PKCS12PBEParams extends ASN1Object
{

    ASN1Integer a;
    ASN1OctetString b;

    private PKCS12PBEParams(ASN1Sequence asn1sequence)
    {
        b = (ASN1OctetString)asn1sequence.a(0);
        a = ASN1Integer.a(asn1sequence.a(1));
    }

    public PKCS12PBEParams(byte abyte0[], int i)
    {
        b = new DEROctetString(abyte0);
        a = new ASN1Integer(i);
    }

    public static PKCS12PBEParams a(Object obj)
    {
        if (obj instanceof PKCS12PBEParams)
        {
            return (PKCS12PBEParams)obj;
        }
        if (obj != null)
        {
            return new PKCS12PBEParams(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(a);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        return a.c();
    }

    public final byte[] d()
    {
        return b.d();
    }
}
