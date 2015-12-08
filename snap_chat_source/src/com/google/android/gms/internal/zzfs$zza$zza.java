// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzfr

static class zzle
    implements zzfs
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public boolean isValidPurchase(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        parcel.writeString(s);
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void zza(zzfr zzfr1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (zzfr1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzfr1 = zzfr1.asBinder();
_L1:
        parcel.writeStrongBinder(zzfr1);
        zzle.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzfr1 = null;
          goto _L1
        zzfr1;
        parcel1.recycle();
        parcel.recycle();
        throw zzfr1;
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
