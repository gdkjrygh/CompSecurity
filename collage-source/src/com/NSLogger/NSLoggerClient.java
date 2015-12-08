// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.NSLogger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.SSLCertificateSocketFactory;
import android.net.wifi.WifiManager;
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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import javax.jmdns.f;
import javax.jmdns.g;
import javax.jmdns.h;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class NSLoggerClient
{
    private class LoggingWorker extends Thread
        implements javax.jmdns.a.a, h, HandshakeCompletedListener
    {

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
            a a1;
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
            a1 = (a)a.get(0);
            abyte0 = a1.e();
            if (abyte0.length <= f)
            {
                break MISSING_BLOCK_LABEL_390;
            }
            i = abyte0;
            h.write(abyte0, 0, f);
            j = f;
_L8:
            a1.d();
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
            a a1 = o. new a(3, o.h.getAndIncrement());
            a1.a((new StringBuilder()).append(Build.MANUFACTURER).append(" ").append(Build.MODEL).toString(), 24);
            a1.a("Android", 22);
            a1.a(android.os.Build.VERSION.RELEASE, 23);
            a1.a(android.provider.Settings.Secure.getString(o.a.getContentResolver(), "android_id"), 25);
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
            a1.a(s, 20);
            a.add(0, a1);
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
            abyte0 = ((a) (obj)).e();
            if (abyte0 != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            return;
            try
            {
                h.write(abyte0);
                ((a) (obj)).d();
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
            NSLoggerClient.a().acquire();
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
                    NSLoggerClient.a().release();
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
                o.j = new a(this);
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

        LoggingWorker()
        {
            o = NSLoggerClient.this;
            super("NSLogger");
            a = new ArrayList(64);
            setPriority(1);
        }
    }

    private class LoggingWorker.a extends Handler
    {

        final LoggingWorker a;

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
                Integer.valueOf(((a)message.obj).a())
            }));
            a.a.add((a)message.obj);
            if (a.g)
            {
                a.a();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Log.v("NSLogger", "add LogRecord to the queue");
            a.a.add(a.o. new a((LogRecord)message.obj, a.o.h.getAndIncrement()));
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

        private LoggingWorker.a(LoggingWorker loggingworker)
        {
            a = loggingworker;
            super();
        }

    }

    public final class a
    {

        final NSLoggerClient a;
        private byte b[];
        private int c;
        private final int d;
        private short e;
        private ReentrantLock f;
        private Condition g;

        private void a(int i1)
        {
            int j1 = b.length;
            if (j1 >= c + i1)
            {
                return;
            } else
            {
                byte abyte0[] = new byte[Math.max(j1 + j1 / 2, c + i1 + 64)];
                System.arraycopy(b, 0, abyte0, 0, c);
                b = abyte0;
                return;
            }
        }

        public int a()
        {
            return d;
        }

        public void a(int i1, int j1)
        {
            a(4);
            int l1 = c;
            byte abyte0[] = b;
            int k1 = l1 + 1;
            abyte0[l1] = (byte)j1;
            abyte0 = b;
            j1 = k1 + 1;
            abyte0[k1] = 2;
            abyte0 = b;
            k1 = j1 + 1;
            abyte0[j1] = (byte)(i1 >> 8);
            b[k1] = (byte)i1;
            c = k1 + 1;
            e = (short)(e + 1);
        }

        public void a(int i1, int j1, byte abyte0[])
        {
            int k1 = abyte0.length;
            a(k1 + 6);
            int i2 = c;
            byte abyte1[] = b;
            int l1 = i2 + 1;
            abyte1[i2] = (byte)i1;
            abyte1 = b;
            i1 = l1 + 1;
            abyte1[l1] = (byte)j1;
            abyte1 = b;
            j1 = i1 + 1;
            abyte1[i1] = (byte)(k1 >> 24);
            abyte1 = b;
            i1 = j1 + 1;
            abyte1[j1] = (byte)(k1 >> 16);
            abyte1 = b;
            j1 = i1 + 1;
            abyte1[i1] = (byte)(k1 >> 8);
            abyte1 = b;
            i1 = j1 + 1;
            abyte1[j1] = (byte)k1;
            System.arraycopy(abyte0, 0, b, i1, k1);
            c = k1 + i1;
            e = (short)(e + 1);
        }

        void a(long l1)
        {
            long l2 = l1;
            if (l1 == 0L)
            {
                l2 = System.currentTimeMillis();
            }
            a(l2 / 1000L, 1);
            a((int)(l2 % 1000L), 2);
        }

        public void a(long l1, int i1)
        {
            a(10);
            int k1 = c;
            byte abyte0[] = b;
            int j1 = k1 + 1;
            abyte0[k1] = (byte)i1;
            abyte0 = b;
            i1 = j1 + 1;
            abyte0[j1] = 4;
            abyte0 = b;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(int)(l1 >> 56);
            abyte0 = b;
            i1 = j1 + 1;
            abyte0[j1] = (byte)(int)(l1 >> 48);
            abyte0 = b;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(int)(l1 >> 40);
            abyte0 = b;
            i1 = j1 + 1;
            abyte0[j1] = (byte)(int)(l1 >> 32);
            abyte0 = b;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(int)(l1 >> 24);
            abyte0 = b;
            i1 = j1 + 1;
            abyte0[j1] = (byte)(int)(l1 >> 16);
            abyte0 = b;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(int)(l1 >> 8);
            b[j1] = (byte)(int)l1;
            c = j1 + 1;
            e = (short)(e + 1);
        }

        public void a(String s, int i1)
        {
            a(i1, 0, s.getBytes(NSLoggerClient.k));
        }

        protected void b()
        {
            f = new ReentrantLock();
            g = f.newCondition();
            f.lock();
        }

        public void b(int i1, int j1)
        {
            a(6);
            int l1 = c;
            byte abyte0[] = b;
            int k1 = l1 + 1;
            abyte0[l1] = (byte)j1;
            abyte0 = b;
            j1 = k1 + 1;
            abyte0[k1] = 3;
            abyte0 = b;
            k1 = j1 + 1;
            abyte0[j1] = (byte)(i1 >> 24);
            abyte0 = b;
            j1 = k1 + 1;
            abyte0[k1] = (byte)(i1 >> 16);
            abyte0 = b;
            k1 = j1 + 1;
            abyte0[j1] = (byte)(i1 >> 8);
            b[k1] = (byte)i1;
            c = k1 + 1;
            e = (short)(e + 1);
        }

        void b(long l1)
        {
            String s1;
            Thread thread;
            s1 = null;
            thread = Thread.currentThread();
            if (thread.getId() != l1) goto _L2; else goto _L1
_L1:
            String s = thread.getName();
_L4:
label0:
            {
                if (s != null)
                {
                    s1 = s;
                    if (!s.isEmpty())
                    {
                        break label0;
                    }
                }
                s1 = Long.toString(l1);
            }
            a(s1, 4);
            return;
_L2:
            Thread athread[] = new Thread[Thread.activeCount()];
            Thread.enumerate(athread);
            int j1 = athread.length;
            int i1 = 0;
            do
            {
                s = s1;
                if (i1 < j1)
                {
label1:
                    {
                        if (athread[i1].getId() != l1)
                        {
                            break label1;
                        }
                        s = thread.getName();
                    }
                }
                if (true)
                {
                    continue;
                }
                i1++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void c()
        {
            Exception exception;
            try
            {
                Log.v("NSLogger", String.format("waiting for flush of message %d", new Object[] {
                    Integer.valueOf(d)
                }));
                g.await();
            }
            catch (InterruptedException interruptedexception)
            {
                f.unlock();
                return;
            }
            finally
            {
                f.unlock();
            }
            f.unlock();
            return;
            throw exception;
        }

        protected void d()
        {
            if (f != null)
            {
                Log.v("NSLogger", String.format("marking message %d as flushed", new Object[] {
                    Integer.valueOf(d)
                }));
                f.lock();
                g.signal();
                f.unlock();
            }
        }

        byte[] e()
        {
            int i1 = c - 4;
            b[0] = (byte)(i1 >> 24);
            b[1] = (byte)(i1 >> 16);
            b[2] = (byte)(i1 >> 8);
            b[3] = (byte)i1;
            b[4] = (byte)(e >> 8);
            b[5] = (byte)e;
            if (c == b.length)
            {
                return b;
            } else
            {
                byte abyte0[] = new byte[c];
                System.arraycopy(b, 0, abyte0, 0, c);
                b = null;
                return abyte0;
            }
        }

        public a(int i1, int j1)
        {
            a = NSLoggerClient.this;
            super();
            d = j1;
            b = new byte[256];
            c = 6;
            b(i1, 0);
            b(d, 10);
            a(0L);
            b(Thread.currentThread().getId());
        }

        public a(LogRecord logrecord, int i1)
        {
            a = NSLoggerClient.this;
            super();
            d = i1;
            b = new byte[logrecord.getMessage().length() + 64];
            c = 6;
            a(logrecord.getMillis());
            b(0, 0);
            b(d, 10);
            a(Long.toString(logrecord.getThreadID()), 4);
            a(logrecord.getLevel().intValue(), 6);
            a((new StringBuilder()).append(logrecord.getSourceClassName()).append(".").append(logrecord.getSourceMethodName()).toString(), 13);
            a(logrecord.getMessage(), 7);
        }
    }


    protected static Charset k = Charset.forName("utf-8");
    private static android.net.wifi.WifiManager.MulticastLock m;
    Context a;
    int b;
    String c;
    String d;
    String e;
    String f;
    int g;
    final AtomicInteger h;
    LoggingWorker i;
    Handler j;
    private final boolean l;

    public NSLoggerClient(Context context)
    {
        l = true;
        h = new AtomicInteger(0);
        Log.i("NSLogger", "NSLoggerClient created");
        a = context.getApplicationContext();
        if (m == null)
        {
            synchronized (getClass())
            {
                if (m == null)
                {
                    m = ((WifiManager)context.getSystemService("wifi")).createMulticastLock("NSLoggerBonjourLock");
                    m.setReferenceCounted(true);
                }
            }
        }
        b = 6;
        return;
        context;
        class1;
        JVM INSTR monitorexit ;
        throw context;
    }

    static android.net.wifi.WifiManager.MulticastLock a()
    {
        return m;
    }

    private void b()
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (i != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i = new LoggingWorker();
        i.n.add(Thread.currentThread());
        i.start();
        flag = true;
        this;
        JVM INSTR monitorexit ;
_L2:
        if (i.m.get())
        {
            break MISSING_BLOCK_LABEL_157;
        }
        flag1 = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        i.n.add(Thread.currentThread());
        flag1 = true;
        LockSupport.parkUntil(this, System.currentTimeMillis() + 100L);
        flag = flag1;
        if (!Thread.interrupted()) goto _L2; else goto _L3
_L3:
        Thread.currentThread().interrupt();
        flag = flag1;
          goto _L2
        Object obj;
        obj;
        Log.e("NSLogger", (new StringBuilder()).append("Exception catched in startLoggingThreadIfNeeded: ").append(((Exception) (obj)).toString()).toString());
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(String s)
    {
        a(null, 0, s);
    }

    public final void a(String s, int i1, String s1)
    {
        a(null, 0, null, s, i1, s1);
    }

    public final void a(String s, int i1, String s1, String s2, int j1, String s3)
    {
        boolean flag = false;
        b();
        if (j != null)
        {
            a a1 = new a(0, h.getAndIncrement());
            a1.a(j1, 6);
            if (s != null)
            {
                a1.a(s, 11);
                if (i1 != 0)
                {
                    a1.b(i1, 12);
                }
            }
            if (s1 != null)
            {
                a1.a(s1, 13);
            }
            if (s2 != null && !s2.isEmpty())
            {
                a1.a(s2, 5);
            }
            a1.a(s3, 7);
            i1 = ((flag) ? 1 : 0);
            if ((b & 1) != 0)
            {
                i1 = 1;
            }
            if (i1 != 0)
            {
                a1.b();
            }
            j.sendMessage(j.obtainMessage(3, a1));
            if (i1 != 0)
            {
                a1.c();
                return;
            }
        }
    }

    public final void a(String s, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (j == null) goto _L2; else goto _L1
_L1:
        Properties properties;
        properties = new Properties();
        properties.setProperty("bonjourService", s1);
        properties.setProperty("bonjourType", s);
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        properties.setProperty("useSSL", s);
        j.sendMessage(j.obtainMessage(5, properties));
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = s1;
        e = s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        b = b | 4;
          goto _L3
        s;
        throw s;
        b = b & -5;
          goto _L3
    }

}
