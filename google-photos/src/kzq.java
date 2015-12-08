// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class kzq
    implements kzo
{

    private IBinder a;

    kzq(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a()
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

    public final void a(kzl kzl1)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (kzl1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = kzl1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        kzl1;
        parcel.recycle();
        throw kzl1;
    }

    public final void a(kzl kzl1, int i)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (kzl1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = kzl1.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        kzl1;
        parcel.recycle();
        throw kzl1;
    }

    public final void a(kzl kzl1, kzr kzr1, String s, String s1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (kzl1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        kzl1 = kzl1.asBinder();
_L1:
        parcel.writeStrongBinder(kzl1);
        kzl1 = obj;
        if (kzr1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        kzl1 = kzr1.asBinder();
        parcel.writeStrongBinder(kzl1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        kzl1 = null;
          goto _L1
        kzl1;
        parcel.recycle();
        throw kzl1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
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
}
