// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.a:
//            t

public interface c
    extends IInterface
{
    public static abstract class a extends Binder
        implements c
    {

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
                parcel1.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    if (iinterface != null && (iinterface instanceof t))
                    {
                        parcel = (t)iinterface;
                    } else
                    {
                        parcel = new t.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                a();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }
    }

    private static final class a.a
        implements c
    {

        private IBinder a;

        public final void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            a.transact(2, parcel, parcel1, 0);
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

        public final void a(t t1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            if (t1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            t1 = t1.asBinder();
_L1:
            parcel.writeStrongBinder(t1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            t1 = null;
              goto _L1
            t1;
            parcel1.recycle();
            parcel.recycle();
            throw t1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(t t)
        throws RemoteException;
}
