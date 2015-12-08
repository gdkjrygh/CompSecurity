// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.internal.k;

public interface u
    extends IInterface
{
    public static abstract class a extends Binder
        implements u
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            b b2 = null;
            b b1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                b2 = a(com.google.android.m4b.maps.model.internal.k.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = b1;
                if (b2 != null)
                {
                    parcel = b2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                b1 = b(com.google.android.m4b.maps.model.internal.k.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = b2;
                break;
            }
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IInfoWindowAdapter");
        }
    }

    static final class a.a
        implements u
    {

        private IBinder a;

        public final b a(k k1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            k1 = com.google.android.m4b.maps.da.b.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return k1;
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

        public final b b(k k1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            k1 = com.google.android.m4b.maps.da.b.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return k1;
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


    public abstract b a(k k);

    public abstract b b(k k);
}
