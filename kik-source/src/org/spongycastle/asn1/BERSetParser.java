// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1SetParser, ASN1ParsingException, BERSet, ASN1StreamParser, 
//            ASN1Primitive

public class BERSetParser
    implements ASN1SetParser
{

    private ASN1StreamParser a;

    BERSetParser(ASN1StreamParser asn1streamparser)
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
            throw new ASN1ParsingException(ioexception.getMessage(), ioexception);
        }
        return asn1primitive;
    }

    public final ASN1Primitive e()
    {
        return new BERSet(a.b());
    }
}
