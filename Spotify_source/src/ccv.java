// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

public final class ccv
    implements cct
{

    private IBinder a;

    public ccv(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(cck cck1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (cck1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        cck1 = cck1.asBinder();
_L1:
        parcel.writeStrongBinder(cck1);
        parcel.writeString(s);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        cck1 = null;
          goto _L1
        cck1;
        parcel1.recycle();
        parcel.recycle();
        throw cck1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
