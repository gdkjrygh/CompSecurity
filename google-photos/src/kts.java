// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class kts
    implements ktq
{

    private IBinder a;

    kts(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(kok kok1, kok kok2, kok kok3, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (kok2 == null) goto _L4; else goto _L3
_L3:
        kok1 = kok2.asBinder();
_L6:
        parcel.writeStrongBinder(kok1);
        kok1 = obj;
        if (kok3 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        kok1 = kok3.asBinder();
        parcel.writeStrongBinder(kok1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        kok1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return kok1;
_L2:
        kok1 = null;
          goto _L5
_L4:
        kok1 = null;
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
