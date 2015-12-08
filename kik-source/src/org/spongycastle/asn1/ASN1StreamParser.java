// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            j, f, ASN1InputStream, BERApplicationSpecificParser, 
//            BERTaggedObjectParser, ASN1Exception, DERExternalParser, BEROctetStringParser, 
//            BERSequenceParser, BERSetParser, e, DERApplicationSpecific, 
//            DERSequenceParser, DERSetParser, DEROctetStringParser, DERTaggedObject, 
//            DEROctetString, ASN1EncodableVector, BERTaggedObject, a, 
//            d, InMemoryRepresentable, ASN1Encodable, ASN1Primitive

public class ASN1StreamParser
{

    private final InputStream a;
    private final int b;
    private final byte c[][];

    public ASN1StreamParser(InputStream inputstream)
    {
        this(inputstream, j.a(inputstream));
    }

    public ASN1StreamParser(InputStream inputstream, int i)
    {
        a = inputstream;
        b = i;
        c = new byte[11][];
    }

    public final ASN1Encodable a()
    {
        int i = a.read();
        if (i == -1)
        {
            return null;
        }
        if (a instanceof f)
        {
            ((f)a).a(false);
        }
        int k = ASN1InputStream.a(a, i);
        int l;
        boolean flag;
        if ((i & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = ASN1InputStream.b(a, b);
        if (l < 0)
        {
            if (!flag)
            {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            ASN1StreamParser asn1streamparser = new ASN1StreamParser(new f(a, b), b);
            if ((i & 0x40) != 0)
            {
                return new BERApplicationSpecificParser(k, asn1streamparser);
            }
            if ((i & 0x80) != 0)
            {
                return new BERTaggedObjectParser(true, k, asn1streamparser);
            }
            switch (k)
            {
            default:
                throw new ASN1Exception((new StringBuilder("unknown BER object encountered: 0x")).append(Integer.toHexString(k)).toString());

            case 8: // '\b'
                return new DERExternalParser(asn1streamparser);

            case 4: // '\004'
                return new BEROctetStringParser(asn1streamparser);

            case 16: // '\020'
                return new BERSequenceParser(asn1streamparser);

            case 17: // '\021'
                return new BERSetParser(asn1streamparser);
            }
        }
        Object obj = new e(a, l);
        if ((i & 0x40) != 0)
        {
            return new DERApplicationSpecific(flag, k, ((e) (obj)).b());
        }
        if ((i & 0x80) != 0)
        {
            return new BERTaggedObjectParser(flag, k, new ASN1StreamParser(((InputStream) (obj))));
        }
        if (flag)
        {
            switch (k)
            {
            default:
                throw new IOException((new StringBuilder("unknown tag ")).append(k).append(" encountered").toString());

            case 4: // '\004'
                return new BEROctetStringParser(new ASN1StreamParser(((InputStream) (obj))));

            case 16: // '\020'
                return new DERSequenceParser(new ASN1StreamParser(((InputStream) (obj))));

            case 17: // '\021'
                return new DERSetParser(new ASN1StreamParser(((InputStream) (obj))));

            case 8: // '\b'
                return new DERExternalParser(new ASN1StreamParser(((InputStream) (obj))));
            }
        }
        switch (k)
        {
        default:
            try
            {
                obj = ASN1InputStream.a(k, ((e) (obj)), c);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw new ASN1Exception("corrupted stream detected", illegalargumentexception);
            }
            return ((ASN1Encodable) (obj));

        case 4: // '\004'
            return new DEROctetStringParser(((e) (obj)));
        }
    }

    final ASN1Primitive a(boolean flag, int i)
    {
        if (!flag)
        {
            return new DERTaggedObject(false, i, new DEROctetString(((e)a).b()));
        }
        ASN1EncodableVector asn1encodablevector = b();
        if (a instanceof f)
        {
            if (asn1encodablevector.a.size() == 1)
            {
                return new BERTaggedObject(true, i, asn1encodablevector.a(0));
            } else
            {
                return new BERTaggedObject(false, i, org.spongycastle.asn1.a.a(asn1encodablevector));
            }
        }
        if (asn1encodablevector.a.size() == 1)
        {
            return new DERTaggedObject(true, i, asn1encodablevector.a(0));
        } else
        {
            return new DERTaggedObject(false, i, d.a(asn1encodablevector));
        }
    }

    final ASN1EncodableVector b()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        do
        {
            ASN1Encodable asn1encodable = a();
            if (asn1encodable != null)
            {
                if (asn1encodable instanceof InMemoryRepresentable)
                {
                    asn1encodablevector.a(((InMemoryRepresentable)asn1encodable).e());
                } else
                {
                    asn1encodablevector.a(asn1encodable.a());
                }
            } else
            {
                return asn1encodablevector;
            }
        } while (true);
    }
}
