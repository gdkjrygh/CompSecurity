// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            nk

public class ng
    implements GeofencingApi
{
    private static abstract class a extends com.google.android.gms.location.LocationServices.a
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        public a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public ng()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, geofencingrequest, pendingintent) {

            final GeofencingRequest agL;
            final PendingIntent agM;
            final ng agN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                com.google.android.gms.location.c.a a1 = new com.google.android.gms.location.c.a(this) {

                    final _cls1 agO;

                    public void a(int i, String as[])
                    {
                        agO.b(LocationStatusCodes.eD(i));
                    }

            
            {
                agO = _pcls1;
                super();
            }
                };
                nk1.a(agL, agM, a1);
            }

            
            {
                agN = ng.this;
                agL = geofencingrequest;
                agM = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return addGeofences(googleapiclient, builder.build(), pendingintent);
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, pendingintent) {

            final PendingIntent agM;
            final ng agN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                com.google.android.gms.location.c.b b = new com.google.android.gms.location.c.b(this) {

                    final _cls2 agP;

                    public void a(int i, PendingIntent pendingintent)
                    {
                        agP.b(LocationStatusCodes.eD(i));
                    }

                    public void b(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                agP = _pcls2;
                super();
            }
                };
                nk1.a(agM, b);
            }

            
            {
                agN = ng.this;
                agM = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.b(new a(googleapiclient, list) {

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
                com.google.android.gms.location.c.b b = new com.google.android.gms.location.c.b(this) {

                    final _cls3 agR;

                    public void a(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void b(int i, String as[])
                    {
                        agR.b(LocationStatusCodes.eD(i));
                    }

            
            {
                agR = _pcls3;
                super();
            }
                };
                nk1.a(agQ, b);
            }

            
            {
                agN = ng.this;
                agQ = list;
                super(googleapiclient);
            }
        });
    }
}
