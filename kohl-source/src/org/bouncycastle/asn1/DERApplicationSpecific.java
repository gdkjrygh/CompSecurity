// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1EncodableVector, ASN1Object, ASN1ParsingException, 
//            ASN1Encodable, ASN1Set, ASN1Sequence, ASN1OutputStream, 
//            StreamUtil, ASN1InputStream

public class DERApplicationSpecific extends ASN1Primitive
{

    private final boolean isConstructed;
    private final byte octets[];
    private final int tag;

    public DERApplicationSpecific(int i, ASN1Encodable asn1encodable)
        throws IOException
    {
        this(true, i, asn1encodable);
    }

    public DERApplicationSpecific(int i, ASN1EncodableVector asn1encodablevector)
    {
        tag = i;
        isConstructed = true;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
        while (i != asn1encodablevector.size()) 
        {
            try
            {
                bytearrayoutputstream.write(((ASN1Object)asn1encodablevector.get(i)).getEncoded("DER"));
            }
            // Misplaced declaration of an exception variable
            catch (ASN1EncodableVector asn1encodablevector)
            {
                throw new ASN1ParsingException((new StringBuilder()).append("malformed object: ").append(asn1encodablevector).toString(), asn1encodablevector);
            }
            i++;
        }
        octets = bytearrayoutputstream.toByteArray();
    }

    public DERApplicationSpecific(int i, byte abyte0[])
    {
        this(false, i, abyte0);
    }

    public DERApplicationSpecific(boolean flag, int i, ASN1Encodable asn1encodable)
        throws IOException
    {
        ASN1Primitive asn1primitive = asn1encodable.toASN1Primitive();
        asn1encodable = asn1primitive.getEncoded("DER");
        boolean flag1;
        if (flag || (asn1primitive instanceof ASN1Set) || (asn1primitive instanceof ASN1Sequence))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        isConstructed = flag1;
        tag = i;
        if (flag)
        {
            octets = asn1encodable;
            return;
        } else
        {
            i = getLengthOfHeader(asn1encodable);
            byte abyte0[] = new byte[asn1encodable.length - i];
            System.arraycopy(asn1encodable, i, abyte0, 0, abyte0.length);
            octets = abyte0;
            return;
        }
    }

    DERApplicationSpecific(boolean flag, int i, byte abyte0[])
    {
        isConstructed = flag;
        tag = i;
        octets = abyte0;
    }

    public static DERApplicationSpecific getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERApplicationSpecific))
        {
            return (DERApplicationSpecific)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct object from byte[]: ").append(((IOException) (obj)).getMessage()).toString());
            }
            return ((DERApplicationSpecific) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
            if (asn1primitive instanceof ASN1Sequence)
            {
                return (DERApplicationSpecific)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    private int getLengthOfHeader(byte abyte0[])
    {
        int i;
        for (i = abyte0[1] & 0xff; i == 128 || i <= 127;)
        {
            return 2;
        }

        i &= 0x7f;
        if (i > 4)
        {
            throw new IllegalStateException((new StringBuilder()).append("DER length more than 4 bytes: ").append(i).toString());
        } else
        {
            return i + 2;
        }
    }

    private byte[] replaceTagNumber(int i, byte abyte0[])
        throws IOException
    {
        int j;
        if ((abyte0[0] & 0x1f) != 31)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        int k = abyte0[1] & 0xff;
        byte abyte1[];
        int l;
        if ((k & 0x7f) == 0)
        {
            throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
        }
        l = 0;
        j = 2;
        for (; k >= 0 && (k & 0x80) != 0; k &= 0xff)
        {
            l = (k & 0x7f | l) << 7;
            k = abyte0[j];
            j++;
        }

_L2:
        abyte1 = new byte[(abyte0.length - j) + 1];
        System.arraycopy(abyte0, j, abyte1, 1, abyte1.length - 1);
        abyte1[0] = (byte)i;
        return abyte1;
        j = 1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof DERApplicationSpecific)
        {
            if (isConstructed == ((DERApplicationSpecific) (asn1primitive = (DERApplicationSpecific)asn1primitive)).isConstructed && tag == ((DERApplicationSpecific) (asn1primitive)).tag && Arrays.areEqual(octets, ((DERApplicationSpecific) (asn1primitive)).octets))
            {
                return true;
            }
        }
        return false;
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        byte byte0 = 64;
        if (isConstructed)
        {
            byte0 = 96;
        }
        asn1outputstream.writeEncoded(byte0, tag, octets);
    }

    int encodedLength()
        throws IOException
    {
        return StreamUtil.calculateTagLength(tag) + StreamUtil.calculateBodyLength(octets.length) + octets.length;
    }

    public int getApplicationTag()
    {
        return tag;
    }

    public byte[] getContents()
    {
        return octets;
    }

    public ASN1Primitive getObject()
        throws IOException
    {
        return (new ASN1InputStream(getContents())).readObject();
    }

    public ASN1Primitive getObject(int i)
        throws IOException
    {
        if (i >= 31)
        {
            throw new IOException("unsupported tag number");
        }
        byte abyte0[] = getEncoded();
        byte abyte1[] = replaceTagNumber(i, abyte0);
        if ((abyte0[0] & 0x20) != 0)
        {
            abyte1[0] = (byte)(abyte1[0] | 0x20);
        }
        return (new ASN1InputStream(abyte1)).readObject();
    }

    public int hashCode()
    {
        boolean flag;
        if (isConstructed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag ^ tag ^ Arrays.hashCode(octets);
    }

    public boolean isConstructed()
    {
        return isConstructed;
    }
}
