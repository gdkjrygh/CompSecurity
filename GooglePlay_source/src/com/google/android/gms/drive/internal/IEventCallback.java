// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public interface IEventCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IEventCallback
    {

        public static IEventCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
            if (iinterface != null && (iinterface instanceof IEventCallback))
            {
                return (IEventCallback)iinterface;
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
                parcel1.writeString("com.google.android.gms.drive.internal.IEventCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IEventCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (OnEventResponse)OnEventResponse.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onEvent(parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.drive.internal.IEventCallback");
        }
    }

    private static final class Stub.Proxy
        implements IEventCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onEvent(OnEventResponse oneventresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IEventCallback");
            if (oneventresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            oneventresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            oneventresponse;
            parcel1.recycle();
            parcel.recycle();
            throw oneventresponse;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onEvent(OnEventResponse oneventresponse)
        throws RemoteException;
}
