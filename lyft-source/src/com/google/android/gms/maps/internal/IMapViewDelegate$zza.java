// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IMapViewDelegate, IGoogleMapDelegate

public abstract class zza extends Binder
    implements IMapViewDelegate
{

    public static IMapViewDelegate a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        class zza
            implements IMapViewDelegate
        {

            private IBinder a;

            public IGoogleMapDelegate a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                IGoogleMapDelegate igooglemapdelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(1, parcel, parcel1, 0);
                parcel1.readException();
                igooglemapdelegate = IGoogleMapDelegate.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return igooglemapdelegate;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public void a(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L1:
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                parcel.writeInt(0);
                  goto _L1
                bundle;
                parcel1.recycle();
                parcel.recycle();
                throw bundle;
            }

            public void a(zzm zzm1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (zzm1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                zzm1 = zzm1.asBinder();
_L1:
                parcel.writeStrongBinder(zzm1);
                a.transact(9, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                zzm1 = null;
                  goto _L1
                zzm1;
                parcel1.recycle();
                parcel.recycle();
                throw zzm1;
            }

            public IBinder asBinder()
            {
                return a;
            }

            public void b()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(3, parcel, parcel1, 0);
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

            public void b(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_69;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L1:
                a.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() != 0)
                {
                    bundle.readFromParcel(parcel1);
                }
                parcel1.recycle();
                parcel.recycle();
                return;
                parcel.writeInt(0);
                  goto _L1
                bundle;
                parcel1.recycle();
                parcel.recycle();
                throw bundle;
            }

            public void c()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(4, parcel, parcel1, 0);
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

            public void d()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(5, parcel, parcel1, 0);
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

            public void e()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(6, parcel, parcel1, 0);
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

            public zzd f()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                a.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                zzd1 = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return zzd1;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            zza(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IMapViewDelegate))
        {
            return (IMapViewDelegate)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        IGoogleMapDelegate igooglemapdelegate = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            igooglemapdelegate = a();
            parcel1.writeNoException();
            parcel = obj;
            if (igooglemapdelegate != null)
            {
                parcel = igooglemapdelegate.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            Bundle bundle = obj1;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            }
            a(bundle);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            Bundle bundle1 = obj2;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.eateFromParcel(parcel);
            }
            b(bundle1);
            parcel1.writeNoException();
            if (bundle1 != null)
            {
                parcel1.writeInt(1);
                bundle1.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            zzd zzd1 = f();
            parcel1.writeNoException();
            parcel = igooglemapdelegate;
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
