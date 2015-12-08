// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            nk, nf

class gleApiClient extends gleApiClient
{

    final PendingIntent agB;
    final LocationRequest agF;
    final nf agH;

    protected volatile void a(com.google.android.gms.common.api. )
    {
        a((nk));
    }

    protected void a(nk nk1)
    {
        nk1.b(agF, agB);
        b(Status.Kw);
    }

    gleApiClient(nf nf, GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        agH = nf;
        agF = locationrequest;
        agB = pendingintent;
        super(googleapiclient);
    }
}
