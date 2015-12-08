// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ng, nk

class agR
    implements com.google.android.gms.location.agR
{

    final nStatusCodes.eD agR;

    public void a(int i, PendingIntent pendingintent)
    {
        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
    }

    public void b(int i, String as[])
    {
        agR.agR(LocationStatusCodes.eD(i));
    }

    eApiClient(eApiClient eapiclient)
    {
        agR = eapiclient;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/ng$3

/* anonymous class */
    class ng._cls3 extends ng.a
    {

        final ng agN;
        final List agQ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
            throws RemoteException
        {
            ng._cls3._cls1 _lcls1 = new ng._cls3._cls1(this);
            nk1.a(agQ, _lcls1);
        }

            
            {
                agN = ng1;
                agQ = list;
                super(googleapiclient);
            }
    }

}
