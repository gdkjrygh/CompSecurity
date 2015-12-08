// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1OutputStream, j

public class DERUTF8String extends ASN1Primitive
    implements ASN1String
{

    private byte a[];

    public DERUTF8String(String s)
    {
        a = Strings.a(s);
    }

    DERUTF8String(byte abyte0[])
    {
        a = abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(12, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTF8String))
        {
            return false;
        } else
        {
            asn1primitive = (DERUTF8String)asn1primitive;
            return Arrays.a(a, ((DERUTF8String) (asn1primitive)).a);
        }
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return Arrays.a(a);
    }

    final int i()
    {
        return j.a(a.length) + 1 + a.length;
    }

    public final String o_()
    {
        return Strings.a(a);
    }

    public String toString()
    {
        return o_();
    }
}
