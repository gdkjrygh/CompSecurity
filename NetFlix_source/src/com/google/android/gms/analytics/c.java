// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.eg;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            b, aa

class com.google.android.gms.analytics.c
    implements com.google.android.gms.analytics.b
{
    final class a
        implements ServiceConnection
    {

        final com.google.android.gms.analytics.c sn;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            aa.y((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    aa.y("bound to service");
                    com.google.android.gms.analytics.c.a(sn, com.google.android.gms.internal.eg.a.t(ibinder));
                    com.google.android.gms.analytics.c.a(sn);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.b(sn).unbindService(this);
            com.google.android.gms.analytics.c.a(sn, null);
            com.google.android.gms.analytics.c.c(sn).a(2, null);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            aa.y((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
            com.google.android.gms.analytics.c.a(sn, null);
            com.google.android.gms.analytics.c.d(sn).onDisconnected();
        }

        a()
        {
            sn = com.google.android.gms.analytics.c.this;
            super();
        }
    }

    public static interface b
    {

        public abstract void onConnected();

        public abstract void onDisconnected();
    }

    public static interface c
    {

        public abstract void a(int i, Intent intent);
    }


    private Context mContext;
    private ServiceConnection sj;
    private b sk;
    private c sl;
    private eg sm;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        sk = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            sl = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.sj = serviceconnection;
        return serviceconnection;
    }

    static eg a(com.google.android.gms.analytics.c c1, eg eg1)
    {
        c1.sm = eg1;
        return eg1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.bU();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    private eg bS()
    {
        bT();
        return sm;
    }

    private void bU()
    {
        bV();
    }

    private void bV()
    {
        sk.onConnected();
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.sl;
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.sk;
    }

    public void a(Map map, long l, String s, List list)
    {
        try
        {
            bS().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            aa.w((new StringBuilder()).append("sendHit failed: ").append(map).toString());
        }
    }

    public void bR()
    {
        try
        {
            bS().bR();
            return;
        }
        catch (RemoteException remoteexception)
        {
            aa.w((new StringBuilder()).append("clear hits failed: ").append(remoteexception).toString());
        }
    }

    protected void bT()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public void connect()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", mContext.getPackageName());
        if (sj != null)
        {
            aa.w("Calling connect() while still connected, missing disconnect().");
        } else
        {
            sj = new a();
            boolean flag = mContext.bindService(intent, sj, 129);
            aa.y((new StringBuilder()).append("connect: bindService returned ").append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                sj = null;
                sl.a(1, null);
                return;
            }
        }
    }

    public void disconnect()
    {
        sm = null;
        if (sj != null)
        {
            try
            {
                mContext.unbindService(sj);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            sj = null;
            sk.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return sm != null;
    }
}
