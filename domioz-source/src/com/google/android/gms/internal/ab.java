// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;

// Referenced classes of package com.google.android.gms.internal:
//            z, zzba, bp

final class ab
    implements z
{

    private IBinder a;

    ab(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(j j1, zzba zzba1, String s, bp bp1, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (zzba1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzba1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        j1 = obj;
        if (bp1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        j1 = bp1.asBinder();
        parcel.writeStrongBinder(j1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        j1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return j1;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
