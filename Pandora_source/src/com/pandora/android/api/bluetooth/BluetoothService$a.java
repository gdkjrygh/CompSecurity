// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.os.Looper;
import java.io.IOException;
import p.cy.a;
import p.cy.b;

// Referenced classes of package com.pandora.android.api.bluetooth:
//            BluetoothService, a

class e extends Thread
{

    a a;
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

    public a a()
        throws Exception
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        a a1 = a;
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

    public void a(Exception exception, String s)
    {
        s = (new StringBuilder()).append(s).append(exception.getMessage()).toString();
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
            com.pandora.android.api.bluetooth.BluetoothService.a(s);
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

    public a d()
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
        a a1 = a();
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

    public (BluetoothService bluetoothservice)
    {
        f = bluetoothservice;
        super("BluetoothServerThread");
        b = false;
        c = 500L;
        d = new Object();
        e = 0;
    }
}
