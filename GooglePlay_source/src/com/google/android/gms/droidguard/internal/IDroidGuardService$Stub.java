// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            IDroidGuardService, IDroidGuardCallbacks, IDroidGuardHandle

public static abstract class Proxy.mRemote extends Binder
    implements IDroidGuardService
{
    private static final class Proxy
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
            idroidguardhandle = IDroidGuardHandle.Stub.asInterface(parcel1.readStrongBinder());
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IDroidGuardService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (iinterface != null && (iinterface instanceof IDroidGuardService))
        {
            return (IDroidGuardService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.droidguard.internal.IDroidGuardService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
            parcel1 = parcel.readStrongBinder();
            if (parcel1 == null)
            {
                parcel1 = obj;
            } else
            {
                android.os.IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                if (iinterface != null && (iinterface instanceof IDroidGuardCallbacks))
                {
                    parcel1 = (IDroidGuardCallbacks)iinterface;
                } else
                {
                    parcel1 = new b.Proxy(parcel1);
                }
            }
            getResults(parcel1, parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
            IDroidGuardHandle idroidguardhandle = createDroidGuardHandle();
            parcel1.writeNoException();
            parcel = obj1;
            if (idroidguardhandle != null)
            {
                parcel = idroidguardhandle.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
            i = getClientBlockingOperationTimeoutMillis();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;
        }
    }
}
