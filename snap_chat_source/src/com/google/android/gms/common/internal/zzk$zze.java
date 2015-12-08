// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzx

public final class zzPT
    implements ServiceConnection
{

    final zzk zzPT;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzx.zzb(ibinder, "Expecting a valid IBinder");
        zzk.zza(zzPT, zzU(ibinder));
        zzPT.mHandler.sendMessage(zzPT.mHandler.obtainMessage(6, new <init>(zzPT)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        zzPT.mHandler.sendMessage(zzPT.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    public (zzk zzk1)
    {
        zzPT = zzk1;
        super();
    }
}
