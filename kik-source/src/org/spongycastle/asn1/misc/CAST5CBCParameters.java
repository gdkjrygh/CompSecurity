// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.misc;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

public class CAST5CBCParameters extends ASN1Object
{

    ASN1Integer a;
    ASN1OctetString b;

    private CAST5CBCParameters(ASN1Sequence asn1sequence)
    {
        b = (ASN1OctetString)asn1sequence.a(0);
        a = (ASN1Integer)asn1sequence.a(1);
    }

    public CAST5CBCParameters(byte abyte0[], int i)
    {
        b = new DEROctetString(abyte0);
        a = new ASN1Integer(i);
    }

    public static CAST5CBCParameters a(Object obj)
    {
        if (obj instanceof CAST5CBCParameters)
        {
            return (CAST5CBCParameters)obj;
        }
        if (obj != null)
        {
            return new CAST5CBCParameters(ASN1Sequence.a(obj));
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

    public final byte[] c()
    {
        return b.d();
    }

    public final int d()
    {
        return a.c().intValue();
    }
}
