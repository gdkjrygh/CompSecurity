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
//            pe

public final class pa
    implements GeofencingApi
{
    static abstract class a extends com.google.android.gms.location.LocationServices.a
    {

        private static Status f(Status status)
        {
            return status;
        }

        public final Result b(Status status)
        {
            return f(status);
        }

        public a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public pa()
    {
    }

    private PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, geofencingrequest, pendingintent) {

            final GeofencingRequest avu;
            final PendingIntent avv;
            final pa avw;

            private void a(pe pe1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener(this) {

                    final _cls1 avx;

                    public final void onAddGeofencesResult(int i, String as[])
                    {
                        avx.b(LocationStatusCodes.hy(i));
                    }

            
            {
                avx = _pcls1;
                super();
            }
                };
                pe1.a(avu, avv, onaddgeofencesresultlistener);
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((pe)a1);
            }

            
            {
                avw = pa.this;
                avu = geofencingrequest;
                avv = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public final PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return addGeofences(googleapiclient, builder.build(), pendingintent);
    }

    public final PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, pendingintent) {

            final PendingIntent avv;
            final pa avw;

            private void a(pe pe1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls2 avy;

                    public final void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        avy.b(LocationStatusCodes.hy(i));
                    }

                    public final void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                avy = _pcls2;
                super();
            }
                };
                pe1.removeGeofences(avv, onremovegeofencesresultlistener);
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((pe)a1);
            }

            
            {
                avw = pa.this;
                avv = pendingintent;
                super(googleapiclient);
            }
        });
    }
}
