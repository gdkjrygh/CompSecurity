// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzv

public final class zzTz
    implements ServiceConnection
{

    final zzi zzTz;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzv.zzb(ibinder, "Expecting a valid IBinder");
        zzi.zza(zzTz, zzT(ibinder));
        zzTz.zzlV();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzTz.mHandler.sendMessage(zzTz.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    public (zzi zzi1)
    {
        zzTz = zzi1;
        super();
    }
}
