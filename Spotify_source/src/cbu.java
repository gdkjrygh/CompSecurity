// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

final class cbu
    implements cbs
{

    private IBinder a;

    cbu(IBinder ibinder)
    {
        a = ibinder;
    }

    public final byb a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byb byb;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        byb = byc.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return byb;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final Uri b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Uri uri = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uri;
_L2:
        uri = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final double c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        double d;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        d = parcel1.readDouble();
        parcel1.recycle();
        parcel.recycle();
        return d;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
