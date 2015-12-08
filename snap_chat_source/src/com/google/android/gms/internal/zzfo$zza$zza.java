// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzfo, zzfn

static class zzle
    implements zzfo
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public void zza(zzfn zzfn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (zzfn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzfn1 = zzfn1.asBinder();
_L1:
        parcel.writeStrongBinder(zzfn1);
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzfn1 = null;
          goto _L1
        zzfn1;
        parcel1.recycle();
        parcel.recycle();
        throw zzfn1;
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
