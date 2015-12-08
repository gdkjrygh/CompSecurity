// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface com.google.android.gms.location.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.location.a
    {

        public static com.google.android.gms.location.a aq(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.location.a))
            {
                return (com.google.android.gms.location.a)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.ILocationListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Location)Location.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLocationChanged(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }
    }

    private static class a.a
        implements com.google.android.gms.location.a
    {

        private IBinder kq;

        public IBinder asBinder()
        {
            return kq;
        }

        public void onLocationChanged(Location location)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            kq.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel.recycle();
            throw location;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void onLocationChanged(Location location)
        throws RemoteException;
}
