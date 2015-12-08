// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

public interface o
    extends IInterface
{
    public static abstract class a extends Binder
        implements o
    {

        public static o a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            if (iinterface != null && (iinterface instanceof o))
            {
                return (o)iinterface;
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
                parcel1.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                i = parcel.readInt();
                j = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Surface)Surface.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(i, j, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                a();
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                b();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
        }
    }

    private static final class a.a
        implements o
    {

        private IBinder a;

        public final void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            a.transact(3, parcel, parcel1, 0);
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

        public final void a(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            parcel.writeInt(i);
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

        public final void a(int i, int j, Surface surface)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            parcel.writeInt(i);
            parcel.writeInt(j);
            if (surface == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            parcel.writeInt(1);
            surface.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            surface;
            parcel1.recycle();
            parcel.recycle();
            throw surface;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            a.transact(4, parcel, parcel1, 0);
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
            a = ibinder;
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(int i)
        throws RemoteException;

    public abstract void a(int i, int j, Surface surface)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;
}
