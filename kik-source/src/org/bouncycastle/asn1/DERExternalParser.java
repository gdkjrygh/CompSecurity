// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            DEREncodable, InMemoryRepresentable, ASN1ParsingException, DERExternal, 
//            ASN1StreamParser, ASN1Exception, DERObject

public class DERExternalParser
    implements DEREncodable, InMemoryRepresentable
{

    private ASN1StreamParser a;

    public DERExternalParser(ASN1StreamParser asn1streamparser)
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
            throw new ASN1ParsingException("unable to get DER object", ioexception);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1ParsingException("unable to get DER object", illegalargumentexception);
        }
        return derobject;
    }

    public final DERObject g()
    {
        DERExternal derexternal;
        try
        {
            derexternal = new DERExternal(a.b());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1Exception(illegalargumentexception.getMessage(), illegalargumentexception);
        }
        return derexternal;
    }
}
