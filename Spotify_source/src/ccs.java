// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

public final class ccs
    implements ccq
{

    private IBinder a;

    public ccs(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ccg ccg1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (ccg1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ccg1 = ccg1.asBinder();
_L1:
        parcel.writeStrongBinder(ccg1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ccg1 = null;
          goto _L1
        ccg1;
        parcel1.recycle();
        parcel.recycle();
        throw ccg1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
