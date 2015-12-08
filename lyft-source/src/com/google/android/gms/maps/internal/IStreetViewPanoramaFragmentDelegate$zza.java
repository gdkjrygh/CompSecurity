// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaFragmentDelegate, IStreetViewPanoramaDelegate

public abstract class zza extends Binder
    implements IStreetViewPanoramaFragmentDelegate
{

    public static IStreetViewPanoramaFragmentDelegate a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        class zza
            implements IStreetViewPanoramaFragmentDelegate
        {

            private IBinder a;

            public zzd a(zzd zzd1, zzd zzd2, Bundle bundle)
            {
                Object obj;
                Parcel parcel;
                Parcel parcel1;
                obj = null;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (zzd1 == null) goto _L2; else goto _L1
_L1:
                zzd1 = zzd1.asBinder();
_L5:
                parcel.writeStrongBinder(zzd1);
                zzd1 = obj;
                if (zzd2 == null)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
                zzd1 = zzd2.asBinder();
                parcel.writeStrongBinder(zzd1);
                if (bundle == null) goto _L4; else goto _L3
_L3:
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L6:
                a.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                zzd1 = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return zzd1;
_L2:
                zzd1 = null;
                  goto _L5
_L4:
                parcel.writeInt(0);
                  goto _L6
                zzd1;
                parcel1.recycle();
                parcel.recycle();
                throw zzd1;
                  goto _L5
            }

            public IStreetViewPanoramaDelegate a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                IStreetViewPanoramaDelegate istreetviewpanoramadelegate;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a.transact(1, parcel, parcel1, 0);
                parcel1.readException();
                istreetviewpanoramadelegate = IStreetViewPanoramaDelegate.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return istreetviewpanoramadelegate;
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
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L1:
                a.transact(3, parcel, parcel1, 0);
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

            public void a(zzd zzd1, StreetViewPanoramaOptions streetviewpanoramaoptions, Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (zzd1 == null) goto _L2; else goto _L1
_L1:
                zzd1 = zzd1.asBinder();
_L5:
                parcel.writeStrongBinder(zzd1);
                if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
                parcel.writeInt(1);
                streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_127;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L7:
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
_L2:
                zzd1 = null;
                  goto _L5
_L4:
                parcel.writeInt(0);
                  goto _L6
                zzd1;
                parcel1.recycle();
                parcel.recycle();
                throw zzd1;
                parcel.writeInt(0);
                  goto _L7
            }

            public void a(zzv zzv1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (zzv1 == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                zzv1 = zzv1.asBinder();
_L1:
                parcel.writeStrongBinder(zzv1);
                a.transact(12, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                zzv1 = null;
                  goto _L1
                zzv1;
                parcel1.recycle();
                parcel.recycle();
                throw zzv1;
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
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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

            public void b(Bundle bundle)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_69;
                }
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 0);
_L1:
                a.transact(10, parcel, parcel1, 0);
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
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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

            public void d()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a.transact(7, parcel, parcel1, 0);
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
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a.transact(8, parcel, parcel1, 0);
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

            public void f()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a.transact(9, parcel, parcel1, 0);
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

            public boolean g()
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag;
                flag = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                a.transact(11, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                if (i != 0)
                {
                    flag = true;
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

            zza(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof IStreetViewPanoramaFragmentDelegate))
        {
            return (IStreetViewPanoramaFragmentDelegate)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        StreetViewPanoramaOptions streetviewpanoramaoptions = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
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
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            zzd zzd1 = com.google.android.gms.dynamic.er(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                streetviewpanoramaoptions = StreetViewPanoramaOptions.CREATOR.a(parcel);
            } else
            {
                streetviewpanoramaoptions = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.CREATOR(parcel);
            } else
            {
                parcel = null;
            }
            a(zzd1, streetviewpanoramaoptions, parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.ns(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            zzd zzd2 = com.google.android.gms.dynamic.e.zza.a(parcel.readStrongBinder());
            zzd zzd3 = com.google.android.gms.dynamic.e.zza.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            zzd2 = a(zzd2, zzd3, parcel);
            parcel1.writeNoException();
            parcel = streetviewpanoramaoptions;
            if (zzd2 != null)
            {
                parcel = zzd2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            f();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.f(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            boolean flag = g();
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

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
