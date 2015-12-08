// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.u;

// Referenced classes of package com.google.android.gms.internal:
//            mn, lu, lz

class gleApiClient extends gleApiClient
{

    final PendingIntent VA;
    final mn Vw;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lu));
    }

    protected void a(lu lu1)
        throws RemoteException
    {
        ementation.b b = new <init>(this);
        u u1 = new u(VA);
        String s = lu1.getContext().getPackageName();
        lu1.jM().a(u1, b, s);
    }

    gleApiClient(mn mn1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        Vw = mn1;
        VA = pendingintent;
        super(googleapiclient);
    }
}
