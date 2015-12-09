// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class t extends t
{

    final GoogleApiClient a;
    final RemoteMediaPlayer b;

    protected void a(zze zze1)
    {
        zze1 = ((zze) (RemoteMediaPlayer.zzc(b)));
        zze1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.zzd(b).a(a);
        com.google.android.gms.cast.RemoteMediaPlayer.zze(b).zza(h);
        RemoteMediaPlayer.zzd(b).a(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        setResult(a(new Status(2100)));
        RemoteMediaPlayer.zzd(b).a(null);
          goto _L1
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.zzd(b).a(null);
        throw obj;
    }

    protected void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        a((zze)ult);
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1)
    {
        b = remotemediaplayer;
        a = googleapiclient1;
        super(googleapiclient);
    }
}
