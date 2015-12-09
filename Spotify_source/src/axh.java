// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import com.ford.syncV4.transport.SiphonServer;
import com.ford.syncV4.transport.TransportType;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.UUID;

public final class axh extends axo
{

    private static final UUID b = new UUID(0x936da01f9abd4d9dL, 0x80c702af85c822a8L);
    private BluetoothAdapter c;
    private BluetoothSocket d;
    private InputStream e;
    private UUID f;
    private axi g;
    private axj h;
    private OutputStream i;
    private BluetoothServerSocket j;
    private String k;
    private boolean l;
    private boolean m;

    public axh(axm axm, boolean flag)
    {
        super(axm);
        c = null;
        d = null;
        e = null;
        f = b;
        g = null;
        h = null;
        i = null;
        j = null;
        k = "";
        l = true;
        m = false;
        l = flag;
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

    static BluetoothServerSocket a(axh axh1)
    {
        return axh1.j;
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

    static BluetoothSocket a(axh axh1, BluetoothSocket bluetoothsocket)
    {
        axh1.d = bluetoothsocket;
        return bluetoothsocket;
    }

    static InputStream a(axh axh1, InputStream inputstream)
    {
        axh1.e = inputstream;
        return inputstream;
    }

    static OutputStream a(axh axh1, OutputStream outputstream)
    {
        axh1.i = outputstream;
        return outputstream;
    }

    static void a(axh axh1, String s, Exception exception)
    {
        axh1.b(s, exception);
    }

    static BluetoothSocket b(axh axh1)
    {
        return axh1.d;
    }

    private void b(String s, Exception exception)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = m;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m = true;
        Object obj;
        String s1;
        if (s == null)
        {
            obj = "";
        } else
        {
            obj = s;
        }
        s1 = ((String) (obj));
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s1 = (new StringBuilder()).append(((String) (obj))).append(", ").append(exception.toString()).toString();
        axg.a((new StringBuilder("BTTransport.disconnect: ")).append(s1).toString(), null, InterfaceActivityDirection.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        if (h != null)
        {
            h.a = Boolean.valueOf(true);
            h = null;
        }
_L5:
        if (g != null)
        {
            obj = g;
            obj.a = true;
            ((axi) (obj)).c.interrupt();
            g = null;
        }
_L6:
        if (j != null)
        {
            j.close();
            j = null;
        }
_L7:
        if (d != null)
        {
            d.close();
            d = null;
        }
_L8:
        if (e != null)
        {
            e.close();
            e = null;
        }
_L9:
        if (i != null)
        {
            i.close();
            i = null;
        }
_L10:
        if (exception != null) goto _L4; else goto _L3
_L3:
        a(s);
_L11:
        m = false;
          goto _L1
        s;
        throw s;
        Exception exception1;
        exception1;
        axt.a("Failed to stop transport reader thread.", exception1);
          goto _L5
        exception1;
        axt.a("Failed to stop adapter monitor thread.", exception1);
          goto _L6
        exception1;
        axt.a("Failed to close serverSocket", exception1);
          goto _L7
        exception1;
        axt.a("Failed to close activeSocket", exception1);
          goto _L8
        exception1;
        axt.a("Failed to close input stream", exception1);
          goto _L9
        exception1;
        axt.a("Failed to close output stream", exception1);
          goto _L10
        s;
        axt.a("Failed to notify of transport disconnect ", s);
          goto _L11
_L4:
        a(s, exception);
          goto _L11
        s;
        axt.a("Failed to notify of transport error ", s);
          goto _L11
    }

    static BluetoothAdapter c(axh axh1)
    {
        return axh1.c;
    }

    static boolean d(axh axh1)
    {
        return axh1.l;
    }

    static BluetoothServerSocket e(axh axh1)
    {
        axh1.j = null;
        return null;
    }

    static InputStream f(axh axh1)
    {
        return axh1.e;
    }

    public final void a()
    {
        if (j != null)
        {
            return;
        }
        c = BluetoothAdapter.getDefaultAdapter();
        if (c == null)
        {
            throw new SyncException("No Bluetooth adapter found. Bluetooth adapter must exist to communicate with SYNC.", SyncExceptionCause.a);
        }
        try
        {
            if (!c.isEnabled())
            {
                throw new SyncException("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", SyncExceptionCause.b);
            }
        }
        catch (SecurityException securityexception)
        {
            throw new SyncException("Insufficient permissions to interact with the Bluetooth Adapter.", SyncExceptionCause.g);
        }
        g = new axi(this, c);
        int i1;
        try
        {
            j = c.listenUsingRfcommWithServiceRecord("SyncProxy", f);
            i1 = a(a(j));
            k = (new StringBuilder("Accepting Connections on SDP Server Port Number: ")).append(i1).append("\r\n").toString();
            k = (new StringBuilder()).append(k).append("Keep Server Socket Open: ").append(l).toString();
        }
        catch (Exception exception)
        {
            if (!c.isEnabled())
            {
                throw new SyncException("Bluetooth adapter must be on to instantiate a SyncProxy object.", SyncExceptionCause.b);
            } else
            {
                throw new SyncException("Could not open connection to SYNC.", exception, SyncExceptionCause.i);
            }
        }
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        throw new SyncException("Could not open connection to SYNC.", SyncExceptionCause.c);
        k = (new StringBuilder()).append(k).append("Keep Server Socket Open: ").append(l).toString();
        if (j == null)
        {
            throw new SyncException("Could not open connection to SYNC.", SyncExceptionCause.i);
        } else
        {
            axg.a((new StringBuilder("BTTransport: listening for incoming connect to service ID ")).append(f).toString(), null, InterfaceActivityDirection.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            h = new axj(this, (byte)0);
            h.setName("TransportReader");
            h.setDaemon(true);
            h.start();
            SiphonServer.a();
            return;
        }
    }

    public final boolean a(byte abyte0[], int i1, int j1)
    {
        try
        {
            i.write(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            axt.a((new StringBuilder("Error writing to Bluetooth socket: ")).append(abyte0.toString()).toString(), abyte0);
            try
            {
                a("Error writing to Bluetooth socket:", ((Exception) (abyte0)));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                axt.a("Failed to notify of transport error", abyte0);
            }
            return false;
        }
        return true;
    }

    public final void b()
    {
        b(null, null);
    }

    public final TransportType c()
    {
        return TransportType.a;
    }

    public final String d()
    {
        return k;
    }

}
