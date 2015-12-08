// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ed;

import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import p.dx.c;
import p.dx.d;

public class a
    implements b.a
{

    public a()
    {
    }

    public SocketChannel a(SocketChannel socketchannel, SelectionKey selectionkey)
    {
        return socketchannel;
    }

    public d a(c c, List list, Socket socket)
    {
        return new d(c, list);
    }

    public ByteChannel b(SocketChannel socketchannel, SelectionKey selectionkey)
        throws IOException
    {
        return a(socketchannel, selectionkey);
    }
}
