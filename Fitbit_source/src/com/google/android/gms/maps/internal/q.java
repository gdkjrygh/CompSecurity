// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.internal.m;

public interface q
    extends IInterface
{
    public static abstract class a extends Binder
        implements q
    {

        public static q a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        /* block-local class not found */
        class a {}

            if (iinterface != null && (iinterface instanceof q))
            {
                return (q)iinterface;
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
            e e2 = null;
            e e1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                e2 = a(com.google.android.gms.maps.model.internal.m.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = e1;
                if (e2 != null)
                {
                    parcel = e2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                e1 = b(com.google.android.gms.maps.model.internal.m.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = e2;
                break;
            }
            if (e1 != null)
            {
                parcel = e1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }
    }


    public abstract e a(m m)
        throws RemoteException;

    public abstract e b(m m)
        throws RemoteException;
}
