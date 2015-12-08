// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DEROutputStream, DERObject

public class DERUTCTime extends ASN1Object
{

    String a;

    DERUTCTime(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        a = new String(ac);
    }

    final void a(DEROutputStream deroutputstream)
    {
        char ac[] = a.toCharArray();
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != ac.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        deroutputstream.a(23, abyte0);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERUTCTime))
        {
            return false;
        } else
        {
            return a.equals(((DERUTCTime)derobject).a);
        }
    }

    public final String e()
    {
        if (a.indexOf('-') < 0 && a.indexOf('+') < 0)
        {
            if (a.length() == 11)
            {
                return (new StringBuilder()).append(a.substring(0, 10)).append("00GMT+00:00").toString();
            } else
            {
                return (new StringBuilder()).append(a.substring(0, 12)).append("GMT+00:00").toString();
            }
        }
        int j = a.indexOf('-');
        int i = j;
        if (j < 0)
        {
            i = a.indexOf('+');
        }
        String s1 = a;
        String s = s1;
        if (i == a.length() - 3)
        {
            s = (new StringBuilder()).append(s1).append("00").toString();
        }
        if (i == 10)
        {
            return (new StringBuilder()).append(s.substring(0, 10)).append("00GMT").append(s.substring(10, 13)).append(":").append(s.substring(13, 15)).toString();
        } else
        {
            return (new StringBuilder()).append(s.substring(0, 12)).append("GMT").append(s.substring(12, 15)).append(":").append(s.substring(15, 17)).toString();
        }
    }

    public final String f()
    {
        String s = e();
        if (s.charAt(0) < '5')
        {
            return (new StringBuilder("20")).append(s).toString();
        } else
        {
            return (new StringBuilder("19")).append(s).toString();
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a;
    }
}
