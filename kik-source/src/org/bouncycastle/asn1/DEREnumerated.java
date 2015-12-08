// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DEROutputStream, DERObject

public class DEREnumerated extends ASN1Object
{

    byte a[];

    public DEREnumerated(int i)
    {
        a = BigInteger.valueOf(i).toByteArray();
    }

    public DEREnumerated(byte abyte0[])
    {
        a = abyte0;
    }

    public static DEREnumerated a(Object obj)
    {
        if (obj == null || (obj instanceof DEREnumerated))
        {
            return (DEREnumerated)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(10, a);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DEREnumerated))
        {
            return false;
        } else
        {
            derobject = (DEREnumerated)derobject;
            return Arrays.a(a, ((DEREnumerated) (derobject)).a);
        }
    }

    public final BigInteger e()
    {
        return new BigInteger(a);
    }

    public int hashCode()
    {
        return Arrays.b(a);
    }
}
