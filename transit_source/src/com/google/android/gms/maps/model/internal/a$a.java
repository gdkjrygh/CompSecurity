// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            a

public static abstract class a.dG extends Binder
    implements com.google.android.gms.maps.model.internal.a
{
    private static class a
        implements com.google.android.gms.maps.model.internal.a
    {

        private IBinder dG;

        public b S(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public b T(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            dG.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public b U(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeString(s);
            dG.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            s = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public b a(Bitmap bitmap)
            throws RemoteException
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
            dG.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            bitmap = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
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

        public b ad(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            b b1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeInt(i);
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            b1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return b1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public b c(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            b b1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel.writeFloat(f);
            dG.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            b1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return b1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public b cQ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            b b1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            dG.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            b1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return b1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public static com.google.android.gms.maps.model.internal.a ac(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.model.internal.a))
        {
            return (com.google.android.gms.maps.model.internal.a)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        b b1 = null;
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
            parcel = ad(parcel.readInt());
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
            b1 = S(parcel.readString());
            parcel1.writeNoException();
            parcel = obj;
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            b1 = T(parcel.readString());
            parcel1.writeNoException();
            parcel = obj1;
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            b1 = cQ();
            parcel1.writeNoException();
            parcel = obj2;
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            b1 = c(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj3;
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            b b2;
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b2 = a(parcel);
            parcel1.writeNoException();
            parcel = b1;
            if (b2 != null)
            {
                parcel = b2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            b1 = U(parcel.readString());
            parcel1.writeNoException();
            parcel = obj4;
            break;
        }
        if (b1 != null)
        {
            parcel = b1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
