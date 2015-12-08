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
//            jg

public class jb
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


    public jb()
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

            final PendingIntent Vu;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.removeLocationUpdates(Vu);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                Vu = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationlistener) {

            final LocationListener Vx;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.removeLocationUpdates(Vx);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                Vx = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(locationrequest, pendingintent) {

            final PendingIntent Vu;
            final LocationRequest Vw;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.requestLocationUpdates(Vw, Vu);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                Vw = locationrequest;
                Vu = pendingintent;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener) {

            final LocationRequest Vw;
            final LocationListener Vx;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.requestLocationUpdates(Vw, Vx);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                Vw = locationrequest;
                Vx = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener, looper) {

            final LocationRequest Vw;
            final LocationListener Vx;
            final jb Vy;
            final Looper Vz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.requestLocationUpdates(Vw, Vx, Vz);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                Vw = locationrequest;
                Vx = locationlistener;
                Vz = looper;
                super();
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.b(new a(location) {

            final Location VB;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.setMockLocation(VB);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                VB = location;
                super();
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.b(new a(flag) {

            final boolean VA;
            final jb Vy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
                throws RemoteException
            {
                jg1.setMockMode(VA);
                b(Status.En);
            }

            
            {
                Vy = jb.this;
                VA = flag;
                super();
            }
        });
    }
}
