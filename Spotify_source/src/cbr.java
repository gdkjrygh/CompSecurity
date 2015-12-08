// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

public final class cbr
    implements cbp
{

    private IBinder a;

    public cbr(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(cbm cbm1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (cbm1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        cbm1 = cbm1.asBinder();
_L1:
        parcel.writeStrongBinder(cbm1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cbm1 = null;
          goto _L1
        cbm1;
        parcel1.recycle();
        parcel.recycle();
        throw cbm1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
