// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1SequenceParser, BERSequence, ASN1StreamParser, DERObject

public class BERSequenceParser
    implements ASN1SequenceParser
{

    private ASN1StreamParser a;

    BERSequenceParser(ASN1StreamParser asn1streamparser)
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
            throw new IllegalStateException(ioexception.getMessage());
        }
        return derobject;
    }

    public final DERObject g()
    {
        return new BERSequence(a.b());
    }
}
