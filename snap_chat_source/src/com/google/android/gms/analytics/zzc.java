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
import com.google.android.gms.internal.zzil;
import com.google.android.gms.internal.zzlo;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            zzb, zzae

class com.google.android.gms.analytics.zzc
    implements com.google.android.gms.analytics.zzb
{
    final class zza
        implements ServiceConnection
    {

        final com.google.android.gms.analytics.zzc zzAX;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            zzae.zzab((new StringBuilder("service connected, binder: ")).append(ibinder).toString());
            try
            {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
                {
                    zzae.zzab("bound to service");
                    com.google.android.gms.analytics.zzc.zza(zzAX, com.google.android.gms.internal.zzil.zza.zzH(ibinder));
                    com.google.android.gms.analytics.zzc.zza(zzAX);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            try
            {
                zzlo.zzka().zza(com.google.android.gms.analytics.zzc.zzb(zzAX), this);
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            com.google.android.gms.analytics.zzc.zza(zzAX, null);
            com.google.android.gms.analytics.zzc.zzc(zzAX).zza(2, null);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            zzae.zzab((new StringBuilder("service disconnected: ")).append(componentname).toString());
            com.google.android.gms.analytics.zzc.zza(zzAX, null);
            com.google.android.gms.analytics.zzc.zzd(zzAX).onDisconnected();
        }

        zza()
        {
            zzAX = com.google.android.gms.analytics.zzc.this;
            super();
        }
    }

    public static interface zzb
    {

        public abstract void onConnected();

        public abstract void onDisconnected();
    }

    public static interface zzc
    {

        public abstract void zza(int i, Intent intent);
    }


    private Context mContext;
    private ServiceConnection zzAT;
    private zzb zzAU;
    private zzc zzAV;
    private zzil zzAW;

    public com.google.android.gms.analytics.zzc(Context context, zzb zzb1, zzc zzc1)
    {
        mContext = context;
        if (zzb1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        zzAU = zzb1;
        if (zzc1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            zzAV = zzc1;
            return;
        }
    }

    static ServiceConnection zza(com.google.android.gms.analytics.zzc zzc1, ServiceConnection serviceconnection)
    {
        zzc1.zzAT = serviceconnection;
        return serviceconnection;
    }

    static zzil zza(com.google.android.gms.analytics.zzc zzc1, zzil zzil1)
    {
        zzc1.zzAW = zzil1;
        return zzil1;
    }

    static void zza(com.google.android.gms.analytics.zzc zzc1)
    {
        zzc1.zzfd();
    }

    static Context zzb(com.google.android.gms.analytics.zzc zzc1)
    {
        return zzc1.mContext;
    }

    static zzc zzc(com.google.android.gms.analytics.zzc zzc1)
    {
        return zzc1.zzAV;
    }

    static zzb zzd(com.google.android.gms.analytics.zzc zzc1)
    {
        return zzc1.zzAU;
    }

    private zzil zzfb()
    {
        zzfc();
        return zzAW;
    }

    private void zzfd()
    {
        zzfe();
    }

    private void zzfe()
    {
        zzAU.onConnected();
    }

    public void connect()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", mContext.getPackageName());
        if (zzAT != null)
        {
            zzae.zzZ("Calling connect() while still connected, missing disconnect().");
        } else
        {
            zzAT = new zza();
            boolean flag = zzlo.zzka().zza(mContext, intent, zzAT, 129);
            zzae.zzab((new StringBuilder("connect: bindService returned ")).append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                zzAT = null;
                zzAV.zza(1, null);
                return;
            }
        }
    }

    public void disconnect()
    {
        zzAW = null;
        if (zzAT != null)
        {
            try
            {
                zzlo.zzka().zza(mContext, zzAT);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            zzAT = null;
            zzAU.onDisconnected();
        }
    }

    public boolean isConnected()
    {
        return zzAW != null;
    }

    public void zza(Map map, long l, String s, List list)
    {
        try
        {
            zzfb().zza(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzae.zzZ((new StringBuilder("sendHit failed: ")).append(map).toString());
        }
    }

    public void zzfa()
    {
        try
        {
            zzfb().zzfa();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzae.zzZ((new StringBuilder("clear hits failed: ")).append(remoteexception).toString());
        }
    }

    protected void zzfc()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }
}
