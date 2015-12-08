// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Session;

// Referenced classes of package com.google.android.gms.internal:
//            mn, lu, lz

class gleApiClient extends gleApiClient
{

    final Session Vv;
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
        String s = lu1.getContext().getPackageName();
        lu1.jM().a((new com.google.android.gms.fitness.request.init>()).(Vv).k(), b, s);
    }

    gleApiClient(mn mn1, GoogleApiClient googleapiclient, Session session)
    {
        Vw = mn1;
        Vv = session;
        super(googleapiclient);
    }
}
