// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo.security.services:
//            c, DeepScanItem, ScanResult

public interface IDeepScan
    extends IInterface
{
    public static abstract class a extends Binder
        implements IDeepScan
    {

        public static IDeepScan a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.services.IDeepScan");
            if (iinterface != null && (iinterface instanceof IDeepScan))
            {
                return (IDeepScan)iinterface;
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
            boolean flag1 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.services.IDeepScan");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = a();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = b();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = c();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = b(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                flag1 = a(com.qihoo.security.services.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag1)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                b(com.qihoo.security.services.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                parcel = a(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                parcel = a(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                java.util.ArrayList arraylist = parcel.createTypedArrayList(DeepScanItem.CREATOR);
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                i = a(arraylist, flag1);
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                String s = parcel.readString();
                boolean flag2 = flag4;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                }
                i = a(s, flag2);
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                String s1 = parcel.readString();
                boolean flag3 = flag5;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                i = b(s1, flag3);
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = d();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = e();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = f();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = g();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.qihoo.security.services.IDeepScan");
                i = a(parcel.createTypedArrayList(ScanResult.CREATOR));
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.services.IDeepScan");
        }
    }

    private static class a.a
        implements IDeepScan
    {

        private IBinder a;

        public int a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(1, parcel, parcel1, 0);
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

        public int a(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int a(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeTypedList(list);
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public int a(List list, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeTypedList(list);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public String a(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeString(s);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String a(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            c1 = c1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(c1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public int b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(2, parcel, parcel1, 0);
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

        public int b(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int b(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public int c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(3, parcel, parcel1, 0);
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

        public int d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(12, parcel, parcel1, 0);
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

        public int e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(13, parcel, parcel1, 0);
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

        public int f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(14, parcel, parcel1, 0);
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

        public int g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo.security.services.IDeepScan");
            a.transact(15, parcel, parcel1, 0);
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
            a = ibinder;
        }
    }


    public abstract int a()
        throws RemoteException;

    public abstract int a(String s, boolean flag)
        throws RemoteException;

    public abstract int a(List list)
        throws RemoteException;

    public abstract int a(List list, boolean flag)
        throws RemoteException;

    public abstract String a(String s)
        throws RemoteException;

    public abstract String a(String s, String s1)
        throws RemoteException;

    public abstract boolean a(c c1)
        throws RemoteException;

    public abstract int b()
        throws RemoteException;

    public abstract int b(String s, String s1)
        throws RemoteException;

    public abstract int b(String s, boolean flag)
        throws RemoteException;

    public abstract void b(c c1)
        throws RemoteException;

    public abstract int c()
        throws RemoteException;

    public abstract int d()
        throws RemoteException;

    public abstract int e()
        throws RemoteException;

    public abstract int f()
        throws RemoteException;

    public abstract int g()
        throws RemoteException;
}
