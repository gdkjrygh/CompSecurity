// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.spongycastle.util.io.Streams;

// Referenced classes of package org.spongycastle.asn1:
//            BERTags, j, ASN1EncodableVector, e, 
//            DERApplicationSpecific, ASN1StreamParser, ASN1OctetString, BEROctetString, 
//            h, d, DERExternal, DERBitString, 
//            DERBMPString, ASN1Boolean, ASN1Enumerated, ASN1GeneralizedTime, 
//            DERGeneralString, DERIA5String, ASN1Integer, DERNull, 
//            DERNumericString, ASN1ObjectIdentifier, DEROctetString, DERPrintableString, 
//            DERT61String, DERUniversalString, ASN1UTCTime, DERUTF8String, 
//            DERVisibleString, f, BERApplicationSpecificParser, BERTaggedObjectParser, 
//            BEROctetStringParser, BERSequenceParser, BERSetParser, DERExternalParser, 
//            ASN1Exception, ASN1Primitive

public class ASN1InputStream extends FilterInputStream
    implements BERTags
{

    private final int a;
    private final boolean b;
    private final byte c[][];

    public ASN1InputStream(InputStream inputstream)
    {
        this(inputstream, j.a(inputstream));
    }

    public ASN1InputStream(InputStream inputstream, byte byte0)
    {
        this(inputstream, j.a(inputstream), true);
    }

    private ASN1InputStream(InputStream inputstream, int i)
    {
        this(inputstream, i, false);
    }

    private ASN1InputStream(InputStream inputstream, int i, boolean flag)
    {
        super(inputstream);
        a = i;
        b = flag;
        c = new byte[11][];
    }

    public ASN1InputStream(byte abyte0[])
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length);
    }

    public ASN1InputStream(byte abyte0[], byte byte0)
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length, true);
    }

    static int a(InputStream inputstream, int i)
    {
        int k = i & 0x1f;
        i = k;
        if (k == 31)
        {
            int l = 0;
            int i1 = inputstream.read();
            i = i1;
            if ((i1 & 0x7f) == 0)
            {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            for (; i >= 0 && (i & 0x80) != 0; i = inputstream.read())
            {
                l = (i & 0x7f | l) << 7;
            }

            if (i < 0)
            {
                throw new EOFException("EOF found inside tag value.");
            }
            i = i & 0x7f | l;
        }
        return i;
    }

    private static ASN1EncodableVector a(e e1)
    {
        e1 = new ASN1InputStream(e1);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        do
        {
            ASN1Primitive asn1primitive = e1.b();
            if (asn1primitive != null)
            {
                asn1encodablevector.a(asn1primitive);
            } else
            {
                return asn1encodablevector;
            }
        } while (true);
    }

    private ASN1Primitive a(int i, int k, int l)
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
        obj = new e(this, l);
        if ((i & 0x40) != 0)
        {
            return new DERApplicationSpecific(flag1, k, ((e) (obj)).b());
        }
        if ((i & 0x80) != 0)
        {
            return (new ASN1StreamParser(((InputStream) (obj)))).a(flag1, k);
        }
        if (flag1)
        {
            switch (k)
            {
            default:
                throw new IOException((new StringBuilder("unknown tag ")).append(k).append(" encountered").toString());

            case 4: // '\004'
                obj = a(((e) (obj)));
                ASN1OctetString aasn1octetstring[] = new ASN1OctetString[((ASN1EncodableVector) (obj)).a.size()];
                for (i = ((flag) ? 1 : 0); i != aasn1octetstring.length; i++)
                {
                    aasn1octetstring[i] = (ASN1OctetString)((ASN1EncodableVector) (obj)).a(i);
                }

                return new BEROctetString(aasn1octetstring);

            case 16: // '\020'
                if (b)
                {
                    return new h(((e) (obj)).b());
                } else
                {
                    return d.a(a(((e) (obj))));
                }

            case 17: // '\021'
                return d.b(a(((e) (obj))));

            case 8: // '\b'
                return new DERExternal(a(((e) (obj))));
            }
        } else
        {
            return a(k, ((e) (obj)), c);
        }
    }

    static ASN1Primitive a(int i, e e1, byte abyte0[][])
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
            throw new IOException((new StringBuilder("unknown tag ")).append(i).append(" encountered").toString());

        case 3: // '\003'
            return DERBitString.a(e1.a(), e1);

        case 30: // '\036'
            return new DERBMPString(b(e1));

        case 1: // '\001'
            return ASN1Boolean.b(a(e1, abyte0));

        case 10: // '\n'
            return ASN1Enumerated.b(a(e1, abyte0));

        case 24: // '\030'
            return new ASN1GeneralizedTime(e1.b());

        case 27: // '\033'
            return new DERGeneralString(e1.b());

        case 22: // '\026'
            return new DERIA5String(e1.b());

        case 2: // '\002'
            return new ASN1Integer(e1.b());

        case 5: // '\005'
            return DERNull.a;

        case 18: // '\022'
            return new DERNumericString(e1.b());

        case 6: // '\006'
            return ASN1ObjectIdentifier.b(a(e1, abyte0));

        case 4: // '\004'
            return new DEROctetString(e1.b());

        case 19: // '\023'
            return new DERPrintableString(e1.b());

        case 20: // '\024'
            return new DERT61String(e1.b());

        case 28: // '\034'
            return new DERUniversalString(e1.b());

        case 23: // '\027'
            return new ASN1UTCTime(e1.b());

        case 12: // '\f'
            return new DERUTF8String(e1.b());

        case 26: // '\032'
            return new DERVisibleString(e1.b());
        }
    }

    private static byte[] a(e e1, byte abyte0[][])
    {
        int i = e1.a();
        if (e1.a() < abyte0.length)
        {
            byte abyte2[] = abyte0[i];
            byte abyte1[] = abyte2;
            if (abyte2 == null)
            {
                abyte1 = new byte[i];
                abyte0[i] = abyte1;
            }
            Streams.a(e1, abyte1);
            return abyte1;
        } else
        {
            return e1.b();
        }
    }

    static int b(InputStream inputstream, int i)
    {
        int k = 0;
        int i1 = inputstream.read();
        if (i1 < 0)
        {
            throw new EOFException("EOF found when length expected");
        }
        int l;
        if (i1 == 128)
        {
            l = -1;
        } else
        {
            l = i1;
            if (i1 > 127)
            {
                int j1 = i1 & 0x7f;
                if (j1 > 4)
                {
                    throw new IOException((new StringBuilder("DER length more than 4 bytes: ")).append(j1).toString());
                }
                i1 = 0;
                l = k;
                for (k = i1; l < j1; k = i1 + (k << 8))
                {
                    i1 = inputstream.read();
                    if (i1 < 0)
                    {
                        throw new EOFException("EOF found reading length");
                    }
                    l++;
                }

                if (k < 0)
                {
                    throw new IOException("corrupted stream - negative length found");
                }
                l = k;
                if (k >= i)
                {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            }
        }
        return l;
    }

    private static char[] b(e e1)
    {
        int k = e1.a() / 2;
        char ac[] = new char[k];
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            int l = e1.read();
            if (l < 0)
            {
                break;
            }
            int i1 = e1.read();
            if (i1 < 0)
            {
                break;
            }
            ac[i] = (char)(l << 8 | i1 & 0xff);
            i++;
        } while (true);
        return ac;
    }

    private int c()
    {
        return b(this, a);
    }

    final int a()
    {
        return a;
    }

    public final ASN1Primitive b()
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
        int k = a(this, i);
        boolean flag;
        int l;
        if ((i & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = c();
        if (l < 0)
        {
            if (!flag)
            {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            ASN1StreamParser asn1streamparser = new ASN1StreamParser(new f(this, a), a);
            if ((i & 0x40) != 0)
            {
                return (new BERApplicationSpecificParser(k, asn1streamparser)).e();
            }
            if ((i & 0x80) != 0)
            {
                return (new BERTaggedObjectParser(true, k, asn1streamparser)).e();
            }
            switch (k)
            {
            default:
                throw new IOException("unknown BER object encountered");

            case 4: // '\004'
                return (new BEROctetStringParser(asn1streamparser)).e();

            case 16: // '\020'
                return (new BERSequenceParser(asn1streamparser)).e();

            case 17: // '\021'
                return (new BERSetParser(asn1streamparser)).e();

            case 8: // '\b'
                return (new DERExternalParser(asn1streamparser)).e();
            }
        }
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = a(i, k, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1Exception("corrupted stream detected", illegalargumentexception);
        }
        return asn1primitive;
    }
}
