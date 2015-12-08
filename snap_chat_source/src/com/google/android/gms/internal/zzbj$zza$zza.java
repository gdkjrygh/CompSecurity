// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzbj, zzba, zzdr

static class zzle
    implements zzbj
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public IBinder zza(zzd zzd1, zzba zzba1, String s, zzdr zzdr1, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        zzd1 = zzd1.asBinder();
_L5:
        parcel.writeStrongBinder(zzd1);
        if (zzba1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzba1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        zzd1 = obj;
        if (zzdr1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        zzd1 = zzdr1.asBinder();
        parcel.writeStrongBinder(zzd1);
        parcel.writeInt(i);
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
_L2:
        zzd1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
          goto _L5
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
