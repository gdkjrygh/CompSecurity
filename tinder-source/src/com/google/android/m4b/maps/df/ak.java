// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.k;

public interface ak
    extends IInterface
{
    public static abstract class a extends Binder
        implements ak
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                a(com.google.android.m4b.maps.model.internal.k.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                c(com.google.android.m4b.maps.model.internal.k.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                b(com.google.android.m4b.maps.model.internal.k.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMarkerDragListener");
        }
    }

    static final class a.a
        implements ak
    {

        private IBinder a;

        public final void a(k k1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(k k1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public final void c(k k1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(k k);

    public abstract void b(k k);

    public abstract void c(k k);
}
