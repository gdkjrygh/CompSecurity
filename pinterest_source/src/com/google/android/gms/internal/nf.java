// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.internal:
//            nk

public class nf
    implements FusedLocationProviderApi
{

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
        return googleapiclient.b(new _cls6(googleapiclient, pendingintent));
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new _cls5(googleapiclient, locationlistener));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new _cls4(googleapiclient, locationrequest, pendingintent));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new _cls1(googleapiclient, locationrequest, locationlistener));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.b(new _cls3(googleapiclient, locationrequest, locationlistener, looper));
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.b(new _cls2(googleapiclient, location));
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.b(new _cls7(googleapiclient, flag));
    }

    private class _cls6 extends a
    {
        private class a extends com.google.android.gms.location.LocationServices.a
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


        final PendingIntent agB;
        final nf agH;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.c(agB);
            b(Status.Kw);
        }

        _cls6(GoogleApiClient googleapiclient, PendingIntent pendingintent)
        {
            agH = nf.this;
            agB = pendingintent;
            super(googleapiclient);
        }
    }


    private class _cls5 extends a
    {

        final LocationListener agG;
        final nf agH;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agG);
            b(Status.Kw);
        }

        _cls5(GoogleApiClient googleapiclient, LocationListener locationlistener)
        {
            agH = nf.this;
            agG = locationlistener;
            super(googleapiclient);
        }
    }


    private class _cls4 extends a
    {

        final PendingIntent agB;
        final LocationRequest agF;
        final nf agH;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.b(agF, agB);
            b(Status.Kw);
        }

        _cls4(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
        {
            agH = nf.this;
            agF = locationrequest;
            agB = pendingintent;
            super(googleapiclient);
        }
    }


    private class _cls1 extends a
    {

        final LocationRequest agF;
        final LocationListener agG;
        final nf agH;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agF, agG, null);
            b(Status.Kw);
        }

        _cls1(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
        {
            agH = nf.this;
            agF = locationrequest;
            agG = locationlistener;
            super(googleapiclient);
        }
    }


    private class _cls3 extends a
    {

        final LocationRequest agF;
        final LocationListener agG;
        final nf agH;
        final Looper agJ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agF, agG, agJ);
            b(Status.Kw);
        }

        _cls3(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        {
            agH = nf.this;
            agF = locationrequest;
            agG = locationlistener;
            agJ = looper;
            super(googleapiclient);
        }
    }


    private class _cls2 extends a
    {

        final nf agH;
        final Location agI;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.b(agI);
            b(Status.Kw);
        }

        _cls2(GoogleApiClient googleapiclient, Location location)
        {
            agH = nf.this;
            agI = location;
            super(googleapiclient);
        }
    }


    private class _cls7 extends a
    {

        final nf agH;
        final boolean agK;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.S(agK);
            b(Status.Kw);
        }

        _cls7(GoogleApiClient googleapiclient, boolean flag)
        {
            agH = nf.this;
            agK = flag;
            super(googleapiclient);
        }
    }

}
