// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1InputStream, e, BERApplicationSpecificParser, BERTaggedObjectParser, 
//            ASN1Exception, DERExternalParser, BEROctetStringParser, BERSequenceParser, 
//            BERSetParser, d, DERApplicationSpecific, DERUnknownTag, 
//            DERSequenceParser, DERSetParser, DEROctetStringParser, DERTaggedObject, 
//            DEROctetString, ASN1EncodableVector, BERTaggedObject, a, 
//            c, InMemoryRepresentable, DEREncodable, DERObject

public class ASN1StreamParser
{

    private final InputStream a;
    private final int b;

    public ASN1StreamParser(InputStream inputstream)
    {
        this(inputstream, ASN1InputStream.a(inputstream));
    }

    public ASN1StreamParser(InputStream inputstream, int i)
    {
        a = inputstream;
        b = i;
    }

    public final DEREncodable a()
    {
        int i = a.read();
        if (i == -1)
        {
            return null;
        }
        if (a instanceof e)
        {
            ((e)a).a(false);
        }
        int j = ASN1InputStream.a(a, i);
        int k;
        boolean flag;
        if ((i & 0x20) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = ASN1InputStream.b(a, b);
        if (k < 0)
        {
            if (!flag)
            {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            ASN1StreamParser asn1streamparser = new ASN1StreamParser(new e(a, b), b);
            if ((i & 0x40) != 0)
            {
                return new BERApplicationSpecificParser(j, asn1streamparser);
            }
            if ((i & 0x80) != 0)
            {
                return new BERTaggedObjectParser(true, j, asn1streamparser);
            }
            switch (j)
            {
            default:
                throw new ASN1Exception((new StringBuilder("unknown BER object encountered: 0x")).append(Integer.toHexString(j)).toString());

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
        Object obj = new d(a, k);
        if ((i & 0x40) != 0)
        {
            return new DERApplicationSpecific(flag, j, ((d) (obj)).b());
        }
        if ((i & 0x80) != 0)
        {
            return new BERTaggedObjectParser(flag, j, new ASN1StreamParser(((InputStream) (obj))));
        }
        if (flag)
        {
            switch (j)
            {
            default:
                return new DERUnknownTag(true, j, ((d) (obj)).b());

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
        switch (j)
        {
        default:
            try
            {
                obj = ASN1InputStream.a(j, ((d) (obj)).b());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw new ASN1Exception("corrupted stream detected", illegalargumentexception);
            }
            return ((DEREncodable) (obj));

        case 4: // '\004'
            return new DEROctetStringParser(((d) (obj)));
        }
    }

    final DERObject a(boolean flag, int i)
    {
        if (!flag)
        {
            return new DERTaggedObject(false, i, new DEROctetString(((d)a).b()));
        }
        ASN1EncodableVector asn1encodablevector = b();
        if (a instanceof e)
        {
            if (asn1encodablevector.a.size() == 1)
            {
                return new BERTaggedObject(true, i, asn1encodablevector.a(0));
            } else
            {
                return new BERTaggedObject(false, i, org.bouncycastle.asn1.a.a(asn1encodablevector));
            }
        }
        if (asn1encodablevector.a.size() == 1)
        {
            return new DERTaggedObject(true, i, asn1encodablevector.a(0));
        } else
        {
            return new DERTaggedObject(false, i, c.a(asn1encodablevector));
        }
    }

    final ASN1EncodableVector b()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        do
        {
            DEREncodable derencodable = a();
            if (derencodable != null)
            {
                if (derencodable instanceof InMemoryRepresentable)
                {
                    asn1encodablevector.a(((InMemoryRepresentable)derencodable).g());
                } else
                {
                    asn1encodablevector.a(derencodable.c());
                }
            } else
            {
                return asn1encodablevector;
            }
        } while (true);
    }
}
