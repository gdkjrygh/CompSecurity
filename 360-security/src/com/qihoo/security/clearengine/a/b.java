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
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
                a();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
                i = parcel.readInt();
                j = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (TrashInfo)TrashInfo.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(i, j, parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.clearengine.aidl.ITrashClearCallback");
        }
    }

    private static class a.a
        implements b
    {

        private IBinder a;

        public void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
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

        public void a(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
            parcel.writeInt(i);
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

        public void a(int i, int j, TrashInfo trashinfo)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.clearengine.aidl.ITrashClearCallback");
            parcel.writeInt(i);
            parcel.writeInt(j);
            if (trashinfo == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            parcel.writeInt(1);
            trashinfo.writeToParcel(parcel, 0);
_L1:
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            trashinfo;
            parcel1.recycle();
            parcel.recycle();
            throw trashinfo;
        }

        public IBinder asBinder()
        {
            return a;
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

    public abstract void a(int i, int j, TrashInfo trashinfo)
        throws RemoteException;
}
