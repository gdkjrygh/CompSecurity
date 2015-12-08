// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj, zzci

static class zzle
    implements zzcj
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public void zza(zzci zzci1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (zzci1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzci1 = zzci1.asBinder();
_L1:
        parcel.writeStrongBinder(zzci1);
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzci1 = null;
          goto _L1
        zzci1;
        parcel1.recycle();
        parcel.recycle();
        throw zzci1;
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
