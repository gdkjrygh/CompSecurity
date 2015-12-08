// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            br, bq

private static class le
    implements br
{

    private IBinder le;

    public void a(bq bq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (bq1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        bq1 = bq1.asBinder();
_L1:
        parcel.writeStrongBinder(bq1);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bq1 = null;
          goto _L1
        bq1;
        parcel1.recycle();
        parcel.recycle();
        throw bq1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
