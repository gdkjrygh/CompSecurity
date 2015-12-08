// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzgs, zzgo, zzgq, zzgr

static class zzle
    implements zzgs
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public zzgq zzd(zzgo zzgo1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (zzgo1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzgo1.writeToParcel(parcel, 0);
_L3:
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        zzgo1 = zzgq.CREATOR.zzi(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return zzgo1;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzgo1;
        parcel1.recycle();
        parcel.recycle();
        throw zzgo1;
        zzgo1 = null;
          goto _L4
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
