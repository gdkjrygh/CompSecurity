// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1Encodable, ASN1Set, ASN1Sequence, 
//            ASN1EncodableVector, ASN1Object, ASN1ParsingException, ASN1OutputStream, 
//            ASN1InputStream, j

public class DERApplicationSpecific extends ASN1Primitive
{

    private final boolean a;
    private final int b;
    private final byte c[];

    public DERApplicationSpecific(int k, ASN1Encodable asn1encodable)
    {
        ASN1Primitive asn1primitive = asn1encodable.a();
        asn1encodable = asn1primitive.a("DER");
        boolean flag;
        if ((asn1primitive instanceof ASN1Set) || (asn1primitive instanceof ASN1Sequence))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = k;
        k = asn1encodable[1] & 0xff;
        byte abyte0[];
        if (k != 128 && k > 127)
        {
            k &= 0x7f;
            if (k > 4)
            {
                throw new IllegalStateException((new StringBuilder("DER length more than 4 bytes: ")).append(k).toString());
            }
            k += 2;
        } else
        {
            k = 2;
        }
        abyte0 = new byte[asn1encodable.length - k];
        System.arraycopy(asn1encodable, k, abyte0, 0, abyte0.length);
        c = abyte0;
    }

    public DERApplicationSpecific(int k, ASN1EncodableVector asn1encodablevector)
    {
        b = k;
        a = true;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        k = 0;
        while (k != asn1encodablevector.a.size()) 
        {
            try
            {
                bytearrayoutputstream.write(((ASN1Object)asn1encodablevector.a(k)).a("DER"));
            }
            // Misplaced declaration of an exception variable
            catch (ASN1EncodableVector asn1encodablevector)
            {
                throw new ASN1ParsingException((new StringBuilder("malformed object: ")).append(asn1encodablevector).toString(), asn1encodablevector);
            }
            k++;
        }
        c = bytearrayoutputstream.toByteArray();
    }

    DERApplicationSpecific(boolean flag, int k, byte abyte0[])
    {
        a = flag;
        b = k;
        c = abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        byte byte0 = 64;
        if (a)
        {
            byte0 = 96;
        }
        asn1outputstream.a(byte0, b, c);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof DERApplicationSpecific)
        {
            if (a == ((DERApplicationSpecific) (asn1primitive = (DERApplicationSpecific)asn1primitive)).a && b == ((DERApplicationSpecific) (asn1primitive)).b && Arrays.a(c, ((DERApplicationSpecific) (asn1primitive)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final byte[] c()
    {
        return c;
    }

    public final int d()
    {
        return b;
    }

    public final ASN1Primitive e()
    {
        byte abyte0[] = b();
        int i1;
        if ((abyte0[0] & 0x1f) == 31)
        {
            int k = 2;
            i1 = abyte0[1] & 0xff;
            int l = i1;
            if ((i1 & 0x7f) == 0)
            {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            do
            {
                i1 = k;
                if (l < 0)
                {
                    break;
                }
                i1 = k;
                if ((l & 0x80) == 0)
                {
                    break;
                }
                l = abyte0[k] & 0xff;
                k++;
            } while (true);
        } else
        {
            i1 = 1;
        }
        byte abyte1[] = new byte[(abyte0.length - i1) + 1];
        System.arraycopy(abyte0, i1, abyte1, 1, abyte1.length - 1);
        abyte1[0] = 16;
        if ((abyte0[0] & 0x20) != 0)
        {
            abyte1[0] = (byte)(abyte1[0] | 0x20);
        }
        return (new ASN1InputStream(abyte1)).b();
    }

    public final boolean h()
    {
        return a;
    }

    public int hashCode()
    {
        boolean flag;
        if (a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag ^ b ^ Arrays.a(c);
    }

    final int i()
    {
        return j.b(b) + j.a(c.length) + c.length;
    }
}
