// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability, LocationResult, LocationAvailabilityCreator

public interface ILocationCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ILocationCallback
    {

        public static ILocationCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (iinterface != null && (iinterface instanceof ILocationCallback))
            {
                return (ILocationCallback)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.ILocationCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                if (parcel.readInt() != 0)
                {
                    parcel = (LocationResult)LocationResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onLocationResult(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = LocationAvailability.CREATOR;
                parcel = LocationAvailabilityCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLocationAvailability(parcel);
            return true;
        }
    }

    private static final class Stub.Proxy
        implements ILocationCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onLocationAvailability(LocationAvailability locationavailability)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationavailability == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            locationavailability.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationavailability;
            parcel.recycle();
            throw locationavailability;
        }

        public final void onLocationResult(LocationResult locationresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationresult == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            locationresult.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationresult;
            parcel.recycle();
            throw locationresult;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onLocationAvailability(LocationAvailability locationavailability)
        throws RemoteException;

    public abstract void onLocationResult(LocationResult locationresult)
        throws RemoteException;
}
