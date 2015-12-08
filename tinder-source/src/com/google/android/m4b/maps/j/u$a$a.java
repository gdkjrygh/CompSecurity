// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.j:
//            u, y

public static final class a
    implements u
{

    private IBinder a;

    public final void a(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        y1.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        y1;
        parcel1.recycle();
        parcel.recycle();
        throw y1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public (IBinder ibinder)
    {
        a = ibinder;
    }
}
