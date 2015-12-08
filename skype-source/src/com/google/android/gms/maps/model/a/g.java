// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public interface g
    extends IInterface
{
    public static abstract class a extends Binder
        implements g
    {

        public static g a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (iinterface != null && (iinterface instanceof g))
            {
                return (g)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
            throws RemoteException
        {
            boolean flag = false;
            boolean flag8 = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            switch (l)
            {
            default:
                return super.onTransact(l, parcel, parcel1, i1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                parcel = c();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readArrayList(getClass().getClassLoader()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                parcel = d();
                parcel1.writeNoException();
                parcel1.writeList(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float f1 = e();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                l = f();
                parcel1.writeNoException();
                parcel1.writeInt(l);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                l = g();
                parcel1.writeNoException();
                parcel1.writeInt(l);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float f2 = h();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(flag3);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean flag4 = i();
                parcel1.writeNoException();
                l = ((flag) ? 1 : 0);
                if (flag4)
                {
                    l = 1;
                }
                parcel1.writeInt(l);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean flag5 = flag8;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                b(flag5);
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean flag6 = j();
                parcel1.writeNoException();
                l = ((flag1) ? 1 : 0);
                if (flag6)
                {
                    l = 1;
                }
                parcel1.writeInt(l);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean flag7 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                l = ((flag2) ? 1 : 0);
                if (flag7)
                {
                    l = 1;
                }
                parcel1.writeInt(l);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                l = k();
                parcel1.writeNoException();
                parcel1.writeInt(l);
                return true;
            }
        }
    }

    private static final class a.a
        implements g
    {

        private IBinder a;

        public final void a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(1, parcel, parcel1, 0);
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

        public final void a(float f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeFloat(f1);
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

        public final void a(int l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeInt(l);
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

        public final void a(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeTypedList(list);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public final void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int l;
            l = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (flag)
            {
                l = 1;
            }
            parcel.writeInt(l);
            a.transact(15, parcel, parcel1, 0);
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

        public final boolean a(g g1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            g1 = g1.asBinder();
_L1:
            int l;
            parcel.writeStrongBinder(g1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            if (l != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            g1 = null;
              goto _L1
            g1;
            parcel1.recycle();
            parcel.recycle();
            throw g1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final String b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
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

        public final void b(float f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeFloat(f1);
            a.transact(13, parcel, parcel1, 0);
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

        public final void b(int l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeInt(l);
            a.transact(11, parcel, parcel1, 0);
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

        public final void b(List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel.writeList(list);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public final void b(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int l;
            l = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (flag)
            {
                l = 1;
            }
            parcel.writeInt(l);
            a.transact(17, parcel, parcel1, 0);
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

        public final List c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(LatLng.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final List d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.readArrayList(getClass().getClassLoader());
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final int f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int l;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return l;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final int g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int l;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return l;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            f1 = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int l;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            if (l != 0)
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

        public final boolean j()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int l;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            if (l != 0)
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

        public final int k()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int l;
            parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            l = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return l;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(float f1)
        throws RemoteException;

    public abstract void a(int l)
        throws RemoteException;

    public abstract void a(List list)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a(g g1)
        throws RemoteException;

    public abstract String b()
        throws RemoteException;

    public abstract void b(float f1)
        throws RemoteException;

    public abstract void b(int l)
        throws RemoteException;

    public abstract void b(List list)
        throws RemoteException;

    public abstract void b(boolean flag)
        throws RemoteException;

    public abstract List c()
        throws RemoteException;

    public abstract List d()
        throws RemoteException;

    public abstract float e()
        throws RemoteException;

    public abstract int f()
        throws RemoteException;

    public abstract int g()
        throws RemoteException;

    public abstract float h()
        throws RemoteException;

    public abstract boolean i()
        throws RemoteException;

    public abstract boolean j()
        throws RemoteException;

    public abstract int k()
        throws RemoteException;
}
