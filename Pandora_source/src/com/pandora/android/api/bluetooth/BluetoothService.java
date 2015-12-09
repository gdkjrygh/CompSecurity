// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;
import java.io.IOException;
import java.io.InputStream;
import p.cw.c;
import p.cx.g;
import p.cx.v;
import p.df.a;
import p.dm.m;

// Referenced classes of package com.pandora.android.api.bluetooth:
//            a

public class BluetoothService extends Service
{
    class a extends Thread
    {

        p.cy.a a;
        boolean b;
        long c;
        Object d;
        int e;
        final BluetoothService f;

        private void e()
            throws Exception
        {
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            if (a != null && !a.d())
            {
                a = null;
                c = 10000L;
                e = e + 1;
                throw new Exception("Bluetooth not enabled, In order to use Pandora Link enable Bluetooth");
            }
            break MISSING_BLOCK_LABEL_63;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            obj;
            JVM INSTR monitorexit ;
        }

        public p.cy.a a()
            throws Exception
        {
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            p.cy.a a1 = a;
            if (a1 != null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            a = d();
            com.pandora.android.api.bluetooth.BluetoothService.b("getConnection() - initBluetoothConnection");
            a1 = a;
            obj;
            JVM INSTR monitorexit ;
            return a1;
            Object obj1;
            obj1;
            com.pandora.android.api.bluetooth.BluetoothService.b("getConnection() - error");
            a = null;
            if (!"Bluetooth is not available".equals(((Exception) (obj1)).getMessage()))
            {
                break MISSING_BLOCK_LABEL_77;
            }
            com.pandora.android.api.bluetooth.BluetoothService.a(((Exception) (obj1)).getMessage());
            obj;
            JVM INSTR monitorexit ;
            return null;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            if ("Bluetooth not enabled, In order to use Pandora Link enable Bluetooth".equals(((Exception) (obj1)).getMessage().trim()))
            {
                com.pandora.android.api.bluetooth.BluetoothService.a(f, true);
                c = 10000L;
                e = e + 1;
            }
            throw obj1;
        }

        public void a(Exception exception, String s1)
        {
            s1 = (new StringBuilder()).append(s1).append(exception.getMessage()).toString();
            if ("Bluetooth not enabled, In order to use Pandora Link enable Bluetooth".equals(exception.getMessage()))
            {
                if (e == 1 || (long)e > 60L)
                {
                    com.pandora.android.api.bluetooth.BluetoothService.a(exception.getMessage());
                    if (e != 1)
                    {
                        e = 0;
                    }
                }
                return;
            } else
            {
                com.pandora.android.api.bluetooth.BluetoothService.a(s1);
                return;
            }
        }

        public void b()
        {
            com.pandora.android.api.bluetooth.BluetoothService.b("shutdown()");
            synchronized (d)
            {
                b = true;
                if (a != null)
                {
                    a.h();
                    a.g();
                    a = null;
                }
            }
            com.pandora.android.api.bluetooth.BluetoothService.b("shutdown() complete");
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean c()
        {
            boolean flag;
            synchronized (d)
            {
                flag = b;
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public p.cy.a d()
            throws Exception
        {
            com.pandora.android.api.bluetooth.a a1 = new com.pandora.android.api.bluetooth.a();
            a1.a();
            return a1;
        }

        public void run()
        {
            Looper.prepare();
_L2:
            if (c())
            {
                break MISSING_BLOCK_LABEL_131;
            }
            if (!p.cy.b.a())
            {
                com.pandora.android.api.bluetooth.BluetoothService.a("Bluetooth not supported prior to Android 2.0");
                return;
            }
            p.cy.a a1 = a();
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            Exception exception;
            try
            {
                a1.b();
            }
            catch (IOException ioexception)
            {
                try
                {
                    e();
                    com.pandora.android.api.bluetooth.BluetoothService.a("Bluetooth server (accept) was canceled");
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    a(exception, "Unable to initialize Bluetooth Connection. Reason: ");
                    try
                    {
                        Thread.sleep(c);
                    }
                    catch (InterruptedException interruptedexception) { }
                    if (!com.pandora.android.api.bluetooth.BluetoothService.b(f))
                    {
                        c = Math.min(c * 2L, 60000L);
                    } else
                    {
                        c = 500L;
                        com.pandora.android.api.bluetooth.BluetoothService.a(f, false);
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            f.b(a1);
            e = 0;
            continue; /* Loop/switch isn't completed */
            com.pandora.android.api.bluetooth.BluetoothService.b("thread stopped.");
            return;
            return;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public a()
        {
            f = BluetoothService.this;
            super("BluetoothServerThread");
            b = false;
            c = 500L;
            d = new Object();
            e = 0;
        }
    }


    protected static BluetoothService a = null;
    protected p.ch.a b;
    private a c;
    private v d;
    private boolean e;
    private boolean f;
    private BroadcastReceiver g;

    public BluetoothService()
    {
        c = null;
        e = false;
        b = null;
        f = false;
        g = null;
    }

    static v a(BluetoothService bluetoothservice)
    {
        return bluetoothservice.d;
    }

    protected static void a(String s1)
    {
        p.df.a.c("BluetoothService", (new StringBuilder()).append("PANDORALINK [BluetoothService] ").append(s1).toString());
    }

    static boolean a(BluetoothService bluetoothservice, boolean flag)
    {
        bluetoothservice.e = flag;
        return flag;
    }

    public static void b()
    {
        a("close service");
        if (a != null)
        {
            a.a();
        }
    }

    protected static void b(String s1)
    {
        p.df.a.a("BluetoothService", (new StringBuilder()).append("PANDORALINK [BluetoothService] ").append(s1).toString());
    }

    static boolean b(BluetoothService bluetoothservice)
    {
        return bluetoothservice.e;
    }

    private static f d()
    {
        Object obj;
        if (a != null)
        {
            if ((obj = b.a) != null && (obj = ((b) (obj)).b()) != null)
            {
                return ((c) (obj)).x();
            }
        }
        return null;
    }

    protected void a()
    {
        a("Stopping bluetooth connection thread");
        if (c != null)
        {
            c.b();
            if (d != null)
            {
                b("cancel waitForLinkConnectTimer");
                d.a();
            }
            try
            {
                c.join(1000L);
            }
            catch (InterruptedException interruptedexception) { }
            c = null;
        }
    }

    public void a(p.dm.b b1)
    {
        b("onLinkConnected");
        boolean flag;
        if (com.pandora.android.provider.b.a() && b.a.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            m.bj = true;
            s.g(this);
        }
        p.cx.c.a().a(b1);
    }

    public void b(p.dm.b b1)
    {
        d = new v();
        d.a(new p.cx.v.a(b1) {

            final p.dm.b a;
            final BluetoothService b;

            public void a(g g1)
            {
                g1 = a.e();
                if (g1 == null)
                {
                    try
                    {
                        com.pandora.android.api.bluetooth.BluetoothService.a("lost bluetooth connection, quiting");
                        com.pandora.android.api.bluetooth.BluetoothService.a(b).a();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (g g1)
                    {
                        com.pandora.android.api.bluetooth.BluetoothService.a("issue with bluetooth connection, quiting");
                    }
                    break MISSING_BLOCK_LABEL_70;
                }
                if (g1.available() > 0)
                {
                    com.pandora.android.api.bluetooth.BluetoothService.b("detected available on the bluetooth stream");
                    b.a(a);
                    com.pandora.android.api.bluetooth.BluetoothService.a(b).a();
                    return;
                }
                break MISSING_BLOCK_LABEL_80;
                com.pandora.android.api.bluetooth.BluetoothService.a(b).a();
            }

            
            {
                b = BluetoothService.this;
                a = b1;
                super();
            }
        }, 0, 300);
    }

    protected boolean c()
    {
        if (!p.cy.b.a())
        {
            a("No Bluetooth Available, service cannot be started");
            return false;
        }
        if (!p.cy.b.b())
        {
            a("Bluetooth disabled, service will be started when enabled.");
            return false;
        }
        if (!b.a.u())
        {
            a("Bluetooth For Automotive Disabled, service will be started when enabled.");
            return false;
        } else
        {
            return true;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        a = this;
        d();
        b("onCreate");
        if (!c())
        {
            f = true;
            stopSelf();
            return;
        }
        if (c == null)
        {
            a("Initializing Bluetooth server thread");
            c = new a();
            c.start();
        }
        if (!s.u())
        {
            b = new p.ch.a(this);
            b.b();
        }
        p.cy.c c1 = p.cy.b.c();
        g = c1.m();
        if (g != null)
        {
            registerReceiver(g, c1.a());
        }
        p.df.a.c("BluetoothService", "Initializing HAP.");
        com.pandora.android.hap.a.a().a(this, null);
    }

    public void onDestroy()
    {
        a("shutting down service");
        com.pandora.android.hap.a.a().c();
        a();
        if (b != null)
        {
            b.a();
            b = null;
        }
        b("destroy complete");
        if (g != null)
        {
            try
            {
                unregisterReceiver(g);
            }
            catch (Exception exception) { }
        }
        a = null;
        f = false;
    }

    public void onStart(Intent intent, int i)
    {
        b("onStart");
        while (f || c()) 
        {
            return;
        }
        stopSelf();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        b("onStartCommand");
        if (f)
        {
            return 2;
        }
        if (!c())
        {
            stopSelf();
            return 2;
        } else
        {
            return 1;
        }
    }

}
