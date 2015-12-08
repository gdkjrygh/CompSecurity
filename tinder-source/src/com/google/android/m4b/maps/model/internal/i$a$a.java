// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.g;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            i, j

static final class a
    implements i
{

    private IBinder a;

    public final j a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        j j;
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        j = a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean a(i j)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        j = j.asBinder();
_L1:
        int k;
        parcel.writeStrongBinder(j);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        j = null;
          goto _L1
        j;
        parcel1.recycle();
        parcel.recycle();
        throw j;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final String b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final LatLng c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = LatLng.CREATOR;
        obj = g.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((LatLng) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final String d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final String e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int j;
        parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        j = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return j;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
