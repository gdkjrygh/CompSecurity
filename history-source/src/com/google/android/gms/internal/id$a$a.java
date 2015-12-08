// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            id, ic

private static class le
    implements id
{

    private IBinder le;

    public void a(ic ic1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        le.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public void a(ic ic1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        parcel.writeInt(i);
        le.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public void a(ic ic1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        le.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public void a(ic ic1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        le.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    public void b(ic ic1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        le.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public void b(ic ic1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        parcel.writeInt(i);
        le.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public void c(ic ic1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ic1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ic1 = ic1.asBinder();
_L1:
        parcel.writeStrongBinder(ic1);
        le.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ic1 = null;
          goto _L1
        ic1;
        parcel1.recycle();
        parcel.recycle();
        throw ic1;
    }

    public int fL()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        le.transact(5001, parcel, parcel1, 0);
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

    public int fM()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        le.transact(5002, parcel, parcel1, 0);
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
        le = ibinder;
    }
}
