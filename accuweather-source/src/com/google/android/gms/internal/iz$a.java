// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            iz, iy

public static abstract class a.ko extends Binder
    implements iz
{
    private static class a
        implements iz
    {

        private IBinder ko;

        public void a(iy iy1, UserAddressRequest useraddressrequest, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
            if (iy1 == null) goto _L2; else goto _L1
_L1:
            iy1 = iy1.asBinder();
_L5:
            parcel.writeStrongBinder(iy1);
            if (useraddressrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            useraddressrequest.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            ko.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            iy1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            iy1;
            parcel1.recycle();
            parcel.recycle();
            throw iy1;
            parcel.writeInt(0);
              goto _L7
        }

        public IBinder asBinder()
        {
            return ko;
        }

        a(IBinder ibinder)
        {
            ko = ibinder;
        }
    }


    public static iz ap(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        if (iinterface != null && (iinterface instanceof iz))
        {
            return (iz)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        iy iy;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            iy = ao(parcel.readStrongBinder());
            break;
        }
        UserAddressRequest useraddressrequest;
        if (parcel.readInt() != 0)
        {
            useraddressrequest = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(parcel);
        } else
        {
            useraddressrequest = null;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(iy, useraddressrequest, parcel);
        parcel1.writeNoException();
        return true;
    }
}
