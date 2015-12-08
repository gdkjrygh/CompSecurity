// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ac, af, ai

private static class kq
    implements ac
{

    private IBinder kq;

    public void Y(DataHolder dataholder)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L1:
        kq.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dataholder;
        parcel.recycle();
        throw dataholder;
    }

    public void a(af af1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (af1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        af1.writeToParcel(parcel, 0);
_L1:
        kq.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        af1;
        parcel.recycle();
        throw af1;
    }

    public void a(ai ai1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L1:
        kq.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ai1;
        parcel.recycle();
        throw ai1;
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(ai ai1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L1:
        kq.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ai1;
        parcel.recycle();
        throw ai1;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
