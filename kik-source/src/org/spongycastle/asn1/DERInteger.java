// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1Integer, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, j

public class DERInteger extends ASN1Primitive
{

    byte a[];

    public DERInteger(int k)
    {
        a = BigInteger.valueOf(k).toByteArray();
    }

    public DERInteger(BigInteger biginteger)
    {
        a = biginteger.toByteArray();
    }

    public DERInteger(byte abyte0[])
    {
        a = abyte0;
    }

    public static ASN1Integer a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Integer))
        {
            return (ASN1Integer)obj;
        }
        if (obj instanceof DERInteger)
        {
            return new ASN1Integer(((DERInteger)obj).c());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1Integer a(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        ASN1Primitive asn1primitive = asn1taggedobject.k();
        if (flag || (asn1primitive instanceof DERInteger))
        {
            return a(asn1primitive);
        } else
        {
            return new ASN1Integer(ASN1OctetString.a(asn1taggedobject.k()).d());
        }
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(2, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERInteger))
        {
            return false;
        } else
        {
            asn1primitive = (DERInteger)asn1primitive;
            return Arrays.a(a, ((DERInteger) (asn1primitive)).a);
        }
    }

    public final BigInteger c()
    {
        return new BigInteger(a);
    }

    public final BigInteger d()
    {
        return new BigInteger(1, a);
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        int k = 0;
        int l = 0;
        for (; k != a.length; k++)
        {
            l ^= (a[k] & 0xff) << k % 4;
        }

        return l;
    }

    final int i()
    {
        return j.a(a.length) + 1 + a.length;
    }

    public String toString()
    {
        return c().toString();
    }
}
