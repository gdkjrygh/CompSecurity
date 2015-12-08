// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzh, zzg

public interface zzf
    extends IInterface
{

    public abstract void a(AddPlaceRequest addplacerequest, PlacesParams placesparams, zzh zzh);

    public abstract void a(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent);

    public abstract void a(PlaceFilter placefilter, PlacesParams placesparams, zzh zzh);

    public abstract void a(PlaceReport placereport, PlacesParams placesparams);

    public abstract void a(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent);

    public abstract void a(UserDataType userdatatype, LatLngBounds latlngbounds, List list, PlacesParams placesparams, zzh zzh);

    public abstract void a(PlacesParams placesparams, PendingIntent pendingintent);

    public abstract void a(PlaceAlias placealias, String s, String s1, PlacesParams placesparams, zzh zzh);

    public abstract void a(LatLng latlng, PlaceFilter placefilter, PlacesParams placesparams, zzh zzh);

    public abstract void a(LatLngBounds latlngbounds, int i, String s, PlaceFilter placefilter, PlacesParams placesparams, zzh zzh);

    public abstract void a(String s, int i, int j, int k, PlacesParams placesparams, zzg zzg);

    public abstract void a(String s, int i, PlacesParams placesparams, zzh zzh);

    public abstract void a(String s, PlacesParams placesparams, zzg zzg);

    public abstract void a(String s, PlacesParams placesparams, zzh zzh);

    public abstract void a(String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter, PlacesParams placesparams, zzh zzh);

    public abstract void a(List list, PlacesParams placesparams, zzh zzh);

    public abstract void b(PlacesParams placesparams, PendingIntent pendingintent);

    public abstract void b(String s, PlacesParams placesparams, zzh zzh);

    public abstract void b(List list, PlacesParams placesparams, zzh zzh);
}
