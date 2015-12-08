// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class ccb
    implements cbz
{

    private IBinder a;

    ccb(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(byb byb1, byb byb2, byb byb3, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
        if (byb2 == null) goto _L4; else goto _L3
_L3:
        byb1 = byb2.asBinder();
_L6:
        parcel.writeStrongBinder(byb1);
        byb1 = obj;
        if (byb3 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        byb1 = byb3.asBinder();
        parcel.writeStrongBinder(byb1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        byb1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return byb1;
_L2:
        byb1 = null;
          goto _L5
_L4:
        byb1 = null;
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
