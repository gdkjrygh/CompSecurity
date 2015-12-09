// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import android.bluetooth.BluetoothAdapter;
import com.ford.syncV4.a.a;

// Referenced classes of package com.ford.syncV4.i:
//            c, a

final class b
{

    final com.ford.syncV4.i.a a;
    private boolean b;
    private BluetoothAdapter c;
    private final String d = "BluetoothAdapterMonitor";
    private Thread e;

    public b(com.ford.syncV4.i.a a1, BluetoothAdapter bluetoothadapter)
    {
        a = a1;
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
            e = new Thread(new c(this, a1));
            e.setName("BluetoothAdapterMonitor");
            e.setDaemon(true);
            e.start();
            return;
        }
    }

    static boolean a(b b1)
    {
        return b1.b;
    }

    static void b(b b1)
    {
        if (b1.c != null && !b1.c.isEnabled())
        {
            com.ford.syncV4.i.a.a(b1.a, "Bluetooth adapter has been disabled.", new a("Bluetooth adapter must be enabled to instantiate a SyncProxy object.", com.ford.syncV4.a.b.b));
        }
    }

    public final void a()
    {
        b = true;
        e.interrupt();
    }
}
