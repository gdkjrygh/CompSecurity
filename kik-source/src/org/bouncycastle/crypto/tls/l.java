// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsProtocolHandler

final class l extends OutputStream
{

    private byte a[];
    private TlsProtocolHandler b;

    l(TlsProtocolHandler tlsprotocolhandler)
    {
        a = new byte[1];
        b = tlsprotocolhandler;
    }

    public final void close()
    {
        b.close();
    }

    public final void flush()
    {
        b.flush();
    }

    public final void write(int i)
    {
        a[0] = (byte)i;
        write(a, 0, 1);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        b.writeData(abyte0, i, j);
    }
}
