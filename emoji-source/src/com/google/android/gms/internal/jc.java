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
//            jh, hm, jg

public class jc
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


    public jc()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            Geofence geofence;
            for (list = list.iterator(); list.hasNext(); arraylist.add((jh)geofence))
            {
                geofence = (Geofence)list.next();
                hm.b(geofence instanceof jh, "Geofence must be created using Geofence.Builder.");
            }

            list = arraylist;
        } else
        {
            list = null;
        }
        return googleapiclient.b(new a(list, pendingintent) {

            final List VC;
            final PendingIntent VD;
            final jc VE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener(this) {

                    final _cls1 VF;

                    public void onAddGeofencesResult(int i, String as[])
                    {
                        VF.b(LocationStatusCodes.cK(i));
                    }

            
            {
                VF = _pcls1;
                super();
            }
                };
                jg1.addGeofences(VC, VD, onaddgeofencesresultlistener);
            }

            
            {
                VE = jc.this;
                VC = list;
                VD = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(pendingintent) {

            final PendingIntent VD;
            final jc VE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls2 VG;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        VG.b(LocationStatusCodes.cK(i));
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

            
            {
                VG = _pcls2;
                super();
            }
                };
                jg1.removeGeofences(VD, onremovegeofencesresultlistener);
            }

            
            {
                VE = jc.this;
                VD = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.b(new a(list) {

            final jc VE;
            final List VH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener = new com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener(this) {

                    final _cls3 VI;

                    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
                    {
                        VI.b(LocationStatusCodes.cK(i));
                    }

            
            {
                VI = _pcls3;
                super();
            }
                };
                jg1.removeGeofences(VH, onremovegeofencesresultlistener);
            }

            
            {
                VE = jc.this;
                VH = list;
                super();
            }
        });
    }
}
