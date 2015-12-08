// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.ford.syncV4.h.a.b;
import com.ford.syncV4.h.e;
import com.ford.syncV4.util.c;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.UUID;

// Referenced classes of package com.ford.syncV4.i:
//            l, d, b, h, 
//            q, g

public final class a extends l
{

    private static final UUID a = new UUID(0x936da01f9abd4d9dL, 0x80c702af85c822a8L);
    private BluetoothAdapter b;
    private BluetoothSocket c;
    private InputStream d;
    private UUID e;
    private com.ford.syncV4.i.b f;
    private d g;
    private OutputStream h;
    private BluetoothServerSocket i;
    private String j;
    private boolean k;
    private boolean l;

    public a(g g1, boolean flag)
    {
        super(g1);
        b = null;
        c = null;
        d = null;
        e = a;
        f = null;
        g = null;
        h = null;
        i = null;
        j = "";
        k = true;
        l = false;
        k = flag;
    }

    private static int a(BluetoothSocket bluetoothsocket)
    {
        int i1 = -1;
        if (bluetoothsocket != null) goto _L2; else goto _L1
_L1:
        int k1 = i1;
_L4:
        return k1;
_L2:
        Field afield[];
        int j1;
        int l1;
        afield = bluetoothsocket.getClass().getDeclaredFields();
        l1 = afield.length;
        j1 = 0;
_L7:
        k1 = i1;
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        Field field;
        field = afield[j1];
        k1 = i1;
        if (!field.getName().equals("mPort")) goto _L6; else goto _L5
_L5:
        field.setAccessible(true);
        k1 = field.getInt(bluetoothsocket);
        i1 = k1;
_L8:
        field.setAccessible(false);
        k1 = i1;
_L6:
        j1++;
        i1 = k1;
          goto _L7
        Object obj;
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
          goto _L8
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
          goto _L8
    }

    static BluetoothServerSocket a(a a1)
    {
        return a1.i;
    }

    private static BluetoothSocket a(BluetoothServerSocket bluetoothserversocket)
    {
        Field afield[];
        int i1;
        int j1;
        afield = bluetoothserversocket.getClass().getDeclaredFields();
        j1 = afield.length;
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        Field field = afield[i1];
        if (!field.getName().equals("mSocket")) goto _L4; else goto _L3
_L3:
        field.setAccessible(true);
        BluetoothSocket bluetoothsocket = (BluetoothSocket)field.get(bluetoothserversocket);
        return bluetoothsocket;
        Object obj;
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
_L5:
        field.setAccessible(false);
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        if (true) goto _L5; else goto _L2
_L2:
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static BluetoothSocket a(a a1, BluetoothSocket bluetoothsocket)
    {
        a1.c = bluetoothsocket;
        return bluetoothsocket;
    }

    static InputStream a(a a1, InputStream inputstream)
    {
        a1.d = inputstream;
        return inputstream;
    }

    static OutputStream a(a a1, OutputStream outputstream)
    {
        a1.h = outputstream;
        return outputstream;
    }

    static void a(a a1, String s, Exception exception)
    {
        a1.b(s, exception);
    }

    static BluetoothSocket b(a a1)
    {
        return a1.c;
    }

    private void b(String s, Exception exception)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = true;
        String s1;
        String s2;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
        }
        s2 = s1;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s2 = (new StringBuilder()).append(s1).append(", ").append(exception.toString()).toString();
        com.ford.syncV4.h.e.a((new StringBuilder("BTTransport.disconnect: ")).append(s2).toString(), null, b.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        if (g != null)
        {
            g.a();
            g = null;
        }
_L5:
        if (f != null)
        {
            f.a();
            f = null;
        }
_L6:
        if (i != null)
        {
            i.close();
            i = null;
        }
_L7:
        if (c != null)
        {
            c.close();
            c = null;
        }
_L8:
        if (d != null)
        {
            d.close();
            d = null;
        }
_L9:
        if (h != null)
        {
            h.close();
            h = null;
        }
_L10:
        if (exception != null) goto _L4; else goto _L3
_L3:
        a(s);
_L11:
        l = false;
          goto _L1
        s;
        throw s;
        Exception exception1;
        exception1;
        com.ford.syncV4.util.c.a("Failed to stop transport reader thread.", exception1);
          goto _L5
        exception1;
        com.ford.syncV4.util.c.a("Failed to stop adapter monitor thread.", exception1);
          goto _L6
        exception1;
        com.ford.syncV4.util.c.a("Failed to close serverSocket", exception1);
          goto _L7
        exception1;
        com.ford.syncV4.util.c.a("Failed to close activeSocket", exception1);
          goto _L8
        exception1;
        com.ford.syncV4.util.c.a("Failed to close input stream", exception1);
          goto _L9
        exception1;
        com.ford.syncV4.util.c.a("Failed to close output stream", exception1);
          goto _L10
        s;
        com.ford.syncV4.util.c.a("Failed to notify of transport disconnect ", s);
          goto _L11
_L4:
        a(s, exception);
          goto _L11
        s;
        com.ford.syncV4.util.c.a("Failed to notify of transport error ", s);
          goto _L11
    }

    static BluetoothAdapter c(a a1)
    {
        return a1.b;
    }

    static boolean d(a a1)
    {
        return a1.k;
    }

    static BluetoothServerSocket e(a a1)
    {
        a1.i = null;
        return null;
    }

    static InputStream f(a a1)
    {
        return a1.d;
    }

    public final void a()
    {
        if (i != null)
        {
            return;
        }
        b = BluetoothAdapter.getDefaultAdapter();
        if (b == null)
        {
            throw new com.ford.syncV4.a.a("No Bluetooth adapter found. Bluetooth adapter must exist to communicate with SYNC.", com.ford.syncV4.a.b.a);
        }
        try
        {
            if (!b.isEnabled())
            {
                throw new com.ford.syncV4.a.a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", com.ford.syncV4.a.b.b);
            }
        }
        catch (SecurityException securityexception)
        {
            throw new com.ford.syncV4.a.a("Insufficient permissions to interact with the Bluetooth Adapter.", com.ford.syncV4.a.b.h);
        }
        f = new com.ford.syncV4.i.b(this, b);
        int i1;
        try
        {
            i = b.listenUsingRfcommWithServiceRecord("SyncProxy", e);
            i1 = a(a(i));
            j = (new StringBuilder("Accepting Connections on SDP Server Port Number: ")).append(i1).append("\r\n").toString();
            j = (new StringBuilder()).append(j).append("Keep Server Socket Open: ").append(k).toString();
        }
        catch (Exception exception)
        {
            if (!b.isEnabled())
            {
                throw new com.ford.syncV4.a.a("Bluetooth adapter must be on to instantiate a SyncProxy object.", com.ford.syncV4.a.b.b);
            } else
            {
                throw new com.ford.syncV4.a.a("Could not open connection to SYNC.", exception, com.ford.syncV4.a.b.j);
            }
        }
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        throw new com.ford.syncV4.a.a("Could not open connection to SYNC.", com.ford.syncV4.a.b.c);
        j = (new StringBuilder()).append(j).append("Keep Server Socket Open: ").append(k).toString();
        if (i == null)
        {
            throw new com.ford.syncV4.a.a("Could not open connection to SYNC.", com.ford.syncV4.a.b.j);
        } else
        {
            com.ford.syncV4.h.e.a((new StringBuilder("BTTransport: listening for incoming connect to service ID ")).append(e).toString(), null, b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            g = new d(this, (byte)0);
            g.setName("TransportReader");
            g.setDaemon(true);
            g.start();
            com.ford.syncV4.i.h.a();
            return;
        }
    }

    public final boolean a(byte abyte0[], int i1, int j1)
    {
        try
        {
            h.write(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Error writing to Bluetooth socket: ")).append(abyte0.toString()).toString(), abyte0);
            try
            {
                a("Error writing to Bluetooth socket:", ((Exception) (abyte0)));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                com.ford.syncV4.util.c.a("Failed to notify of transport error", abyte0);
            }
            return false;
        }
        return true;
    }

    public final void b()
    {
        b(null, null);
    }

    public final int c()
    {
        return q.a;
    }

    public final String d()
    {
        return j;
    }

}
