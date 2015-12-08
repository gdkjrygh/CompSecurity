// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

// Referenced classes of package com.google.android.gms.cast.internal:
//            m

private static final class a
    implements m
{

    private IBinder a;

    public final void a()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void a(double d, double d1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeDouble(d);
        parcel.writeDouble(d1);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void a(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, LaunchOptions launchoptions)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        if (launchoptions == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        parcel.writeInt(1);
        launchoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(13, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, String s1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, String s1, long l)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeLong(l);
        a.transact(9, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(String s, byte abyte0[], long l)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        parcel.writeLong(l);
        a.transact(10, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void a(boolean flag, double d, boolean flag1)
        throws RemoteException
    {
        Parcel parcel;
        boolean flag2;
        flag2 = true;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeDouble(d);
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void b(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        a.transact(11, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final void c()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void c(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
        parcel.writeString(s);
        a.transact(12, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
