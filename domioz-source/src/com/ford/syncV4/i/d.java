// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.ford.syncV4.a.a;
import com.ford.syncV4.h.a.b;
import com.ford.syncV4.h.e;
import com.ford.syncV4.util.c;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.ford.syncV4.i:
//            a

final class d extends Thread
{

    byte a[];
    final com.ford.syncV4.i.a b;
    private Boolean c;

    private d(com.ford.syncV4.i.a a1)
    {
        b = a1;
        super();
        a = new byte[4096];
        c = Boolean.valueOf(false);
    }

    d(com.ford.syncV4.i.a a1, byte byte0)
    {
        this(a1);
    }

    public final void a()
    {
        c = Boolean.valueOf(true);
    }

    public final void run()
    {
        e.a("BTTransport: Waiting for incoming RFCOMM connect", "", b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        boolean flag;
        com.ford.syncV4.i.a.a(b, com.ford.syncV4.i.a.a(b).accept());
        flag = c.booleanValue();
        {
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (!com.ford.syncV4.i.a.d(b) && com.ford.syncV4.i.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
            {
                Object obj;
                String s;
                IOException ioexception1;
                int i;
                try
                {
                    com.ford.syncV4.i.a.a(b).close();
                }
                catch (IOException ioexception) { }
                com.ford.syncV4.i.a.e(b);
            }
        }
        if (c.booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        i = com.ford.syncV4.i.a.f(b).read(a);
        if (i != -1)
        {
            try
            {
                b.a(a, i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (!c.booleanValue())
                {
                    s = (new StringBuilder("Failure in BTTransport reader thread: ")).append(((Exception) (obj)).toString()).toString();
                    com.ford.syncV4.util.c.a(s, ((Throwable) (obj)));
                    com.ford.syncV4.i.a.a(b, s, ((Exception) (obj)));
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_581;
        e.a("BTTransport: RFCOMM Connection Accepted", e.a(com.ford.syncV4.i.a.b(b).getRemoteDevice()), b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
        com.ford.syncV4.i.a.a(b, com.ford.syncV4.i.a.b(b).getOutputStream());
        com.ford.syncV4.i.a.a(b, com.ford.syncV4.i.a.b(b).getInputStream());
        b.f();
        if (!com.ford.syncV4.i.a.d(b) && com.ford.syncV4.i.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                com.ford.syncV4.i.a.a(b).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            com.ford.syncV4.i.a.e(b);
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (!c.booleanValue())
        {
            if (com.ford.syncV4.i.a.c(b) == null || com.ford.syncV4.i.a.c(b).isEnabled())
            {
                break MISSING_BLOCK_LABEL_437;
            }
            com.ford.syncV4.i.a.a(b, "Bluetooth Adapater has been disabled.", new a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", ((Throwable) (obj)), com.ford.syncV4.a.b.b));
        }
_L1:
        if (!com.ford.syncV4.i.a.d(b) && com.ford.syncV4.i.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                com.ford.syncV4.i.a.a(b).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            com.ford.syncV4.i.a.e(b);
        }
        continue; /* Loop/switch isn't completed */
        com.ford.syncV4.i.a.a(b, "Failed to accept connection", ((Exception) (obj)));
          goto _L1
        obj;
        if (!com.ford.syncV4.i.a.d(b) && com.ford.syncV4.i.a.a(b) != null && !c.booleanValue() && android.os.Build.VERSION.SDK_INT > 16)
        {
            try
            {
                com.ford.syncV4.i.a.a(b).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception1) { }
            com.ford.syncV4.i.a.e(b);
        }
        throw obj;
        obj;
        if (c.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (com.ford.syncV4.i.a.c(b) != null && !com.ford.syncV4.i.a.c(b).isEnabled())
        {
            com.ford.syncV4.i.a.a(b, "Bluetooth Adapater has been disabled.", new a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", ((Throwable) (obj)), com.ford.syncV4.a.b.b));
            continue; /* Loop/switch isn't completed */
        }
        com.ford.syncV4.i.a.a(b, "Failed to read from Bluetooth transport.", ((Exception) (obj)));
        continue; /* Loop/switch isn't completed */
        if (!c.booleanValue())
        {
            com.ford.syncV4.util.c.a("End of stream reached!");
            com.ford.syncV4.i.a.a(b, "End of stream reached.", null);
        }
        if (true) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_102;
_L2:
    }
}
