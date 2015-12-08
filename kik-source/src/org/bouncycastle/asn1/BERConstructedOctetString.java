// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            DEROctetString, ASN1Sequence, ASN1OutputStream, BEROutputStream, 
//            DEROutputStream

public class BERConstructedOctetString extends DEROctetString
{

    private Vector b;

    public BERConstructedOctetString(Vector vector)
    {
        super(a(vector));
        b = vector;
    }

    public BERConstructedOctetString(byte abyte0[])
    {
        super(abyte0);
    }

    public static BERConstructedOctetString a(ASN1Sequence asn1sequence)
    {
        Vector vector = new Vector();
        for (asn1sequence = asn1sequence.e(); asn1sequence.hasMoreElements(); vector.addElement(asn1sequence.nextElement())) { }
        return new BERConstructedOctetString(vector);
    }

    private static byte[] a(Vector vector)
    {
        Object obj = new ByteArrayOutputStream();
        int i = 0;
        while (i != vector.size()) 
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).write(((DEROctetString)vector.elementAt(i)).f());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(vector.elementAt(i).getClass().getName()).append(" found in input should only contain DEROctetString").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Vector vector)
            {
                throw new IllegalArgumentException((new StringBuilder("exception converting octets ")).append(vector.toString()).toString());
            }
            i++;
        }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
    }

    public final void a(DEROutputStream deroutputstream)
    {
        if ((deroutputstream instanceof ASN1OutputStream) || (deroutputstream instanceof BEROutputStream))
        {
            deroutputstream.write(36);
            deroutputstream.write(128);
            for (Enumeration enumeration = h(); enumeration.hasMoreElements(); deroutputstream.a(enumeration.nextElement())) { }
            deroutputstream.write(0);
            deroutputstream.write(0);
            return;
        } else
        {
            super.a(deroutputstream);
            return;
        }
    }

    public final byte[] f()
    {
        return a;
    }

    public final Enumeration h()
    {
        if (b == null)
        {
            Vector vector = new Vector();
            int i = 0;
            while (i < a.length) 
            {
                byte abyte0[];
                int j;
                if (i + 1000 > a.length)
                {
                    j = a.length;
                } else
                {
                    j = i + 1000;
                }
                abyte0 = new byte[j - i];
                System.arraycopy(a, i, abyte0, 0, abyte0.length);
                vector.addElement(new DEROctetString(abyte0));
                i += 1000;
            }
            return vector.elements();
        } else
        {
            return b.elements();
        }
    }
}
