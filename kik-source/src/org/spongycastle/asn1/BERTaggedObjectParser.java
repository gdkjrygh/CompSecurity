// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1TaggedObjectParser, ASN1ParsingException, ASN1StreamParser, ASN1Primitive

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

    public final ASN1Primitive a()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = e();
        }
        catch (IOException ioexception)
        {
            throw new ASN1ParsingException(ioexception.getMessage());
        }
        return asn1primitive;
    }

    public final ASN1Primitive e()
    {
        return c.a(a, b);
    }
}
