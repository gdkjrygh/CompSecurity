// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            dc, cd, cf, da

final class de
    implements dc
{

    private IBinder a;

    de(IBinder ibinder)
    {
        a = ibinder;
    }

    public final cf a(cd cd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (cd1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        cd1.writeToParcel(parcel, 0);
_L3:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        cd1 = cf.a;
        cd1 = da.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return cd1;
_L2:
        parcel.writeInt(0);
          goto _L3
        cd1;
        parcel1.recycle();
        parcel.recycle();
        throw cd1;
        cd1 = null;
          goto _L4
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
