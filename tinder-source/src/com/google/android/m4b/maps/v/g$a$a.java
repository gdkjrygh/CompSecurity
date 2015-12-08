// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.h.q;

// Referenced classes of package com.google.android.m4b.maps.v:
//            g, a

static final class a
    implements g
{

    private IBinder a;

    public final void a(a a1, com.google.android.m4b.maps.v.a a2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        a1.writeToParcel(parcel, 0);
_L3:
        if (a2 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        parcel.writeInt(1);
        a2.writeToParcel(parcel, 0);
_L4:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(q q1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        q1.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        q1;
        parcel1.recycle();
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
