// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1OctetStringParser, ASN1ParsingException, c, BEROctetString, 
//            ASN1StreamParser, ASN1Primitive

public class BEROctetStringParser
    implements ASN1OctetStringParser
{

    private ASN1StreamParser a;

    BEROctetStringParser(ASN1StreamParser asn1streamparser)
    {
        a = asn1streamparser;
    }

    public final ASN1Primitive a()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = e();
        }
        catch (IOException ioexception)
        {
            throw new ASN1ParsingException((new StringBuilder("IOException converting stream to byte array: ")).append(ioexception.getMessage()).toString(), ioexception);
        }
        return asn1primitive;
    }

    public final InputStream c()
    {
        return new c(a);
    }

    public final ASN1Primitive e()
    {
        return new BEROctetString(Streams.a(c()));
    }
}
