// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1OutputStream, j

public class DERBMPString extends ASN1Primitive
    implements ASN1String
{

    private char a[];

    public DERBMPString(String s)
    {
        a = s.toCharArray();
    }

    DERBMPString(char ac[])
    {
        a = ac;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.b(30);
        asn1outputstream.a(a.length * 2);
        for (int k = 0; k != a.length; k++)
        {
            char c = a[k];
            asn1outputstream.b((byte)(c >> 8));
            asn1outputstream.b((byte)c);
        }

    }

    protected final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERBMPString))
        {
            return false;
        } else
        {
            asn1primitive = (DERBMPString)asn1primitive;
            return Arrays.a(a, ((DERBMPString) (asn1primitive)).a);
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
        return j.a(a.length * 2) + 1 + a.length * 2;
    }

    public final String o_()
    {
        return new String(a);
    }

    public String toString()
    {
        return o_();
    }
}
