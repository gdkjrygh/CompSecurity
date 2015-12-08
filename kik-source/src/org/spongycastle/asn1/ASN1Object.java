// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Encodable, DEROutputStream, DLOutputStream, ASN1OutputStream, 
//            ASN1Primitive

public abstract class ASN1Object
    implements ASN1Encodable
{

    public ASN1Object()
    {
    }

    public abstract ASN1Primitive a();

    public final byte[] a(String s)
    {
        if (s.equals("DER"))
        {
            s = new ByteArrayOutputStream();
            (new DEROutputStream(s)).a(this);
            return s.toByteArray();
        }
        if (s.equals("DL"))
        {
            s = new ByteArrayOutputStream();
            (new DLOutputStream(s)).a(this);
            return s.toByteArray();
        } else
        {
            return b();
        }
    }

    public byte[] b()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        (new ASN1OutputStream(bytearrayoutputstream)).a(this);
        return bytearrayoutputstream.toByteArray();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ASN1Encodable))
        {
            return false;
        } else
        {
            obj = (ASN1Encodable)obj;
            return a().equals(((ASN1Encodable) (obj)).a());
        }
    }

    public int hashCode()
    {
        return a().hashCode();
    }
}
