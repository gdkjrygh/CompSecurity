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
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class  extends 
{

    final GoogleApiClient a;
    final long b;
    final int c;
    final JSONObject d;
    final RemoteMediaPlayer e;

    protected void a(zze zze1)
    {
        zze1 = ((zze) (RemoteMediaPlayer.zzc(e)));
        zze1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.zzd(e).(a);
        com.google.android.gms.cast.RemoteMediaPlayer.zze(e).zza(h, b, c, d);
        RemoteMediaPlayer.zzd(e).(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        setResult(a(new Status(2100)));
        RemoteMediaPlayer.zzd(e).(null);
          goto _L1
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.zzd(e).(null);
        throw obj;
    }

    protected void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        a((zze)ult);
    }

    (RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, long l, int i, JSONObject jsonobject)
    {
        e = remotemediaplayer;
        a = googleapiclient1;
        b = l;
        c = i;
        d = jsonobject;
        super(googleapiclient);
    }
}
