// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.core.c:
//            a

public interface c
    extends IInterface
{
    public static abstract class a extends Binder
        implements c
    {

        public static c a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            if (iinterface != null && (iinterface instanceof c))
            {
                return (c)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            boolean flag7 = false;
            boolean flag8 = false;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                a(com.qihoo360.mobilesafe.core.c.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                b(com.qihoo360.mobilesafe.core.c.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                }
                a(flag2);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                boolean flag3 = flag7;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                b(flag3);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                e();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                b(parcel.createTypedArrayList(KillBean.CREATOR));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                a(parcel.createTypedArrayList(KillBean.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeStringList(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                String s = parcel.readString();
                boolean flag4 = flag8;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                a(s, flag4);
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                d();
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                c();
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                boolean flag5 = f();
                parcel1.writeNoException();
                j = ((flag) ? 1 : 0);
                if (flag5)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                boolean flag6 = g();
                parcel1.writeNoException();
                j = ((flag1) ? 1 : 0);
                if (flag6)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                parcel = h();
                parcel1.writeNoException();
                parcel1.writeStringList(parcel);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
                long l = i();
                parcel1.writeNoException();
                parcel1.writeLong(l);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.qihoo360.mobilesafe.core.service.ISysProcessClear");
        }
    }

    private static class a.a
        implements c
    {

        private IBinder a;

        public List a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(ProcessInfo.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void a(com.qihoo360.mobilesafe.core.c.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void a(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            parcel.writeString(s);
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            parcel.writeTypedList(list);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int j;
            j = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            if (!flag)
            {
                j = 0;
            }
            parcel.writeInt(j);
            a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public List b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createStringArrayList();
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void b(com.qihoo360.mobilesafe.core.c.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public void b(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            parcel.writeTypedList(list);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public void b(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
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

        public void c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(12, parcel, parcel1, 0);
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

        public void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(11, parcel, parcel1, 0);
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

        public void e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(5, parcel, parcel1, 0);
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

        public boolean f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public List h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createStringArrayList();
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public long i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            long l;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.core.service.ISysProcessClear");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readLong();
            parcel1.recycle();
            parcel.recycle();
            return l;
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


    public abstract List a()
        throws RemoteException;

    public abstract void a(com.qihoo360.mobilesafe.core.c.a a1)
        throws RemoteException;

    public abstract void a(String s, boolean flag)
        throws RemoteException;

    public abstract void a(List list)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract List b()
        throws RemoteException;

    public abstract void b(com.qihoo360.mobilesafe.core.c.a a1)
        throws RemoteException;

    public abstract void b(List list)
        throws RemoteException;

    public abstract void b(boolean flag)
        throws RemoteException;

    public abstract void c()
        throws RemoteException;

    public abstract void d()
        throws RemoteException;

    public abstract void e()
        throws RemoteException;

    public abstract boolean f()
        throws RemoteException;

    public abstract boolean g()
        throws RemoteException;

    public abstract List h()
        throws RemoteException;

    public abstract long i()
        throws RemoteException;
}
