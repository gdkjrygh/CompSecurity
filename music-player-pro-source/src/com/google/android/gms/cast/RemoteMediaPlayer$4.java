// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.it;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, MediaInfo

class t extends t
{

    final RemoteMediaPlayer GA;
    final GoogleApiClient GB;
    final MediaInfo GE;
    final boolean GF;
    final long GG;
    final long GH[];
    final JSONObject GI;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((im));
    }

    protected void a(im im1)
    {
        im1 = ((im) (RemoteMediaPlayer.c(GA)));
        im1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.d(GA).b(GB);
        RemoteMediaPlayer.e(GA).a(GR, GE, GF, GG, GH, GI);
        RemoteMediaPlayer.d(GA).b(null);
_L1:
        im1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b(k(new Status(2100)));
        RemoteMediaPlayer.d(GA).b(null);
          goto _L1
        obj;
        im1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.d(GA).b(null);
        throw obj;
    }

    t(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaInfo mediainfo, boolean flag, long l, 
            long al[], JSONObject jsonobject)
    {
        GA = remotemediaplayer;
        GB = googleapiclient1;
        GE = mediainfo;
        GF = flag;
        GG = l;
        GH = al;
        GI = jsonobject;
        super(googleapiclient);
    }
}
