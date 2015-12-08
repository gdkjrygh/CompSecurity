// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.a;

// Referenced classes of package com.google.android.gms.internal:
//            ed

final class ef
    implements ed
{

    private IBinder a;

    ef(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(a a1, a a2, a a3, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1 = a1.asBinder();
_L5:
        parcel.writeStrongBinder(a1);
        if (a2 == null) goto _L4; else goto _L3
_L3:
        a1 = a2.asBinder();
_L6:
        parcel.writeStrongBinder(a1);
        a1 = obj;
        if (a3 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        a1 = a3.asBinder();
        parcel.writeStrongBinder(a1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        a1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return a1;
_L2:
        a1 = null;
          goto _L5
_L4:
        a1 = null;
          goto _L6
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
