// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.InputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsProtocolHandler

final class k extends InputStream
{

    private byte a[];
    private TlsProtocolHandler b;

    k(TlsProtocolHandler tlsprotocolhandler)
    {
        a = new byte[1];
        b = null;
        b = tlsprotocolhandler;
    }

    public final void close()
    {
        b.close();
    }

    public final int read()
    {
        if (read(a) < 0)
        {
            return -1;
        } else
        {
            return a[0] & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        return b.readApplicationData(abyte0, i, j);
    }
}
