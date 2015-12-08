// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzh

public interface zze
    extends IInterface
{

    public abstract void a(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent, zzh zzh);

    public abstract void a(PlaceFilter placefilter, PlacesParams placesparams, zzh zzh);

    public abstract void a(PlaceReport placereport, PlacesParams placesparams, zzh zzh);

    public abstract void a(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent, zzh zzh);

    public abstract void a(PlacesParams placesparams, PendingIntent pendingintent, zzh zzh);

    public abstract void b(PlacesParams placesparams, PendingIntent pendingintent, zzh zzh);
}
