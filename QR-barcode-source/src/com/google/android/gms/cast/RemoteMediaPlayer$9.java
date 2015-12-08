// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.iq;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class <init> extends <init>
{

    final RemoteMediaPlayer FK;
    final GoogleApiClient FL;
    final JSONObject FS;
    final double FV;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ij));
    }

    protected void a(ij ij1)
    {
        ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
        ij1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.d(FK).b(FL);
        RemoteMediaPlayer.e(FK).a(Gb, FV, FS);
        RemoteMediaPlayer.d(FK).b(null);
_L1:
        ij1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b(l(new Status(2100)));
        RemoteMediaPlayer.d(FK).b(null);
          goto _L1
        obj;
        ij1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        b(l(new Status(2100)));
        RemoteMediaPlayer.d(FK).b(null);
          goto _L1
        obj;
        b(l(new Status(2100)));
        RemoteMediaPlayer.d(FK).b(null);
          goto _L1
        obj;
        RemoteMediaPlayer.d(FK).b(null);
        throw obj;
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, double d, JSONObject jsonobject)
    {
        FK = remotemediaplayer;
        FL = googleapiclient;
        FV = d;
        FS = jsonobject;
        super();
    }
}
