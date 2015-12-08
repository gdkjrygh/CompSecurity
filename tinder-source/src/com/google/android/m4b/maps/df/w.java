// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ad

public interface w
    extends IInterface
{
    public static abstract class a extends Binder
        implements w
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
                parcel1.writeString("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                    if (iinterface != null && (iinterface instanceof ad))
                    {
                        parcel = (ad)iinterface;
                    } else
                    {
                        parcel = new ad.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                e();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.ILocationSourceDelegate");
        }
    }

    static final class a.a
        implements w
    {

        private IBinder a;

        public final void a(ad ad1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void e()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
            a.transact(2, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(ad ad);

    public abstract void e();
}
