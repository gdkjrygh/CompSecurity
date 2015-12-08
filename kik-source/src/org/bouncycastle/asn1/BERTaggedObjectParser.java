// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1TaggedObjectParser, ASN1ParsingException, ASN1StreamParser, DERObject

public class BERTaggedObjectParser
    implements ASN1TaggedObjectParser
{

    private boolean a;
    private int b;
    private ASN1StreamParser c;

    BERTaggedObjectParser(boolean flag, int i, ASN1StreamParser asn1streamparser)
    {
        a = flag;
        b = i;
        c = asn1streamparser;
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
            throw new ASN1ParsingException(ioexception.getMessage());
        }
        return derobject;
    }

    public final DERObject g()
    {
        return c.a(a, b);
    }
}
