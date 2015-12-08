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
import com.google.android.gms.internal.hc;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            b, z

class com.google.android.gms.analytics.c
    implements com.google.android.gms.analytics.b
{
    final class a
        implements ServiceConnection
    {

        final com.google.android.gms.analytics.c xK;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            z.V((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    z.V("bound to service");
                    com.google.android.gms.analytics.c.a(xK, com.google.android.gms.internal.hc.a.E(ibinder));
                    com.google.android.gms.analytics.c.a(xK);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            try
            {
                com.google.android.gms.analytics.c.b(xK).unbindService(this);
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.a(xK, null);
            com.google.android.gms.analytics.c.c(xK).a(2, null);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            z.V((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
            com.google.android.gms.analytics.c.a(xK, null);
            com.google.android.gms.analytics.c.d(xK).onDisconnected();
        }

        a()
        {
            xK = com.google.android.gms.analytics.c.this;
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
    private ServiceConnection xG;
    private b xH;
    private c xI;
    private hc xJ;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        xH = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            xI = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.xG = serviceconnection;
        return serviceconnection;
    }

    static hc a(com.google.android.gms.analytics.c c1, hc hc1)
    {
        c1.xJ = hc1;
        return hc1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.dK();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.xI;
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.xH;
    }

    private hc dI()
    {
        dJ();
        return xJ;
    }

    private void dK()
    {
        dL();
    }

    private void dL()
    {
        xH.onConnected();
    }

    public void a(Map map, long l, String s, List list)
    {
        try
        {
            dI().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            z.T((new StringBuilder()).append("sendHit failed: ").append(map).toString());
        }
    }

    public void connect()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", mContext.getPackageName());
        if (xG != null)
        {
            z.T("Calling connect() while still connected, missing disconnect().");
        } else
        {
            xG = new a();
            boolean flag = mContext.bindService(intent, xG, 129);
            z.V((new StringBuilder()).append("connect: bindService returned ").append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                xG = null;
                xI.a(1, null);
                return;
            }
        }
    }

    public void dH()
    {
        try
        {
            dI().dH();
            return;
        }
        catch (RemoteException remoteexception)
        {
            z.T((new StringBuilder()).append("clear hits failed: ").append(remoteexception).toString());
        }
    }

    protected void dJ()
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
        xJ = null;
        if (xG != null)
        {
            try
            {
                mContext.unbindService(xG);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            xG = null;
            xH.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return xJ != null;
    }
}
