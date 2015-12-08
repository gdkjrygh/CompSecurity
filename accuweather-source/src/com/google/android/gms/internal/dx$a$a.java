// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dx, dt, dv, dw

private static class ko
    implements dx
{

    private IBinder ko;

    public IBinder asBinder()
    {
        return ko;
    }

    public dv b(dt dt1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (dt1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dt1.writeToParcel(parcel, 0);
_L3:
        ko.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        dt1 = dv.CREATOR.i(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return dt1;
_L2:
        parcel.writeInt(0);
          goto _L3
        dt1;
        parcel1.recycle();
        parcel.recycle();
        throw dt1;
        dt1 = null;
          goto _L4
    }

    (IBinder ibinder)
    {
        ko = ibinder;
    }
}
