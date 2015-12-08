// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;

// Referenced classes of package com.google.android.gms.internal:
//            eg

private static final class a
    implements eg
{

    private IBinder a;

    public final IBinder a(c c1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        c1 = c1.asBinder();
_L1:
        parcel.writeStrongBinder(c1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        c1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return c1;
        c1 = null;
          goto _L1
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
