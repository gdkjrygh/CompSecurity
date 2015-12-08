// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEROutputStream, DERObject

public class DERUTF8String extends ASN1Object
    implements DERString
{

    String a;

    public DERUTF8String(String s)
    {
        a = s;
    }

    public DERUTF8String(byte abyte0[])
    {
        try
        {
            a = Strings.a(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException("UTF8 encoding invalid");
        }
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(12, Strings.a(a));
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERUTF8String))
        {
            return false;
        } else
        {
            derobject = (DERUTF8String)derobject;
            return n_().equals(derobject.n_());
        }
    }

    public int hashCode()
    {
        return n_().hashCode();
    }

    public final String n_()
    {
        return a;
    }

    public String toString()
    {
        return a;
    }
}
