// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.List;

// Referenced classes of package com.qihoo.security.clearengine.a:
//            b, c

public interface com.qihoo.security.clearengine.a.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.qihoo.security.clearengine.a.a
    {

        public static com.qihoo.security.clearengine.a.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (iinterface != null && (iinterface instanceof com.qihoo.security.clearengine.a.a))
            {
                return (com.qihoo.security.clearengine.a.a)iinterface;
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
            Object obj = null;
            UserBWRecord userbwrecord = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                a(parcel.readInt(), parcel.createIntArray(), parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                a();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                b();
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                a(parcel.createTypedArrayList(TrashInfo.CREATOR));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                c();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                a(com.qihoo.security.clearengine.a.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                b(com.qihoo.security.clearengine.a.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                a(com.qihoo.security.clearengine.a.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                b(com.qihoo.security.clearengine.a.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                d();
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                parcel = a(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                if (parcel.readInt() != 0)
                {
                    userbwrecord = (UserBWRecord)UserBWRecord.CREATOR.createFromParcel(parcel);
                }
                a(userbwrecord);
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashCleanService");
                userbwrecord = obj;
                break;
            }
            if (parcel.readInt() != 0)
            {
                userbwrecord = (UserBWRecord)UserBWRecord.CREATOR.createFromParcel(parcel);
            }
            b(userbwrecord);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.clearengine.aidl.ITrashCleanService");
        }
    }

    private static class a.a
        implements com.qihoo.security.clearengine.a.a
    {

        private IBinder a;

        public List a(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            parcel.writeInt(i);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(UserBWRecord.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
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

        public void a(int i, int ai[], List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            parcel.writeInt(i);
            parcel.writeIntArray(ai);
            parcel.writeStringList(list);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ai;
            parcel1.recycle();
            parcel.recycle();
            throw ai;
        }

        public void a(b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            b1 = null;
              goto _L1
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
        }

        public void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
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

        public void a(UserBWRecord userbwrecord)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (userbwrecord == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            userbwrecord.writeToParcel(parcel, 0);
_L1:
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            userbwrecord;
            parcel1.recycle();
            parcel.recycle();
            throw userbwrecord;
        }

        public void a(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            parcel.writeTypedList(list);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public void b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
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

        public void b(b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            b1 = b1.asBinder();
_L1:
            parcel.writeStrongBinder(b1);
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            b1 = null;
              goto _L1
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
        }

        public void b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(7, parcel, parcel1, 0);
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

        public void b(UserBWRecord userbwrecord)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
            if (userbwrecord == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            userbwrecord.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            userbwrecord;
            parcel1.recycle();
            parcel.recycle();
            throw userbwrecord;
        }

        public void c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
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

        public void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashCleanService");
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract List a(int i)
        throws RemoteException;

    public abstract void a()
        throws RemoteException;

    public abstract void a(int i, int ai[], List list)
        throws RemoteException;

    public abstract void a(b b1)
        throws RemoteException;

    public abstract void a(c c1)
        throws RemoteException;

    public abstract void a(UserBWRecord userbwrecord)
        throws RemoteException;

    public abstract void a(List list)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;

    public abstract void b(b b1)
        throws RemoteException;

    public abstract void b(c c1)
        throws RemoteException;

    public abstract void b(UserBWRecord userbwrecord)
        throws RemoteException;

    public abstract void c()
        throws RemoteException;

    public abstract void d()
        throws RemoteException;
}
