// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;

// Referenced classes of package com.google.android.gms.maps.internal:
//            cp

final class cr
    implements cp
{

    private IBinder a;

    cr(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Bitmap bitmap)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
    }

    public final void a(j j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
