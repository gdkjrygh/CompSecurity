// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEROutputStream, DERObject

public class DERVisibleString extends ASN1Object
    implements DERString
{

    String a;

    public DERVisibleString(byte abyte0[])
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

        deroutputstream.a(26, abyte0);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERVisibleString))
        {
            return false;
        } else
        {
            return n_().equals(((DERVisibleString)derobject).n_());
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
