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
import org.spongycastle.asn1.x509.DigestInfo;

public class MacData extends ASN1Object
{

    private static final BigInteger d = BigInteger.valueOf(1L);
    DigestInfo a;
    byte b[];
    BigInteger c;

    private MacData(ASN1Sequence asn1sequence)
    {
        a = DigestInfo.a(asn1sequence.a(0));
        b = ((ASN1OctetString)asn1sequence.a(1)).d();
        if (asn1sequence.e() == 3)
        {
            c = ((ASN1Integer)asn1sequence.a(2)).c();
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
        if (obj != null)
        {
            return new MacData(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DEROctetString(b));
        if (!c.equals(d))
        {
            asn1encodablevector.a(new ASN1Integer(c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final DigestInfo c()
    {
        return a;
    }

    public final byte[] d()
    {
        return b;
    }

    public final BigInteger e()
    {
        return c;
    }

}
