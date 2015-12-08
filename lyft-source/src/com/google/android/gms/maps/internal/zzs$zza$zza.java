// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzs

class a
    implements zzs
{

    private IBinder a;

    public void a(StreetViewPanoramaLocation streetviewpanoramalocation)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
        if (streetviewpanoramalocation == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        streetviewpanoramalocation.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        streetviewpanoramalocation;
        parcel1.recycle();
        parcel.recycle();
        throw streetviewpanoramalocation;
    }

    public IBinder asBinder()
    {
        return a;
    }

    amaLocation(IBinder ibinder)
    {
        a = ibinder;
    }
}
