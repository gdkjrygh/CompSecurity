// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.m;
import com.google.android.gms.maps.model.internal.h;
import com.google.android.gms.maps.o;

// Referenced classes of package com.google.android.gms.maps.internal:
//            p, d, e, a, 
//            i, h

public static abstract class a.a extends Binder
    implements p
{
    private static class a
        implements p
    {

        private IBinder a;

        public com.google.android.gms.maps.internal.a a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.internal.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.maps.internal.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public com.google.android.gms.maps.internal.e a(e e1, GoogleMapOptions googlemapoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null) goto _L2; else goto _L1
_L1:
            e1 = e1.asBinder();
_L5:
            parcel.writeStrongBinder(e1);
            if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            googlemapoptions.writeToParcel(parcel, 0);
_L6:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            e1 = e.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return e1;
_L2:
            e1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
              goto _L5
        }

        public i a(e e1, StreetViewPanoramaOptions streetviewpanoramaoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null) goto _L2; else goto _L1
_L1:
            e1 = e1.asBinder();
_L5:
            parcel.writeStrongBinder(e1);
            if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            e1 = i.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return e1;
_L2:
            e1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
              goto _L5
        }

        public void a(e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        public void a(e e1, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            parcel.writeInt(j);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public d b(e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            e1 = d.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return e1;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        public h b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            h h1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            h1 = com.google.android.gms.maps.model.internal.h.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return h1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public com.google.android.gms.maps.internal.h c(e e1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            e1 = e1.asBinder();
_L1:
            parcel.writeStrongBinder(e1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            e1 = h.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return e1;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static p a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (iinterface != null && (iinterface instanceof p))
        {
            return (p)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
        throws RemoteException
    {
        Object obj = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj1 = null;
        Object obj5 = null;
        Object obj2 = null;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj1 = com.google.android.gms.dynamic.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = GoogleMapOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(((e) (obj1)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((com.google.android.gms.maps.internal.e) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = a();
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((com.google.android.gms.maps.internal.a) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((h) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = com.google.android.gms.dynamic.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = StreetViewPanoramaOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((e) (obj)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((i) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = c(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj5;
            break;
        }
        if (obj != null)
        {
            parcel = ((com.google.android.gms.maps.internal.h) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
