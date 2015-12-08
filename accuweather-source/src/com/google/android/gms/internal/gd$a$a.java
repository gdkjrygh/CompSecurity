// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            gd, gc

private static class ko
    implements gd
{

    private IBinder ko;

    public void a(gc gc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        ko.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public void a(gc gc1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        parcel.writeInt(i);
        ko.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public void a(gc gc1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        ko.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public void a(gc gc1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        ko.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public IBinder asBinder()
    {
        return ko;
    }

    public void b(gc gc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        ko.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public void b(gc gc1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        parcel.writeInt(i);
        ko.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public void c(gc gc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (gc1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gc1 = gc1.asBinder();
_L1:
        parcel.writeStrongBinder(gc1);
        ko.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gc1 = null;
          goto _L1
        gc1;
        parcel1.recycle();
        parcel.recycle();
        throw gc1;
    }

    public int dP()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        ko.transact(5001, parcel, parcel1, 0);
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

    public int dQ()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        ko.transact(5002, parcel, parcel1, 0);
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
        ko = ibinder;
    }
}
