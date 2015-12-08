// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            DEREncodable, ASN1OutputStream, DEROutputStream, DERObject

public abstract class ASN1Encodable
    implements DEREncodable
{

    public ASN1Encodable()
    {
    }

    public byte[] a()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        (new ASN1OutputStream(bytearrayoutputstream)).a(this);
        return bytearrayoutputstream.toByteArray();
    }

    public final byte[] a(String s)
    {
        if (s.equals("DER"))
        {
            s = new ByteArrayOutputStream();
            (new DEROutputStream(s)).a(this);
            return s.toByteArray();
        } else
        {
            return a();
        }
    }

    public final byte[] b()
    {
        byte abyte0[];
        try
        {
            abyte0 = a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    public DERObject c()
    {
        return d();
    }

    public abstract DERObject d();

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof DEREncodable))
        {
            return false;
        } else
        {
            obj = (DEREncodable)obj;
            return d().equals(((DEREncodable) (obj)).c());
        }
    }

    public int hashCode()
    {
        return d().hashCode();
    }
}
