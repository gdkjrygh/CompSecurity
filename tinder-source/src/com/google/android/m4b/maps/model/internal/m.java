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

public interface m
    extends IInterface
{
    public static abstract class a extends Binder
        implements m
    {

        public static m a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            if (iinterface != null && (iinterface instanceof m))
            {
                return (m)iinterface;
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
                parcel1.writeString("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                j();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                parcel = q();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                float f = l();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                i = k();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                float f1 = m();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                b(flag3);
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                boolean flag4 = o();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag4)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                boolean flag5 = flag8;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                a(flag5);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                boolean flag6 = n();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag6)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                boolean flag7 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag7)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                i = p();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IPolylineDelegate");
        }
    }

    static final class a.a
        implements m
    {

        private IBinder a;

        public final String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
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

        public final void a(float f)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            parcel.writeFloat(f);
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

        public final void a(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            parcel.writeInt(i);
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

        public final void a(List list)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        public final boolean a(m m1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            if (m1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            m1 = m1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(m1);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            m1 = null;
              goto _L1
            m1;
            parcel1.recycle();
            parcel.recycle();
            throw m1;
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            parcel.writeFloat(f);
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

        public final void b(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            if (flag)
            {
                i = 1;
            }
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

        public final void j()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
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

        public final int k()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(8, parcel, parcel1, 0);
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

        public final float l()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(6, parcel, parcel1, 0);
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

        public final float m()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(10, parcel, parcel1, 0);
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

        public final boolean n()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(14, parcel, parcel1, 0);
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

        public final boolean o()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(12, parcel, parcel1, 0);
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

        public final int p()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            a.transact(16, parcel, parcel1, 0);
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

        public final List q()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
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

    public abstract boolean a(m m1);

    public abstract void b(float f);

    public abstract void b(boolean flag);

    public abstract void j();

    public abstract int k();

    public abstract float l();

    public abstract float m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int p();

    public abstract List q();
}
