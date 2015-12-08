// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ev, ek

final class ex
    implements ev
{

    private IBinder a;

    ex(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ek ek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (ek1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ek1 = ek1.asBinder();
_L1:
        parcel.writeStrongBinder(ek1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ek1 = null;
          goto _L1
        ek1;
        parcel1.recycle();
        parcel.recycle();
        throw ek1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
