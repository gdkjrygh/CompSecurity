// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zze

public class zzj extends zzi
{

    private final PlacesParams d;
    private final Locale e = Locale.getDefault();

    public zzj(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 67, connectioncallbacks, onconnectionfailedlistener, zze1);
        context = null;
        if (zze1.b() != null)
        {
            context = zze1.b().name;
        }
        d = new PlacesParams(s, e, context, placesoptions.a, s1);
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a(zzm zzm, PlaceFilter placefilter)
    {
        PlaceFilter placefilter1 = placefilter;
        if (placefilter == null)
        {
            placefilter1 = PlaceFilter.d();
        }
        ((com.google.android.gms.location.places.internal.zze)m()).a(placefilter1, d, zzm);
    }

    public void a(zzm zzm, PlaceReport placereport)
    {
        zzu.a(placereport);
        ((com.google.android.gms.location.places.internal.zze)m()).a(placereport, d, zzm);
    }

    protected com.google.android.gms.location.places.internal.zze b(IBinder ibinder)
    {
        return zze.zza.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected String e()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }
}
