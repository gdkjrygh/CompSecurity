// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;

public class ng
    implements GeofencingApi
{

    public ng()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new _cls1(googleapiclient, geofencingrequest, pendingintent));
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
        return googleapiclient.b(new _cls2(googleapiclient, pendingintent));
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.b(new _cls3(googleapiclient, list));
    }

    private class _cls1 extends a
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


        final GeofencingRequest agL;
        final PendingIntent agM;
        final ng agN;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            class _cls1
                implements com.google.android.gms.location.c.a
            {

                final _cls1 agO;

                public void a(int i, String as[])
                {
                    agO.b(LocationStatusCodes.eD(i));
                }

                _cls1()
                {
                    agO = _cls1.this;
                    super();
                }
            }

            _cls1 _lcls1 = new _cls1();
            nk1.a(agL, agM, _lcls1);
        }

        _cls1(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
        {
            agN = ng.this;
            agL = geofencingrequest;
            agM = pendingintent;
            super(googleapiclient);
        }
    }


    private class _cls2 extends a
    {

        final PendingIntent agM;
        final ng agN;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            class _cls1
                implements com.google.android.gms.location.c.b
            {

                final _cls2 agP;

                public void a(int i, PendingIntent pendingintent)
                {
                    agP.b(LocationStatusCodes.eD(i));
                }

                public void b(int i, String as[])
                {
                    Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                }

                _cls1()
                {
                    agP = _cls2.this;
                    super();
                }
            }

            _cls1 _lcls1 = new _cls1();
            nk1.a(agM, _lcls1);
        }

        _cls2(GoogleApiClient googleapiclient, PendingIntent pendingintent)
        {
            agN = ng.this;
            agM = pendingintent;
            super(googleapiclient);
        }
    }


    private class _cls3 extends a
    {

        final ng agN;
        final List agQ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            class _cls1
                implements com.google.android.gms.location.c.b
            {

                final _cls3 agR;

                public void a(int i, PendingIntent pendingintent)
                {
                    Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                }

                public void b(int i, String as[])
                {
                    agR.b(LocationStatusCodes.eD(i));
                }

                _cls1()
                {
                    agR = _cls3.this;
                    super();
                }
            }

            _cls1 _lcls1 = new _cls1();
            nk1.a(agQ, _lcls1);
        }

        _cls3(GoogleApiClient googleapiclient, List list)
        {
            agN = ng.this;
            agQ = list;
            super(googleapiclient);
        }
    }

}
