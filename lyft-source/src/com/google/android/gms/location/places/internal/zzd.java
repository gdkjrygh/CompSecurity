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
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzf

public class zzd extends zzi
{

    private final PlacesParams d;
    private final Locale e = Locale.getDefault();

    public zzd(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 65, connectioncallbacks, onconnectionfailedlistener, zze1);
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

    public void a(zzm zzm, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        zzu.a(s, "query == null");
        zzu.a(latlngbounds, "bounds == null");
        zzu.a(zzm, "callback == null");
        if (autocompletefilter == null)
        {
            autocompletefilter = AutocompleteFilter.a(null);
        }
        ((zzf)m()).a(s, latlngbounds, autocompletefilter, d, zzm);
    }

    public void a(zzm zzm, List list)
    {
        ((zzf)m()).b(list, d, zzm);
    }

    protected zzf b(IBinder ibinder)
    {
        return zzf.zza.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected String e()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }
}
