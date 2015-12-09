// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.google.android.gms.games.internal.JingleLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            SocketProxy, DataConnectionManager

private final class <init> extends Thread
{

    final SocketProxy this$0;

    public final void run()
    {
        synchronized (SocketProxy.this)
        {
            notify();
        }
        String s;
        mLocalSocket = mLocalServerSocket.accept();
        obj = SocketProxy.this;
        ((SocketProxy) (obj)).mSocketReady.set(true);
        s = ((SocketProxy) (obj)).mPeerJid;
        InputStream inputstream;
        byte abyte0[];
        inputstream = ((SocketProxy) (obj)).mLocalSocket.getInputStream();
        abyte0 = new byte[Math.min(((SocketProxy) (obj)).mLocalSocket.getReceiveBufferSize(), 1168)];
_L1:
        int i = inputstream.read(abyte0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        JingleLog.v("SocketProxy", (new StringBuilder("Forwarding ")).append(i).append(" bytes.").toString());
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        ((SocketProxy) (obj)).mDataConnectionManager.sendUnreliableMessage(abyte1, new String[] {
            s
        });
          goto _L1
        Exception exception;
        exception;
        try
        {
            ((SocketProxy) (obj)).mSocketReady.set(false);
            ((SocketProxy) (obj)).close();
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            JingleLog.e("SocketProxy", (new StringBuilder("IOException in readLoop")).append(obj).toString());
        }
        mDataConnectionManager.onObsoleteSocketClosed(new ocketData(mPeerJid, SocketProxy.this));
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        ((SocketProxy) (obj)).mSocketReady.set(false);
        ((SocketProxy) (obj)).close();
        return;
    }

    private ocketData()
    {
        this$0 = SocketProxy.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
