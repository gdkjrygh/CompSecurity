// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import java.net.Socket;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//            AbstractSessionOutputBuffer

public class SocketOutputBuffer extends AbstractSessionOutputBuffer
{

    public SocketOutputBuffer(Socket socket, int i, HttpParams httpparams)
    {
        char c = '\u0400';
        super();
        if (socket == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (i < 0)
        {
            i = socket.getSendBufferSize();
        }
        if (i < 1024)
        {
            i = c;
        }
        init(socket.getOutputStream(), i, httpparams);
    }
}
