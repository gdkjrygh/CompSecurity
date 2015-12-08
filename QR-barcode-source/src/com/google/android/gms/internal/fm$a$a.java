// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fm, fi, fk, fl

private static class lb
    implements fm
{

    private IBinder lb;

    public IBinder asBinder()
    {
        return lb;
    }

    public fk b(fi fi1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (fi1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        fi1.writeToParcel(parcel, 0);
_L3:
        lb.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        fi1 = fk.CREATOR.i(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return fi1;
_L2:
        parcel.writeInt(0);
          goto _L3
        fi1;
        parcel1.recycle();
        parcel.recycle();
        throw fi1;
        fi1 = null;
          goto _L4
    }

    (IBinder ibinder)
    {
        lb = ibinder;
    }
}
