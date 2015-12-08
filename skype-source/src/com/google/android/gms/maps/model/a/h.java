// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface h
    extends IInterface
{
    public static abstract class a extends Binder
        implements h
    {

        public static h a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            if (iinterface != null && (iinterface instanceof h))
            {
                return (h)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag = false;
            boolean flag1 = false;
            boolean flag4 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                a();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                b();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                parcel = c();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                float f1 = d();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(flag3);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                flag3 = e();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag3)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                flag3 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag3)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                i = f();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                flag3 = flag4;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                b(flag3);
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                flag3 = g();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                break;
            }
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;
        }
    }

    private static final class a.a
        implements h
    {

        private IBinder a;

        public final void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(1, parcel, parcel1, 0);
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

        public final void a(float f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            parcel.writeFloat(f1);
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

        public final void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(6, parcel, parcel1, 0);
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

        public final boolean a(h h1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            if (h1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            h1 = h1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(h1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            h1 = null;
              goto _L1
            h1;
            parcel1.recycle();
            parcel.recycle();
            throw h1;
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
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
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

        public final void b(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(10, parcel, parcel1, 0);
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

        public final String c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final int f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(9, parcel, parcel1, 0);
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

        public final boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
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

    public abstract void a(float f1)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a(h h1)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;

    public abstract void b(boolean flag)
        throws RemoteException;

    public abstract String c()
        throws RemoteException;

    public abstract float d()
        throws RemoteException;

    public abstract boolean e()
        throws RemoteException;

    public abstract int f()
        throws RemoteException;

    public abstract boolean g()
        throws RemoteException;
}
