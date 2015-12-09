// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.location:
//            v, zzh

final class x
    implements v
{

    private IBinder a;

    x(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(zzh zzh1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.ILocationResultListener");
        if (zzh1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        zzh1.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        zzh1;
        parcel.recycle();
        throw zzh1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
