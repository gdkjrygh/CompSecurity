// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            gc, gb

private static class kq
    implements gc
{

    private IBinder kq;

    public void a(gb gb1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        kq.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public void a(gb gb1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        parcel.writeInt(i);
        kq.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public void a(gb gb1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        kq.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public void a(gb gb1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        kq.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(gb gb1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        kq.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public void b(gb gb1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        parcel.writeInt(i);
        kq.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public void c(gb gb1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gb1 = gb1.asBinder();
_L1:
        parcel.writeStrongBinder(gb1);
        kq.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gb1 = null;
          goto _L1
        gb1;
        parcel1.recycle();
        parcel.recycle();
        throw gb1;
    }

    public int dU()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        kq.transact(5001, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int dV()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        kq.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
