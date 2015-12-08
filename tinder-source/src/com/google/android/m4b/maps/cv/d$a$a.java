// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.e.c;

// Referenced classes of package com.google.android.m4b.maps.cv:
//            d, c

static final class a
    implements d
{

    private IBinder a;

    public final void a(com.google.android.m4b.maps.cv.c c1, c c2)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = c1.asBinder();
        parcel.writeStrongBinder(ibinder);
        if (c2 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        parcel.writeInt(1);
        c2.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        c1;
        parcel.recycle();
        throw c1;
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
