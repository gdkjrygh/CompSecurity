// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.s;

// Referenced classes of package com.google.android.gms.maps.internal:
//            br

final class bt
    implements br
{

    private IBinder a;

    bt(IBinder ibinder)
    {
        a = ibinder;
    }

    public final boolean a(s s1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s1 = s1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(s1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
