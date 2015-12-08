// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzd

public abstract class zza extends Binder
    implements com.google.android.gms.maps.model.internal.zzd
{

    public static com.google.android.gms.maps.model.internal.zzd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        class zza
            implements com.google.android.gms.maps.model.internal.zzd
        {

            private IBinder a;

            public zzd a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
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

            public zzd a(float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
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

            public zzd a(int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                zzd zzd1;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel.writeInt(i);
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

            public zzd a(Bitmap bitmap)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                if (bitmap == null)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                parcel.writeInt(1);
                bitmap.writeToParcel(parcel, 0);
_L1:
                a.transact(6, parcel, parcel1, 0);
                parcel1.readException();
                bitmap = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return bitmap;
                parcel.writeInt(0);
                  goto _L1
                bitmap;
                parcel1.recycle();
                parcel.recycle();
                throw bitmap;
            }

            public zzd a(String s)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel.writeString(s);
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                s = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return s;
                s;
                parcel1.recycle();
                parcel.recycle();
                throw s;
            }

            public IBinder asBinder()
            {
                return a;
            }

            public zzd b(String s)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel.writeString(s);
                a.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                s = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return s;
                s;
                parcel1.recycle();
                parcel.recycle();
                throw s;
            }

            public zzd c(String s)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel.writeString(s);
                a.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                s = com.google.android.gms.dynamic.zzd.zza.a(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return s;
                s;
                parcel1.recycle();
                parcel.recycle();
                throw s;
            }

            zza(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.model.internal.zzd))
        {
            return (com.google.android.gms.maps.model.internal.zzd)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        zzd zzd1 = null;
        Object obj4 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel = a(parcel.readInt());
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
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd1 = a(parcel.readString());
            parcel1.writeNoException();
            parcel = obj;
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd1 = b(parcel.readString());
            parcel1.writeNoException();
            parcel = obj1;
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd1 = a();
            parcel1.writeNoException();
            parcel = obj2;
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd1 = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj3;
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd zzd2;
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zzd2 = a(parcel);
            parcel1.writeNoException();
            parcel = zzd1;
            if (zzd2 != null)
            {
                parcel = zzd2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zzd1 = c(parcel.readString());
            parcel1.writeNoException();
            parcel = obj4;
            break;
        }
        if (zzd1 != null)
        {
            parcel = zzd1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
