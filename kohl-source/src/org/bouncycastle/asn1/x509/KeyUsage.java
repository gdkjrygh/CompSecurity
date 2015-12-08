// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERBitString;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension

public class KeyUsage extends DERBitString
{

    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;

    public KeyUsage(int i)
    {
        super(getBytes(i), getPadBits(i));
    }

    public KeyUsage(DERBitString derbitstring)
    {
        super(derbitstring.getBytes(), derbitstring.getPadBits());
    }

    public static DERBitString getInstance(Object obj)
    {
        if (obj instanceof KeyUsage)
        {
            return (KeyUsage)obj;
        }
        if (obj instanceof X509Extension)
        {
            return new KeyUsage(DERBitString.getInstance(X509Extension.convertValueToObject((X509Extension)obj)));
        } else
        {
            return new KeyUsage(DERBitString.getInstance(obj));
        }
    }

    public String toString()
    {
        if (data.length == 1)
        {
            return (new StringBuilder()).append("KeyUsage: 0x").append(Integer.toHexString(data[0] & 0xff)).toString();
        } else
        {
            return (new StringBuilder()).append("KeyUsage: 0x").append(Integer.toHexString((data[1] & 0xff) << 8 | data[0] & 0xff)).toString();
        }
    }
}
