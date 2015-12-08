// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dp

final class du
    implements ds
{

    private IBinder a;

    du(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(dp dp1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (dp1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        dp1 = dp1.asBinder();
_L1:
        parcel.writeStrongBinder(dp1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        dp1 = null;
          goto _L1
        dp1;
        parcel1.recycle();
        parcel.recycle();
        throw dp1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
