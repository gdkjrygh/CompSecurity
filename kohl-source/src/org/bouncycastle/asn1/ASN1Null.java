// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1OutputStream

public abstract class ASN1Null extends ASN1Primitive
{

    public ASN1Null()
    {
    }

    public static ASN1Null getInstance(Object obj)
    {
        if (obj instanceof ASN1Null)
        {
            return (ASN1Null)obj;
        }
        if (obj != null)
        {
            ASN1Null asn1null;
            try
            {
                asn1null = getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct NULL from byte[]: ").append(((IOException) (obj)).getMessage()).toString());
            }
            catch (ClassCastException classcastexception)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance(): ").append(obj.getClass().getName()).toString());
            }
            return asn1null;
        } else
        {
            return null;
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        return asn1primitive instanceof ASN1Null;
    }

    abstract void encode(ASN1OutputStream asn1outputstream)
        throws IOException;

    public int hashCode()
    {
        return -1;
    }

    public String toString()
    {
        return "NULL";
    }
}
