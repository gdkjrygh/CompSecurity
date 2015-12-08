// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.g;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ab

public static abstract class a.a extends Binder
    implements ab
{
    static final class a
        implements ab
    {

        private IBinder a;

        public final void a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(g g1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            g1 = g1.asBinder();
_L1:
            parcel.writeStrongBinder(g1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            g1 = null;
              goto _L1
            g1;
            parcel1.recycle();
            parcel.recycle();
            throw g1;
        }

        public final IBinder asBinder()
        {
            return a;
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
            parcel1.writeString("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            a(com.google.android.m4b.maps.model.internal.(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
