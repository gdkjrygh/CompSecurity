// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            IMessageListener, MessageWrapper, MessageWrapperCreator

public static abstract class attachInterface extends Binder
    implements IMessageListener
{
    private static final class Proxy
        implements IMessageListener
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onMessageFound(MessageWrapper messagewrapper)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (messagewrapper == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            messagewrapper.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messagewrapper;
            parcel.recycle();
            throw messagewrapper;
        }

        public final void onMessageLost(MessageWrapper messagewrapper)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (messagewrapper == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            messagewrapper.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messagewrapper;
            parcel.recycle();
            throw messagewrapper;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IMessageListener asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
        if (iinterface != null && (iinterface instanceof IMessageListener))
        {
            return (IMessageListener)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (parcel.readInt() != 0)
            {
                parcel1 = MessageWrapper.CREATOR;
                parcel = MessageWrapperCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onMessageFound(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = MessageWrapper.CREATOR;
            parcel = MessageWrapperCreator.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        onMessageLost(parcel);
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.nearby.messages.internal.IMessageListener");
    }
}
