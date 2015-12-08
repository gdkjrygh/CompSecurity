// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEROutputStream, DERObject

public class DERBMPString extends ASN1Object
    implements DERString
{

    String a;

    public DERBMPString(String s)
    {
        a = s;
    }

    public DERBMPString(byte abyte0[])
    {
        char ac[] = new char[abyte0.length / 2];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i * 2] << 8 | abyte0[i * 2 + 1] & 0xff);
        }

        a = new String(ac);
    }

    final void a(DEROutputStream deroutputstream)
    {
        char ac[] = a.toCharArray();
        byte abyte0[] = new byte[ac.length * 2];
        for (int i = 0; i != ac.length; i++)
        {
            abyte0[i * 2] = (byte)(ac[i] >> 8);
            abyte0[i * 2 + 1] = (byte)ac[i];
        }

        deroutputstream.a(30, abyte0);
    }

    protected final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERBMPString))
        {
            return false;
        } else
        {
            derobject = (DERBMPString)derobject;
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
