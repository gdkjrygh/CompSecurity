// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileCreator;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            i

private static class kq
    implements i
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public Tile getTile(int j, int k, int l)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeInt(l);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Tile tile = Tile.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return tile;
_L2:
        tile = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
