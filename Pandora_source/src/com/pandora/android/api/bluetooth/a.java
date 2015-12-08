// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class a
    implements p.cy.a
{

    private Object a;
    private BluetoothServerSocket b;
    private BluetoothSocket c;
    private InputStream d;
    private OutputStream e;
    private int f;

    public a()
        throws Exception
    {
        a = new Object();
        f = 2;
        if (!c())
        {
            throw new Exception("Bluetooth is not available");
        }
        if (!d())
        {
            throw new Exception("Bluetooth not enabled, In order to use Pandora Link enable Bluetooth");
        } else
        {
            return;
        }
    }

    protected static void b(String s)
    {
        p.df.a.c("BluetoothConnectionImpl", (new StringBuilder()).append("PANDORALINK [BluetoothConnection] ").append(s).toString());
    }

    public void a()
        throws Exception
    {
        obj;
        JVM INSTR monitorenter ;
        synchronized (a)
        {
            b = BluetoothAdapter.getDefaultAdapter().listenUsingRfcommWithServiceRecord("PandoraLink", UUID.fromString("453994D5-D58B-96F9-6616-B37F586BA2EC"));
        }
        return;
        IOException ioexception;
        ioexception;
        b((new StringBuilder()).append("Error creating ServerSocket from BluetoothAdapter: ").append(ioexception.getMessage()).toString());
        throw ioexception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(String s)
    {
        p.df.a.a("BluetoothConnectionImpl", (new StringBuilder()).append("PANDORALINK [BluetoothConnection] ").append(s).toString());
    }

    public void b()
        throws IOException
    {
        try
        {
            f = 0;
            b("Awaiting bluetooth connection on service PandoraLink");
            c = b.accept();
            d = c.getInputStream();
            e = c.getOutputStream();
            f = 1;
            b("Bluetooth connection established.");
            return;
        }
        catch (IOException ioexception)
        {
            f = 2;
            throw ioexception;
        }
    }

    public boolean c()
    {
        return BluetoothAdapter.getDefaultAdapter() != null;
    }

    public boolean d()
    {
        return c() && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    public InputStream e()
    {
        return d;
    }

    public OutputStream f()
    {
        return e;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        a("closing BluetoothSocket Connection: PandoraLink");
        obj = d;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        a("closing InputStream");
        d.close();
        d = null;
_L1:
        obj = e;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a("closing OutputStream ");
        e.close();
        e = null;
_L2:
        obj = c;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        a("closing BluetoothSocket ");
        c.close();
        c = null;
_L3:
        if (f != 0)
        {
            f = 2;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        a((new StringBuilder()).append("Error closing input stream: ").append(((IOException) (obj1)).getMessage()).toString());
        d = null;
          goto _L1
        obj1;
        throw obj1;
        obj1;
        d = null;
        throw obj1;
        obj1;
        a((new StringBuilder()).append("Error closing output stream: ").append(((IOException) (obj1)).getMessage()).toString());
        e = null;
          goto _L2
        obj1;
        e = null;
        throw obj1;
        obj1;
        a((new StringBuilder()).append("Error closing socket: ").append(((IOException) (obj1)).getMessage()).toString());
        c = null;
          goto _L3
        obj1;
        c = null;
        throw obj1;
          goto _L1
    }

    public void h()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        BluetoothServerSocket bluetoothserversocket = b;
        if (bluetoothserversocket == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        a("closing BluetoothServerSocket - should interrupt accept");
        b.close();
        b = null;
_L1:
        f = 2;
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        a((new StringBuilder()).append("Error closing server socket: ").append(((IOException) (obj1)).getMessage()).toString());
        b = null;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        b = null;
        throw obj1;
    }

    public boolean i()
    {
        return true;
    }
}
