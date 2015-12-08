// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Criteria;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ILocationService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ILocationService
    {

        private static final String DESCRIPTOR = "com.urbanairship.location.ILocationService";
        static final int TRANSACTION_createLocationEvent = 2;
        static final int TRANSACTION_getBestProvider = 7;
        static final int TRANSACTION_getCriteria = 3;
        static final int TRANSACTION_getCurrentProvider = 6;
        static final int TRANSACTION_getLocation = 1;
        static final int TRANSACTION_requestSingleLocationUpdate = 8;
        static final int TRANSACTION_resetProviders = 5;
        static final int TRANSACTION_setCriteria = 4;

        public static ILocationService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.urbanairship.location.ILocationService");
            if (iinterface != null && (iinterface instanceof ILocationService))
            {
                return (ILocationService)iinterface;
            } else
            {
                return new Proxy(ibinder);
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
                parcel1.writeString("com.urbanairship.location.ILocationService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                parcel = getLocation();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 2: // '\002'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                Location location;
                if (parcel.readInt() != 0)
                {
                    location = (Location)Location.CREATOR.createFromParcel(parcel);
                } else
                {
                    location = null;
                }
                createLocationEvent(location, parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                parcel = getCriteria();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 4: // '\004'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Criteria)Criteria.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                setCriteria(parcel);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                resetProviders();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                parcel = getCurrentProvider();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                parcel = getBestProvider();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.urbanairship.location.ILocationService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Criteria)Criteria.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            requestSingleLocationUpdate(parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.urbanairship.location.ILocationService");
        }
    }

    private static class Stub.Proxy
        implements ILocationService
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void createLocationEvent(Location location, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel1.recycle();
            parcel.recycle();
            throw location;
        }

        public String getBestProvider()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Criteria getCriteria()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Criteria criteria = (Criteria)Criteria.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return criteria;
_L2:
            criteria = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getCurrentProvider()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getInterfaceDescriptor()
        {
            return "com.urbanairship.location.ILocationService";
        }

        public Location getLocation()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return location;
_L2:
            location = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void requestSingleLocationUpdate(Criteria criteria)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            if (criteria == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            criteria.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            criteria;
            parcel1.recycle();
            parcel.recycle();
            throw criteria;
        }

        public void resetProviders()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setCriteria(Criteria criteria)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.urbanairship.location.ILocationService");
            if (criteria == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            criteria.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            criteria;
            parcel1.recycle();
            parcel.recycle();
            throw criteria;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void createLocationEvent(Location location, int i, int j)
        throws RemoteException;

    public abstract String getBestProvider()
        throws RemoteException;

    public abstract Criteria getCriteria()
        throws RemoteException;

    public abstract String getCurrentProvider()
        throws RemoteException;

    public abstract Location getLocation()
        throws RemoteException;

    public abstract void requestSingleLocationUpdate(Criteria criteria)
        throws RemoteException;

    public abstract void resetProviders()
        throws RemoteException;

    public abstract void setCriteria(Criteria criteria)
        throws RemoteException;
}
