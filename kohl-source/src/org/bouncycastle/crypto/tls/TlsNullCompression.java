// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCompression

public class TlsNullCompression
    implements TlsCompression
{

    public TlsNullCompression()
    {
    }

    public OutputStream compress(OutputStream outputstream)
    {
        return outputstream;
    }

    public OutputStream decompress(OutputStream outputstream)
    {
        return outputstream;
    }
}
