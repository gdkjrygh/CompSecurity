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
//            lz

public class lu
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


    public lu()
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

            final PendingIntent aeC;
            final lu aeG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.removeLocationUpdates(aeC);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeC = pendingintent;
                super();
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationlistener) {

            final LocationListener aeF;
            final lu aeG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.removeLocationUpdates(aeF);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeF = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(locationrequest, pendingintent) {

            final PendingIntent aeC;
            final LocationRequest aeE;
            final lu aeG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.requestLocationUpdates(aeE, aeC);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeE = locationrequest;
                aeC = pendingintent;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener) {

            final LocationRequest aeE;
            final LocationListener aeF;
            final lu aeG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.requestLocationUpdates(aeE, aeF, null);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeE = locationrequest;
                aeF = locationlistener;
                super();
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.b(new a(locationrequest, locationlistener, looper) {

            final LocationRequest aeE;
            final LocationListener aeF;
            final lu aeG;
            final Looper aeI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.requestLocationUpdates(aeE, aeF, aeI);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeE = locationrequest;
                aeF = locationlistener;
                aeI = looper;
                super();
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.b(new a(location) {

            final lu aeG;
            final Location aeH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.setMockLocation(aeH);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeH = location;
                super();
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.b(new a(flag) {

            final lu aeG;
            final boolean aeJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lz)a1);
            }

            protected void a(lz lz1)
                throws RemoteException
            {
                lz1.setMockMode(aeJ);
                b(Status.Jv);
            }

            
            {
                aeG = lu.this;
                aeJ = flag;
                super();
            }
        });
    }
}
