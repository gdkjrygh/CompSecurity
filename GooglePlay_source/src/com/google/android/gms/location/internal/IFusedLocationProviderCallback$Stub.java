// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location.internal:
//            IFusedLocationProviderCallback, FusedLocationProviderResult

public static abstract class Proxy.mRemote extends Binder
    implements IFusedLocationProviderCallback
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IFusedLocationProviderCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        if (iinterface != null && (iinterface instanceof IFusedLocationProviderCallback))
        {
            return (IFusedLocationProviderCallback)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (FusedLocationProviderResult)FusedLocationProviderResult.CREATOR.CREATOR(parcel);
        } else
        {
            parcel = null;
        }
        onFusedLocationProviderResult(parcel);
        return true;
    }
}
