// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.drive.internal:
//            IEventReleaseCallback

public static abstract class Proxy.mRemote extends Binder
    implements IEventReleaseCallback
{
    private static final class Proxy
        implements IEventReleaseCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void release(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
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


    public static IEventReleaseCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
        if (iinterface != null && (iinterface instanceof IEventReleaseCallback))
        {
            return (IEventReleaseCallback)iinterface;
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
            parcel1.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
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
        release(flag);
        return true;
    }
}
