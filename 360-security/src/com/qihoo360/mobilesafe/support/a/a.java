// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface com.qihoo360.mobilesafe.support.a.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.qihoo360.mobilesafe.support.a.a
    {

        public static com.qihoo360.mobilesafe.support.a.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo360.mobilesafe.support.root.IRootCallback");
            if (iinterface != null && (iinterface instanceof com.qihoo360.mobilesafe.support.a.a))
            {
                return (com.qihoo360.mobilesafe.support.a.a)iinterface;
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
                parcel1.writeString("com.qihoo360.mobilesafe.support.root.IRootCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo360.mobilesafe.support.root.IRootCallback");
                i = parcel.readInt();
                break;
            }
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(i, flag, parcel.createByteArray());
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.qihoo360.mobilesafe.support.root.IRootCallback");
        }
    }

    private static class a.a
        implements com.qihoo360.mobilesafe.support.a.a
    {

        private IBinder a;

        public void a(int i, boolean flag, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo360.mobilesafe.support.root.IRootCallback");
            parcel.writeInt(i);
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
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


    public abstract void a(int i, boolean flag, byte abyte0[])
        throws RemoteException;
}
