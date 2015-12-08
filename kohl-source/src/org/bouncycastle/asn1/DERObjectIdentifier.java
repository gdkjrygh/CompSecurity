// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, OIDTokenizer, ASN1ObjectIdentifier, ASN1TaggedObject, 
//            ASN1OctetString, ASN1OutputStream, StreamUtil

public class DERObjectIdentifier extends ASN1Primitive
{

    private static ASN1ObjectIdentifier cache[][] = new ASN1ObjectIdentifier[255][];
    private byte body[];
    String identifier;

    public DERObjectIdentifier(String s)
    {
        if (!isValidIdentifier(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("string ").append(s).append(" not an OID").toString());
        } else
        {
            identifier = s;
            return;
        }
    }

    DERObjectIdentifier(byte abyte0[])
    {
        BigInteger biginteger;
        StringBuffer stringbuffer;
        int i;
        int k;
        long l;
        stringbuffer = new StringBuffer();
        i = 1;
        biginteger = null;
        l = 0L;
        k = 0;
_L10:
        if (k == abyte0.length) goto _L2; else goto _L1
_L1:
        int j = abyte0[k] & 0xff;
        if (l >= 0x80000000000000L) goto _L4; else goto _L3
_L3:
        BigInteger biginteger1;
        long l1;
        l = l * 128L + (long)(j & 0x7f);
        biginteger1 = biginteger;
        l1 = l;
        if ((j & 0x80) != 0)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        j = i;
        l1 = l;
        if (i == 0) goto _L6; else goto _L5
_L5:
        (int)l / 40;
        JVM INSTR tableswitch 0 1: default 120
    //                   0 175
    //                   1 186;
           goto _L7 _L8 _L9
_L7:
        stringbuffer.append('2');
        l -= 80L;
_L11:
        j = 0;
        l1 = l;
_L6:
        stringbuffer.append('.');
        stringbuffer.append(l1);
        l = 0L;
        i = j;
_L12:
        k++;
          goto _L10
_L8:
        stringbuffer.append('0');
          goto _L11
_L9:
        stringbuffer.append('1');
        l -= 40L;
          goto _L11
_L4:
        biginteger1 = biginteger;
        if (biginteger == null)
        {
            biginteger1 = BigInteger.valueOf(l);
        }
        biginteger = biginteger1.shiftLeft(7).or(BigInteger.valueOf(j & 0x7f));
        biginteger1 = biginteger;
        l1 = l;
        if ((j & 0x80) != 0)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        stringbuffer.append('.');
        stringbuffer.append(biginteger);
        l = 0L;
        biginteger = null;
          goto _L12
_L2:
        identifier = stringbuffer.toString();
        return;
        biginteger = biginteger1;
        l = l1;
          goto _L12
    }

    private void doOutput(ByteArrayOutputStream bytearrayoutputstream)
    {
        OIDTokenizer oidtokenizer = new OIDTokenizer(identifier);
        writeField(bytearrayoutputstream, Integer.parseInt(oidtokenizer.nextToken()) * 40 + Integer.parseInt(oidtokenizer.nextToken()));
        while (oidtokenizer.hasMoreTokens()) 
        {
            String s = oidtokenizer.nextToken();
            if (s.length() < 18)
            {
                writeField(bytearrayoutputstream, Long.parseLong(s));
            } else
            {
                writeField(bytearrayoutputstream, new BigInteger(s));
            }
        }
    }

    static ASN1ObjectIdentifier fromOctetString(byte abyte0[])
    {
        if (abyte0.length < 3)
        {
            return new ASN1ObjectIdentifier(abyte0);
        }
        int j = abyte0[abyte0.length - 2] & 0xff;
        Object obj = cache[j];
        ASN1ObjectIdentifier aasn1objectidentifier[] = ((ASN1ObjectIdentifier []) (obj));
        if (obj == null)
        {
            obj = cache;
            aasn1objectidentifier = new ASN1ObjectIdentifier[255];
            obj[j] = aasn1objectidentifier;
        }
        int i = abyte0[abyte0.length - 1] & 0xff;
        obj = aasn1objectidentifier[i];
        if (obj == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[i] = abyte0;
            return abyte0;
        }
        if (Arrays.areEqual(abyte0, ((ASN1ObjectIdentifier) (obj)).getBody()))
        {
            return ((ASN1ObjectIdentifier) (obj));
        }
        j = (j + 1) % 256;
        obj = cache[j];
        aasn1objectidentifier = ((ASN1ObjectIdentifier []) (obj));
        if (obj == null)
        {
            ASN1ObjectIdentifier aasn1objectidentifier1[][] = cache;
            aasn1objectidentifier = new ASN1ObjectIdentifier[255];
            aasn1objectidentifier1[j] = aasn1objectidentifier;
        }
        aasn1objectidentifier1 = aasn1objectidentifier[i];
        if (aasn1objectidentifier1 == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[i] = abyte0;
            return abyte0;
        }
        if (Arrays.areEqual(abyte0, aasn1objectidentifier1.getBody()))
        {
            return aasn1objectidentifier1;
        }
        i = (i + 1) % 256;
        aasn1objectidentifier1 = aasn1objectidentifier[i];
        if (aasn1objectidentifier1 == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[i] = abyte0;
            return abyte0;
        }
        if (Arrays.areEqual(abyte0, aasn1objectidentifier1.getBody()))
        {
            return aasn1objectidentifier1;
        } else
        {
            return new ASN1ObjectIdentifier(abyte0);
        }
    }

    public static ASN1ObjectIdentifier getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier))
        {
            return (ASN1ObjectIdentifier)obj;
        }
        if (obj instanceof DERObjectIdentifier)
        {
            return new ASN1ObjectIdentifier(((DERObjectIdentifier)obj).getId());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        ASN1Primitive asn1primitive = asn1taggedobject.getObject();
        if (flag || (asn1primitive instanceof DERObjectIdentifier))
        {
            return getInstance(asn1primitive);
        } else
        {
            return ASN1ObjectIdentifier.fromOctetString(ASN1OctetString.getInstance(asn1taggedobject.getObject()).getOctets());
        }
    }

    private static boolean isValidIdentifier(String s)
    {
        if (s.length() >= 3 && s.charAt(1) == '.') goto _L2; else goto _L1
_L1:
        int i;
        return false;
_L2:
        if ((i = s.charAt(0)) < '0' || i > '2') goto _L1; else goto _L3
_L3:
        boolean flag;
        i = s.length() - 1;
        flag = false;
_L5:
        char c;
        if (i < 2)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        c = s.charAt(i);
        if ('0' > c || c > '9')
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
_L7:
        i--;
        if (true) goto _L5; else goto _L4
_L4:
        if (c != '.' || !flag) goto _L1; else goto _L6
_L6:
        flag = false;
          goto _L7
        return flag;
    }

    private void writeField(ByteArrayOutputStream bytearrayoutputstream, long l)
    {
        byte abyte0[] = new byte[9];
        int i = 8;
        for (abyte0[8] = (byte)((int)l & 0x7f); l >= 128L; abyte0[i] = (byte)((int)l & 0x7f | 0x80))
        {
            l >>= 7;
            i--;
        }

        bytearrayoutputstream.write(abyte0, i, 9 - i);
    }

    private void writeField(ByteArrayOutputStream bytearrayoutputstream, BigInteger biginteger)
    {
        int k = (biginteger.bitLength() + 6) / 7;
        if (k == 0)
        {
            bytearrayoutputstream.write(0);
            return;
        }
        byte abyte0[] = new byte[k];
        for (int i = k - 1; i >= 0; i--)
        {
            abyte0[i] = (byte)(biginteger.intValue() & 0x7f | 0x80);
            biginteger = biginteger.shiftRight(7);
        }

        int j = k - 1;
        abyte0[j] = (byte)(abyte0[j] & 0x7f);
        bytearrayoutputstream.write(abyte0, 0, abyte0.length);
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERObjectIdentifier))
        {
            return false;
        } else
        {
            return identifier.equals(((DERObjectIdentifier)asn1primitive).identifier);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        byte abyte0[] = getBody();
        asn1outputstream.write(6);
        asn1outputstream.writeLength(abyte0.length);
        asn1outputstream.write(abyte0);
    }

    int encodedLength()
        throws IOException
    {
        int i = getBody().length;
        return i + (StreamUtil.calculateBodyLength(i) + 1);
    }

    protected byte[] getBody()
    {
        if (body == null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            doOutput(bytearrayoutputstream);
            body = bytearrayoutputstream.toByteArray();
        }
        return body;
    }

    public String getId()
    {
        return identifier;
    }

    public int hashCode()
    {
        return identifier.hashCode();
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return getId();
    }

}
