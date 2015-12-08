// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ai

static final class a
    implements ai
{

    private IBinder a;

    public final void a(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
        parcel.writeBinderList(list);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
        parcel.writeBinderList(list);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
