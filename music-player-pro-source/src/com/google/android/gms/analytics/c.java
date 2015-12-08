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
import com.google.android.gms.internal.hb;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            b, ae

class com.google.android.gms.analytics.c
    implements com.google.android.gms.analytics.b
{
    final class a
        implements ServiceConnection
    {

        final com.google.android.gms.analytics.c xZ;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            ae.V((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    ae.V("bound to service");
                    com.google.android.gms.analytics.c.a(xZ, com.google.android.gms.internal.hb.a.D(ibinder));
                    com.google.android.gms.analytics.c.a(xZ);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            try
            {
                com.google.android.gms.analytics.c.b(xZ).unbindService(this);
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.a(xZ, null);
            com.google.android.gms.analytics.c.c(xZ).a(2, null);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            ae.V((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
            com.google.android.gms.analytics.c.a(xZ, null);
            com.google.android.gms.analytics.c.d(xZ).onDisconnected();
        }

        a()
        {
            xZ = com.google.android.gms.analytics.c.this;
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
    private ServiceConnection xV;
    private b xW;
    private c xX;
    private hb xY;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        xW = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            xX = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.xV = serviceconnection;
        return serviceconnection;
    }

    static hb a(com.google.android.gms.analytics.c c1, hb hb1)
    {
        c1.xY = hb1;
        return hb1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.dT();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.xX;
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.xW;
    }

    private hb dR()
    {
        dS();
        return xY;
    }

    private void dT()
    {
        dU();
    }

    private void dU()
    {
        xW.onConnected();
    }

    public void a(Map map, long l, String s, List list)
    {
        try
        {
            dR().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ae.T((new StringBuilder()).append("sendHit failed: ").append(map).toString());
        }
    }

    public void connect()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", mContext.getPackageName());
        if (xV != null)
        {
            ae.T("Calling connect() while still connected, missing disconnect().");
        } else
        {
            xV = new a();
            boolean flag = mContext.bindService(intent, xV, 129);
            ae.V((new StringBuilder()).append("connect: bindService returned ").append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                xV = null;
                xX.a(1, null);
                return;
            }
        }
    }

    public void dQ()
    {
        try
        {
            dR().dQ();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ae.T((new StringBuilder()).append("clear hits failed: ").append(remoteexception).toString());
        }
    }

    protected void dS()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public void disconnect()
    {
        xY = null;
        if (xV != null)
        {
            try
            {
                mContext.unbindService(xV);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            xV = null;
            xW.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return xY != null;
    }
}
