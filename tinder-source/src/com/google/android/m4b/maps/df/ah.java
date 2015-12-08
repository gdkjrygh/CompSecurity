// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.df:
//            t

public interface ah
    extends IInterface
{
    public static abstract class a extends Binder
        implements ah
    {

        public static ah a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
            if (iinterface != null && (iinterface instanceof ah))
            {
                return (ah)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

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
                parcel1.writeString("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
                parcel = parcel.readStrongBinder();
                break;
            }
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IGoogleMapDelegate");
                if (iinterface != null && (iinterface instanceof t))
                {
                    parcel = (t)iinterface;
                } else
                {
                    parcel = new t.a.a(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapReadyCallback");
        }
    }

    static final class a.a
        implements ah
    {

        private IBinder a;

        public final void a(t t1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
            if (t1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            t1 = t1.asBinder();
_L1:
            parcel.writeStrongBinder(t1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            t1 = null;
              goto _L1
            t1;
            parcel1.recycle();
            parcel.recycle();
            throw t1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(t t);
}
