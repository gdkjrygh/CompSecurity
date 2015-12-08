// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;

// Referenced classes of package com.google.android.gms.internal:
//            dh

final class dj
    implements dh
{

    private IBinder a;

    dj(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(j j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        j1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return j1;
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
