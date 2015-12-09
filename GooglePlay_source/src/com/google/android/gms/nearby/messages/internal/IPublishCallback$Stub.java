// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            IPublishCallback

public static abstract class attachInterface extends Binder
    implements IPublishCallback
{
    private static final class Proxy
        implements IPublishCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onExpired()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IPublishCallback");
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


    public static IPublishCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
        if (iinterface != null && (iinterface instanceof IPublishCallback))
        {
            return (IPublishCallback)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            onExpired();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }
}
