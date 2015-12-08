// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.UUID;
import p.bk.e;
import p.bl.b;
import p.bn.d;

// Referenced classes of package p.bm:
//            f, e, i, d

public class p.bm.a extends f
{
    private class a
    {

        final p.bm.a a;
        private boolean b;
        private BluetoothAdapter c;
        private final String d = "BluetoothAdapterMonitor";
        private Thread e;

        static boolean a(a a1)
        {
            return a1.b;
        }

        private void b()
        {
            if (c != null && !c.isEnabled())
            {
                p.bm.a.a(a, "Bluetooth adapter has been disabled.", new p.ax.a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", p.ax.b.b));
            }
        }

        static void b(a a1)
        {
            a1.b();
        }

        public void a()
        {
            b = true;
            e.interrupt();
        }

        public a(BluetoothAdapter bluetoothadapter)
        {
            a = p.bm.a.this;
            super();
            b = false;
            c = null;
            e = null;
            if (bluetoothadapter == null)
            {
                throw new IllegalArgumentException("BluetoothAdapter cannot be null.");
            } else
            {
                c = bluetoothadapter;
                e = new Thread(new _cls1(this, p.bm.a.this));
                e.setName("BluetoothAdapterMonitor");
                e.setDaemon(true);
                e.start();
                return;
            }
        }
    }

    private class b extends Thread
    {

        byte a[];
        final p.bm.a b;
        private Boolean c;

        private void b()
        {
            p.bk.e.a("BTTransport: Waiting for incoming RFCOMM connect", "", p.bl.b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            boolean flag;
            p.bm.a.a(b, p.bm.a.a(b).accept());
            flag = c.booleanValue();
label0:
            {
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    if (!p.bm.a.d(b) && p.bm.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
                    {
                        Object obj;
                        IOException ioexception1;
                        try
                        {
                            p.bm.a.a(b).close();
                        }
                        catch (IOException ioexception) { }
                        p.bm.a.a(b, null);
                    }
                }
                return;
            }
            p.bk.e.a("BTTransport: RFCOMM Connection Accepted", p.bk.e.a(p.bm.a.b(b).getRemoteDevice()), p.bl.b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            p.bm.a.a(b, p.bm.a.b(b).getOutputStream());
            p.bm.a.a(b, p.bm.a.b(b).getInputStream());
            b.f();
            if (!p.bm.a.d(b) && p.bm.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
            {
                try
                {
                    p.bm.a.a(b).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                p.bm.a.a(b, null);
                return;
            }
            continue; /* Loop/switch isn't completed */
            obj;
            if (!c.booleanValue())
            {
                if (p.bm.a.c(b) == null || p.bm.a.c(b).isEnabled())
                {
                    break MISSING_BLOCK_LABEL_342;
                }
                p.bm.a.a(b, "Bluetooth Adapater has been disabled.", new p.ax.a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", ((Throwable) (obj)), p.ax.b.b));
            }
_L1:
            if (!p.bm.a.d(b) && p.bm.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
            {
                try
                {
                    p.bm.a.a(b).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                p.bm.a.a(b, null);
                return;
            }
            continue; /* Loop/switch isn't completed */
            p.bm.a.a(b, "Failed to accept connection", ((Exception) (obj)));
              goto _L1
            if (true) goto _L3; else goto _L2
_L3:
            break MISSING_BLOCK_LABEL_101;
_L2:
            obj;
            if (!p.bm.a.d(b) && p.bm.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
            {
                try
                {
                    p.bm.a.a(b).close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception1) { }
                p.bm.a.a(b, null);
            }
            throw obj;
        }

        private void c()
        {
            int i1 = p.bm.a.e(b).read(a);
            Exception exception;
            if (i1 == -1)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            try
            {
                b.a(a, i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
            break MISSING_BLOCK_LABEL_91;
            exception;
            if (c.booleanValue())
            {
                break MISSING_BLOCK_LABEL_175;
            }
            if (p.bm.a.c(b) != null && !p.bm.a.c(b).isEnabled())
            {
                p.bm.a.a(b, "Bluetooth Adapater has been disabled.", new p.ax.a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", exception, p.ax.b.b));
                return;
            }
            break MISSING_BLOCK_LABEL_139;
            if (!c.booleanValue())
            {
                String s = (new StringBuilder()).append("Failure in BTTransport reader thread: ").append(exception.toString()).toString();
                p.bn.d.a(s, exception);
                p.bm.a.a(b, s, exception);
                return;
            }
            break MISSING_BLOCK_LABEL_175;
            p.bm.a.a(b, "Failed to read from Bluetooth transport.", exception);
            return;
            if (!c.booleanValue())
            {
                p.bn.d.a("End of stream reached!");
                p.bm.a.a(b, "End of stream reached.", null);
            }
        }

        public void a()
        {
            c = Boolean.valueOf(true);
        }

        public void run()
        {
            b();
            for (; !c.booleanValue(); c()) { }
        }

        private b()
        {
            b = p.bm.a.this;
            super();
            a = new byte[4096];
            c = Boolean.valueOf(false);
        }

    }


    private static final UUID a = new UUID(0x936da01f9abd4d9dL, 0x80c702af85c822a8L);
    private BluetoothAdapter b;
    private BluetoothSocket c;
    private InputStream d;
    private UUID e;
    private a f;
    private b g;
    private OutputStream h;
    private BluetoothServerSocket i;
    private String j;
    private boolean k;
    private boolean l;

    public p.bm.a(p.bm.d d1, boolean flag)
    {
        super(d1);
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

    static BluetoothServerSocket a(p.bm.a a1)
    {
        return a1.i;
    }

    static BluetoothServerSocket a(p.bm.a a1, BluetoothServerSocket bluetoothserversocket)
    {
        a1.i = bluetoothserversocket;
        return bluetoothserversocket;
    }

    static BluetoothSocket a(p.bm.a a1, BluetoothSocket bluetoothsocket)
    {
        a1.c = bluetoothsocket;
        return bluetoothsocket;
    }

    static InputStream a(p.bm.a a1, InputStream inputstream)
    {
        a1.d = inputstream;
        return inputstream;
    }

    static OutputStream a(p.bm.a a1, OutputStream outputstream)
    {
        a1.h = outputstream;
        return outputstream;
    }

    static void a(p.bm.a a1, String s, Exception exception)
    {
        a1.b(s, exception);
    }

    static BluetoothSocket b(p.bm.a a1)
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
        p.bk.e.a((new StringBuilder()).append("BTTransport.disconnect: ").append(s2).toString(), null, p.bl.b.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
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
        p.bn.d.a("Failed to stop transport reader thread.", exception1);
          goto _L5
        exception1;
        p.bn.d.a("Failed to stop adapter monitor thread.", exception1);
          goto _L6
        exception1;
        p.bn.d.a("Failed to close serverSocket", exception1);
          goto _L7
        exception1;
        p.bn.d.a("Failed to close activeSocket", exception1);
          goto _L8
        exception1;
        p.bn.d.a("Failed to close input stream", exception1);
          goto _L9
        exception1;
        p.bn.d.a("Failed to close output stream", exception1);
          goto _L10
        s;
        p.bn.d.a("Failed to notify of transport disconnect ", s);
          goto _L11
_L4:
        a(s, exception);
          goto _L11
        s;
        p.bn.d.a("Failed to notify of transport error ", s);
          goto _L11
    }

    static BluetoothAdapter c(p.bm.a a1)
    {
        return a1.b;
    }

    static boolean d(p.bm.a a1)
    {
        return a1.k;
    }

    static InputStream e(p.bm.a a1)
    {
        return a1.d;
    }

    public int a(BluetoothSocket bluetoothsocket)
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

    public BluetoothSocket a(BluetoothServerSocket bluetoothserversocket)
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

    public void a()
        throws p.ax.a
    {
        if (i != null)
        {
            return;
        }
        b = BluetoothAdapter.getDefaultAdapter();
        if (b == null)
        {
            throw new p.ax.a("No Bluetooth adapter found. Bluetooth adapter must exist to communicate with SYNC.", p.ax.b.a);
        }
        try
        {
            if (!b.isEnabled())
            {
                throw new p.ax.a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", p.ax.b.b);
            }
        }
        catch (SecurityException securityexception)
        {
            throw new p.ax.a("Insufficient permissions to interact with the Bluetooth Adapter.", p.ax.b.h);
        }
        f = new a(b);
        int i1;
        try
        {
            i = b.listenUsingRfcommWithServiceRecord("SyncProxy", e);
            i1 = a(a(i));
            j = (new StringBuilder()).append("Accepting Connections on SDP Server Port Number: ").append(i1).append("\r\n").toString();
            j = (new StringBuilder()).append(j).append("Keep Server Socket Open: ").append(k).toString();
        }
        catch (IOException ioexception)
        {
            throw new p.ax.a("Could not open connection to SYNC.", p.ax.b.c);
        }
        catch (Exception exception)
        {
            if (!b.isEnabled())
            {
                throw new p.ax.a("Bluetooth adapter must be on to instantiate a SyncProxy object.", p.ax.b.b);
            }
            if (((p.ax.a)exception).a() == p.ax.b.c)
            {
                throw new p.ax.a("Could not open connection to SYNC.", p.ax.b.c);
            } else
            {
                throw new p.ax.a("Could not open connection to SYNC.", exception, p.ax.b.j);
            }
        }
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        throw new p.ax.a("Could not open connection to SYNC.", p.ax.b.c);
        if (i == null)
        {
            throw new p.ax.a("Could not open connection to SYNC.", p.ax.b.j);
        } else
        {
            p.bk.e.a((new StringBuilder()).append("BTTransport: listening for incoming connect to service ID ").append(e).toString(), null, p.bl.b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            g = new b();
            g.setName("TransportReader");
            g.setDaemon(true);
            g.start();
            p.bm.e.a();
            return;
        }
    }

    public boolean a(byte abyte0[], int i1, int j1)
    {
        try
        {
            h.write(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            p.bn.d.a((new StringBuilder()).append("Error writing to Bluetooth socket: ").append(abyte0.toString()).toString(), abyte0);
            try
            {
                a("Error writing to Bluetooth socket:", ((Exception) (abyte0)));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                p.bn.d.a("Failed to notify of transport error", abyte0);
            }
            return false;
        }
        return true;
    }

    public void b()
    {
        b(null, null);
    }

    public i c()
    {
        return i.a;
    }

    public String d()
    {
        return j;
    }


    // Unreferenced inner class p/bm/a$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        final p.bm.a a;
        final a b;

        public void run()
        {
            do
            {
                if (a.a(b))
                {
                    break;
                }
                p.bm.a.b(b);
                try
                {
                    Thread.sleep(15000L);
                    continue;
                }
                catch (InterruptedException interruptedexception) { }
                break;
            } while (true);
        }

            
            {
                b = a1;
                a = a2;
                super();
            }
    }

}
