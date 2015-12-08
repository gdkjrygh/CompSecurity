// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            i

public interface ILocationSourceDelegate
    extends IInterface
{
    public static abstract class a extends Binder
        implements ILocationSourceDelegate
    {

        public static ILocationSourceDelegate aW(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            if (iinterface != null && (iinterface instanceof ILocationSourceDelegate))
            {
                return (ILocationSourceDelegate)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                activate(com.google.android.gms.maps.internal.i.a.bc(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                deactivate();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }
    }

    private static class a.a
        implements ILocationSourceDelegate
    {

        private IBinder le;

        public void activate(i j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            j = j.asBinder();
_L1:
            parcel.writeStrongBinder(j);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            j = null;
              goto _L1
            j;
            parcel1.recycle();
            parcel.recycle();
            throw j;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void deactivate()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            le.transact(2, parcel, parcel1, 0);
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
            le = ibinder;
        }
    }


    public abstract void activate(i i)
        throws RemoteException;

    public abstract void deactivate()
        throws RemoteException;
}
