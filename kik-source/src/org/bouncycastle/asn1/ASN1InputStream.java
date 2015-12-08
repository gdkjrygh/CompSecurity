// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DERTags, g, ASN1EncodableVector, DERUnknownTag, 
//            DERBitString, DERBMPString, ASN1Boolean, ASN1Enumerated, 
//            ASN1GeneralizedTime, DERGeneralString, DERIA5String, ASN1Integer, 
//            DERNull, DERNumericString, ASN1ObjectIdentifier, DEROctetString, 
//            DERPrintableString, DERT61String, DERUniversalString, ASN1UTCTime, 
//            DERUTF8String, DERVisibleString, ASN1StreamParser, e, 
//            BERApplicationSpecificParser, BERTaggedObjectParser, BEROctetStringParser, BERSequenceParser, 
//            BERSetParser, DERExternalParser, d, DERApplicationSpecific, 
//            ASN1Exception, BERConstructedOctetString, LazyDERSequence, c, 
//            DERExternal, DERObject

public class ASN1InputStream extends FilterInputStream
    implements DERTags
{

    private final int a;
    private final boolean b;

    public ASN1InputStream(InputStream inputstream)
    {
        this(inputstream, a(inputstream));
    }

    public ASN1InputStream(InputStream inputstream, int i)
    {
        this(inputstream, i, false);
    }

    public ASN1InputStream(InputStream inputstream, int i, boolean flag)
    {
        super(inputstream);
        a = i;
        b = flag;
    }

    public ASN1InputStream(byte abyte0[])
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length);
    }

    public ASN1InputStream(byte abyte0[], byte byte0)
    {
        this(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length, true);
    }

    static int a(InputStream inputstream)
    {
        if (inputstream instanceof g)
        {
            return ((g)inputstream).a();
        }
        if (inputstream instanceof ByteArrayInputStream)
        {
            return ((ByteArrayInputStream)inputstream).available();
        } else
        {
            return 0x7fffffff;
        }
    }

    static int a(InputStream inputstream, int i)
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

    private static ASN1EncodableVector a(d d1)
    {
        d1 = new ASN1InputStream(d1);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        do
        {
            DERObject derobject = d1.a();
            if (derobject != null)
            {
                asn1encodablevector.a(derobject);
            } else
            {
                return asn1encodablevector;
            }
        } while (true);
    }

    static DERObject a(int i, byte abyte0[])
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
            return new DERUnknownTag(false, i, abyte0);

        case 3: // '\003'
            return DERBitString.b(abyte0);

        case 30: // '\036'
            return new DERBMPString(abyte0);

        case 1: // '\001'
            return new ASN1Boolean(abyte0);

        case 10: // '\n'
            return new ASN1Enumerated(abyte0);

        case 24: // '\030'
            return new ASN1GeneralizedTime(abyte0);

        case 27: // '\033'
            return new DERGeneralString(abyte0);

        case 22: // '\026'
            return new DERIA5String(abyte0);

        case 2: // '\002'
            return new ASN1Integer(abyte0);

        case 5: // '\005'
            return DERNull.b;

        case 18: // '\022'
            return new DERNumericString(abyte0);

        case 6: // '\006'
            return new ASN1ObjectIdentifier(abyte0);

        case 4: // '\004'
            return new DEROctetString(abyte0);

        case 19: // '\023'
            return new DERPrintableString(abyte0);

        case 20: // '\024'
            return new DERT61String(abyte0);

        case 28: // '\034'
            return new DERUniversalString(abyte0);

        case 23: // '\027'
            return new ASN1UTCTime(abyte0);

        case 12: // '\f'
            return new DERUTF8String(abyte0);

        case 26: // '\032'
            return new DERVisibleString(abyte0);
        }
    }

    private int b()
    {
        return b(((InputStream) (this)), a);
    }

    static int b(InputStream inputstream, int i)
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
                    throw new IOException((new StringBuilder("DER length more than 4 bytes: ")).append(i1).toString());
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

    public final DERObject a()
    {
        Object obj;
        int i;
        int j;
        boolean flag1;
        flag1 = true;
        i = read();
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
        j = a(((InputStream) (this)), i);
        boolean flag;
        int k;
        if ((i & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = b();
        if (k < 0)
        {
            if (!flag)
            {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            ASN1StreamParser asn1streamparser = new ASN1StreamParser(new e(this, a), a);
            if ((i & 0x40) != 0)
            {
                return (new BERApplicationSpecificParser(j, asn1streamparser)).g();
            }
            if ((i & 0x80) != 0)
            {
                return (new BERTaggedObjectParser(true, j, asn1streamparser)).g();
            }
            switch (j)
            {
            default:
                throw new IOException("unknown BER object encountered");

            case 4: // '\004'
                return (new BEROctetStringParser(asn1streamparser)).g();

            case 16: // '\020'
                return (new BERSequenceParser(asn1streamparser)).g();

            case 17: // '\021'
                return (new BERSetParser(asn1streamparser)).g();

            case 8: // '\b'
                return (new DERExternalParser(asn1streamparser)).g();
            }
        }
        if ((i & 0x20) == 0)
        {
            flag1 = false;
        }
        try
        {
            obj = new d(this, k);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ASN1Exception("corrupted stream detected", ((Throwable) (obj)));
        }
        if ((i & 0x40) == 0)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        obj = new DERApplicationSpecific(flag1, j, ((d) (obj)).b());
        return ((DERObject) (obj));
        if ((i & 0x80) == 0) goto _L2; else goto _L1
_L1:
        return (new ASN1StreamParser(((InputStream) (obj)))).a(flag1, j);
_L11:
        return new DERUnknownTag(true, j, ((d) (obj)).b());
_L6:
        return new BERConstructedOctetString(a(((d) (obj))).a);
_L8:
        if (b)
        {
            return new LazyDERSequence(((d) (obj)).b());
        } else
        {
            return c.a(a(((d) (obj))));
        }
_L9:
        return c.b(a(((d) (obj))));
_L7:
        return new DERExternal(a(((d) (obj))));
_L4:
        obj = a(j, ((d) (obj)).b());
        return ((DERObject) (obj));
_L2:
        if (!flag1) goto _L4; else goto _L3
_L3:
        j;
        JVM INSTR lookupswitch 4: default 468
    //                   4: 346
    //                   8: 396
    //                   16: 361
    //                   17: 388;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        if (true) goto _L11; else goto _L10
_L10:
    }
}
