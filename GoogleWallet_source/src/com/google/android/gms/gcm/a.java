// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface com.google.android.gms.gcm.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.gcm.a
    {

        public static com.google.android.gms.gcm.a cc(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.gcm.a))
            {
                return (com.google.android.gms.gcm.a)iinterface;
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
                parcel1.writeString("com.google.android.gms.gcm.INetworkTaskCallback");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                he(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    static final class a.a
        implements com.google.android.gms.gcm.a
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void he(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            parcel.writeInt(i);
            ld.transact(2, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract void he(int i)
        throws RemoteException;
}
