// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1EncodableVector, ASN1Encodable, ASN1ParsingException, 
//            DEROutputStream, ASN1InputStream, DERObject

public class DERApplicationSpecific extends ASN1Object
{

    private final boolean a;
    private final int b;
    private final byte c[];

    public DERApplicationSpecific(int i, ASN1EncodableVector asn1encodablevector)
    {
        b = i;
        a = true;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
        while (i != asn1encodablevector.a.size()) 
        {
            try
            {
                bytearrayoutputstream.write(((ASN1Encodable)asn1encodablevector.a(i)).a());
            }
            // Misplaced declaration of an exception variable
            catch (ASN1EncodableVector asn1encodablevector)
            {
                throw new ASN1ParsingException((new StringBuilder("malformed object: ")).append(asn1encodablevector).toString(), asn1encodablevector);
            }
            i++;
        }
        c = bytearrayoutputstream.toByteArray();
    }

    DERApplicationSpecific(boolean flag, int i, byte abyte0[])
    {
        a = flag;
        b = i;
        c = abyte0;
    }

    final void a(DEROutputStream deroutputstream)
    {
        byte byte0 = 64;
        if (a)
        {
            byte0 = 96;
        }
        deroutputstream.a(byte0, b, c);
    }

    final boolean a(DERObject derobject)
    {
        if (derobject instanceof DERApplicationSpecific)
        {
            if (a == ((DERApplicationSpecific) (derobject = (DERApplicationSpecific)derobject)).a && b == ((DERApplicationSpecific) (derobject)).b && Arrays.a(c, ((DERApplicationSpecific) (derobject)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final boolean e()
    {
        return a;
    }

    public final byte[] f()
    {
        return c;
    }

    public final int g()
    {
        return b;
    }

    public final DERObject h()
    {
        byte abyte0[] = a();
        int k;
        if ((abyte0[0] & 0x1f) == 31)
        {
            int i = 2;
            k = abyte0[1] & 0xff;
            int j = k;
            if ((k & 0x7f) == 0)
            {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            do
            {
                k = i;
                if (j < 0)
                {
                    break;
                }
                k = i;
                if ((j & 0x80) == 0)
                {
                    break;
                }
                j = abyte0[i] & 0xff;
                i++;
            } while (true);
        } else
        {
            k = 1;
        }
        byte abyte1[] = new byte[(abyte0.length - k) + 1];
        System.arraycopy(abyte0, k, abyte1, 1, abyte1.length - 1);
        abyte1[0] = 16;
        if ((abyte0[0] & 0x20) != 0)
        {
            abyte1[0] = (byte)(abyte1[0] | 0x20);
        }
        return (new ASN1InputStream(abyte1)).a();
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
        return flag ^ b ^ Arrays.b(c);
    }
}
