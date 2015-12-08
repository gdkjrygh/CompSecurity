// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

public final class ccp
    implements ccn
{

    private IBinder a;

    public ccp(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ccc ccc1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (ccc1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ccc1 = ccc1.asBinder();
_L1:
        parcel.writeStrongBinder(ccc1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ccc1 = null;
          goto _L1
        ccc1;
        parcel1.recycle();
        parcel.recycle();
        throw ccc1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
