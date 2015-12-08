// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            BEROctetString, ASN1Encodable, ASN1Sequence, DEROctetString, 
//            ASN1Primitive

public class BERConstructedOctetString extends BEROctetString
{

    private static final int MAX_LENGTH = 1000;
    private Vector octs;

    public BERConstructedOctetString(Vector vector)
    {
        super(toBytes(vector));
        octs = vector;
    }

    public BERConstructedOctetString(ASN1Encodable asn1encodable)
    {
        this(asn1encodable.toASN1Primitive());
    }

    public BERConstructedOctetString(ASN1Primitive asn1primitive)
    {
        super(toByteArray(asn1primitive));
    }

    public BERConstructedOctetString(byte abyte0[])
    {
        super(abyte0);
    }

    public static BEROctetString fromSequence(ASN1Sequence asn1sequence)
    {
        Vector vector = new Vector();
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements(); vector.addElement(asn1sequence.nextElement())) { }
        return new BERConstructedOctetString(vector);
    }

    private Vector generateOcts()
    {
        Vector vector = new Vector();
        int i = 0;
        while (i < string.length) 
        {
            byte abyte0[];
            int j;
            if (i + 1000 > string.length)
            {
                j = string.length;
            } else
            {
                j = i + 1000;
            }
            abyte0 = new byte[j - i];
            System.arraycopy(string, i, abyte0, 0, abyte0.length);
            vector.addElement(new DEROctetString(abyte0));
            i += 1000;
        }
        return vector;
    }

    private static byte[] toByteArray(ASN1Primitive asn1primitive)
    {
        try
        {
            asn1primitive = asn1primitive.getEncoded();
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Primitive asn1primitive)
        {
            throw new IllegalArgumentException("Unable to encode object");
        }
        return asn1primitive;
    }

    private static byte[] toBytes(Vector vector)
    {
        Object obj = new ByteArrayOutputStream();
        int i = 0;
        while (i != vector.size()) 
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).write(((DEROctetString)vector.elementAt(i)).getOctets());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(vector.elementAt(i).getClass().getName()).append(" found in input should only contain DEROctetString").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Vector vector)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("exception converting octets ").append(vector.toString()).toString());
            }
            i++;
        }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
    }

    public Enumeration getObjects()
    {
        if (octs == null)
        {
            return generateOcts().elements();
        } else
        {
            return octs.elements();
        }
    }

    public byte[] getOctets()
    {
        return string;
    }
}
