// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            BERTags, StreamUtil, DefiniteLengthInputStream, DERBitString, 
//            DERBMPString, ASN1Boolean, ASN1Enumerated, ASN1GeneralizedTime, 
//            DERGeneralString, DERIA5String, ASN1Integer, DERNull, 
//            DERNumericString, ASN1ObjectIdentifier, DEROctetString, DERPrintableString, 
//            DERT61String, DERUniversalString, ASN1UTCTime, DERUTF8String, 
//            DERVisibleString, ASN1EncodableVector, DERApplicationSpecific, ASN1StreamParser, 
//            ASN1OctetString, BEROctetString, LazyEncodedSequence, DERFactory, 
//            DERExternal, IndefiniteLengthInputStream, BERApplicationSpecificParser, BERTaggedObjectParser, 
//            BEROctetStringParser, BERSequenceParser, BERSetParser, DERExternalParser, 
//            ASN1Exception, ASN1Primitive

public class ASN1InputStream extends FilterInputStream
    implements BERTags
{

    private final boolean lazyEvaluate;
    private final int limit;
    private final byte tmpBuffers[][];

    public ASN1InputStream(InputStream inputstream)
    {
        this(inputstream, StreamUtil.findLimit(inputstream));
    }

    public ASN1InputStream(InputStream inputstream, int i)
    {
        this(inputstream, i, false);
    }

    public ASN1InputStream(InputStream inputstream, int i, boolean flag)
    {
        super(inputstream);
        limit = i;
        lazyEvaluate = flag;
        tmpBuffers = new byte[11][];
    }

    public ASN1InputStream(InputStream inputstream, boolean flag)
    {
        this(inputstream, StreamUtil.findLimit(inputstream), flag);
    }

    public ASN1InputStream(byte abyte0[])
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length);
    }

    public ASN1InputStream(byte abyte0[], boolean flag)
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length, flag);
    }

    static ASN1Primitive createPrimitiveDERObject(int i, DefiniteLengthInputStream definitelengthinputstream, byte abyte0[][])
        throws IOException
    {
        switch (i)
        {
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 11: // '\013'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 21: // '\025'
        case 25: // '\031'
        case 29: // '\035'
        default:
            throw new IOException((new StringBuilder()).append("unknown tag ").append(i).append(" encountered").toString());

        case 3: // '\003'
            return DERBitString.fromInputStream(definitelengthinputstream.getRemaining(), definitelengthinputstream);

        case 30: // '\036'
            return new DERBMPString(getBMPCharBuffer(definitelengthinputstream));

        case 1: // '\001'
            return ASN1Boolean.fromOctetString(getBuffer(definitelengthinputstream, abyte0));

        case 10: // '\n'
            return ASN1Enumerated.fromOctetString(getBuffer(definitelengthinputstream, abyte0));

        case 24: // '\030'
            return new ASN1GeneralizedTime(definitelengthinputstream.toByteArray());

        case 27: // '\033'
            return new DERGeneralString(definitelengthinputstream.toByteArray());

        case 22: // '\026'
            return new DERIA5String(definitelengthinputstream.toByteArray());

        case 2: // '\002'
            return new ASN1Integer(definitelengthinputstream.toByteArray());

        case 5: // '\005'
            return DERNull.INSTANCE;

        case 18: // '\022'
            return new DERNumericString(definitelengthinputstream.toByteArray());

        case 6: // '\006'
            return ASN1ObjectIdentifier.fromOctetString(getBuffer(definitelengthinputstream, abyte0));

        case 4: // '\004'
            return new DEROctetString(definitelengthinputstream.toByteArray());

        case 19: // '\023'
            return new DERPrintableString(definitelengthinputstream.toByteArray());

        case 20: // '\024'
            return new DERT61String(definitelengthinputstream.toByteArray());

        case 28: // '\034'
            return new DERUniversalString(definitelengthinputstream.toByteArray());

        case 23: // '\027'
            return new ASN1UTCTime(definitelengthinputstream.toByteArray());

        case 12: // '\f'
            return new DERUTF8String(definitelengthinputstream.toByteArray());

        case 26: // '\032'
            return new DERVisibleString(definitelengthinputstream.toByteArray());
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definitelengthinputstream)
        throws IOException
    {
        char ac[];
        int i;
        int j;
        j = definitelengthinputstream.getRemaining() / 2;
        ac = new char[j];
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k = definitelengthinputstream.read();
        if (k >= 0) goto _L3; else goto _L2
_L2:
        int l;
        return ac;
_L3:
        if ((l = definitelengthinputstream.read()) < 0) goto _L2; else goto _L4
_L4:
        ac[i] = (char)(k << 8 | l & 0xff);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definitelengthinputstream, byte abyte0[][])
        throws IOException
    {
        int i = definitelengthinputstream.getRemaining();
        if (definitelengthinputstream.getRemaining() < abyte0.length)
        {
            byte abyte2[] = abyte0[i];
            byte abyte1[] = abyte2;
            if (abyte2 == null)
            {
                abyte1 = new byte[i];
                abyte0[i] = abyte1;
            }
            Streams.readFully(definitelengthinputstream, abyte1);
            return abyte1;
        } else
        {
            return definitelengthinputstream.toByteArray();
        }
    }

    static int readLength(InputStream inputstream, int i)
        throws IOException
    {
        int j = 0;
        int l = inputstream.read();
        if (l < 0)
        {
            throw new EOFException("EOF found when length expected");
        }
        int k;
        if (l == 128)
        {
            k = -1;
        } else
        {
            k = l;
            if (l > 127)
            {
                int i1 = l & 0x7f;
                if (i1 > 4)
                {
                    throw new IOException((new StringBuilder()).append("DER length more than 4 bytes: ").append(i1).toString());
                }
                l = 0;
                k = j;
                for (j = l; k < i1; j = l + (j << 8))
                {
                    l = inputstream.read();
                    if (l < 0)
                    {
                        throw new EOFException("EOF found reading length");
                    }
                    k++;
                }

                if (j < 0)
                {
                    throw new IOException("corrupted stream - negative length found");
                }
                k = j;
                if (j >= i)
                {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            }
        }
        return k;
    }

    static int readTagNumber(InputStream inputstream, int i)
        throws IOException
    {
        int j = i & 0x1f;
        i = j;
        if (j == 31)
        {
            int k = 0;
            int l = inputstream.read();
            i = l;
            if ((l & 0x7f) == 0)
            {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            for (; i >= 0 && (i & 0x80) != 0; i = inputstream.read())
            {
                k = (i & 0x7f | k) << 7;
            }

            if (i < 0)
            {
                throw new EOFException("EOF found inside tag value.");
            }
            i = i & 0x7f | k;
        }
        return i;
    }

    ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream definitelengthinputstream)
        throws IOException
    {
        return (new ASN1InputStream(definitelengthinputstream)).buildEncodableVector();
    }

    ASN1EncodableVector buildEncodableVector()
        throws IOException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        do
        {
            ASN1Primitive asn1primitive = readObject();
            if (asn1primitive != null)
            {
                asn1encodablevector.add(asn1primitive);
            } else
            {
                return asn1encodablevector;
            }
        } while (true);
    }

    protected ASN1Primitive buildObject(int i, int j, int k)
        throws IOException
    {
        boolean flag = false;
        Object obj;
        boolean flag1;
        if ((i & 0x20) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = new DefiniteLengthInputStream(this, k);
        if ((i & 0x40) != 0)
        {
            return new DERApplicationSpecific(flag1, j, ((DefiniteLengthInputStream) (obj)).toByteArray());
        }
        if ((i & 0x80) != 0)
        {
            return (new ASN1StreamParser(((InputStream) (obj)))).readTaggedObject(flag1, j);
        }
        if (flag1)
        {
            switch (j)
            {
            default:
                throw new IOException((new StringBuilder()).append("unknown tag ").append(j).append(" encountered").toString());

            case 4: // '\004'
                obj = buildDEREncodableVector(((DefiniteLengthInputStream) (obj)));
                ASN1OctetString aasn1octetstring[] = new ASN1OctetString[((ASN1EncodableVector) (obj)).size()];
                for (i = ((flag) ? 1 : 0); i != aasn1octetstring.length; i++)
                {
                    aasn1octetstring[i] = (ASN1OctetString)((ASN1EncodableVector) (obj)).get(i);
                }

                return new BEROctetString(aasn1octetstring);

            case 16: // '\020'
                if (lazyEvaluate)
                {
                    return new LazyEncodedSequence(((DefiniteLengthInputStream) (obj)).toByteArray());
                } else
                {
                    return DERFactory.createSequence(buildDEREncodableVector(((DefiniteLengthInputStream) (obj))));
                }

            case 17: // '\021'
                return DERFactory.createSet(buildDEREncodableVector(((DefiniteLengthInputStream) (obj))));

            case 8: // '\b'
                return new DERExternal(buildDEREncodableVector(((DefiniteLengthInputStream) (obj))));
            }
        } else
        {
            return createPrimitiveDERObject(j, ((DefiniteLengthInputStream) (obj)), tmpBuffers);
        }
    }

    int getLimit()
    {
        return limit;
    }

    protected void readFully(byte abyte0[])
        throws IOException
    {
        if (Streams.readFully(this, abyte0) != abyte0.length)
        {
            throw new EOFException("EOF encountered in middle of object");
        } else
        {
            return;
        }
    }

    protected int readLength()
        throws IOException
    {
        return readLength(((InputStream) (this)), limit);
    }

    public ASN1Primitive readObject()
        throws IOException
    {
        int i = read();
        if (i <= 0)
        {
            if (i == 0)
            {
                throw new IOException("unexpected end-of-contents marker");
            } else
            {
                return null;
            }
        }
        int j = readTagNumber(this, i);
        boolean flag;
        int k;
        if ((i & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = readLength();
        if (k < 0)
        {
            if (!flag)
            {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            ASN1StreamParser asn1streamparser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, limit), limit);
            if ((i & 0x40) != 0)
            {
                return (new BERApplicationSpecificParser(j, asn1streamparser)).getLoadedObject();
            }
            if ((i & 0x80) != 0)
            {
                return (new BERTaggedObjectParser(true, j, asn1streamparser)).getLoadedObject();
            }
            switch (j)
            {
            default:
                throw new IOException("unknown BER object encountered");

            case 4: // '\004'
                return (new BEROctetStringParser(asn1streamparser)).getLoadedObject();

            case 16: // '\020'
                return (new BERSequenceParser(asn1streamparser)).getLoadedObject();

            case 17: // '\021'
                return (new BERSetParser(asn1streamparser)).getLoadedObject();

            case 8: // '\b'
                return (new DERExternalParser(asn1streamparser)).getLoadedObject();
            }
        }
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = buildObject(i, j, k);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1Exception("corrupted stream detected", illegalargumentexception);
        }
        return asn1primitive;
    }
}
