// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            BERGenerator, ASN1Encodable, BEROutputStream, ASN1Primitive

public class BERSequenceGenerator extends BERGenerator
{

    public BERSequenceGenerator(OutputStream outputstream)
        throws IOException
    {
        super(outputstream);
        writeBERHeader(48);
    }

    public BERSequenceGenerator(OutputStream outputstream, int i, boolean flag)
        throws IOException
    {
        super(outputstream, i, flag);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable asn1encodable)
        throws IOException
    {
        asn1encodable.toASN1Primitive().encode(new BEROutputStream(_out));
    }

    public void close()
        throws IOException
    {
        writeBEREnd();
    }
}
