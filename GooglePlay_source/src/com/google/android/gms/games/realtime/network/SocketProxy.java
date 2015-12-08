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
//            DataConnectionManager

final class SocketProxy
{
    private final class SocketProxyThread extends Thread
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
            mDataConnectionManager.onObsoleteSocketClosed(new DcmMessages.SocketProxyClosedSocketData(mPeerJid, SocketProxy.this));
            return;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            ((SocketProxy) (obj)).mSocketReady.set(false);
            ((SocketProxy) (obj)).close();
            return;
        }

        private SocketProxyThread()
        {
            this$0 = SocketProxy.this;
            super();
        }

        SocketProxyThread(byte byte0)
        {
            this();
        }
    }


    final DataConnectionManager mDataConnectionManager;
    final LocalServerSocket mLocalServerSocket;
    LocalSocket mLocalSocket;
    final String mPeerJid;
    final String mSocketAddress;
    private final SocketProxyThread mSocketProxyThread = new SocketProxyThread((byte)0);
    final AtomicBoolean mSocketReady = new AtomicBoolean(false);

    SocketProxy(String s, DataConnectionManager dataconnectionmanager, String s1, LocalServerSocket localserversocket)
    {
        mPeerJid = s;
        mDataConnectionManager = dataconnectionmanager;
        mLocalServerSocket = localserversocket;
        mSocketAddress = s1;
        mSocketProxyThread.setPriority(4);
    }

    final void close()
        throws IOException
    {
        if (mLocalSocket != null && mLocalSocket.isConnected())
        {
            mLocalSocket.close();
        }
    }

    final void createConnection()
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        mSocketProxyThread.start();
        wait();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
