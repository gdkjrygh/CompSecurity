// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.h.q;

// Referenced classes of package com.google.android.m4b.maps.cv:
//            c

static final class a
    implements c
{

    private IBinder a;

    public final void a(q q1)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        q1.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        q1;
        parcel.recycle();
        throw q1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
