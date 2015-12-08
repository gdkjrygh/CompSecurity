// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERBMPString extends ASN1Primitive
    implements ASN1String
{

    private char string[];

    public DERBMPString(String s)
    {
        string = s.toCharArray();
    }

    DERBMPString(byte abyte0[])
    {
        char ac[] = new char[abyte0.length / 2];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i * 2] << 8 | abyte0[i * 2 + 1] & 0xff);
        }

        string = ac;
    }

    DERBMPString(char ac[])
    {
        string = ac;
    }

    public static DERBMPString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERBMPString))
        {
            return (DERBMPString)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERBMPString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERBMPString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERBMPString(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    protected boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERBMPString))
        {
            return false;
        } else
        {
            asn1primitive = (DERBMPString)asn1primitive;
            return Arrays.areEqual(string, ((DERBMPString) (asn1primitive)).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.write(30);
        asn1outputstream.writeLength(string.length * 2);
        for (int i = 0; i != string.length; i++)
        {
            char c = string[i];
            asn1outputstream.write((byte)(c >> 8));
            asn1outputstream.write((byte)c);
        }

    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(string.length * 2) + 1 + string.length * 2;
    }

    public String getString()
    {
        return new String(string);
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
