// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1OutputStream, j

public class DERGeneralString extends ASN1Primitive
    implements ASN1String
{

    private byte a[];

    DERGeneralString(byte abyte0[])
    {
        a = abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(27, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERGeneralString))
        {
            return false;
        } else
        {
            asn1primitive = (DERGeneralString)asn1primitive;
            return Arrays.a(a, ((DERGeneralString) (asn1primitive)).a);
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
        return Strings.b(a);
    }

    public String toString()
    {
        return o_();
    }
}
