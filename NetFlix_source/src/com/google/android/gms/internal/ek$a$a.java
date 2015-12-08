// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ek, ej

private static class kn
    implements ek
{

    private IBinder kn;

    public void a(ej ej1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        kn.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public void a(ej ej1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        parcel.writeInt(i);
        kn.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public void a(ej ej1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        kn.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public void a(ej ej1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        kn.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public IBinder asBinder()
    {
        return kn;
    }

    public void b(ej ej1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        kn.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public void b(ej ej1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        parcel.writeInt(i);
        kn.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public void c(ej ej1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ej1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ej1 = ej1.asBinder();
_L1:
        parcel.writeStrongBinder(ej1);
        kn.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ej1 = null;
          goto _L1
        ej1;
        parcel1.recycle();
        parcel.recycle();
        throw ej1;
    }

    public int dv()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        kn.transact(5001, parcel, parcel1, 0);
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

    public int dw()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        kn.transact(5002, parcel, parcel1, 0);
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
        kn = ibinder;
    }
}
