// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1Enumerated, ASN1OutputStream, j

public class DEREnumerated extends ASN1Primitive
{

    private static ASN1Enumerated b[] = new ASN1Enumerated[12];
    byte a[];

    public DEREnumerated(int k)
    {
        a = BigInteger.valueOf(k).toByteArray();
    }

    public DEREnumerated(BigInteger biginteger)
    {
        a = biginteger.toByteArray();
    }

    public DEREnumerated(byte abyte0[])
    {
        a = abyte0;
    }

    public static ASN1Enumerated a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Enumerated))
        {
            return (ASN1Enumerated)obj;
        }
        if (obj instanceof DEREnumerated)
        {
            return new ASN1Enumerated(((DEREnumerated)obj).c());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    static ASN1Enumerated b(byte abyte0[])
    {
        ASN1Enumerated asn1enumerated;
        if (abyte0.length > 1)
        {
            asn1enumerated = new ASN1Enumerated(Arrays.b(abyte0));
        } else
        {
            if (abyte0.length == 0)
            {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            int k = abyte0[0] & 0xff;
            if (k >= b.length)
            {
                return new ASN1Enumerated(Arrays.b(abyte0));
            }
            ASN1Enumerated asn1enumerated1 = b[k];
            asn1enumerated = asn1enumerated1;
            if (asn1enumerated1 == null)
            {
                ASN1Enumerated aasn1enumerated[] = b;
                abyte0 = new ASN1Enumerated(Arrays.b(abyte0));
                aasn1enumerated[k] = abyte0;
                return abyte0;
            }
        }
        return asn1enumerated;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(10, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DEREnumerated))
        {
            return false;
        } else
        {
            asn1primitive = (DEREnumerated)asn1primitive;
            return Arrays.a(a, ((DEREnumerated) (asn1primitive)).a);
        }
    }

    public final BigInteger c()
    {
        return new BigInteger(a);
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return Arrays.a(a);
    }

    final int i()
    {
        return j.a(a.length) + 1 + a.length;
    }

}
