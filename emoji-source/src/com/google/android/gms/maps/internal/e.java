// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPositionCreator;

public interface e
    extends IInterface
{
    public static abstract class a extends Binder
        implements e
    {

        public static e aD(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            if (iinterface != null && (iinterface instanceof e))
            {
                return (e)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
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
                parcel = CameraPosition.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onCameraChange(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
        }
    }

    private static class a.a
        implements e
    {

        private IBinder kq;

        public IBinder asBinder()
        {
            return kq;
        }

        public void onCameraChange(CameraPosition cameraposition)
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
            kq.transact(1, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void onCameraChange(CameraPosition cameraposition)
        throws RemoteException;
}
