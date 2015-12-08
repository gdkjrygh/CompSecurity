// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERUTF8String extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERUTF8String(String s)
    {
        string = Strings.toUTF8ByteArray(s);
    }

    DERUTF8String(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERUTF8String getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERUTF8String))
        {
            return (DERUTF8String)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERUTF8String getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERUTF8String))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERUTF8String(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTF8String))
        {
            return false;
        } else
        {
            asn1primitive = (DERUTF8String)asn1primitive;
            return Arrays.areEqual(string, ((DERUTF8String) (asn1primitive)).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.writeEncoded(12, string);
    }

    int encodedLength()
        throws IOException
    {
        return StreamUtil.calculateBodyLength(string.length) + 1 + string.length;
    }

    public String getString()
    {
        return Strings.fromUTF8ByteArray(string);
    }

    public int hashCode()
    {
        return Arrays.hashCode(string);
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return getString();
    }
}
