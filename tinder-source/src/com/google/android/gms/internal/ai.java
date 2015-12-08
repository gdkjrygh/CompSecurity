// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

public interface ai
    extends IInterface
{
    public static abstract class a extends Binder
        implements ai
    {

        public static ai a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (iinterface != null && (iinterface instanceof ai))
            {
                return (ai)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                parcel = a();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                parcel = b();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                double d = c();
                parcel1.writeNoException();
                parcel1.writeDouble(d);
                return true;
            }
        }
    }

    private static final class a.a
        implements ai
    {

        private IBinder a;

        public final com.google.android.gms.dynamic.a a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.dynamic.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.dynamic.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
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

        public final Uri b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Uri uri = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return uri;
_L2:
            uri = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final double c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            double d;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            d = parcel1.readDouble();
            parcel1.recycle();
            parcel.recycle();
            return d;
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


    public abstract com.google.android.gms.dynamic.a a()
        throws RemoteException;

    public abstract Uri b()
        throws RemoteException;

    public abstract double c()
        throws RemoteException;
}
