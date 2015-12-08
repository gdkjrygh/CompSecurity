// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;
import com.google.android.gms.maps.model.a.f;

public interface p
    extends IInterface
{
    public static abstract class a extends Binder
        implements p
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            c c2 = null;
            c c1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                c2 = a(com.google.android.gms.maps.model.a.f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = c1;
                if (c2 != null)
                {
                    parcel = c2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                c1 = b(com.google.android.gms.maps.model.a.f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = c2;
                break;
            }
            if (c1 != null)
            {
                parcel = c1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static final class a.a
        implements p
    {

        private IBinder a;

        public final c a(f f1)
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
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            f1 = com.google.android.gms.b.c.a.a(parcel1.readStrongBinder());
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final c b(f f1)
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
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            f1 = com.google.android.gms.b.c.a.a(parcel1.readStrongBinder());
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
            a = ibinder;
        }
    }


    public abstract c a(f f)
        throws RemoteException;

    public abstract c b(f f)
        throws RemoteException;
}
