// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.bd;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            a

private static final class a
    implements com.google.android.gms.ads.internal.reward.client.a
{

    private IBinder a;

    public final IBinder a(a a1, bd bd1, int i)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a1 = obj;
        if (bd1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a1 = bd1.asBinder();
        parcel.writeStrongBinder(a1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        a1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return a1;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
