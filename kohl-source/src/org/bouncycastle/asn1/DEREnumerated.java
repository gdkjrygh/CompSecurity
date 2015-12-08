// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1Enumerated, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DEREnumerated extends ASN1Primitive
{

    private static ASN1Enumerated cache[] = new ASN1Enumerated[12];
    byte bytes[];

    public DEREnumerated(int i)
    {
        bytes = BigInteger.valueOf(i).toByteArray();
    }

    public DEREnumerated(BigInteger biginteger)
    {
        bytes = biginteger.toByteArray();
    }

    public DEREnumerated(byte abyte0[])
    {
        bytes = abyte0;
    }

    static ASN1Enumerated fromOctetString(byte abyte0[])
    {
        ASN1Enumerated asn1enumerated;
        if (abyte0.length > 1)
        {
            asn1enumerated = new ASN1Enumerated(Arrays.clone(abyte0));
        } else
        {
            if (abyte0.length == 0)
            {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            int i = abyte0[0] & 0xff;
            if (i >= cache.length)
            {
                return new ASN1Enumerated(Arrays.clone(abyte0));
            }
            ASN1Enumerated asn1enumerated1 = cache[i];
            asn1enumerated = asn1enumerated1;
            if (asn1enumerated1 == null)
            {
                ASN1Enumerated aasn1enumerated[] = cache;
                abyte0 = new ASN1Enumerated(Arrays.clone(abyte0));
                aasn1enumerated[i] = abyte0;
                return abyte0;
            }
        }
        return asn1enumerated;
    }

    public static ASN1Enumerated getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Enumerated))
        {
            return (ASN1Enumerated)obj;
        }
        if (obj instanceof DEREnumerated)
        {
            return new ASN1Enumerated(((DEREnumerated)obj).getValue());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DEREnumerated getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DEREnumerated))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return fromOctetString(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DEREnumerated))
        {
            return false;
        } else
        {
            asn1primitive = (DEREnumerated)asn1primitive;
            return Arrays.areEqual(bytes, ((DEREnumerated) (asn1primitive)).bytes);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.writeEncoded(10, bytes);
    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(bytes.length) + 1 + bytes.length;
    }

    public BigInteger getValue()
    {
        return new BigInteger(bytes);
    }

    public int hashCode()
    {
        return Arrays.hashCode(bytes);
    }

    boolean isConstructed()
    {
        return false;
    }

}
