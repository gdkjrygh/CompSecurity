// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal:
//            jr

final class jt
    implements jr
{

    private IBinder a;

    jt(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(LocationSettingsResult locationsettingsresult)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
        if (locationsettingsresult == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        locationsettingsresult.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        locationsettingsresult;
        parcel1.recycle();
        parcel.recycle();
        throw locationsettingsresult;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
