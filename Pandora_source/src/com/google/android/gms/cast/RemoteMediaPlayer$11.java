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
    final double b;
    final JSONObject c;
    final RemoteMediaPlayer d;

    protected void a(zze zze1)
    {
        zze1 = ((zze) (RemoteMediaPlayer.zzc(d)));
        zze1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.zzd(d).(a);
        com.google.android.gms.cast.RemoteMediaPlayer.zze(d).zza(h, b, c);
        RemoteMediaPlayer.zzd(d).(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
_L2:
        setResult(a(new Status(2100)));
        RemoteMediaPlayer.zzd(d).(null);
          goto _L1
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.zzd(d).(null);
        throw obj;
        obj;
          goto _L2
        obj;
          goto _L2
    }

    protected void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        a((zze)ult);
    }

    (RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, double d1, JSONObject jsonobject)
    {
        d = remotemediaplayer;
        a = googleapiclient1;
        b = d1;
        c = jsonobject;
        super(googleapiclient);
    }
}
