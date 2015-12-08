// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class lcu
    implements lcs
{

    private IBinder a;

    lcu(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(lcp lcp1, Uri uri, Bundle bundle, boolean flag)
    {
        IBinder ibinder;
        Parcel parcel;
        int i;
        ibinder = null;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
        if (lcp1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        ibinder = lcp1.asBinder();
        parcel.writeStrongBinder(ibinder);
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L5:
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_128;
_L6:
        parcel.writeInt(i);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        lcp1;
        parcel.recycle();
        throw lcp1;
_L4:
        parcel.writeInt(0);
        while (!flag) 
        {
            i = 0;
            break;
        }
          goto _L6
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
