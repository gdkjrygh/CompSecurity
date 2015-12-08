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
import com.google.android.gms.common.internal.o;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mc, lz

public class lv
    implements GeofencingApi
{
    private static abstract class a extends com.google.android.gms.location.LocationServices.a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private a()
        {
        }

    }


    public lv()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            Geofence geofence;
            for (list = list.iterator(); list.hasNext(); arraylist.add((mc)geofence))
            {
                geofence = (Geofence)list.next();
                o.b(geofence instanceof mc, "Geofence must be created using Geofence.Builder.");
            }

            list = arraylist;
        } else
        {
            list = null;
        }
        return googleapiclient.b(new a(list, pendingintent) {

            final List aeK;
            final PendingIntent aeL;
            final lv aeM;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener(this) {

                    final _cls1 aeN;

                    public void onAddGeofencesResult(int i, String as[])
                    {
                        aeN.b(LocationStatusCodes.eg(i));
                    }

            
            {
                aeN = _pcls1;
                super();
            }
                };
                lz1.addGeofences(aeK, aeL, onaddgeofencesresultlistener);
            }

            
            {
                aeM = lv.this;
                aeK = list;
                aeL = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(pendingintent) {

            final PendingIntent aeL;
            final lv aeM;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls2 aeO;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        aeO.b(LocationStatusCodes.eg(i));
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                aeO = _pcls2;
                super();
            }
                };
                lz1.removeGeofences(aeL, onremovegeofencesresultlistener);
            }

            
            {
                aeM = lv.this;
                aeL = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.b(new a(list) {

            final lv aeM;
            final List aeP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls3 aeQ;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        aeQ.b(LocationStatusCodes.eg(i));
                    }

            
            {
                aeQ = _pcls3;
                super();
            }
                };
                lz1.removeGeofences(aeP, onremovegeofencesresultlistener);
            }

            
            {
                aeM = lv.this;
                aeP = list;
                super();
            }
        });
    }
}
