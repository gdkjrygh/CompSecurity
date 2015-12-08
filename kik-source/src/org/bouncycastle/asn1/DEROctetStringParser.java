// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetStringParser, ASN1ParsingException, DEROctetString, d, 
//            DERObject

public class DEROctetStringParser
    implements ASN1OctetStringParser
{

    private d a;

    DEROctetStringParser(d d1)
    {
        a = d1;
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
        return a;
    }

    public final DERObject g()
    {
        return new DEROctetString(a.b());
    }
}
