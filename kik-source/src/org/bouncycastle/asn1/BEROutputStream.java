// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DEROutputStream, DERObject, DEREncodable

public class BEROutputStream extends DEROutputStream
{

    public BEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            a();
            return;
        }
        if (obj instanceof DERObject)
        {
            ((DERObject)obj).a(this);
            return;
        }
        if (obj instanceof DEREncodable)
        {
            ((DEREncodable)obj).c().a(this);
            return;
        } else
        {
            throw new IOException("object not BEREncodable");
        }
    }
}
