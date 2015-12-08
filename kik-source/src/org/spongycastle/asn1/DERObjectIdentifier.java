// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1ObjectIdentifier, ASN1TaggedObject, ASN1OctetString, 
//            OIDTokenizer, ASN1OutputStream, j

public class DERObjectIdentifier extends ASN1Primitive
{

    private static ASN1ObjectIdentifier c[][] = new ASN1ObjectIdentifier[255][];
    String a;
    private byte b[];

    public DERObjectIdentifier(String s)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        super();
        flag = flag1;
        if (s.length() < 3) goto _L2; else goto _L1
_L1:
        if (s.charAt(1) == '.') goto _L4; else goto _L3
_L3:
        flag = flag1;
_L2:
        char c1;
        int k;
        char c2;
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder("string ")).append(s).append(" not an OID").toString());
        } else
        {
            a = s;
            return;
        }
_L4:
        c1 = s.charAt(0);
        flag = flag1;
        if (c1 < '0') goto _L2; else goto _L5
_L5:
        flag = flag1;
        if (c1 > '2') goto _L2; else goto _L6
_L6:
        k = s.length() - 1;
        c1 = '\0';
_L8:
        if (k < 2)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        c2 = s.charAt(k);
        if ('0' > c2 || c2 > '9')
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = '\001';
_L11:
        k--;
        if (true) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (c2 != '.') goto _L2; else goto _L9
_L9:
        flag = flag1;
        if (!c1) goto _L2; else goto _L10
_L10:
        c1 = '\0';
          goto _L11
        flag = c1;
          goto _L2
    }

    DERObjectIdentifier(byte abyte0[])
    {
        BigInteger biginteger;
        StringBuffer stringbuffer;
        int k;
        int i1;
        long l1;
        stringbuffer = new StringBuffer();
        k = 1;
        biginteger = null;
        l1 = 0L;
        i1 = 0;
_L10:
        if (i1 == abyte0.length) goto _L2; else goto _L1
_L1:
        int l = abyte0[i1] & 0xff;
        if (l1 >= 0x80000000000000L) goto _L4; else goto _L3
_L3:
        BigInteger biginteger1;
        long l2;
        l1 = l1 * 128L + (long)(l & 0x7f);
        biginteger1 = biginteger;
        l2 = l1;
        if ((l & 0x80) != 0)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        l = k;
        l2 = l1;
        if (k == 0) goto _L6; else goto _L5
_L5:
        (int)l1 / 40;
        JVM INSTR tableswitch 0 1: default 120
    //                   0 175
    //                   1 186;
           goto _L7 _L8 _L9
_L7:
        stringbuffer.append('2');
        l1 -= 80L;
_L11:
        l = 0;
        l2 = l1;
_L6:
        stringbuffer.append('.');
        stringbuffer.append(l2);
        l1 = 0L;
        k = l;
_L12:
        i1++;
          goto _L10
_L8:
        stringbuffer.append('0');
          goto _L11
_L9:
        stringbuffer.append('1');
        l1 -= 40L;
          goto _L11
_L4:
        biginteger1 = biginteger;
        if (biginteger == null)
        {
            biginteger1 = BigInteger.valueOf(l1);
        }
        biginteger = biginteger1.shiftLeft(7).or(BigInteger.valueOf(l & 0x7f));
        biginteger1 = biginteger;
        l2 = l1;
        if ((l & 0x80) != 0)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        stringbuffer.append('.');
        stringbuffer.append(biginteger);
        l1 = 0L;
        biginteger = null;
          goto _L12
_L2:
        a = stringbuffer.toString();
        return;
        biginteger = biginteger1;
        l1 = l2;
          goto _L12
    }

    public static ASN1ObjectIdentifier a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier))
        {
            return (ASN1ObjectIdentifier)obj;
        }
        if (obj instanceof DERObjectIdentifier)
        {
            return new ASN1ObjectIdentifier(((DERObjectIdentifier)obj).a);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1ObjectIdentifier a(ASN1TaggedObject asn1taggedobject)
    {
        ASN1Primitive asn1primitive = asn1taggedobject.k();
        if (asn1primitive instanceof DERObjectIdentifier)
        {
            return a(asn1primitive);
        } else
        {
            return ASN1ObjectIdentifier.b(ASN1OctetString.a(asn1taggedobject.k()).d());
        }
    }

    private void a(ByteArrayOutputStream bytearrayoutputstream)
    {
        OIDTokenizer oidtokenizer = new OIDTokenizer(a);
        a(bytearrayoutputstream, Integer.parseInt(oidtokenizer.b()) * 40 + Integer.parseInt(oidtokenizer.b()));
        while (oidtokenizer.a()) 
        {
            String s = oidtokenizer.b();
            if (s.length() < 18)
            {
                a(bytearrayoutputstream, Long.parseLong(s));
            } else
            {
                a(bytearrayoutputstream, new BigInteger(s));
            }
        }
    }

    private static void a(ByteArrayOutputStream bytearrayoutputstream, long l)
    {
        int k = 8;
        byte abyte0[] = new byte[9];
        for (abyte0[8] = (byte)((int)l & 0x7f); l >= 128L; abyte0[k] = (byte)((int)l & 0x7f | 0x80))
        {
            l >>= 7;
            k--;
        }

        bytearrayoutputstream.write(abyte0, k, 9 - k);
    }

    private static void a(ByteArrayOutputStream bytearrayoutputstream, BigInteger biginteger)
    {
        int i1 = (biginteger.bitLength() + 6) / 7;
        if (i1 == 0)
        {
            bytearrayoutputstream.write(0);
            return;
        }
        byte abyte0[] = new byte[i1];
        for (int k = i1 - 1; k >= 0; k--)
        {
            abyte0[k] = (byte)(biginteger.intValue() & 0x7f | 0x80);
            biginteger = biginteger.shiftRight(7);
        }

        int l = i1 - 1;
        abyte0[l] = (byte)(abyte0[l] & 0x7f);
        bytearrayoutputstream.write(abyte0, 0, i1);
    }

    static ASN1ObjectIdentifier b(byte abyte0[])
    {
        if (abyte0.length < 3)
        {
            return new ASN1ObjectIdentifier(abyte0);
        }
        int l = abyte0[abyte0.length - 2] & 0xff;
        Object obj = c[l];
        ASN1ObjectIdentifier aasn1objectidentifier[] = ((ASN1ObjectIdentifier []) (obj));
        if (obj == null)
        {
            obj = c;
            aasn1objectidentifier = new ASN1ObjectIdentifier[255];
            obj[l] = aasn1objectidentifier;
        }
        int k = abyte0[abyte0.length - 1] & 0xff;
        obj = aasn1objectidentifier[k];
        if (obj == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[k] = abyte0;
            return abyte0;
        }
        if (Arrays.a(abyte0, ((ASN1ObjectIdentifier) (obj)).d()))
        {
            return ((ASN1ObjectIdentifier) (obj));
        }
        l = (l + 1) % 256;
        obj = c[l];
        aasn1objectidentifier = ((ASN1ObjectIdentifier []) (obj));
        if (obj == null)
        {
            ASN1ObjectIdentifier aasn1objectidentifier1[][] = c;
            aasn1objectidentifier = new ASN1ObjectIdentifier[255];
            aasn1objectidentifier1[l] = aasn1objectidentifier;
        }
        aasn1objectidentifier1 = aasn1objectidentifier[k];
        if (aasn1objectidentifier1 == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[k] = abyte0;
            return abyte0;
        }
        if (Arrays.a(abyte0, aasn1objectidentifier1.d()))
        {
            return aasn1objectidentifier1;
        }
        k = (k + 1) % 256;
        aasn1objectidentifier1 = aasn1objectidentifier[k];
        if (aasn1objectidentifier1 == null)
        {
            abyte0 = new ASN1ObjectIdentifier(abyte0);
            aasn1objectidentifier[k] = abyte0;
            return abyte0;
        }
        if (Arrays.a(abyte0, aasn1objectidentifier1.d()))
        {
            return aasn1objectidentifier1;
        } else
        {
            return new ASN1ObjectIdentifier(abyte0);
        }
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        byte abyte0[] = d();
        asn1outputstream.b(6);
        asn1outputstream.a(abyte0.length);
        asn1outputstream.a(abyte0);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERObjectIdentifier))
        {
            return false;
        } else
        {
            return a.equals(((DERObjectIdentifier)asn1primitive).a);
        }
    }

    public final String c()
    {
        return a;
    }

    protected final byte[] d()
    {
        if (b == null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            a(bytearrayoutputstream);
            b = bytearrayoutputstream.toByteArray();
        }
        return b;
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    final int i()
    {
        int k = d().length;
        return k + (j.a(k) + 1);
    }

    public String toString()
    {
        return a;
    }

}
