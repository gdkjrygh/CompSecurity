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
//            gc

public interface gd
    extends IInterface
{
    public static abstract class a extends Binder
        implements gd
    {

        public static gd F(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            if (iinterface != null && (iinterface instanceof gd))
            {
                return (gd)iinterface;
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
                i = dP();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = dQ();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(gc.a.E(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(gc.a.E(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(gc.a.E(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(gc.a.E(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(gc.a.E(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(gc.a.E(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                c(gc.a.E(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class a.a
        implements gd
    {

        private IBinder ko;

        public void a(gc gc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            ko.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public void a(gc gc1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            parcel.writeInt(i);
            ko.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public void a(gc gc1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            ko.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public void a(gc gc1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            ko.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public IBinder asBinder()
        {
            return ko;
        }

        public void b(gc gc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            ko.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public void b(gc gc1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            parcel.writeInt(i);
            ko.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public void c(gc gc1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (gc1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            gc1 = gc1.asBinder();
_L1:
            parcel.writeStrongBinder(gc1);
            ko.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            gc1 = null;
              goto _L1
            gc1;
            parcel1.recycle();
            parcel.recycle();
            throw gc1;
        }

        public int dP()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            ko.transact(5001, parcel, parcel1, 0);
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

        public int dQ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            ko.transact(5002, parcel, parcel1, 0);
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
            ko = ibinder;
        }
    }


    public abstract void a(gc gc)
        throws RemoteException;

    public abstract void a(gc gc, int i)
        throws RemoteException;

    public abstract void a(gc gc, int i, String s, byte abyte0[])
        throws RemoteException;

    public abstract void a(gc gc, int i, byte abyte0[])
        throws RemoteException;

    public abstract void b(gc gc)
        throws RemoteException;

    public abstract void b(gc gc, int i)
        throws RemoteException;

    public abstract void c(gc gc)
        throws RemoteException;

    public abstract int dP()
        throws RemoteException;

    public abstract int dQ()
        throws RemoteException;
}
