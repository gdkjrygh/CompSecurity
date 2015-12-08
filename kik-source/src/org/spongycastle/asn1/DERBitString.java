// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1Encodable, ASN1TaggedObject, 
//            ASN1OctetString, ASN1OutputStream, j

public class DERBitString extends ASN1Primitive
    implements ASN1String
{

    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    protected byte a[];
    protected int b;

    public DERBitString(ASN1Encodable asn1encodable)
    {
        try
        {
            a = asn1encodable.a().a("DER");
            b = 0;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Encodable asn1encodable)
        {
            throw new IllegalArgumentException((new StringBuilder("Error processing object : ")).append(asn1encodable.toString()).toString());
        }
    }

    public DERBitString(byte abyte0[])
    {
        this(abyte0, 0);
    }

    public DERBitString(byte abyte0[], int k)
    {
        a = abyte0;
        b = k;
    }

    protected static int a(int k)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 3;
_L8:
        int l = ((flag) ? 1 : 0);
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (k >> i1 * 8 == 0) goto _L6; else goto _L5
_L5:
        l = k >> i1 * 8 & 0xff;
_L2:
        if (l == 0)
        {
            return 7;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k & 0xff;
        if (true) goto _L2; else goto _L6
_L6:
        i1--;
        if (true) goto _L8; else goto _L7
_L7:
        k = 1;
        do
        {
            l <<= 1;
            if ((l & 0xff) != 0)
            {
                k++;
            } else
            {
                return 8 - k;
            }
        } while (true);
    }

    static DERBitString a(int k, InputStream inputstream)
    {
        if (k <= 0)
        {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int l = inputstream.read();
        byte abyte0[] = new byte[k - 1];
        if (abyte0.length != 0 && Streams.a(inputstream, abyte0) != abyte0.length)
        {
            throw new EOFException("EOF encountered in middle of BIT STRING");
        } else
        {
            return new DERBitString(abyte0, l);
        }
    }

    public static DERBitString a(Object obj)
    {
        if (obj == null || (obj instanceof DERBitString))
        {
            return (DERBitString)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static DERBitString a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.k();
        if (asn1taggedobject instanceof DERBitString)
        {
            return a(asn1taggedobject);
        }
        asn1taggedobject = ((ASN1OctetString)asn1taggedobject).d();
        if (asn1taggedobject.length <= 0)
        {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte byte0 = asn1taggedobject[0];
        byte abyte0[] = new byte[asn1taggedobject.length - 1];
        if (abyte0.length != 0)
        {
            System.arraycopy(asn1taggedobject, 1, abyte0, 0, asn1taggedobject.length - 1);
        }
        return new DERBitString(abyte0, byte0);
    }

    protected static byte[] b(int k)
    {
        int l = 4;
        for (int i1 = 3; i1 > 0 && (255 << i1 * 8 & k) == 0; i1--)
        {
            l--;
        }

        byte abyte0[] = new byte[l];
        for (int j1 = 0; j1 < l; j1++)
        {
            abyte0[j1] = (byte)(k >> j1 * 8 & 0xff);
        }

        return abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        byte abyte0[] = new byte[a.length + 1];
        abyte0[0] = (byte)b;
        System.arraycopy(a, 0, abyte0, 1, abyte0.length - 1);
        asn1outputstream.a(3, abyte0);
    }

    protected final boolean a(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof DERBitString)
        {
            if (b == ((DERBitString) (asn1primitive = (DERBitString)asn1primitive)).b && Arrays.a(a, ((DERBitString) (asn1primitive)).a))
            {
                return true;
            }
        }
        return false;
    }

    public final byte[] c()
    {
        return a;
    }

    public final int d()
    {
        return b;
    }

    public final int e()
    {
        int k = 0;
        int l = 0;
        for (; k != a.length && k != 4; k++)
        {
            l |= (a[k] & 0xff) << k * 8;
        }

        return l;
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return b ^ Arrays.a(a);
    }

    final int i()
    {
        return j.a(a.length + 1) + 1 + a.length + 1;
    }

    public final String o_()
    {
        Object obj = new StringBuffer("#");
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        byte abyte0[];
        try
        {
            asn1outputstream.a(this);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("internal error encoding BitString");
        }
        abyte0 = bytearrayoutputstream.toByteArray();
        for (int k = 0; k != abyte0.length; k++)
        {
            ((StringBuffer) (obj)).append(c[abyte0[k] >>> 4 & 0xf]);
            ((StringBuffer) (obj)).append(c[abyte0[k] & 0xf]);
        }

        return ((StringBuffer) (obj)).toString();
    }

    public String toString()
    {
        return o_();
    }

}
