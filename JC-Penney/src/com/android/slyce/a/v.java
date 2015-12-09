// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.d.c;
import java.io.Closeable;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

// Referenced classes of package com.android.slyce.a:
//            ac, r, bm

class v
    implements Runnable
{

    final ac a;
    final com.android.slyce.a.a.c b;
    final InetSocketAddress c;
    final r d;

    v(r r1, ac ac1, com.android.slyce.a.a.c c1, InetSocketAddress inetsocketaddress)
    {
        d = r1;
        a = ac1;
        b = c1;
        c = inetsocketaddress;
        super();
    }

    public void run()
    {
        SelectionKey selectionkey1;
        Object obj;
        selectionkey1 = null;
        obj = null;
        if (a.isCancelled())
        {
            return;
        }
        a.b = b;
        SocketChannel socketchannel;
        ac ac1 = a;
        socketchannel = SocketChannel.open();
        ac1.a = socketchannel;
        SelectionKey selectionkey = obj;
        socketchannel.configureBlocking(false);
        selectionkey = obj;
        selectionkey1 = socketchannel.register(r.a(d).a(), 8);
        selectionkey = selectionkey1;
        selectionkey1.attach(a);
        Throwable throwable;
        selectionkey = selectionkey1;
        try
        {
            socketchannel.connect(c);
            return;
        }
        catch (Throwable throwable1)
        {
            selectionkey1 = selectionkey;
            throwable = throwable1;
        }
_L2:
        if (selectionkey1 != null)
        {
            selectionkey1.cancel();
        }
        com.android.slyce.a.d.c.a(new Closeable[] {
            socketchannel
        });
        a.a(new RuntimeException(throwable));
        return;
        throwable;
        socketchannel = null;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
