// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.i;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.model.a.b;

// Referenced classes of package com.google.android.gms.maps.a:
//            a, e, i, d, 
//            h

public interface o
    extends IInterface
{
    public static abstract class a extends Binder
        implements o
    {

        public static o a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (iinterface != null && (iinterface instanceof o))
            {
                return (o)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
        {
            Object obj = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj1 = null;
            Object obj5 = null;
            Object obj2 = null;
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = b(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
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
                obj1 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    i i1 = GoogleMapOptions.CREATOR;
                    parcel = i.a(parcel);
                } else
                {
                    parcel = null;
                }
                obj1 = a(((c) (obj1)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((e) (obj1)).asBinder();
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
                    parcel = ((com.google.android.gms.maps.a.a) (obj)).asBinder();
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
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    j j1 = StreetViewPanoramaOptions.CREATOR;
                    parcel = j.a(parcel);
                } else
                {
                    parcel = null;
                }
                obj = a(((c) (obj)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj1));
                if (obj != null)
                {
                    parcel = ((com.google.android.gms.maps.a.i) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = c(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj5;
                break;
            }
            if (obj != null)
            {
                parcel = ((h) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static final class a.a
        implements o
    {

        private IBinder a;

        public final com.google.android.gms.maps.a.a a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.a.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.maps.a.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final e a(c c1, GoogleMapOptions googlemapoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            googlemapoptions.writeToParcel(parcel, 0);
_L6:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            c1 = e.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final com.google.android.gms.maps.a.i a(c c1, StreetViewPanoramaOptions streetviewpanoramaoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            c1 = i.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void a(c c1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            parcel.writeInt(i);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final d b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            c1 = d.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final b b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            b b1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            b1 = com.google.android.gms.maps.model.a.b.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return b1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final h c(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            c1 = h.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract com.google.android.gms.maps.a.a a()
        throws RemoteException;

    public abstract e a(c c1, GoogleMapOptions googlemapoptions)
        throws RemoteException;

    public abstract com.google.android.gms.maps.a.i a(c c1, StreetViewPanoramaOptions streetviewpanoramaoptions)
        throws RemoteException;

    public abstract void a(c c1)
        throws RemoteException;

    public abstract void a(c c1, int i)
        throws RemoteException;

    public abstract d b(c c1)
        throws RemoteException;

    public abstract b b()
        throws RemoteException;

    public abstract h c(c c1)
        throws RemoteException;
}
