// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ICollaboratorEventCallback, ParcelableCollaborator

public static abstract class Proxy.mRemote extends Binder
    implements ICollaboratorEventCallback
{
    private static final class Proxy
        implements ICollaboratorEventCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onJoined(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcelablecollaborator == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        public final void onLeft(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcelablecollaborator == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
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
            parcel1.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcel.readInt() != 0)
            {
                parcel = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.cel(parcel);
            } else
            {
                parcel = null;
            }
            onJoined(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.cel(parcel);
        } else
        {
            parcel = null;
        }
        onLeft(parcel);
        parcel1.writeNoException();
        return true;
    }
}
