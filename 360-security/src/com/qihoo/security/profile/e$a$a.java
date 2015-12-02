// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.qihoo.security.profile:
//            e, d

private static class a
    implements e
{

    private IBinder a;

    public void a(int i, int j)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void a(d d1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = d1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        d1;
        parcel.recycle();
        throw d1;
    }

    public void a(d d1, int i, int j, String s)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ibinder = d1.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeString(s);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        d1;
        parcel.recycle();
        throw d1;
    }

    public void a(d d1, String s)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = d1.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        d1;
        parcel.recycle();
        throw d1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
