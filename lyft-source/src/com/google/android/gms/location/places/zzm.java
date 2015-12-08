// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.location.places.personalized.zzd;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihoodBuffer, AutocompletePredictionBuffer, PlaceBuffer

public class zzm extends com.google.android.gms.location.places.internal.zzh.zza
{

    private static final String a = com/google/android/gms/location/places/zzm.getSimpleName();
    private final zzd b;
    private final zza c;
    private final zze d;
    private final zzf e;
    private final zzc f;
    private final Context g;

    public zzm(zza zza)
    {
        b = null;
        c = zza;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public zzm(zzc zzc, Context context)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = zzc;
        g = context;
    }

    public zzm(zzd zzd1, Context context)
    {
        b = zzd1;
        c = null;
        d = null;
        e = null;
        f = null;
        g = context;
    }

    public zzm(zzf zzf)
    {
        b = null;
        c = null;
        d = null;
        e = zzf;
        f = null;
        g = null;
    }

    public void a(Status status)
    {
        e.a(status);
    }

    public void a(DataHolder dataholder)
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "placeEstimator cannot be null");
        if (dataholder == null)
        {
            if (Log.isLoggable(a, 6))
            {
                Log.e(a, (new StringBuilder()).append("onPlaceEstimated received null DataHolder: ").append(zzlm.a()).toString());
            }
            b.c(Status.c);
            return;
        } else
        {
            dataholder = new PlaceLikelihoodBuffer(dataholder, 100, g);
            b.a(dataholder);
            return;
        }
    }

    public void b(DataHolder dataholder)
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(a, 6))
            {
                Log.e(a, (new StringBuilder()).append("onAutocompletePrediction received null DataHolder: ").append(zzlm.a()).toString());
            }
            c.c(Status.c);
            return;
        } else
        {
            c.a(new AutocompletePredictionBuffer(dataholder));
            return;
        }
    }

    public void c(DataHolder dataholder)
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(a, 6))
            {
                Log.e(a, (new StringBuilder()).append("onPlaceUserDataFetched received null DataHolder: ").append(zzlm.a()).toString());
            }
            d.c(Status.c);
            return;
        } else
        {
            d.a(new com.google.android.gms.location.places.personalized.zzd(dataholder));
            return;
        }
    }

    public void d(DataHolder dataholder)
    {
        dataholder = new PlaceBuffer(dataholder, g);
        f.a(dataholder);
    }


    private class zzf extends zzb
    {
        private class zzb extends com.google.android.gms.common.api.zza.zza
        {

            public zzb(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
            {
                super(clientkey, googleapiclient);
            }
        }


        protected Result b(Status status)
        {
            return d(status);
        }

        protected Status d(Status status)
        {
            return status;
        }

        public zzf(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }


    private class zzd extends zzb
    {

        protected Result b(Status status)
        {
            return d(status);
        }

        protected PlaceLikelihoodBuffer d(Status status)
        {
            return new PlaceLikelihoodBuffer(DataHolder.b(status.g()), 100, null);
        }

        public zzd(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }


    private class zza extends zzb
    {

        protected Result b(Status status)
        {
            return d(status);
        }

        protected AutocompletePredictionBuffer d(Status status)
        {
            return new AutocompletePredictionBuffer(DataHolder.b(status.g()));
        }

        public zza(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }


    private class zze extends zzb
    {
    }


    private class zzc extends zzb
    {

        protected Result b(Status status)
        {
            return d(status);
        }

        protected PlaceBuffer d(Status status)
        {
            return new PlaceBuffer(DataHolder.b(status.g()), null);
        }

        public zzc(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

}
