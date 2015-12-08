// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1OctetString, ASN1Sequence, DEROctetString, ASN1OutputStream, 
//            ASN1Encodable, ASN1Primitive, b

public class BEROctetString extends ASN1OctetString
{

    private ASN1OctetString b[];

    public BEROctetString(byte abyte0[])
    {
        super(abyte0);
    }

    public BEROctetString(ASN1OctetString aasn1octetstring[])
    {
        super(a(aasn1octetstring));
        b = aasn1octetstring;
    }

    static BEROctetString a(ASN1Sequence asn1sequence)
    {
        ASN1OctetString aasn1octetstring[] = new ASN1OctetString[asn1sequence.e()];
        asn1sequence = asn1sequence.d();
        for (int k = 0; asn1sequence.hasMoreElements(); k++)
        {
            aasn1octetstring[k] = (ASN1OctetString)asn1sequence.nextElement();
        }

        return new BEROctetString(aasn1octetstring);
    }

    private static byte[] a(ASN1OctetString aasn1octetstring[])
    {
        Object obj = new ByteArrayOutputStream();
        int k = 0;
        while (k != aasn1octetstring.length) 
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).write(((DEROctetString)aasn1octetstring[k]).d());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(aasn1octetstring[k].getClass().getName()).append(" found in input should only contain DEROctetString").toString());
            }
            // Misplaced declaration of an exception variable
            catch (ASN1OctetString aasn1octetstring[])
            {
                throw new IllegalArgumentException((new StringBuilder("exception converting octets ")).append(aasn1octetstring.toString()).toString());
            }
            k++;
        }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
    }

    static ASN1OctetString[] a(BEROctetString beroctetstring)
    {
        return beroctetstring.b;
    }

    public final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.b(36);
        asn1outputstream.b(128);
        for (Enumeration enumeration = j(); enumeration.hasMoreElements(); asn1outputstream.a((ASN1Encodable)enumeration.nextElement())) { }
        asn1outputstream.b(0);
        asn1outputstream.b(0);
    }

    public byte[] d()
    {
        return a;
    }

    final boolean h()
    {
        return true;
    }

    final int i()
    {
        Enumeration enumeration = j();
        int k;
        for (k = 0; enumeration.hasMoreElements(); k = ((ASN1Encodable)enumeration.nextElement()).a().i() + k) { }
        return k + 2 + 2;
    }

    public Enumeration j()
    {
        if (b == null)
        {
            Vector vector = new Vector();
            int k = 0;
            while (k < a.length) 
            {
                byte abyte0[];
                int l;
                if (k + 1000 > a.length)
                {
                    l = a.length;
                } else
                {
                    l = k + 1000;
                }
                abyte0 = new byte[l - k];
                System.arraycopy(a, k, abyte0, 0, abyte0.length);
                vector.addElement(new DEROctetString(abyte0));
                k += 1000;
            }
            return vector.elements();
        } else
        {
            return new b(this);
        }
    }
}
