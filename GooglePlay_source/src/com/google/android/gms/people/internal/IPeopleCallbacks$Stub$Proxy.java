// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.people.internal:
//            IPeopleCallbacks

private static final class mRemote
    implements IPeopleCallbacks
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
        parcel.writeInt(i);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        bundle1.writeToParcel(parcel, 0);
_L4:
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        bundle;
        parcel.recycle();
        throw bundle;
        parcel.writeInt(0);
          goto _L4
    }

    public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
        parcel.writeInt(i);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L4:
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        bundle;
        parcel.recycle();
        throw bundle;
        parcel.writeInt(0);
          goto _L4
    }

    public final void onDataHoldersLoaded(int i, Bundle bundle, DataHolder adataholder[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
        parcel.writeInt(i);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        parcel.writeTypedArray(adataholder, 0);
        mRemote.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel.recycle();
        throw bundle;
    }

    public final void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
        parcel.writeInt(i);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L5:
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        parcel.writeInt(1);
        bundle1.writeToParcel(parcel, 0);
_L7:
        mRemote.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        bundle;
        parcel.recycle();
        throw bundle;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public final void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
        parcel.writeInt(i);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
        mRemote.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        bundle;
        parcel.recycle();
        throw bundle;
        parcel.writeInt(0);
          goto _L4
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
