// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1OutputStream, j

public class DERUTCTime extends ASN1Primitive
{

    private byte a[];

    DERUTCTime(byte abyte0[])
    {
        a = abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.b(23);
        int l = a.length;
        asn1outputstream.a(l);
        for (int k = 0; k != l; k++)
        {
            asn1outputstream.b(a[k]);
        }

    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTCTime))
        {
            return false;
        } else
        {
            return Arrays.a(a, ((DERUTCTime)asn1primitive).a);
        }
    }

    public final String c()
    {
        String s1 = Strings.b(a);
        if (s1.indexOf('-') < 0 && s1.indexOf('+') < 0)
        {
            if (s1.length() == 11)
            {
                return (new StringBuilder()).append(s1.substring(0, 10)).append("00GMT+00:00").toString();
            } else
            {
                return (new StringBuilder()).append(s1.substring(0, 12)).append("GMT+00:00").toString();
            }
        }
        int l = s1.indexOf('-');
        int k = l;
        if (l < 0)
        {
            k = s1.indexOf('+');
        }
        String s = s1;
        if (k == s1.length() - 3)
        {
            s = (new StringBuilder()).append(s1).append("00").toString();
        }
        if (k == 10)
        {
            return (new StringBuilder()).append(s.substring(0, 10)).append("00GMT").append(s.substring(10, 13)).append(":").append(s.substring(13, 15)).toString();
        } else
        {
            return (new StringBuilder()).append(s.substring(0, 12)).append("GMT").append(s.substring(12, 15)).append(":").append(s.substring(15, 17)).toString();
        }
    }

    public final String d()
    {
        String s = c();
        if (s.charAt(0) < '5')
        {
            return (new StringBuilder("20")).append(s).toString();
        } else
        {
            return (new StringBuilder("19")).append(s).toString();
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
        int k = a.length;
        return k + (j.a(k) + 1);
    }

    public String toString()
    {
        return Strings.b(a);
    }
}
