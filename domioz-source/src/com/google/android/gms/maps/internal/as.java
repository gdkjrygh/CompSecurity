// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.s;

// Referenced classes of package com.google.android.gms.maps.internal:
//            aq

final class as
    implements aq
{

    private IBinder a;

    as(IBinder ibinder)
    {
        a = ibinder;
    }

    public final Bitmap a(s s1, int i, int j)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s1 = obj;
        if (parcel1.readInt() != 0)
        {
            s1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return s1;
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
