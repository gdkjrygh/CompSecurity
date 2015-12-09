// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            IDataHolderEventCallback

private static final class mRemote
    implements IDataHolderEventCallback
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void onError(Status status)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
        if (status == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        status;
        parcel1.recycle();
        parcel.recycle();
        throw status;
    }

    public final void onResult(DataHolder dataholder, ParcelableEventList parcelableeventlist)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
        if (dataholder == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L3:
        if (parcelableeventlist == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        parcel.writeInt(1);
        parcelableeventlist.writeToParcel(parcel, 0);
_L4:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        dataholder;
        parcel1.recycle();
        parcel.recycle();
        throw dataholder;
        parcel.writeInt(0);
          goto _L4
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
