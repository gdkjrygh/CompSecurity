// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzh

public abstract class zza extends Binder
    implements zzh
{

    public static zzh a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        class zza
            implements zzh
        {

            private IBinder a;

            public String a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                String s;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
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

            public boolean a(zzh zzh1)
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag;
                flag = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                if (zzh1 == null)
                {
                    break MISSING_BLOCK_LABEL_76;
                }
                zzh1 = zzh1.asBinder();
_L1:
                int i;
                parcel.writeStrongBinder(zzh1);
                a.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                if (i != 0)
                {
                    flag = true;
                }
                parcel1.recycle();
                parcel.recycle();
                return flag;
                zzh1 = null;
                  goto _L1
                zzh1;
                parcel1.recycle();
                parcel.recycle();
                throw zzh1;
            }

            public IBinder asBinder()
            {
                return a;
            }

            public String b()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                String s;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                a.transact(2, parcel, parcel1, 0);
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

            public void c()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
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

            public int d()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                a.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                parcel1.recycle();
                parcel.recycle();
                return i;
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

        if (iinterface != null && (iinterface instanceof zzh))
        {
            return (zzh)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            boolean flag = a(a(parcel.readStrongBinder()));
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

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            i = d();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;
        }
    }
}
