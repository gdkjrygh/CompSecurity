// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            a

public interface b
    extends IInterface
{
    public static abstract class a extends Binder
        implements b
    {

        public static b a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
            if (iinterface != null && (iinterface instanceof b))
            {
                return (b)iinterface;
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
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            boolean flag6 = false;
            boolean flag7 = false;
            boolean flag8 = false;
            boolean flag = false;
            boolean flag18;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo360.mobilesafe.support.root.IRootClient");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag9 = a(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong());
                parcel1.writeNoException();
                if (flag9)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                i = b(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong());
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                parcel = c(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong());
                parcel1.writeNoException();
                parcel1.writeByteArray(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                a(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), com.qihoo360.mobilesafe.support.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                b(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), com.qihoo360.mobilesafe.support.a.a.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag10 = a();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag10)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag11 = a(parcel.readLong());
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag11)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag12 = b();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag12)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                i = c();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag13 = a(parcel.readString(), parcel.readInt(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag3) ? 1 : 0);
                if (flag13)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag14 = a(parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag4) ? 1 : 0);
                if (flag14)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag15 = a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag5) ? 1 : 0);
                if (flag15)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag16 = a(parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag6) ? 1 : 0);
                if (flag16)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                boolean flag17 = a(parcel.readString(), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag7) ? 1 : 0);
                if (flag17)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootClient");
                flag18 = a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                i = ((flag8) ? 1 : 0);
                break;
            }
            if (flag18)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.qihoo360.mobilesafe.support.root.IRootClient");
        }
    }

    private static class a.a
        implements b
    {

        private IBinder a;

        public void a(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            s = a1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            a.transact(6, parcel, parcel1, 0);
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

        public boolean a(int i, int j, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeLong(l);
            a.transact(13, parcel, parcel1, 0);
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

        public boolean a(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeLong(l);
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

        public boolean a(String s, int i, int j, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeLong(l);
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(String s, int i, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeLong(l);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeLong(l);
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
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(String s, String s1, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeLong(l);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(String s, String s1, String s2, long l, String s3, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeLong(l);
            parcel.writeString(s3);
            parcel.writeLong(l1);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean a(String s, List list, List list1, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            parcel.writeLong(l);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public int b(String s, List list, List list1, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            parcel.writeLong(l);
            a.transact(2, parcel, parcel1, 0);
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

        public void b(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            s = a1.asBinder();
_L1:
            parcel.writeStrongBinder(s);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
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
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
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

        public byte[] c(String s, List list, List list1, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootClient");
            parcel.writeString(s);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            parcel.writeLong(l);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
        throws RemoteException;

    public abstract boolean a()
        throws RemoteException;

    public abstract boolean a(int i, int j, long l)
        throws RemoteException;

    public abstract boolean a(long l)
        throws RemoteException;

    public abstract boolean a(String s, int i, int j, long l)
        throws RemoteException;

    public abstract boolean a(String s, int i, long l)
        throws RemoteException;

    public abstract boolean a(String s, long l)
        throws RemoteException;

    public abstract boolean a(String s, String s1, long l)
        throws RemoteException;

    public abstract boolean a(String s, String s1, String s2, long l, String s3, long l1)
        throws RemoteException;

    public abstract boolean a(String s, List list, List list1, long l)
        throws RemoteException;

    public abstract int b(String s, List list, List list1, long l)
        throws RemoteException;

    public abstract void b(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
        throws RemoteException;

    public abstract boolean b()
        throws RemoteException;

    public abstract int c()
        throws RemoteException;

    public abstract byte[] c(String s, List list, List list1, long l)
        throws RemoteException;
}
