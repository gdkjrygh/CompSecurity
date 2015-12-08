// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, j

public class DERIA5String extends ASN1Primitive
    implements ASN1String
{

    private byte a[];

    public DERIA5String(String s)
    {
        this(s, false);
    }

    public DERIA5String(String s, boolean flag)
    {
        if (s == null)
        {
            throw new NullPointerException("string cannot be null");
        }
        if (flag && !b(s))
        {
            throw new IllegalArgumentException("string contains illegal characters");
        } else
        {
            a = Strings.d(s);
            return;
        }
    }

    DERIA5String(byte abyte0[])
    {
        a = abyte0;
    }

    public static DERIA5String a(Object obj)
    {
        if (obj == null || (obj instanceof DERIA5String))
        {
            return (DERIA5String)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static DERIA5String a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.k();
        if (asn1taggedobject instanceof DERIA5String)
        {
            return a(asn1taggedobject);
        } else
        {
            return new DERIA5String(((ASN1OctetString)asn1taggedobject).d());
        }
    }

    private static boolean b(String s)
    {
        for (int k = s.length() - 1; k >= 0; k--)
        {
            if (s.charAt(k) > '\177')
            {
                return false;
            }
        }

        return true;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(22, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERIA5String))
        {
            return false;
        } else
        {
            asn1primitive = (DERIA5String)asn1primitive;
            return Arrays.a(a, ((DERIA5String) (asn1primitive)).a);
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
