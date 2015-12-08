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
//            ic

public interface id
    extends IInterface
{
    public static abstract class a extends Binder
        implements id
    {

        public static id J(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            if (iinterface != null && (iinterface instanceof id))
            {
                return (id)iinterface;
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
                i = fL();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = fM();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ic.a.I(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ic.a.I(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ic.a.I(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(ic.a.I(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(ic.a.I(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(ic.a.I(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                c(ic.a.I(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class a.a
        implements id
    {

        private IBinder le;

        public void a(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            le.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            le.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            le.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            le.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void b(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            le.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void b(ic ic1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            le.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void c(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            le.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public int fL()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            le.transact(5001, parcel, parcel1, 0);
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

        public int fM()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            le.transact(5002, parcel, parcel1, 0);
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
            le = ibinder;
        }
    }


    public abstract void a(ic ic)
        throws RemoteException;

    public abstract void a(ic ic, int i)
        throws RemoteException;

    public abstract void a(ic ic, int i, String s, byte abyte0[])
        throws RemoteException;

    public abstract void a(ic ic, int i, byte abyte0[])
        throws RemoteException;

    public abstract void b(ic ic)
        throws RemoteException;

    public abstract void b(ic ic, int i)
        throws RemoteException;

    public abstract void c(ic ic)
        throws RemoteException;

    public abstract int fL()
        throws RemoteException;

    public abstract int fM()
        throws RemoteException;
}
