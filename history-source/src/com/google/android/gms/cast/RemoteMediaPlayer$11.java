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

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class  extends 
{

    final RemoteMediaPlayer GA;
    final GoogleApiClient GB;

    protected volatile void a(com.google.android.gms.common.api.ent_20_g_11_ ent_20_g_11_)
        throws RemoteException
    {
        a((im)ent_20_g_11_);
    }

    protected void a(im im1)
    {
        im1 = ((im) (RemoteMediaPlayer.c(GA)));
        im1;
        JVM INSTR monitorenter ;
        RemoteMediaPlayer.d(GA).(GB);
        RemoteMediaPlayer.e(GA).a(GR);
        RemoteMediaPlayer.d(GA).(null);
_L1:
        im1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b(k(new Status(2100)));
        RemoteMediaPlayer.d(GA).(null);
          goto _L1
        obj;
        im1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        RemoteMediaPlayer.d(GA).(null);
        throw obj;
    }

    (RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1)
    {
        GA = remotemediaplayer;
        GB = googleapiclient1;
        super(googleapiclient);
    }
}
