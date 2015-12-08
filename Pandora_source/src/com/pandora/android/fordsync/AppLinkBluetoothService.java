// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.fordsync;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.content.j;
import com.pandora.android.Main;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.radio.provider.f;
import java.util.Iterator;
import java.util.Set;
import p.ct.a;
import p.ct.b;
import p.cw.c;
import p.dm.m;

// Referenced classes of package com.pandora.android.fordsync:
//            a

public class AppLinkBluetoothService extends Service
    implements b
{

    boolean a;

    public AppLinkBluetoothService()
    {
        a = false;
    }

    private void a(Intent intent)
    {
        while (!e() || a) 
        {
            return;
        }
        c();
        if (p.ct.a.a().d() != 1)
        {
            a("refreshing the bluetooth SyncProxy");
            a(true);
            return;
        } else
        {
            a("Awaiting bluetooth SyncProxy connection");
            return;
        }
    }

    private void a(String s)
    {
        p.df.a.c("AppLink", (new StringBuilder()).append("FORDSYNC [AppLinkBluetoothService]  ").append(s).toString());
    }

    private void a(boolean flag)
    {
        (new Thread((new StringBuilder()).append(getClass().getSimpleName()).append("-startProxy").toString(), flag) {

            final boolean a;
            final AppLinkBluetoothService b;

            public void run()
            {
                if (a)
                {
                    p.ct.a.a().e();
                    return;
                } else
                {
                    p.ct.a.a().b();
                    b.a = false;
                    return;
                }
            }

            
            {
                b = AppLinkBluetoothService.this;
                a = flag;
                super(s);
            }
        }).start();
    }

    private f d()
    {
        return com.pandora.android.provider.b.a.b().x();
    }

    private boolean e()
    {
        if (!p.cy.b.a())
        {
            a("No Bluetooth Available, SyncProxy cannot be started");
            return false;
        }
        if (!p.cy.b.b())
        {
            a("Bluetooth not enabled, In order to use Ford SYNC enable Bluetooth and restart Pandora");
            return false;
        }
        if (!com.pandora.android.provider.b.a.u())
        {
            a("Bluetooth For Automotive Disabled");
            return false;
        } else
        {
            return true;
        }
    }

    public void a()
    {
        a("SyncProxy bluetooth connection established");
        if (!com.pandora.android.provider.b.a.g())
        {
            m.bj = true;
            a("Attempting to auto-start Pandora mobile application");
            Intent intent = new Intent(this, com/pandora/android/Main);
            intent.addFlags(0x10000000);
            startActivity(intent);
            return;
        } else
        {
            a("Notify running Pandora application, that a new SyncProxy bluetooth connection detected");
            com.pandora.android.provider.b.a.C().a(new PandoraIntent("fordsync_connection_detected"));
            return;
        }
    }

    protected boolean b()
    {
        if (!p.cy.b.b())
        {
            return false;
        }
        Iterator iterator = BluetoothAdapter.getDefaultAdapter().getBondedDevices().iterator();
        boolean flag1 = false;
        do
        {
            boolean flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            BluetoothDevice bluetoothdevice = (BluetoothDevice)iterator.next();
            if (bluetoothdevice.getName() != null && bluetoothdevice.getName().contains("SYNC"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
        } while (!flag);
        return flag;
    }

    protected void c()
    {
        if (p.ct.a.a() == null)
        {
            a("initializing bluetooth SyncProxyAgent");
            (new a()).a(this);
        }
    }

    public IBinder onBind(Intent intent)
    {
        return new Binder();
    }

    public void onCreate()
    {
        d();
        if (!e() || !b())
        {
            return;
        } else
        {
            a = true;
            c();
            a(false);
            return;
        }
    }

    public void onDestroy()
    {
        a("shutting down");
        if (p.ct.a.a() != null)
        {
            boolean flag = com.pandora.android.fordsync.a.a().G();
            a("disposing sync proxy");
            p.ct.a.a().f();
            if (flag)
            {
                com.pandora.android.fordsync.a.a().i();
            }
        }
        a("shutdown complete");
    }

    public void onStart(Intent intent, int i)
    {
        a(intent);
    }

    public int onStartCommand(Intent intent, int i, int k)
    {
        a(intent);
        return 1;
    }
}
