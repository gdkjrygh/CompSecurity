// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.df:
//            f, i

static final class a
    implements f
{

    private IBinder a;

    public final void a(i j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        j = j.asBinder();
_L1:
        parcel.writeStrongBinder(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j = null;
          goto _L1
        j;
        parcel1.recycle();
        parcel.recycle();
        throw j;
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
