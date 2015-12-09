// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.a;

// Referenced classes of package com.google.android.gms.maps.internal:
//            f

public static abstract class a.ld extends Binder
    implements f
{
    static final class a
        implements f
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void onCameraChange(CameraPosition cameraposition)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            if (cameraposition == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            cameraposition.writeToParcel(parcel, 0);
_L1:
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            cameraposition;
            parcel1.recycle();
            parcel.recycle();
            throw cameraposition;
        }

        a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public static f cF(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        if (iinterface != null && (iinterface instanceof f))
        {
            return (f)iinterface;
        } else
        {
            return new a(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            com.google.android.gms.maps.model.a a1 = CameraPosition.CREATOR;
            parcel = com.google.android.gms.maps.model.a.gm(parcel);
        } else
        {
            parcel = null;
        }
        onCameraChange(parcel);
        parcel1.writeNoException();
        return true;
    }
}
