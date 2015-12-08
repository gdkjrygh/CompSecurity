// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.NSLogger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.LogRecord;
import javax.jmdns.a;
import javax.jmdns.f;
import javax.jmdns.g;
import javax.jmdns.h;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.NSLogger:
//            NSLoggerClient

private class setPriority extends Thread
    implements javax.jmdns., h, HandshakeCompletedListener
{
    private class a extends Handler
    {

        final NSLoggerClient.LoggingWorker a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 10: default 60
        //                       1 254
        //                       2 222
        //                       3 61
        //                       4 128
        //                       5 199
        //                       6 60
        //                       7 60
        //                       8 60
        //                       9 60
        //                       10 411;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L1 _L1 _L7
_L1:
            return;
_L4:
            Log.v("NSLogger", String.format("add log %d to the queue", new Object[] {
                Integer.valueOf(((NSLoggerClient.a)message.obj).a())
            }));
            a.a.add((NSLoggerClient.a)message.obj);
            if (a.g)
            {
                a.a();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Log.v("NSLogger", "add LogRecord to the queue");
            a.a.add(new NSLoggerClient.a(a.o, (LogRecord)message.obj, a.o.h.getAndIncrement()));
            if (a.g)
            {
                a.a();
                return;
            }
            if (true) goto _L1; else goto _L6
_L6:
            Log.v("NSLogger", "options change message received");
            a.a((Properties)message.obj);
            return;
_L3:
            Log.v("NSLogger", "connect complete message received");
            a.b = false;
            a.g = true;
            a.a();
            return;
_L2:
            String s;
            int i1;
            if (a.e == null)
            {
                message = "null";
            } else
            {
                message = "not null";
            }
            if (a.h == null)
            {
                s = "null";
            } else
            {
                s = "not null";
            }
            if (a.b)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            Log.v("NSLogger", String.format("try connect message received, remote socket is %s, writeStream is %s, connecting=%d", new Object[] {
                message, s, Integer.valueOf(i1)
            }));
            a.c = false;
            if (a.e == null && a.h == null && !a.b && a.o.f != null && a.o.g != 0)
            {
                a.b();
                return;
            }
            if (true) goto _L1; else goto _L7
_L7:
            Looper.myLooper().quit();
            return;
        }

        private a()
        {
            a = NSLoggerClient.LoggingWorker.this;
            super();
        }

        a(NSLoggerClient._cls1 _pcls1)
        {
            this();
        }
    }


    ArrayList a;
    boolean b;
    boolean c;
    boolean d;
    Socket e;
    int f;
    boolean g;
    OutputStream h;
    byte i[];
    int j;
    javax.jmdns.a k;
    String l;
    final AtomicBoolean m = new AtomicBoolean(false);
    final Queue n = new ConcurrentLinkedQueue();
    final NSLoggerClient o;

    void a()
    {
        if (!a.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!d)
        {
            e();
        }
        if (h != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o.c != null)
        {
            f();
            return;
        }
        if (!b && !c && (o.b & 2) == 0 && o.f != null && o.g != 0)
        {
            b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (e == null)
        {
            h();
            return;
        }
        if (!e.isConnected())
        {
            c();
            d();
            return;
        }
        if (!g) goto _L1; else goto _L4
_L4:
        int i1;
        int j1;
        j1 = f;
        i1 = j1;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        i1 = Math.min(j1, i.length - j);
        h.write(i, j, i1);
        j = j + i1;
        j1 -= i1;
        i1 = j1;
        if (j != i.length)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        i = null;
        j = 0;
        i1 = j1;
        b b1;
        byte abyte0[];
        try
        {
            if (!a.isEmpty())
            {
                Log.v("NSLogger", String.format("processLogQueue: %d bytes available on socket, %d queued messages", new Object[] {
                    Integer.valueOf(i1), Integer.valueOf(a.size())
                }));
            }
        }
        catch (IOException ioexception)
        {
            Log.d("NSLogger", (new StringBuilder()).append("processLogQueue(): remote socket disconnected - exception: ").append(ioexception.toString()).toString());
            c();
            d();
            return;
        }
_L7:
        if (i1 <= 0) goto _L1; else goto _L5
_L5:
        if (a.isEmpty()) goto _L1; else goto _L6
_L6:
        b1 = (a)a.get(0);
        abyte0 = b1.a();
        if (abyte0.length <= f)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        i = abyte0;
        h.write(abyte0, 0, f);
        j = f;
_L8:
        b1.f();
        a.remove(0);
          goto _L7
        h.write(abyte0);
          goto _L8
    }

    void a(Properties properties)
    {
        int j1;
        boolean flag1;
        flag1 = false;
        j1 = 0;
        if (!properties.containsKey("filename")) goto _L2; else goto _L1
_L1:
        properties = properties.getProperty("filename");
        if (o.c == null || !o.c.equalsIgnoreCase(properties))
        {
            if (o.c == null)
            {
                c();
            } else
            if (h != null)
            {
                g();
            }
            o.c = properties;
            f();
        }
_L5:
        return;
_L2:
        boolean flag;
        int i1;
        if (o.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        String s;
        if (properties.getProperty("useSSL", "0").equals("1"))
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        if (!properties.containsKey("bonjourService")) goto _L4; else goto _L3
_L3:
        i1 = 2;
        properties = "";
_L6:
        if (i1 != o.b || flag)
        {
            Log.i("NSLogger", "Options changed, closing/restarting");
            if (o.c != null)
            {
                g();
            } else
            {
                c();
            }
            o.b = i1;
            if ((i1 & 2) == 0)
            {
                o.f = properties;
                o.g = j1;
                b();
                return;
            } else
            {
                i();
                return;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
label0:
        {
            s = properties.getProperty("remoteHost");
            j1 = Integer.parseInt(properties.getProperty("remotePort", "0"));
            if (flag || (o.b & 2) != 0)
            {
                break MISSING_BLOCK_LABEL_308;
            }
            if (o.f != null && !o.f.equalsIgnoreCase(s))
            {
                flag = flag1;
                if (o.g == j1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        properties = s;
          goto _L6
        properties = s;
          goto _L6
    }

    public void a(javax.jmdns.a a1, Collection collection)
    {
        Log.e("NSLogger", (new StringBuilder()).append("JmDNS can't record from IOError: infos=").append(collection.toString()).toString());
    }

    public void a(f f1)
    {
        Log.v("NSLogger", (new StringBuilder()).append("Bonjour service found: ").append(f1.b()).append(" ").append(f1.c()).toString());
        k.b(f1.b(), f1.c(), false, 1L);
    }

    void b()
    {
        if (h != null)
        {
            throw new NullPointerException("internal error: writeStream should be null");
        }
        if (e != null)
        {
            throw new NullPointerException("internal error: remoteSocket should be null");
        }
        j();
        Log.d("NSLogger", String.format("connecting to %s:%d", new Object[] {
            o.f, Integer.valueOf(o.g)
        }));
        e = new Socket(o.f, o.g);
        if ((o.b & 4) != 0)
        {
            Log.v("NSLogger", "activating SSL connection");
            e = SSLCertificateSocketFactory.getInsecure(5000, null).createSocket(e, o.f, o.g, true);
            if (e != null)
            {
                Log.v("NSLogger", String.format("starting SSL handshake with %s:%d", new Object[] {
                    e.getInetAddress().toString(), Integer.valueOf(e.getPort())
                }));
                SSLSocket sslsocket = (SSLSocket)e;
                sslsocket.setUseClientMode(true);
                sslsocket.addHandshakeCompletedListener(this);
                sslsocket.startHandshake();
                return;
            }
            break MISSING_BLOCK_LABEL_375;
        }
        try
        {
            f = e.getSendBufferSize();
            h = e.getOutputStream();
            o.j.sendMessage(o.j.obtainMessage(2));
            return;
        }
        catch (UnknownHostException unknownhostexception)
        {
            Log.e("NSLogger", String.format("can't connect to %s:%d (unknown host)", new Object[] {
                o.f, Integer.valueOf(o.g)
            }));
            c();
            return;
        }
        catch (Exception exception)
        {
            Log.e("NSLogger", String.format("exception while trying to connect to %s:%d: %s", new Object[] {
                o.f, Integer.valueOf(o.g), exception.toString()
            }));
        }
        c();
        d();
    }

    public void b(f f1)
    {
        Log.v("NSLogger", (new StringBuilder()).append("Bonjour service removed: ").append(f1.toString()).toString());
    }

    void c()
    {
        g = false;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Log.d("NSLogger", "disconnectFromRemote()");
        if (e instanceof SSLSocket)
        {
            ((SSLSocket)e).removeHandshakeCompletedListener(this);
        }
        if (h != null)
        {
            h.close();
        }
        e.close();
        h = null;
        e = null;
        f = 0;
        b = false;
        d = false;
        return;
        Object obj;
        obj;
        Log.e("NSLogger", (new StringBuilder()).append("Exception catched in disconnectFromRemote: ").append(((Exception) (obj)).toString()).toString());
        h = null;
        e = null;
        f = 0;
        b = false;
        d = false;
        return;
        obj;
        h = null;
        e = null;
        f = 0;
        b = false;
        d = false;
        throw obj;
    }

    public void c(f f1)
    {
        Log.v("NSLogger", (new StringBuilder()).append("Bonjour service resolved: ").append(f1.toString()).toString());
        if (e == null)
        {
            Log.v("NSLogger", "-> retrieving service info");
            f1 = f1.d();
            InetAddress ainetaddress[] = f1.f();
            if (ainetaddress.length > 0)
            {
                o.f = ainetaddress[0].getHostAddress();
                o.g = f1.i();
                Log.v("NSLogger", String.format("-> will try to connect to Bonjour service %s:%d", new Object[] {
                    o.f, Integer.valueOf(o.g)
                }));
                o.j.sendMessage(o.j.obtainMessage(1));
            }
        }
    }

    void d()
    {
        if (!c)
        {
            Log.d("NSLogger", "tryReconnecting");
            if ((o.b & 2) != 0)
            {
                if (k == null)
                {
                    i();
                    return;
                }
            } else
            {
                c = true;
                o.j.sendMessageDelayed(o.j.obtainMessage(1), 2000L);
                return;
            }
        }
    }

    void e()
    {
        Log.v("NSLogger", "Pushing client info to front of queue");
        o o1 = new o(o, 3, o.h.getAndIncrement());
        o1.getAndIncrement((new StringBuilder()).append(Build.MANUFACTURER).append(" ").append(Build.MODEL).toString(), 24);
        o1.getAndIncrement("Android", 22);
        o1.getAndIncrement(android.os.r.getAndIncrement, 23);
        o1.getAndIncrement(android.provider.ndIncrement(o.a.getContentResolver(), "android_id"), 25);
        ApplicationInfo applicationinfo = o.a.getApplicationInfo();
        String s1 = applicationinfo.packageName;
        String s = s1;
        if (s1 == null)
        {
            String s2 = applicationinfo.processName;
            s = s2;
            if (s2 == null)
            {
                String s3 = applicationinfo.taskAffinity;
                s = s3;
                if (s3 == null)
                {
                    s = applicationinfo.toString();
                }
            }
        }
        o1.g(s, 20);
        a.add(0, o1);
        d = true;
    }

    void f()
    {
        if (o.c == null || o.c.isEmpty())
        {
            return;
        }
        try
        {
            Log.d("NSLogger", String.format("Creating file buffer stream to %s", new Object[] {
                o.c
            }));
            h = new BufferedOutputStream(new FileOutputStream(o.c, true));
            h();
            return;
        }
        catch (Exception exception)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception catched while trying to create file stream: ").append(exception.toString()).toString());
        }
        o.c = null;
    }

    void g()
    {
        Log.d("NSLogger", "Closing file buffer stream");
        try
        {
            h.flush();
            h.close();
        }
        catch (Exception exception)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception catched in closeBufferWriteStream: ").append(exception.toString()).toString());
        }
        h = null;
    }

    void h()
    {
        Object obj;
        byte abyte0[];
        Log.v("NSLogger", "flushQueueToBufferStream");
        j = 0;
        if (i != null)
        {
            try
            {
                h.write(i, j, i.length - j);
                i = null;
                j = 0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("NSLogger", (new StringBuilder()).append("Exception catched while trying to write to file stream: ").append(((IOException) (obj)).toString()).toString());
            }
        }
_L2:
        if (a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = (a)a.get(0);
        abyte0 = ((a) (obj)).a();
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        return;
        try
        {
            h.write(abyte0);
            ((h) (obj)).h();
            a.remove(0);
        }
        catch (IOException ioexception)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception catched in flushQueueToBufferStream: ").append(ioexception.toString()).toString());
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void handshakeCompleted(HandshakeCompletedEvent handshakecompletedevent)
    {
        try
        {
            Log.v("NSLogger", "SSL handshake completed");
            f = e.getSendBufferSize();
            h = e.getOutputStream();
            o.j.sendMessage(o.j.obtainMessage(2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HandshakeCompletedEvent handshakecompletedevent)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception cached in handshakeCompleted: ").append(handshakecompletedevent.toString()).toString());
        }
        c();
        d();
    }

    void i()
    {
        if ((o.b & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Log.d("NSLogger", "setupBonjour(): creating JmDNS instance");
        com.NSLogger.NSLoggerClient.a().uire();
        k = javax.jmdns.a.a();
        k.a(this);
        l = o.e;
        if (l != null && !l.isEmpty())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        String s;
        if ((o.b & 4) != 0)
        {
            s = "_nslogger-ssl._tcp.local.";
        } else
        {
            s = "_nslogger._tcp.local.";
        }
        l = s;
        k.a(l, this);
        return;
        Exception exception;
        exception;
        Log.e("NSLogger", (new StringBuilder()).append("Exception catched in setupBonjour(): ").append(exception.toString()).toString());
        l = null;
        return;
        j();
    }

    void j()
    {
        try
        {
            if (k != null)
            {
                Log.d("NSLogger", "closeBonjour()");
                if (l != null)
                {
                    k.b(l, this);
                    l = null;
                }
                k.b();
                k.a(null);
                k = null;
                com.NSLogger.NSLoggerClient.a().ease();
            }
            return;
        }
        catch (Exception exception)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception catched in closeBonjour(): ").append(exception.toString()).toString());
        }
    }

    public void run()
    {
        try
        {
            Log.i("NSLogger", "Logging thread starting up");
            Looper.prepare();
            o.j = new a(null);
            m.set(true);
            for (; !n.isEmpty(); LockSupport.unpark((Thread)n.poll())) { }
        }
        catch (Exception exception)
        {
            Log.e("NSLogger", (new StringBuilder()).append("Exception catched in LoggingWorker.run(): ").append(exception.toString()).toString());
            m.set(true);
            for (; !n.isEmpty(); LockSupport.unpark((Thread)n.peek())) { }
            break MISSING_BLOCK_LABEL_236;
        }
        if (o.c == null) goto _L2; else goto _L1
_L1:
        f();
_L5:
        Log.i("NSLogger", "Logging thread looper starting");
        Looper.loop();
        Log.i("NSLogger", "Logging thread looper ended");
        j();
        o.i = null;
        o.j = null;
        return;
_L2:
        if (o.f == null || o.g == 0) goto _L4; else goto _L3
_L3:
        b();
          goto _L5
_L4:
        if ((o.b & 2) == 0) goto _L5; else goto _L6
_L6:
        i();
          goto _L5
    }

    a(NSLoggerClient nsloggerclient)
    {
        o = nsloggerclient;
        super("NSLogger");
        a = new ArrayList(64);
        setPriority(1);
    }
}
