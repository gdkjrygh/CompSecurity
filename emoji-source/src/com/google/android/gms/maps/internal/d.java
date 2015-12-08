// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.f;

public interface d
    extends IInterface
{
    public static abstract class a extends Binder
        implements d
    {

        public static d az(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (iinterface != null && (iinterface instanceof d))
            {
                return (d)iinterface;
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
            com.google.android.gms.dynamic.d d2 = null;
            com.google.android.gms.dynamic.d d1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                d2 = f(com.google.android.gms.maps.model.internal.f.a.bc(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = d1;
                if (d2 != null)
                {
                    parcel = d2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                d1 = g(com.google.android.gms.maps.model.internal.f.a.bc(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = d2;
                break;
            }
            if (d1 != null)
            {
                parcel = d1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }
    }

    private static class a.a
        implements d
    {

        private IBinder kq;

        public IBinder asBinder()
        {
            return kq;
        }

        public com.google.android.gms.dynamic.d f(f f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            f1 = f1.asBinder();
_L1:
            parcel.writeStrongBinder(f1);
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            f1 = com.google.android.gms.dynamic.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return f1;
            f1 = null;
              goto _L1
            f1;
            parcel1.recycle();
            parcel.recycle();
            throw f1;
        }

        public com.google.android.gms.dynamic.d g(f f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (f1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            f1 = f1.asBinder();
_L1:
            parcel.writeStrongBinder(f1);
            kq.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            f1 = com.google.android.gms.dynamic.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return f1;
            f1 = null;
              goto _L1
            f1;
            parcel1.recycle();
            parcel.recycle();
            throw f1;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract com.google.android.gms.dynamic.d f(f f1)
        throws RemoteException;

    public abstract com.google.android.gms.dynamic.d g(f f1)
        throws RemoteException;
}
