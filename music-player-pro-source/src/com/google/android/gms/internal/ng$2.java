// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.internal:
//            ng, nk

class gleApiClient extends gleApiClient
{

    final PendingIntent agM;
    final ng agN;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((nk));
    }

    protected void a(nk nk1)
        throws RemoteException
    {
        com.google.android.gms.location.a a1 = new com.google.android.gms.location.c.b() {

            final ng._cls2 agP;

            public void a(int i, PendingIntent pendingintent)
            {
                agP.b(LocationStatusCodes.eD(i));
            }

            public void b(int i, String as[])
            {
                Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
            }

            
            {
                agP = ng._cls2.this;
                super();
            }
        };
        nk1.a(agM, a1);
    }

    gleApiClient(ng ng1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        agN = ng1;
        agM = pendingintent;
        super(googleapiclient);
    }
}
