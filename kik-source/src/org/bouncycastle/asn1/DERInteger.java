// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1TaggedObject, ASN1Integer, ASN1OctetString, 
//            DEROutputStream, DERObject

public class DERInteger extends ASN1Object
{

    byte a[];

    public DERInteger(int i)
    {
        a = BigInteger.valueOf(i).toByteArray();
    }

    public DERInteger(BigInteger biginteger)
    {
        a = biginteger.toByteArray();
    }

    public DERInteger(byte abyte0[])
    {
        a = abyte0;
    }

    public static DERInteger a(Object obj)
    {
        if (obj == null || (obj instanceof DERInteger))
        {
            return (DERInteger)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static DERInteger a(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        DERObject derobject = asn1taggedobject.i();
        if (flag || (derobject instanceof DERInteger))
        {
            return a(derobject);
        } else
        {
            return new ASN1Integer(ASN1OctetString.a(asn1taggedobject.i()).f());
        }
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(2, a);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERInteger))
        {
            return false;
        } else
        {
            derobject = (DERInteger)derobject;
            return Arrays.a(a, ((DERInteger) (derobject)).a);
        }
    }

    public final BigInteger e()
    {
        return new BigInteger(a);
    }

    public final BigInteger f()
    {
        return new BigInteger(1, a);
    }

    public int hashCode()
    {
        int i = 0;
        int j = 0;
        for (; i != a.length; i++)
        {
            j ^= (a[i] & 0xff) << i % 4;
        }

        return j;
    }

    public String toString()
    {
        return e().toString();
    }
}
