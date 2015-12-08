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
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ji, hn, jh

public class jd
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


    public jd()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            Geofence geofence;
            for (list = list.iterator(); list.hasNext(); arraylist.add((ji)geofence))
            {
                geofence = (Geofence)list.next();
                hn.b(geofence instanceof ji, "Geofence must be created using Geofence.Builder.");
            }

            list = arraylist;
        } else
        {
            list = null;
        }
        return googleapiclient.b(new a(list, pendingintent) {

            final PendingIntent VA;
            final jd VB;
            final List Vz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener(this) {

                    final _cls1 VC;

                    public void onAddGeofencesResult(int i, String as[])
                    {
                        VC.b(LocationStatusCodes.cK(i));
                    }

            
            {
                VC = _pcls1;
                super();
            }
                };
                jh1.addGeofences(Vz, VA, onaddgeofencesresultlistener);
            }

            
            {
                VB = jd.this;
                Vz = list;
                VA = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(pendingintent) {

            final PendingIntent VA;
            final jd VB;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls2 VD;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        VD.b(LocationStatusCodes.cK(i));
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                VD = _pcls2;
                super();
            }
                };
                jh1.removeGeofences(VA, onremovegeofencesresultlistener);
            }

            
            {
                VB = jd.this;
                VA = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.b(new a(list) {

            final jd VB;
            final List VE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls3 VF;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        VF.b(LocationStatusCodes.cK(i));
                    }

            
            {
                VF = _pcls3;
                super();
            }
                };
                jh1.removeGeofences(VE, onremovegeofencesresultlistener);
            }

            
            {
                VB = jd.this;
                VE = list;
                super();
            }
        });
    }
}
