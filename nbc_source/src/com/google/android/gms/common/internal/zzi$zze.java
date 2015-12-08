// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzu

public final class zzaaA
    implements ServiceConnection
{

    private final int zzaaA;
    final zzi zzaax;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzu.zzb(ibinder, "Expecting a valid IBinder");
        zzi.zza(zzaax, zzaG(ibinder));
        zzaax.zzbt(zzaaA);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzaax.mHandler.sendMessage(zzaax.mHandler.obtainMessage(4, zzaaA, 1));
    }

    public (zzi zzi1, int i)
    {
        zzaax = zzi1;
        super();
        zzaaA = i;
    }
}
