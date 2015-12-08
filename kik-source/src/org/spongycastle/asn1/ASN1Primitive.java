// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Object, ASN1InputStream, ASN1Encodable, ASN1OutputStream

public abstract class ASN1Primitive extends ASN1Object
{

    ASN1Primitive()
    {
    }

    public static ASN1Primitive a(byte abyte0[])
    {
        abyte0 = new ASN1InputStream(abyte0);
        try
        {
            abyte0 = abyte0.b();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("cannot recognise object in stream");
        }
        return abyte0;
    }

    public final ASN1Primitive a()
    {
        return this;
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    abstract boolean a(ASN1Primitive asn1primitive);

    public final boolean equals(Object obj)
    {
        while (this == obj || (obj instanceof ASN1Encodable) && a(((ASN1Encodable)obj).a())) 
        {
            return true;
        }
        return false;
    }

    ASN1Primitive f()
    {
        return this;
    }

    ASN1Primitive g()
    {
        return this;
    }

    abstract boolean h();

    public abstract int hashCode();

    abstract int i();
}
