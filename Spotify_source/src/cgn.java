// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class cgn
    implements cgl
{

    private IBinder a;

    cgn(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        byb1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return byb1;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
