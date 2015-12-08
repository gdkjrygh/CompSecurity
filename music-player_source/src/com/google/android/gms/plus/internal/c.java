// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.d;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a

final class c
    implements a
{

    private IBinder a;

    c(IBinder ibinder)
    {
        a = ibinder;
    }

    public final com.google.android.gms.a.c a(com.google.android.gms.a.c c1, int i, int j, String s, int k)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        c1 = c1.asBinder();
_L1:
        parcel.writeStrongBinder(c1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeInt(k);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        c1 = d.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return c1;
        c1 = null;
          goto _L1
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
    }

    public final com.google.android.gms.a.c a(com.google.android.gms.a.c c1, int i, int j, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        c1 = c1.asBinder();
_L1:
        parcel.writeStrongBinder(c1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        c1 = d.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return c1;
        c1 = null;
          goto _L1
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
