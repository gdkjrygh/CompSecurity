// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.OutputStream;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1OutputStream

private final class b extends ASN1OutputStream
{

    final ASN1OutputStream a;
    private boolean b;

    public final void b(int i)
    {
        if (b)
        {
            b = false;
            return;
        } else
        {
            super.b(i);
            return;
        }
    }

    public (ASN1OutputStream asn1outputstream, OutputStream outputstream)
    {
        a = asn1outputstream;
        super(outputstream);
        b = true;
    }
}
