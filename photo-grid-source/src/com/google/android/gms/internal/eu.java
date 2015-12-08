// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            es, eg

final class eu
    implements es
{

    private IBinder a;

    eu(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(eg eg1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (eg1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        eg1 = eg1.asBinder();
_L1:
        parcel.writeStrongBinder(eg1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        eg1 = null;
          goto _L1
        eg1;
        parcel1.recycle();
        parcel.recycle();
        throw eg1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
