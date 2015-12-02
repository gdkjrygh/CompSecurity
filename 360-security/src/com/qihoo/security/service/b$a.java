// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.qihoo.security.service:
//            b

public static abstract class attachInterface extends Binder
    implements b
{
    private static class a
        implements b
    {

        private IBinder a;

        public void a(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.service.IMemoryUpdateWatcher");
            parcel.writeInt(i);
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

        public IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static b a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.service.IMemoryUpdateWatcher");
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
            parcel1.writeString("com.qihoo.security.service.IMemoryUpdateWatcher");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.qihoo.security.service.IMemoryUpdateWatcher");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }

    public a.a()
    {
        attachInterface(this, "com.qihoo.security.service.IMemoryUpdateWatcher");
    }
}
