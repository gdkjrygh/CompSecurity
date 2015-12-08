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
import com.google.android.gms.internal.fe;
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

        final com.google.android.gms.analytics.c tB;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            aa.C((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    aa.C("bound to service");
                    com.google.android.gms.analytics.c.a(tB, com.google.android.gms.internal.fe.a.z(ibinder));
                    com.google.android.gms.analytics.c.a(tB);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.c.b(tB).unbindService(this);
            com.google.android.gms.analytics.c.a(tB, null);
            com.google.android.gms.analytics.c.c(tB).a(2, null);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            aa.C((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
            com.google.android.gms.analytics.c.a(tB, null);
            com.google.android.gms.analytics.c.d(tB).onDisconnected();
        }

        a()
        {
            tB = com.google.android.gms.analytics.c.this;
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
    private fe tA;
    private ServiceConnection tx;
    private b ty;
    private c tz;

    public com.google.android.gms.analytics.c(Context context, b b1, c c1)
    {
        mContext = context;
        if (b1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        ty = b1;
        if (c1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            tz = c1;
            return;
        }
    }

    static ServiceConnection a(com.google.android.gms.analytics.c c1, ServiceConnection serviceconnection)
    {
        c1.tx = serviceconnection;
        return serviceconnection;
    }

    static fe a(com.google.android.gms.analytics.c c1, fe fe1)
    {
        c1.tA = fe1;
        return fe1;
    }

    static void a(com.google.android.gms.analytics.c c1)
    {
        c1.co();
    }

    static Context b(com.google.android.gms.analytics.c c1)
    {
        return c1.mContext;
    }

    static c c(com.google.android.gms.analytics.c c1)
    {
        return c1.tz;
    }

    private fe cm()
    {
        cn();
        return tA;
    }

    private void co()
    {
        cp();
    }

    private void cp()
    {
        ty.onConnected();
    }

    static b d(com.google.android.gms.analytics.c c1)
    {
        return c1.ty;
    }

    public void a(Map map, long l, String s, List list)
    {
        try
        {
            cm().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            aa.A((new StringBuilder()).append("sendHit failed: ").append(map).toString());
        }
    }

    public void cl()
    {
        try
        {
            cm().cl();
            return;
        }
        catch (RemoteException remoteexception)
        {
            aa.A((new StringBuilder()).append("clear hits failed: ").append(remoteexception).toString());
        }
    }

    protected void cn()
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
        if (tx != null)
        {
            aa.A("Calling connect() while still connected, missing disconnect().");
        } else
        {
            tx = new a();
            boolean flag = mContext.bindService(intent, tx, 129);
            aa.C((new StringBuilder()).append("connect: bindService returned ").append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                tx = null;
                tz.a(1, null);
                return;
            }
        }
    }

    public void disconnect()
    {
        tA = null;
        if (tx != null)
        {
            try
            {
                mContext.unbindService(tx);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            tx = null;
            ty.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return tA != null;
    }
}
