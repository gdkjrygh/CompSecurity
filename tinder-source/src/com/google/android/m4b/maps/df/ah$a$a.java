// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ah, t

static final class a
    implements ah
{

    private IBinder a;

    public final void a(t t1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        t1 = t1.asBinder();
_L1:
        parcel.writeStrongBinder(t1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        t1 = null;
          goto _L1
        t1;
        parcel1.recycle();
        parcel.recycle();
        throw t1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
