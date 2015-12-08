// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fl, fh, fj, fk

private static class le
    implements fl
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public fj b(fh fh1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (fh1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        fh1.writeToParcel(parcel, 0);
_L3:
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        fh1 = fj.CREATOR.i(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return fh1;
_L2:
        parcel.writeInt(0);
          goto _L3
        fh1;
        parcel1.recycle();
        parcel.recycle();
        throw fh1;
        fh1 = null;
          goto _L4
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
