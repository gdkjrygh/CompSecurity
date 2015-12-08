// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.internal:
//            jh

public class jc
    implements FusedLocationProviderApi
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

    public Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.e(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.getLastLocation();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(pendingintent) {

            final PendingIntent Vr;
            final jc Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.removeLocationUpdates(Vr);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vr = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationlistener) {

            final LocationListener Vu;
            final jc Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.removeLocationUpdates(Vu);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vu = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(locationrequest, pendingintent) {

            final PendingIntent Vr;
            final LocationRequest Vt;
            final jc Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.requestLocationUpdates(Vt, Vr);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vt = locationrequest;
                Vr = pendingintent;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener) {

            final LocationRequest Vt;
            final LocationListener Vu;
            final jc Vv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.requestLocationUpdates(Vt, Vu);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vt = locationrequest;
                Vu = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener, looper) {

            final LocationRequest Vt;
            final LocationListener Vu;
            final jc Vv;
            final Looper Vw;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.requestLocationUpdates(Vt, Vu, Vw);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vt = locationrequest;
                Vu = locationlistener;
                Vw = looper;
                super();
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.b(new a(location) {

            final jc Vv;
            final Location Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.setMockLocation(Vy);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vy = location;
                super();
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.b(new a(flag) {

            final jc Vv;
            final boolean Vx;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jh)a1);
            }

            protected void a(jh jh1)
                throws RemoteException
            {
                jh1.setMockMode(Vx);
                b(Status.Ek);
            }

            
            {
                Vv = jc.this;
                Vx = flag;
                super();
            }
        });
    }
}
