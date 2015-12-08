// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.internal:
//            ad, x, aw

private static class dG
    implements ad
{

    private IBinder dG;

    public IBinder a(b b1, x x1, String s, aw aw1, int i)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b1 = b1.asBinder();
_L5:
        parcel.writeStrongBinder(b1);
        if (x1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        x1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        b1 = obj;
        if (aw1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        b1 = aw1.asBinder();
        parcel.writeStrongBinder(b1);
        parcel.writeInt(i);
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        b1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return b1;
_L2:
        b1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
          goto _L5
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
