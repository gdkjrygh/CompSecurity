// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.dc;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.dc:
//            b

public static abstract class a.a extends Binder
    implements b
{
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static b a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.service.ISidewinderService");
        if (iinterface != null && (iinterface instanceof b))
        {
            return (b)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.service.ISidewinderService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.service.ISidewinderService");
            boolean flag = a();
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.service.ISidewinderService");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeMap(parcel);
            return true;
        }
    }
}
