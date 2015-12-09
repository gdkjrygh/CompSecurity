// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.pandora.android.Main;
import com.pandora.android.api.bluetooth.BluetoothService;
import com.pandora.radio.util.b;
import com.pandora.radio.util.i;
import java.io.IOException;
import org.json.JSONObject;
import p.cx.c;
import p.dm.m;

// Referenced classes of package com.pandora.android.hap:
//            b

public class a extends b
{

    private static volatile a a;
    private com.airbiquity.hap.a b;
    private int c;
    private com.pandora.android.hap.b d;
    private BluetoothService e;
    private String f;
    private Thread g;
    private ServiceConnection h;
    private com.airbiquity.hap.b i;

    protected a()
    {
        b = null;
        c = -1;
        d = null;
        e = null;
        f = null;
        g = null;
        h = new ServiceConnection() {

            final a a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                p.df.a.a("HAPClient", "Connected to HAP Service.");
                a.a(a, com.airbiquity.hap.a.a(ibinder));
                try
                {
                    a.a(a, com.pandora.android.hap.a.b(a).a("Pandora", "3.0", com/pandora/android/Main.getName(), a.d(a)));
                    p.df.a.a("HAPClient", (new StringBuilder()).append("HAP initialized. Connection Id: ").append(com.pandora.android.hap.a.c(a)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname)
                {
                    p.df.a.b("HAPClient", "Error during aqHapInit().", componentname);
                }
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                a.a(a, null);
                p.df.a.a("HAPClient", "Disconnected from HAP Service");
            }

            
            {
                a = a.this;
                super();
            }
        };
        i = new com.airbiquity.hap.b.a() {

            final a a;

            public void a(int j)
                throws RemoteException
            {
                p.df.a.a("HAPClient", (new StringBuilder()).append("onHapConnectionStateChange(): connectionState = ").append(j).toString());
                c c1 = p.cx.c.a();
                if (j == 0)
                {
                    if (!c1.J())
                    {
                        a.a(a, a.d());
                        p.df.a.a("HAPClient", "initializing PandoraLink connection");
                        c1.b(a.a(a));
                        a.b();
                    }
                } else
                if (j == 1 && c1.J())
                {
                    p.df.a.a("HAPClient", "PandoraLink disconnect");
                    c1.j();
                    a.a(a).g();
                    a.a(a, null);
                    a.e(a).interrupt();
                    a.a(a, null);
                    return;
                }
            }

            public void a(int j, byte abyte0[], String s)
                throws RemoteException
            {
                p.df.a.a("HAPClient", (new StringBuilder()).append("onHapCommandReceived(): payloadLength = ").append(abyte0.length).append(", contentType = ").append(s).append(", payload in hex = ").append(m.d(abyte0)).toString());
                if (!"application/json".equals(s)) goto _L2; else goto _L1
_L1:
                byte abyte1[] = p.bn.a.a((new JSONObject(new String(abyte0, "UTF-8"))).optString("payload"));
_L5:
                try
                {
                    a(abyte1);
                    com.pandora.android.hap.a.b(a).a(com.pandora.android.hap.a.c(a), j, new byte[0], "application/octet-stream");
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[]) { }
                break MISSING_BLOCK_LABEL_155;
_L2:
                if ("application/binary".equals(s)) goto _L4; else goto _L3
_L3:
                abyte1 = abyte0;
                if (!"message/external-body".equals(s)) goto _L5; else goto _L4
_L4:
                abyte1 = p.bn.a.a(new String(abyte0, "UTF-8"));
                  goto _L5
                try
                {
                    p.df.a.a("HAPClient", (new StringBuilder()).append("onHapCommandReceived(): INVALID FRAME, ignoring = ").append(m.d(abyte1)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    p.df.a.a("HAPClient", (new StringBuilder()).append("onHapCommandReceived(): not base64 ").append(abyte0).toString());
                }
                abyte0.printStackTrace();
                return;
            }

            public void a(byte abyte0[])
                throws p.dm.i
            {
                p.dq.c.a(abyte0);
                c c1 = p.cx.c.a();
                if (a.a(a) == null || a.a(a).a())
                {
                    p.df.a.a("HAPClient", "onFrameRead - connection is closed, ignoring frame");
                } else
                {
                    if (!c1.G())
                    {
                        a.f(a).a(a.a(a));
                    }
                    if (c1.J())
                    {
                        try
                        {
                            p.df.a.a("HAPClient", "onFrameRead - writing bytes to pandora");
                            a.a(a).a(abyte0);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (byte abyte0[])
                        {
                            p.df.a.a("HAPClient", (new StringBuilder()).append("error writing to Pandora ").append(abyte0).toString());
                        }
                        abyte0.printStackTrace();
                        return;
                    }
                }
            }

            
            {
                a = a.this;
                super();
            }
        };
    }

    static int a(a a1, int j)
    {
        a1.c = j;
        return j;
    }

    static com.airbiquity.hap.a a(a a1, com.airbiquity.hap.a a2)
    {
        a1.b = a2;
        return a2;
    }

    public static a a()
    {
        com/pandora/android/hap/a;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a = new a();
        }
        a1 = a;
        com/pandora/android/hap/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    static com.pandora.android.hap.b a(a a1)
    {
        return a1.d;
    }

    static com.pandora.android.hap.b a(a a1, com.pandora.android.hap.b b1)
    {
        a1.d = b1;
        return b1;
    }

    static Thread a(a a1, Thread thread)
    {
        a1.g = thread;
        return thread;
    }

    static com.airbiquity.hap.a b(a a1)
    {
        return a1.b;
    }

    private void b(BluetoothService bluetoothservice, String s)
    {
        e = bluetoothservice;
        String s1 = f;
        if (!com.pandora.radio.util.i.a(s))
        {
            s1 = s;
        }
        if (com.pandora.radio.util.i.a(s1))
        {
            p.df.a.a("HAPClient", "Cant bind to HAP service. Is the HAP Service available?");
            return;
        }
        if (!bluetoothservice.bindService(new Intent(s1), h, 0))
        {
            p.df.a.a("HAPClient", "Cant bind to HAP service. Is the HAP Service available?");
            return;
        } else
        {
            f = s;
            p.df.a.a("HAPClient", "Binding to HAP service.");
            return;
        }
    }

    static int c(a a1)
    {
        return a1.c;
    }

    static com.airbiquity.hap.b d(a a1)
    {
        return a1.i;
    }

    static com.pandora.android.hap.b d()
    {
        return e();
    }

    private static com.pandora.android.hap.b e()
    {
        return new com.pandora.android.hap.b();
    }

    static Thread e(a a1)
    {
        return a1.g;
    }

    static BluetoothService f(a a1)
    {
        return a1.e;
    }

    public void a(BluetoothService bluetoothservice, String s)
    {
        b(bluetoothservice, s);
    }

    public void a(String s)
    {
        b(e, s);
    }

    public void b()
    {
        g = new Thread((new StringBuilder()).append(getClass().getSimpleName()).append("-setupResponseThread").toString()) {

            final a a;

            public void run()
            {
_L5:
                if (a.a(a) == null) goto _L2; else goto _L1
_L1:
                boolean flag = a.a(a).a();
                if (!flag) goto _L3; else goto _L2
_L2:
                p.df.a.a("HAPClient", "response thread COMPLETED");
                return;
_L3:
                byte abyte0[];
                com.airbiquity.hap.a a1;
                abyte0 = a.a(a).b();
                a1 = com.pandora.android.hap.a.b(a);
                if (a1 == null) goto _L5; else goto _L4
_L4:
                p.df.a.a("HAPClient", (new StringBuilder()).append("aqSendMsg(): connectionId = ").append(com.pandora.android.hap.a.c(a)).append(", sequenceNumber = ").append(0).append(", responsePayload = ").append(m.d(abyte0)).append(", responseContentType = ").append("application/octet-stream").toString());
                com.pandora.android.hap.a.b(a).a(com.pandora.android.hap.a.c(a), 0, abyte0, "application/octet-stream");
                  goto _L5
                Object obj;
                obj;
                p.df.a.a("HAPClient", (new StringBuilder()).append("error in hapService.aqSendMsg ").append(obj).toString());
                ((RemoteException) (obj)).printStackTrace();
                  goto _L5
                obj;
                p.df.a.a("HAPClient", (new StringBuilder()).append("error in reading from pandora ").append(obj).toString());
                ((IOException) (obj)).printStackTrace();
                  goto _L2
            }

            
            {
                a = a.this;
                super(s);
            }
        };
        g.start();
    }

    public void c()
    {
        if (e == null || h == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        e.unbindService(h);
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        p.df.a.c("HAPClient", "Failed to unbind HAP service.", illegalargumentexception);
        return;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
