// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class kwc
    implements kwa
{

    private IBinder a;

    kwc(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(kok kok1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (kok1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        kok1 = kok1.asBinder();
_L1:
        parcel.writeStrongBinder(kok1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        kok1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return kok1;
        kok1 = null;
          goto _L1
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
