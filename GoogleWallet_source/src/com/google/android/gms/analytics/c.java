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
import com.google.android.gms.internal.hg;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            b, ac

final class com.google.android.gms.analytics.c
    implements com.google.android.gms.analytics.b
{
    final class a
        implements ServiceConnection
    {

        final com.google.android.gms.analytics.c xY;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            ac.v((new StringBuilder("service connected, binder: ")).append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    ac.v("bound to service");
                    com.google.android.gms.analytics.c.a(xY, com.google.android.gms.internal.hg.a.H(ibinder));
                    com.google.android.gms.analytics.c.a(xY);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            try
            {
                com.google.android.gms.analytics.c.b(xY).unbindService(this);
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.a(xY, null);
            com.google.android.gms.analytics.c.c(xY).a(2, null);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            ac.v((new StringBuilder("service disconnected: ")).append(componentname).toString());
            com.google.android.gms.analytics.c.a(xY, null);
            com.google.android.gms.analytics.c.d(xY).onDisconnected();
        }

        a()
        {
            xY = com.google.android.gms.analytics.c.this;
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
    private ServiceConnection xU;
    private b xV;
    private c xW;
    private hg xX;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        xV = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            xW = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.xU = serviceconnection;
        return serviceconnection;
    }

    static hg a(com.google.android.gms.analytics.c c1, hg hg1)
    {
        c1.xX = hg1;
        return hg1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.dS();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.xW;
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.xV;
    }

    private hg dQ()
    {
        dR();
        return xX;
    }

    private void dR()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    private void dS()
    {
        dT();
    }

    private void dT()
    {
        xV.onConnected();
    }

    private boolean isConnected()
    {
        return xX != null;
    }

    public final void a(Map map, long l, String s, List list)
    {
        try
        {
            dQ().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ac.e((new StringBuilder("sendHit failed: ")).append(map).toString());
        }
    }

    public final void clearHits()
    {
        try
        {
            dQ().clearHits();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ac.e((new StringBuilder("clear hits failed: ")).append(remoteexception).toString());
        }
    }

    public final void connect()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", mContext.getPackageName());
        if (xU != null)
        {
            ac.e("Calling connect() while still connected, missing disconnect().");
        } else
        {
            xU = new a();
            boolean flag = mContext.bindService(intent, xU, 129);
            ac.v((new StringBuilder("connect: bindService returned ")).append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                xU = null;
                xW.a(1, null);
                return;
            }
        }
    }

    public final void disconnect()
    {
        xX = null;
        if (xU != null)
        {
            try
            {
                mContext.unbindService(xU);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            xU = null;
            xV.onDisconnected();
        }
    }
}
