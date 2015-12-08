// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1ApplicationSpecificParser, ASN1ParsingException, BERApplicationSpecific, ASN1StreamParser, 
//            ASN1Primitive

public class BERApplicationSpecificParser
    implements ASN1ApplicationSpecificParser
{

    private final int a;
    private final ASN1StreamParser b;

    BERApplicationSpecificParser(int i, ASN1StreamParser asn1streamparser)
    {
        a = i;
        b = asn1streamparser;
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
            throw new ASN1ParsingException(ioexception.getMessage(), ioexception);
        }
        return asn1primitive;
    }

    public final ASN1Primitive e()
    {
        return new BERApplicationSpecific(a, b.b());
    }
}
