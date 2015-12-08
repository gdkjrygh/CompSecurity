// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.DigestInfo;

public class MacData extends ASN1Encodable
{

    private static final BigInteger d = BigInteger.valueOf(1L);
    DigestInfo a;
    byte b[];
    BigInteger c;

    private MacData(ASN1Sequence asn1sequence)
    {
        a = DigestInfo.a(asn1sequence.a(0));
        b = ((ASN1OctetString)asn1sequence.a(1)).f();
        if (asn1sequence.f() == 3)
        {
            c = ((DERInteger)asn1sequence.a(2)).e();
            return;
        } else
        {
            c = d;
            return;
        }
    }

    public MacData(DigestInfo digestinfo, byte abyte0[])
    {
        a = digestinfo;
        b = abyte0;
        c = BigInteger.valueOf(1024L);
    }

    public static MacData a(Object obj)
    {
        if (obj instanceof MacData)
        {
            return (MacData)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new MacData((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DEROctetString(b));
        if (!c.equals(d))
        {
            asn1encodablevector.a(new DERInteger(c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final DigestInfo e()
    {
        return a;
    }

    public final byte[] f()
    {
        return b;
    }

    public final BigInteger g()
    {
        return c;
    }

}
