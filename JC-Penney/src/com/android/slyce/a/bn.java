// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

// Referenced classes of package com.android.slyce.a:
//            al

class bn extends al
{

    SocketChannel a;

    bn(SocketChannel socketchannel)
    {
        super(socketchannel);
        a = socketchannel;
    }

    public int a(ByteBuffer abytebuffer[])
    {
        return (int)a.write(abytebuffer);
    }

    public void a()
    {
        try
        {
            a.socket().shutdownOutput();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean b()
    {
        return a.isConnected();
    }

    public int read(ByteBuffer bytebuffer)
    {
        return a.read(bytebuffer);
    }

    public long read(ByteBuffer abytebuffer[])
    {
        return a.read(abytebuffer);
    }

    public long read(ByteBuffer abytebuffer[], int i, int j)
    {
        return a.read(abytebuffer, i, j);
    }
}
