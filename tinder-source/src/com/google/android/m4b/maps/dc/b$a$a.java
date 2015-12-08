// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.dc;

import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.dc:
//            b

static final class a
    implements b
{

    private IBinder a;

    public final boolean a()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.maps.service.ISidewinderService");
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
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final Map b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        java.util.HashMap hashmap;
        parcel.writeInterfaceToken("com.google.android.gms.maps.service.ISidewinderService");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        hashmap = parcel1.readHashMap(getClass().getClassLoader());
        parcel1.recycle();
        parcel.recycle();
        return hashmap;
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
