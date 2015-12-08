// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            cy, cx

private static class dG
    implements cy
{

    private IBinder dG;

    public void a(cx cx1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        dG.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public void a(cx cx1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        parcel.writeInt(i);
        dG.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public void a(cx cx1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        dG.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public void a(cx cx1, int i, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        dG.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public void b(cx cx1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        dG.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public void b(cx cx1, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        parcel.writeInt(i);
        dG.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public void c(cx cx1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (cx1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        cx1 = cx1.asBinder();
_L1:
        parcel.writeStrongBinder(cx1);
        dG.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cx1 = null;
          goto _L1
        cx1;
        parcel1.recycle();
        parcel.recycle();
        throw cx1;
    }

    public int getMaxNumKeys()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        dG.transact(5002, parcel, parcel1, 0);
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

    public int getMaxStateSize()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        dG.transact(5001, parcel, parcel1, 0);
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
        dG = ibinder;
    }
}
