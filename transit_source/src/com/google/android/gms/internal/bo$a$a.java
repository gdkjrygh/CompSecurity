// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.internal:
//            bo

private static class dG
    implements bo
{

    private IBinder dG;

    public IBinder a(b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        b1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return b1;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
