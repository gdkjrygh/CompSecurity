// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetStringParser, ASN1ParsingException, b, BERConstructedOctetString, 
//            ASN1StreamParser, DERObject

public class BEROctetStringParser
    implements ASN1OctetStringParser
{

    private ASN1StreamParser a;

    BEROctetStringParser(ASN1StreamParser asn1streamparser)
    {
        a = asn1streamparser;
    }

    public final DERObject c()
    {
        DERObject derobject;
        try
        {
            derobject = g();
        }
        catch (IOException ioexception)
        {
            throw new ASN1ParsingException((new StringBuilder("IOException converting stream to byte array: ")).append(ioexception.getMessage()).toString(), ioexception);
        }
        return derobject;
    }

    public final InputStream e()
    {
        return new b(a);
    }

    public final DERObject g()
    {
        return new BERConstructedOctetString(Streams.a(e()));
    }
}
