// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps.internal:
//            e

private static class le
    implements e
{

    private IBinder le;

    public Bitmap a(l l1, int i, int j)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        l1 = obj;
        if (parcel1.readInt() != 0)
        {
            l1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return l1;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    l(IBinder ibinder)
    {
        le = ibinder;
    }
}
