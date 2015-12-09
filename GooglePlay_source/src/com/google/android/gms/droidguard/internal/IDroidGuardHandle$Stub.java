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
//            IDroidGuardHandle

public static abstract class Proxy.mRemote extends Binder
    implements IDroidGuardHandle
{
    private static final class Proxy
        implements IDroidGuardHandle
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void close()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void init(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            parcel.writeString(s);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final byte[] snapshot(Map map)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            parcel.writeMap(map);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            map = parcel1.createByteArray();
            parcel1.recycle();
            parcel.recycle();
            return map;
            map;
            parcel1.recycle();
            parcel.recycle();
            throw map;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IDroidGuardHandle asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        if (iinterface != null && (iinterface instanceof IDroidGuardHandle))
        {
            return (IDroidGuardHandle)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            init(parcel.readString());
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            parcel = snapshot(parcel.readHashMap(getClass().getClassLoader()));
            parcel1.writeNoException();
            parcel1.writeByteArray(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            close();
            return true;
        }
    }
}
