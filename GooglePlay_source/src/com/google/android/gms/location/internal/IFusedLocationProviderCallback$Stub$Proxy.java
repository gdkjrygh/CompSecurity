// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location.internal:
//            IFusedLocationProviderCallback, FusedLocationProviderResult

private static final class mRemote
    implements IFusedLocationProviderCallback
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void onFusedLocationProviderResult(FusedLocationProviderResult fusedlocationproviderresult)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        if (fusedlocationproviderresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        fusedlocationproviderresult.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        fusedlocationproviderresult;
        parcel.recycle();
        throw fusedlocationproviderresult;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
