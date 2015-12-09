// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

public final class cgx
    implements cgv
{

    private IBinder a;

    public cgx(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(cgs cgs1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (cgs1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        cgs1 = cgs1.asBinder();
_L1:
        parcel.writeStrongBinder(cgs1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cgs1 = null;
          goto _L1
        cgs1;
        parcel1.recycle();
        parcel.recycle();
        throw cgs1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
