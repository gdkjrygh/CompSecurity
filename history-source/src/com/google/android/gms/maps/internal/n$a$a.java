// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps.internal:
//            n

private static class le
    implements n
{

    private IBinder le;

    public boolean a(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        l1 = l1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(l1);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
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
