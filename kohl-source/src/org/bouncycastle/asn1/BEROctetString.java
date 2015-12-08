// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetString, ASN1Sequence, DEROctetString, ASN1OutputStream, 
//            ASN1Encodable, ASN1Primitive

public class BEROctetString extends ASN1OctetString
{

    private static final int MAX_LENGTH = 1000;
    private ASN1OctetString octs[];

    public BEROctetString(byte abyte0[])
    {
        super(abyte0);
    }

    public BEROctetString(ASN1OctetString aasn1octetstring[])
    {
        super(toBytes(aasn1octetstring));
        octs = aasn1octetstring;
    }

    static BEROctetString fromSequence(ASN1Sequence asn1sequence)
    {
        ASN1OctetString aasn1octetstring[] = new ASN1OctetString[asn1sequence.size()];
        asn1sequence = asn1sequence.getObjects();
        for (int i = 0; asn1sequence.hasMoreElements(); i++)
        {
            aasn1octetstring[i] = (ASN1OctetString)asn1sequence.nextElement();
        }

        return new BEROctetString(aasn1octetstring);
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

    private static byte[] toBytes(ASN1OctetString aasn1octetstring[])
    {
        Object obj = new ByteArrayOutputStream();
        int i = 0;
        while (i != aasn1octetstring.length) 
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).write(((DEROctetString)aasn1octetstring[i]).getOctets());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(aasn1octetstring[i].getClass().getName()).append(" found in input should only contain DEROctetString").toString());
            }
            // Misplaced declaration of an exception variable
            catch (ASN1OctetString aasn1octetstring[])
            {
                throw new IllegalArgumentException((new StringBuilder()).append("exception converting octets ").append(aasn1octetstring.toString()).toString());
            }
            i++;
        }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
    }

    public void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.write(36);
        asn1outputstream.write(128);
        for (Enumeration enumeration = getObjects(); enumeration.hasMoreElements(); asn1outputstream.writeObject((ASN1Encodable)enumeration.nextElement())) { }
        asn1outputstream.write(0);
        asn1outputstream.write(0);
    }

    int encodedLength()
        throws IOException
    {
        Enumeration enumeration = getObjects();
        int i;
        for (i = 0; enumeration.hasMoreElements(); i = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive().encodedLength() + i) { }
        return i + 2 + 2;
    }

    public Enumeration getObjects()
    {
        if (octs == null)
        {
            return generateOcts().elements();
        } else
        {
            return new Enumeration() {

                int counter;
                final BEROctetString this$0;

                public boolean hasMoreElements()
                {
                    return counter < octs.length;
                }

                public Object nextElement()
                {
                    ASN1OctetString aasn1octetstring[] = octs;
                    int i = counter;
                    counter = i + 1;
                    return aasn1octetstring[i];
                }

            
            {
                this$0 = BEROctetString.this;
                super();
                counter = 0;
            }
            };
        }
    }

    public byte[] getOctets()
    {
        return string;
    }

    boolean isConstructed()
    {
        return true;
    }

}
