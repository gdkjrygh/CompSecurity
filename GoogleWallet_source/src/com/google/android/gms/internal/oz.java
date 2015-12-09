// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.internal:
//            pe

public final class oz
    implements FusedLocationProviderApi
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


    public oz()
    {
    }

    public final Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.h(googleapiclient);
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

    public final PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, pendingintent) {

            final PendingIntent avi;
            final oz avo;

            private void a(pe pe1)
                throws RemoteException
            {
                pe1.removeLocationUpdates(avi);
                b(Status.Th);
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((pe)a1);
            }

            
            {
                avo = oz.this;
                avi = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public final PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.b(new a(googleapiclient, locationrequest, pendingintent) {

            final PendingIntent avi;
            final LocationRequest avm;
            final oz avo;

            private void a(pe pe1)
                throws RemoteException
            {
                pe1.requestLocationUpdates(avm, avi);
                b(Status.Th);
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((pe)a1);
            }

            
            {
                avo = oz.this;
                avm = locationrequest;
                avi = pendingintent;
                super(googleapiclient);
            }
        });
    }
}
