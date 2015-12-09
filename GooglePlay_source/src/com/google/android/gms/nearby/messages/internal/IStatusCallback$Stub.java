// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            IStatusCallback

public static abstract class attachInterface extends Binder
    implements IStatusCallback
{
    private static final class Proxy
        implements IStatusCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onPermissionChanged(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IStatusCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
        if (iinterface != null && (iinterface instanceof IStatusCallback))
        {
            return (IStatusCallback)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        onPermissionChanged(flag);
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }
}
