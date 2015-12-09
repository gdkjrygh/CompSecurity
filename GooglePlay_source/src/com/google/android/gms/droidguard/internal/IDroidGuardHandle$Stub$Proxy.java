// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            IDroidGuardHandle

private static final class mRemote
    implements IDroidGuardHandle
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void close()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        mRemote.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void init(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        parcel.writeString(s);
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final byte[] snapshot(Map map)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        parcel.writeMap(map);
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        map = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return map;
        map;
        parcel1.recycle();
        parcel.recycle();
        throw map;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
