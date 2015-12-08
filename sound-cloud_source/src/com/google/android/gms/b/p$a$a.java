// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.b:
//            p, o, q

private static final class a
    implements p
{

    private IBinder a;

    public final void a()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void a(o o1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = o1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        o1;
        parcel.recycle();
        throw o1;
    }

    public final void a(o o1, int i)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = o1.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        o1;
        parcel.recycle();
        throw o1;
    }

    public final void a(o o1, q q1, String s, String s1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        o1 = o1.asBinder();
_L1:
        parcel.writeStrongBinder(o1);
        o1 = obj;
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        o1 = q1.asBinder();
        parcel.writeStrongBinder(o1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        o1 = null;
          goto _L1
        o1;
        parcel.recycle();
        throw o1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
