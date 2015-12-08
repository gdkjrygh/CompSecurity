// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.a;
import com.google.android.gms.b.b;

// Referenced classes of package com.google.android.gms.common.internal:
//            bf

final class bh
    implements bf
{

    private IBinder a;

    bh(IBinder ibinder)
    {
        a = ibinder;
    }

    public final a a(a a1, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        a1 = b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
