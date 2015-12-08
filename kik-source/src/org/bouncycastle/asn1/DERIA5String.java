// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, ASN1TaggedObject, ASN1OctetString, 
//            DEROutputStream, DERObject

public class DERIA5String extends ASN1Object
    implements DERString
{

    String a;

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
            a = s;
            return;
        }
    }

    public DERIA5String(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        a = new String(ac);
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
        asn1taggedobject = asn1taggedobject.i();
        if (asn1taggedobject instanceof DERIA5String)
        {
            return a(asn1taggedobject);
        } else
        {
            return new DERIA5String(((ASN1OctetString)asn1taggedobject).f());
        }
    }

    private static boolean b(String s)
    {
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) > '\177')
            {
                return false;
            }
        }

        return true;
    }

    final void a(DEROutputStream deroutputstream)
    {
        char ac[] = a.toCharArray();
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != ac.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        deroutputstream.a(22, abyte0);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERIA5String))
        {
            return false;
        } else
        {
            derobject = (DERIA5String)derobject;
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
