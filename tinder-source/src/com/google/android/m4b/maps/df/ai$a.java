// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ai

public static abstract class a.a extends Binder
    implements ai
{
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
            a(parcel.createBinderArrayList());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapsEngineFeatureClickListener");
            b(parcel.createBinderArrayList());
            parcel1.writeNoException();
            return true;
        }
    }
}
