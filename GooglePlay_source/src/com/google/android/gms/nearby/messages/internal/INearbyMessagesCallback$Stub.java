// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            INearbyMessagesCallback

public static abstract class attachInterface extends Binder
    implements INearbyMessagesCallback
{
    private static final class Proxy
        implements INearbyMessagesCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onStatusReceived(Status status)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel.recycle();
            throw status;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static INearbyMessagesCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
        if (iinterface != null && (iinterface instanceof INearbyMessagesCallback))
        {
            return (INearbyMessagesCallback)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Status)Status.CREATOR.Parcel(parcel);
        } else
        {
            parcel = null;
        }
        onStatusReceived(parcel);
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }
}
