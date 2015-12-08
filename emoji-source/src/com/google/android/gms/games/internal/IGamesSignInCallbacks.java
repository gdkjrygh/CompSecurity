// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public interface IGamesSignInCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesSignInCallbacks
    {

        public static IGamesSignInCallbacks ak(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            if (iinterface != null && (iinterface instanceof IGamesSignInCallbacks))
            {
                return (IGamesSignInCallbacks)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            Object obj1 = null;
            Object obj2 = null;
            Intent intent = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    intent = (Intent)Intent.CREATOR.createFromParcel(parcel);
                }
                b(i, intent);
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                DataHolder dataholder = obj;
                if (parcel.readInt() != 0)
                {
                    dataholder = DataHolder.CREATOR.x(parcel);
                }
                S(dataholder);
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                DataHolder dataholder1 = obj1;
                if (parcel.readInt() != 0)
                {
                    dataholder1 = DataHolder.CREATOR.x(parcel);
                }
                T(dataholder1);
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                ci(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                DataHolder dataholder2 = obj2;
                if (parcel.readInt() != 0)
                {
                    dataholder2 = DataHolder.CREATOR.x(parcel);
                }
                g(dataholder2);
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                cj(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesSignInCallbacks");
        }
    }

    private static class Stub.Proxy
        implements IGamesSignInCallbacks
    {

        private IBinder kq;

        public void S(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void T(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(int i, Intent intent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            parcel.writeInt(i);
            if (intent == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            kq.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        public void ci(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            parcel.writeInt(i);
            kq.transact(5004, parcel, parcel1, 0);
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

        public void cj(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            parcel.writeInt(i);
            kq.transact(5006, parcel, parcel1, 0);
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

        public void g(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        Stub.Proxy(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void S(DataHolder dataholder)
        throws RemoteException;

    public abstract void T(DataHolder dataholder)
        throws RemoteException;

    public abstract void b(int i, Intent intent)
        throws RemoteException;

    public abstract void ci(int i)
        throws RemoteException;

    public abstract void cj(int i)
        throws RemoteException;

    public abstract void g(DataHolder dataholder)
        throws RemoteException;
}
