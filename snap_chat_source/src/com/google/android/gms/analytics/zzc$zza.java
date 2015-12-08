// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.zzlo;

// Referenced classes of package com.google.android.gms.analytics:
//            zzc, zzae

final class zzAX
    implements ServiceConnection
{

    final zzc zzAX;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzae.zzab((new StringBuilder("service connected, binder: ")).append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                zzae.zzab("bound to service");
                zzc.zza(zzAX, com.google.android.gms.internal..zzH(ibinder));
                zzc.zza(zzAX);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        try
        {
            zzlo.zzka().zza(zzc.zzb(zzAX), this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        zzc.zza(zzAX, null);
        zzc.zzc(zzAX).zza(2, null);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        zzae.zzab((new StringBuilder("service disconnected: ")).append(componentname).toString());
        zzc.zza(zzAX, null);
        zzc.zzd(zzAX).onDisconnected();
    }

    (zzc zzc1)
    {
        zzAX = zzc1;
        super();
    }
}
