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
//            nk

public class nf
    implements FusedLocationProviderApi
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


    public nf()
    {
    }

    public Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.f(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.nl();
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
        return googleapiclient.b(new a(googleapiclient, pendingintent) {

            final PendingIntent agB;
            final nf agH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.c(agB);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agB = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(googleapiclient, locationlistener) {

            final LocationListener agG;
            final nf agH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.a(agG);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agG = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, locationrequest, pendingintent) {

            final PendingIntent agB;
            final LocationRequest agF;
            final nf agH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.b(agF, agB);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agF = locationrequest;
                agB = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new a(googleapiclient, locationrequest, locationlistener) {

            final LocationRequest agF;
            final LocationListener agG;
            final nf agH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.a(agF, agG, null);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agF = locationrequest;
                agG = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.b(new a(googleapiclient, locationrequest, locationlistener, looper) {

            final LocationRequest agF;
            final LocationListener agG;
            final nf agH;
            final Looper agJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.a(agF, agG, agJ);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agF = locationrequest;
                agG = locationlistener;
                agJ = looper;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.b(new a(googleapiclient, location) {

            final nf agH;
            final Location agI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.b(agI);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agI = location;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.b(new a(googleapiclient, flag) {

            final nf agH;
            final boolean agK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((nk)a1);
            }

            protected void a(nk nk1)
                throws RemoteException
            {
                nk1.S(agK);
                b(Status.Kw);
            }

            
            {
                agH = nf.this;
                agK = flag;
                super(googleapiclient);
            }
        });
    }
}
