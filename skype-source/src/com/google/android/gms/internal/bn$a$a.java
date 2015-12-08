// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;

// Referenced classes of package com.google.android.gms.internal:
//            bn

private static final class a
    implements bn
{

    private IBinder a;

    public final IBinder a(c c1, c c2, c c3, int i)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1 = c1.asBinder();
_L5:
        parcel.writeStrongBinder(c1);
        if (c2 == null) goto _L4; else goto _L3
_L3:
        c1 = c2.asBinder();
_L6:
        parcel.writeStrongBinder(c1);
        c1 = obj;
        if (c3 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        c1 = c3.asBinder();
        parcel.writeStrongBinder(c1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        c1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return c1;
_L2:
        c1 = null;
          goto _L5
_L4:
        c1 = null;
          goto _L6
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
          goto _L5
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
