// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

public interface d
    extends IInterface
{
    public static abstract class a extends Binder
        implements d
    {

        public static d L(IBinder ibinder)
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
            b b2 = null;
            b b1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                b2 = f(com.google.android.gms.maps.model.internal.a.af(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = b1;
                if (b2 != null)
                {
                    parcel = b2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                b1 = g(com.google.android.gms.maps.model.internal.a.af(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = b2;
                break;
            }
            if (b1 != null)
            {
                parcel = b1.asBinder();
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

        private IBinder dG;

        public IBinder asBinder()
        {
            return dG;
        }

        public b f(com.google.android.gms.maps.model.internal.d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public b g(com.google.android.gms.maps.model.internal.d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract b f(com.google.android.gms.maps.model.internal.d d1)
        throws RemoteException;

    public abstract b g(com.google.android.gms.maps.model.internal.d d1)
        throws RemoteException;
}
