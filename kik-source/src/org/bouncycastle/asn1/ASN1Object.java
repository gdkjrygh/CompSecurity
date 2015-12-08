// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            DERObject, ASN1InputStream, DEREncodable, DEROutputStream

public abstract class ASN1Object extends DERObject
{

    public ASN1Object()
    {
    }

    public static ASN1Object a(byte abyte0[])
    {
        abyte0 = new ASN1InputStream(abyte0);
        try
        {
            abyte0 = (ASN1Object)abyte0.a();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("cannot recognise object in stream");
        }
        return abyte0;
    }

    abstract void a(DEROutputStream deroutputstream);

    abstract boolean a(DERObject derobject);

    public final boolean equals(Object obj)
    {
        while (this == obj || (obj instanceof DEREncodable) && a(((DEREncodable)obj).c())) 
        {
            return true;
        }
        return false;
    }

    public abstract int hashCode();
}
