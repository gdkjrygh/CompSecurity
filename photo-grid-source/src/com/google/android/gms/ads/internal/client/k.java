// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.a;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx

final class k
    implements zzx
{

    private IBinder a;

    k(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final IBinder zza(a a1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a1 = a1.asBinder();
_L1:
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
}
