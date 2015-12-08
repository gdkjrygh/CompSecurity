// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import java.util.List;

public interface l
    extends IInterface
{
    public static abstract class a extends Binder
        implements l
    {

        public static l a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            if (iinterface != null && (iinterface instanceof l))
            {
                return (l)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int i1)
        {
            boolean flag = false;
            boolean flag8 = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, i1);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                j();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                parcel = k();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                b(parcel.readArrayList(getClass().getClassLoader()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                parcel = l();
                parcel1.writeNoException();
                parcel1.writeList(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                float f = o();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                i = m();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                b(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                i = n();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                float f1 = p();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                b(flag3);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                boolean flag4 = r();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag4)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                boolean flag5 = flag8;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                a(flag5);
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                boolean flag6 = q();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag6)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                boolean flag7 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag7)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
                i = s();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IPolygonDelegate");
        }
    }

    static final class a.a
        implements l
    {

        private IBinder a;

        public final String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(float f)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            parcel.writeFloat(f);
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

        public final void a(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            parcel.writeInt(i);
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
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
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
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final boolean a(l l1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            if (l1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            l1 = l1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(l1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            l1 = null;
              goto _L1
            l1;
            parcel1.recycle();
            parcel.recycle();
            throw l1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(float f)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            parcel.writeFloat(f);
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

        public final void b(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            parcel.writeInt(i);
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
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
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
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final void j()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
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

        public final List k()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
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

        public final List l()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
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

        public final int m()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(10, parcel, parcel1, 0);
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

        public final int n()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(12, parcel, parcel1, 0);
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

        public final float o()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final float p()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            f = parcel1.readFloat();
            parcel1.recycle();
            parcel.recycle();
            return f;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean q()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(18, parcel, parcel1, 0);
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

        public final boolean r()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(16, parcel, parcel1, 0);
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

        public final int s()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolygonDelegate");
            a.transact(20, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract String a();

    public abstract void a(float f);

    public abstract void a(int i);

    public abstract void a(List list);

    public abstract void a(boolean flag);

    public abstract boolean a(l l1);

    public abstract void b(float f);

    public abstract void b(int i);

    public abstract void b(List list);

    public abstract void b(boolean flag);

    public abstract void j();

    public abstract List k();

    public abstract List l();

    public abstract int m();

    public abstract int n();

    public abstract float o();

    public abstract float p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract int s();
}
