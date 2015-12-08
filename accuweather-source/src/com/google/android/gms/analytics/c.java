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
import com.google.android.gms.internal.ff;
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

        final com.google.android.gms.analytics.c ty;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            aa.C((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    aa.C("bound to service");
                    com.google.android.gms.analytics.c.a(ty, com.google.android.gms.internal.ff.a.z(ibinder));
                    com.google.android.gms.analytics.c.a(ty);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.b(ty).unbindService(this);
            com.google.android.gms.analytics.c.a(ty, null);
            com.google.android.gms.analytics.c.c(ty).a(2, null);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            aa.C((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
            com.google.android.gms.analytics.c.a(ty, null);
            com.google.android.gms.analytics.c.d(ty).onDisconnected();
        }

        a()
        {
            ty = com.google.android.gms.analytics.c.this;
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
    private ServiceConnection tu;
    private b tv;
    private c tw;
    private ff tx;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        tv = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            tw = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.tu = serviceconnection;
        return serviceconnection;
    }

    static ff a(com.google.android.gms.analytics.c c1, ff ff1)
    {
        c1.tx = ff1;
        return ff1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.cj();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.tw;
    }

    private ff ch()
    {
        ci();
        return tx;
    }

    private void cj()
    {
        ck();
    }

    private void ck()
    {
        tv.onConnected();
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.tv;
    }

    public void a(Map map, long l, String s, List list)
    {
        try
        {
            ch().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            aa.A((new StringBuilder()).append("sendHit failed: ").append(map).toString());
        }
    }

    public void cg()
    {
        try
        {
            ch().cg();
            return;
        }
        catch (RemoteException remoteexception)
        {
            aa.A((new StringBuilder()).append("clear hits failed: ").append(remoteexception).toString());
        }
    }

    protected void ci()
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
        if (tu != null)
        {
            aa.A("Calling connect() while still connected, missing disconnect().");
        } else
        {
            tu = new a();
            boolean flag = mContext.bindService(intent, tu, 129);
            aa.C((new StringBuilder()).append("connect: bindService returned ").append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                tu = null;
                tw.a(1, null);
                return;
            }
        }
    }

    public void disconnect()
    {
        tx = null;
        if (tu != null)
        {
            try
            {
                mContext.unbindService(tu);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            tu = null;
            tv.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return tx != null;
    }
}
