// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zze, PlacesParams, zzh

class a
    implements zze
{

    private IBinder a;

    public void a(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (nearbyalertrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        nearbyalertrequest.writeToParcel(parcel, 0);
_L7:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L8:
        if (pendingintent == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L9:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        nearbyalertrequest = zzh1.asBinder();
_L10:
        parcel.writeStrongBinder(nearbyalertrequest);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        nearbyalertrequest;
        parcel1.recycle();
        parcel.recycle();
        throw nearbyalertrequest;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        nearbyalertrequest = null;
          goto _L10
    }

    public void a(PlaceFilter placefilter, PlacesParams placesparams, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (placefilter == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placefilter.writeToParcel(parcel, 0);
_L5:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L6:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        placefilter = zzh1.asBinder();
_L7:
        parcel.writeStrongBinder(placefilter);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        placefilter;
        parcel1.recycle();
        parcel.recycle();
        throw placefilter;
_L4:
        parcel.writeInt(0);
          goto _L6
        placefilter = null;
          goto _L7
    }

    public void a(PlaceReport placereport, PlacesParams placesparams, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (placereport == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placereport.writeToParcel(parcel, 0);
_L5:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L6:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        placereport = zzh1.asBinder();
_L7:
        parcel.writeStrongBinder(placereport);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        placereport;
        parcel1.recycle();
        parcel.recycle();
        throw placereport;
_L4:
        parcel.writeInt(0);
          goto _L6
        placereport = null;
          goto _L7
    }

    public void a(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (placerequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placerequest.writeToParcel(parcel, 0);
_L7:
        if (placesparams == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L8:
        if (pendingintent == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L9:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        placerequest = zzh1.asBinder();
_L10:
        parcel.writeStrongBinder(placerequest);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        placerequest;
        parcel1.recycle();
        parcel.recycle();
        throw placerequest;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        placerequest = null;
          goto _L10
    }

    public void a(PlacesParams placesparams, PendingIntent pendingintent, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L5:
        if (pendingintent == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L6:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        placesparams = zzh1.asBinder();
_L7:
        parcel.writeStrongBinder(placesparams);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        placesparams;
        parcel1.recycle();
        parcel.recycle();
        throw placesparams;
_L4:
        parcel.writeInt(0);
          goto _L6
        placesparams = null;
          goto _L7
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(PlacesParams placesparams, PendingIntent pendingintent, zzh zzh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (placesparams == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        placesparams.writeToParcel(parcel, 0);
_L5:
        if (pendingintent == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L6:
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        placesparams = zzh1.asBinder();
_L7:
        parcel.writeStrongBinder(placesparams);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        placesparams;
        parcel1.recycle();
        parcel.recycle();
        throw placesparams;
_L4:
        parcel.writeInt(0);
          goto _L6
        placesparams = null;
          goto _L7
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
