// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetStringParser, DEROctetString, DefiniteLengthInputStream, ASN1ParsingException, 
//            ASN1Primitive

public class DEROctetStringParser
    implements ASN1OctetStringParser
{

    private DefiniteLengthInputStream stream;

    DEROctetStringParser(DefiniteLengthInputStream definitelengthinputstream)
    {
        stream = definitelengthinputstream;
    }

    public ASN1Primitive getLoadedObject()
        throws IOException
    {
        return new DEROctetString(stream.toByteArray());
    }

    public InputStream getOctetStream()
    {
        return stream;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = getLoadedObject();
        }
        catch (IOException ioexception)
        {
            throw new ASN1ParsingException((new StringBuilder()).append("IOException converting stream to byte array: ").append(ioexception.getMessage()).toString(), ioexception);
        }
        return asn1primitive;
    }
}
