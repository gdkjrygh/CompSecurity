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
//            RemoteMediaPlayer, MediaInfo

class t extends t
{

    final GoogleApiClient a;
    final MediaInfo b;
    final boolean c;
    final long d;
    final long e[];
    final JSONObject f;
    final RemoteMediaPlayer g;

    protected void a(zze zze1)
    {
        zze1 = ((zze) (RemoteMediaPlayer.zzc(g)));
        zze1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.zzd(g).a(a);
        com.google.android.gms.cast.RemoteMediaPlayer.zze(g).zza(h, b, c, d, e, f);
        RemoteMediaPlayer.zzd(g).a(null);
_L1:
        zze1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        setResult(a(new Status(2100)));
        RemoteMediaPlayer.zzd(g).a(null);
          goto _L1
        obj;
        zze1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.zzd(g).a(null);
        throw obj;
    }

    protected void zza(com.google.android.gms.common.api.ult ult)
        throws RemoteException
    {
        a((zze)ult);
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaInfo mediainfo, boolean flag, long l, 
            long al[], JSONObject jsonobject)
    {
        g = remotemediaplayer;
        a = googleapiclient1;
        b = mediainfo;
        c = flag;
        d = l;
        e = al;
        f = jsonobject;
        super(googleapiclient);
    }
}
