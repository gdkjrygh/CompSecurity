// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzg

class a
    implements zzg
{

    private IBinder a;

    public void a(PlacePhotoMetadataResult placephotometadataresult)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
        if (placephotometadataresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        placephotometadataresult.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        placephotometadataresult;
        parcel.recycle();
        throw placephotometadataresult;
    }

    public void a(PlacePhotoResult placephotoresult)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
        if (placephotoresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        placephotoresult.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        placephotoresult;
        parcel.recycle();
        throw placephotoresult;
    }

    public IBinder asBinder()
    {
        return a;
    }

    ult(IBinder ibinder)
    {
        a = ibinder;
    }
}
