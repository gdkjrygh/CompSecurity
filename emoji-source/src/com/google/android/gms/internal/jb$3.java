// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            jb, jg

class <init> extends <init>
{

    final PendingIntent Vu;
    final LocationRequest Vw;
    final jb Vy;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jg));
    }

    protected void a(jg jg1)
        throws RemoteException
    {
        jg1.requestLocationUpdates(Vw, Vu);
        b(Status.En);
    }

    ionRequest(jb jb1, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        Vy = jb1;
        Vw = locationrequest;
        Vu = pendingintent;
        super(null);
    }
}
