// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate

public interface m
    extends IInterface
{
    public static abstract class a extends Binder
        implements m
    {

        public static m bg(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            if (iinterface != null && (iinterface instanceof m))
            {
                return (m)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                a(IGoogleMapDelegate.a.aT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }
    }

    private static class a.a
        implements m
    {

        private IBinder le;

        public void a(IGoogleMapDelegate igooglemapdelegate)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            if (igooglemapdelegate == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            igooglemapdelegate = igooglemapdelegate.asBinder();
_L1:
            parcel.writeStrongBinder(igooglemapdelegate);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igooglemapdelegate = null;
              goto _L1
            igooglemapdelegate;
            parcel1.recycle();
            parcel.recycle();
            throw igooglemapdelegate;
        }

        public IBinder asBinder()
        {
            return le;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException;
}
