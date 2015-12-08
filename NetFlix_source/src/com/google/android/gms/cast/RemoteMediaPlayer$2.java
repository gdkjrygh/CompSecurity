// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.es;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, MediaInfo

class <init> extends <init>
{

    final RemoteMediaPlayer yI;
    final GoogleApiClient yJ;
    final MediaInfo yK;
    final boolean yL;
    final long yM;
    final JSONObject yN;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((en));
    }

    protected void a(en en1)
    {
        en1 = ((en) (RemoteMediaPlayer.c(yI)));
        en1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.d(yI).b(yJ);
        RemoteMediaPlayer.e(yI).a(yW, yK, yL, yM, yN);
        RemoteMediaPlayer.d(yI).b(null);
_L1:
        en1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        a(((com.google.android.gms.common.api.Result) (j(new Status(1)))));
        RemoteMediaPlayer.d(yI).b(null);
          goto _L1
        obj;
        en1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.d(yI).b(null);
        throw obj;
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
    {
        yI = remotemediaplayer;
        yJ = googleapiclient;
        yK = mediainfo;
        yL = flag;
        yM = l;
        yN = jsonobject;
        super();
    }
}
