// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.io.EofSensor;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//            AbstractSessionInputBuffer

public class SocketInputBuffer extends AbstractSessionInputBuffer
    implements EofSensor
{

    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket1, int i, HttpParams httpparams)
    {
        char c = '\u0400';
        super();
        if (socket1 == null)
        {
            throw new IllegalArgumentException("Socket may not be null");
        }
        socket = socket1;
        eof = false;
        if (i < 0)
        {
            i = socket1.getReceiveBufferSize();
        }
        if (i < 1024)
        {
            i = c;
        }
        init(socket1.getInputStream(), i, httpparams);
    }

    protected int fillBuffer()
    {
        int i = super.fillBuffer();
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eof = flag;
        return i;
    }

    public boolean isDataAvailable(int i)
    {
        int j;
        boolean flag;
        boolean flag1 = hasBufferedData();
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        j = socket.getSoTimeout();
        socket.setSoTimeout(i);
        fillBuffer();
        flag = hasBufferedData();
        socket.setSoTimeout(j);
        return flag;
        Object obj;
        obj;
        throw obj;
        obj;
        socket.setSoTimeout(j);
        throw obj;
    }

    public boolean isEof()
    {
        return eof;
    }
}
