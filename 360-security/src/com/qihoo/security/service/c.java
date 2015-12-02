// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

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
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.service.ITopAppChangedWatcher");
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

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag2 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.service.ITopAppChangedWatcher");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.service.ITopAppChangedWatcher");
                break;
            }
            boolean flag;
            boolean flag1;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            a(flag, flag1, flag2, parcel.readString());
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.service.ITopAppChangedWatcher");
        }
    }

    private static class a.a
        implements c
    {

        private IBinder a;

        public void a(boolean flag, boolean flag1, boolean flag2, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag3;
            flag3 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.service.ITopAppChangedWatcher");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag2)
            {
                i = ((flag3) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeString(s);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
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


    public abstract void a(boolean flag, boolean flag1, boolean flag2, String s)
        throws RemoteException;
}
