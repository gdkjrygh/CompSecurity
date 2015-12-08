// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1OutputStream, ASN1Encodable, ASN1Primitive

public class DEROutputStream extends ASN1OutputStream
{

    public DEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    final ASN1OutputStream a()
    {
        return this;
    }

    public final void a(ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodable.a().f().a(this);
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    final ASN1OutputStream b()
    {
        return this;
    }
}
