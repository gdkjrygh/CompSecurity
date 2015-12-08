// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zza;
import com.google.android.gms.maps.model.zze;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ICameraUpdateFactoryDelegate

public abstract class zza extends Binder
    implements ICameraUpdateFactoryDelegate
{

    public static ICameraUpdateFactoryDelegate a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        class zza
            implements ICameraUpdateFactoryDelegate
        {

            private IBinder a;

            public zzd a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a.transact(1, parcel, parcel1, 0);
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

            public zzd a(float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                a.transact(4, parcel, parcel1, 0);
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

            public zzd a(float f, float f1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                parcel.writeFloat(f1);
                a.transact(3, parcel, parcel1, 0);
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

            public zzd a(float f, int i, int j)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                parcel.writeInt(i);
                parcel.writeInt(j);
                a.transact(6, parcel, parcel1, 0);
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

            public zzd a(CameraPosition cameraposition)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (cameraposition == null)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                parcel.writeInt(1);
                cameraposition.writeToParcel(parcel, 0);
_L1:
                a.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                cameraposition = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return cameraposition;
                parcel.writeInt(0);
                  goto _L1
                cameraposition;
                parcel1.recycle();
                parcel.recycle();
                throw cameraposition;
            }

            public zzd a(LatLng latlng)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlng == null)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                parcel.writeInt(1);
                latlng.writeToParcel(parcel, 0);
_L1:
                a.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                latlng = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlng;
                parcel.writeInt(0);
                  goto _L1
                latlng;
                parcel1.recycle();
                parcel.recycle();
                throw latlng;
            }

            public zzd a(LatLng latlng, float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlng == null)
                {
                    break MISSING_BLOCK_LABEL_76;
                }
                parcel.writeInt(1);
                latlng.writeToParcel(parcel, 0);
_L1:
                parcel.writeFloat(f);
                a.transact(9, parcel, parcel1, 0);
                parcel1.readException();
                latlng = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlng;
                parcel.writeInt(0);
                  goto _L1
                latlng;
                parcel1.recycle();
                parcel.recycle();
                throw latlng;
            }

            public zzd a(LatLngBounds latlngbounds, int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlngbounds == null)
                {
                    break MISSING_BLOCK_LABEL_76;
                }
                parcel.writeInt(1);
                latlngbounds.writeToParcel(parcel, 0);
_L1:
                parcel.writeInt(i);
                a.transact(10, parcel, parcel1, 0);
                parcel1.readException();
                latlngbounds = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlngbounds;
                parcel.writeInt(0);
                  goto _L1
                latlngbounds;
                parcel1.recycle();
                parcel.recycle();
                throw latlngbounds;
            }

            public zzd a(LatLngBounds latlngbounds, int i, int j, int k)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlngbounds == null)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                parcel.writeInt(1);
                latlngbounds.writeToParcel(parcel, 0);
_L1:
                parcel.writeInt(i);
                parcel.writeInt(j);
                parcel.writeInt(k);
                a.transact(11, parcel, parcel1, 0);
                parcel1.readException();
                latlngbounds = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlngbounds;
                parcel.writeInt(0);
                  goto _L1
                latlngbounds;
                parcel1.recycle();
                parcel.recycle();
                throw latlngbounds;
            }

            public IBinder asBinder()
            {
                return a;
            }

            public zzd b()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a.transact(2, parcel, parcel1, 0);
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

            public zzd b(float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                a.transact(5, parcel, parcel1, 0);
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

        if (iinterface != null && (iinterface instanceof ICameraUpdateFactoryDelegate))
        {
            return (ICameraUpdateFactoryDelegate)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj = null;
        zzd zzd1 = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b();
            parcel1.writeNoException();
            parcel = obj5;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj6;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj7;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = b(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj8;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obj = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj9;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = CameraPosition.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            zzd1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = LatLng.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(parcel);
            parcel1.writeNoException();
            parcel = zzd1;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLng.CREATOR.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLng) (obj)), parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj1;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLngBounds) (obj)), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = LatLngBounds.CREATOR.a(parcel);
        } else
        {
            obj = null;
        }
        obj = a(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel = obj3;
        if (obj != null)
        {
            parcel = ((zzd) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
