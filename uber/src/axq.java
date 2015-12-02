// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class axq
    implements axo
{

    private IBinder a;

    axq(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(aur aur1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        if (aur1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aur1 = aur1.asBinder();
_L1:
        parcel.writeStrongBinder(aur1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        aur1 = null;
          goto _L1
        aur1;
        parcel1.recycle();
        parcel.recycle();
        throw aur1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
