// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEREncodable, DERObject, 
//            ASN1TaggedObject, ASN1OctetString, DEROutputStream, ASN1OutputStream

public class DERBitString extends ASN1Object
    implements DERString
{

    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    protected byte a[];
    protected int b;

    public DERBitString(DEREncodable derencodable)
    {
        try
        {
            a = derencodable.c().a("DER");
            b = 0;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DEREncodable derencodable)
        {
            throw new IllegalArgumentException((new StringBuilder("Error processing object : ")).append(derencodable.toString()).toString());
        }
    }

    public DERBitString(byte abyte0[])
    {
        this(abyte0, 0);
    }

    public DERBitString(byte abyte0[], int i)
    {
        a = abyte0;
        b = i;
    }

    protected static int a(int i)
    {
        int k;
        boolean flag;
        flag = false;
        k = 3;
_L8:
        int j = ((flag) ? 1 : 0);
        if (k < 0) goto _L2; else goto _L1
_L1:
        if (k == 0) goto _L4; else goto _L3
_L3:
        if (i >> k * 8 == 0) goto _L6; else goto _L5
_L5:
        j = i >> k * 8 & 0xff;
_L2:
        if (j == 0)
        {
            return 7;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i & 0xff;
        if (true) goto _L2; else goto _L6
_L6:
        k--;
        if (true) goto _L8; else goto _L7
_L7:
        i = 1;
        do
        {
            j <<= 1;
            if ((j & 0xff) != 0)
            {
                i++;
            } else
            {
                return 8 - i;
            }
        } while (true);
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
        asn1taggedobject = asn1taggedobject.i();
        if (asn1taggedobject instanceof DERBitString)
        {
            return a(asn1taggedobject);
        } else
        {
            return b(((ASN1OctetString)asn1taggedobject).f());
        }
    }

    static DERBitString b(byte abyte0[])
    {
        if (abyte0.length <= 0)
        {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte byte0 = abyte0[0];
        byte abyte1[] = new byte[abyte0.length - 1];
        if (abyte1.length != 0)
        {
            System.arraycopy(abyte0, 1, abyte1, 0, abyte0.length - 1);
        }
        return new DERBitString(abyte1, byte0);
    }

    protected static byte[] b(int i)
    {
        int j = 4;
        for (int k = 3; k > 0 && (255 << k * 8 & i) == 0; k--)
        {
            j--;
        }

        byte abyte0[] = new byte[j];
        for (int l = 0; l < j; l++)
        {
            abyte0[l] = (byte)(i >> l * 8 & 0xff);
        }

        return abyte0;
    }

    final void a(DEROutputStream deroutputstream)
    {
        byte abyte0[] = new byte[a.length + 1];
        abyte0[0] = (byte)b;
        System.arraycopy(a, 0, abyte0, 1, abyte0.length - 1);
        deroutputstream.a(3, abyte0);
    }

    protected final boolean a(DERObject derobject)
    {
        if (derobject instanceof DERBitString)
        {
            if (b == ((DERBitString) (derobject = (DERBitString)derobject)).b && Arrays.a(a, ((DERBitString) (derobject)).a))
            {
                return true;
            }
        }
        return false;
    }

    public final byte[] e()
    {
        return a;
    }

    public final int f()
    {
        return b;
    }

    public final int g()
    {
        int i = 0;
        int j = 0;
        for (; i != a.length && i != 4; i++)
        {
            j |= (a[i] & 0xff) << i * 8;
        }

        return j;
    }

    public int hashCode()
    {
        return b ^ Arrays.b(a);
    }

    public final String n_()
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
        for (int i = 0; i != abyte0.length; i++)
        {
            ((StringBuffer) (obj)).append(c[abyte0[i] >>> 4 & 0xf]);
            ((StringBuffer) (obj)).append(c[abyte0[i] & 0xf]);
        }

        return ((StringBuffer) (obj)).toString();
    }

    public String toString()
    {
        return n_();
    }

}
