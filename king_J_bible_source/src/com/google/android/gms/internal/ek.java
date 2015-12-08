// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ej

public interface ek
    extends IInterface
{
    public static abstract class a extends Binder
        implements ek
    {

        public static ek w(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            if (iinterface != null && (iinterface instanceof ek))
            {
                return (ek)iinterface;
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
                parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = dv();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = dw();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ej.a.v(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ej.a.v(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ej.a.v(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ej.a.v(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(ej.a.v(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(ej.a.v(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                c(ej.a.v(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class a.a
        implements ek
    {

        private IBinder kn;

        public void a(ej ej1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            kn.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public void a(ej ej1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            parcel.writeInt(i);
            kn.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public void a(ej ej1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            kn.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public void a(ej ej1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            kn.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public IBinder asBinder()
        {
            return kn;
        }

        public void b(ej ej1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            kn.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public void b(ej ej1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            parcel.writeInt(i);
            kn.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public void c(ej ej1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ej1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ej1 = ej1.asBinder();
_L1:
            parcel.writeStrongBinder(ej1);
            kn.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ej1 = null;
              goto _L1
            ej1;
            parcel1.recycle();
            parcel.recycle();
            throw ej1;
        }

        public int dv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            kn.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int dw()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            kn.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            kn = ibinder;
        }
    }


    public abstract void a(ej ej)
        throws RemoteException;

    public abstract void a(ej ej, int i)
        throws RemoteException;

    public abstract void a(ej ej, int i, String s, byte abyte0[])
        throws RemoteException;

    public abstract void a(ej ej, int i, byte abyte0[])
        throws RemoteException;

    public abstract void b(ej ej)
        throws RemoteException;

    public abstract void b(ej ej, int i)
        throws RemoteException;

    public abstract void c(ej ej)
        throws RemoteException;

    public abstract int dv()
        throws RemoteException;

    public abstract int dw()
        throws RemoteException;
}
