// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.df:
//            i

public interface f
    extends IInterface
{
    public static abstract class a extends Binder
        implements f
    {

        public static f a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if (iinterface != null && (iinterface instanceof f))
            {
                return (f)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        {
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
                parcel = parcel.readStrongBinder();
                break;
            }
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaDelegate");
                if (iinterface != null && (iinterface instanceof i))
                {
                    parcel = (i)iinterface;
                } else
                {
                    parcel = new i.a.a(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    static final class a.a
        implements f
    {

        private IBinder a;

        public final void a(i j)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            j = j.asBinder();
_L1:
            parcel.writeStrongBinder(j);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            j = null;
              goto _L1
            j;
            parcel1.recycle();
            parcel.recycle();
            throw j;
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


    public abstract void a(i i);
}
