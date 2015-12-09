// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class cby
    implements cbw
{

    private IBinder a;

    cby(IBinder ibinder)
    {
        a = ibinder;
    }

    public final byb a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s = byc.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void a(String s, byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        parcel.writeString(s);
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
