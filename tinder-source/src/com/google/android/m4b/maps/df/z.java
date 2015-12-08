// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface z
    extends IInterface
{
    public static abstract class a extends Binder
        implements z
    {

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        {
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                parcel = i();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                a(parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    static final class a.a
        implements z
    {

        private IBinder a;

        public final void a(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
            parcel.writeString(s);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final String i()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
            a.transact(1, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(String s);

    public abstract String i();
}
