// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsProtocolHandler

class TlsInputStream extends InputStream
{

    private byte buf[];
    private TlsProtocolHandler handler;

    TlsInputStream(TlsProtocolHandler tlsprotocolhandler)
    {
        buf = new byte[1];
        handler = null;
        handler = tlsprotocolhandler;
    }

    public void close()
        throws IOException
    {
        handler.close();
    }

    public int read()
        throws IOException
    {
        if (read(buf) < 0)
        {
            return -1;
        } else
        {
            return buf[0] & 0xff;
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return handler.readApplicationData(abyte0, i, j);
    }
}
