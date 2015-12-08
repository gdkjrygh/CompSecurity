// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gp;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, TextTrackStyle

class <init> extends <init>
{

    final RemoteMediaPlayer AX;
    final GoogleApiClient AY;
    final TextTrackStyle Ba;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((gi));
    }

    protected void a(gi gi1)
    {
        gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
        gi1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.d(AX).b(AY);
        RemoteMediaPlayer.e(AX).a(Bn, Ba);
        RemoteMediaPlayer.d(AX).b(null);
_L1:
        gi1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b(l(new Status(1)));
        RemoteMediaPlayer.d(AX).b(null);
          goto _L1
        obj;
        gi1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.d(AX).b(null);
        throw obj;
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        AX = remotemediaplayer;
        AY = googleapiclient;
        Ba = texttrackstyle;
        super();
    }
}
