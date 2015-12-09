// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            IDroidGuardService, IDroidGuardCallbacks, IDroidGuardHandle

private static final class mRemote
    implements IDroidGuardService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final IDroidGuardHandle createDroidGuardHandle()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IDroidGuardHandle idroidguardhandle;
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        idroidguardhandle = face(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return idroidguardhandle;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int getClientBlockingOperationTimeoutMillis()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
        mRemote.transact(3, parcel, parcel1, 0);
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

    public final void getResults(IDroidGuardCallbacks idroidguardcallbacks, String s, Map map)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (idroidguardcallbacks == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ibinder = idroidguardcallbacks.asBinder();
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeMap(map);
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        idroidguardcallbacks;
        parcel.recycle();
        throw idroidguardcallbacks;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
