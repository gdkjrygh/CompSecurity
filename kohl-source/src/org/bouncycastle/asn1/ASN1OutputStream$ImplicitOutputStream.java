// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OutputStream

private class first extends ASN1OutputStream
{

    private boolean first;
    final ASN1OutputStream this$0;

    public void write(int i)
        throws IOException
    {
        if (first)
        {
            first = false;
            return;
        } else
        {
            super.write(i);
            return;
        }
    }

    public A(OutputStream outputstream)
    {
        this$0 = ASN1OutputStream.this;
        super(outputstream);
        first = true;
    }
}
