// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OutputStream, ASN1Encodable, ASN1Primitive

public class DEROutputStream extends ASN1OutputStream
{

    public DEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    ASN1OutputStream getDERSubStream()
    {
        return this;
    }

    ASN1OutputStream getDLSubStream()
    {
        return this;
    }

    public void writeObject(ASN1Encodable asn1encodable)
        throws IOException
    {
        if (asn1encodable != null)
        {
            asn1encodable.toASN1Primitive().toDERObject().encode(this);
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }
}
