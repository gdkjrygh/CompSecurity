// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzg

public abstract class zza extends Binder
    implements zzg
{

    public static zzg a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        class zza
            implements zzg
        {

            private IBinder a;

            public int a()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                a.transact(1, parcel, parcel1, 0);
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

            public boolean a(zzg zzg1)
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag;
                flag = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                if (zzg1 == null)
                {
                    break MISSING_BLOCK_LABEL_76;
                }
                zzg1 = zzg1.asBinder();
_L1:
                int i;
                parcel.writeStrongBinder(zzg1);
                a.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                i = parcel1.readInt();
                if (i != 0)
                {
                    flag = true;
                }
                parcel1.recycle();
                parcel.recycle();
                return flag;
                zzg1 = null;
                  goto _L1
                zzg1;
                parcel1.recycle();
                parcel.recycle();
                throw zzg1;
            }

            public IBinder asBinder()
            {
                return a;
            }

            public int b()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                a.transact(2, parcel, parcel1, 0);
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

            public List c()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                java.util.ArrayList arraylist;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                a.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                arraylist = parcel1.createBinderArrayList();
                parcel1.recycle();
                parcel.recycle();
                return arraylist;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public boolean d()
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag;
                flag = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
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
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public int e()
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                int i;
                parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                a.transact(6, parcel, parcel1, 0);
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

        if (iinterface != null && (iinterface instanceof zzg))
        {
            return (zzg)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            i = a();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            i = b();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            parcel = c();
            parcel1.writeNoException();
            parcel1.writeBinderList(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            boolean flag2 = d();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            boolean flag3 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            i = e();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;
        }
    }
}
