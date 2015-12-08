// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            i

private static final class a
    implements i
{

    private IBinder a;

    public final void a(LocationSettingsResult locationsettingsresult)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
        if (locationsettingsresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        locationsettingsresult.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        locationsettingsresult;
        parcel.recycle();
        throw locationsettingsresult;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    sResult(IBinder ibinder)
    {
        a = ibinder;
    }
}
