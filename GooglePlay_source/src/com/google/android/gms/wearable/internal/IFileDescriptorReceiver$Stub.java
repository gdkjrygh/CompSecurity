// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            IFileDescriptorReceiver

public static abstract class Proxy.mRemote extends Binder
    implements IFileDescriptorReceiver
{
    private static final class Proxy
        implements IFileDescriptorReceiver
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void setFileDescriptor(ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelfiledescriptor;
            parcel.recycle();
            throw parcelfiledescriptor;
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
            parcel1.writeString("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.Parcel(parcel);
        } else
        {
            parcel = null;
        }
        setFileDescriptor(parcel);
        return true;
    }
}
