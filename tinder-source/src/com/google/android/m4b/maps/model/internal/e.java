// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.g;

public interface e
    extends IInterface
{
    public static abstract class a extends Binder
        implements e
    {

        public static e a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            if (iinterface != null && (iinterface instanceof e))
            {
                return (e)iinterface;
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
            boolean flag1 = false;
            boolean flag2 = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, i1);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                j();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0)
                {
                    g g1 = LatLng.CREATOR;
                    parcel = g.a(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                parcel = k();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                a(parcel.readDouble());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                double d = l();
                parcel1.writeNoException();
                parcel1.writeDouble(d);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                float f = o();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                i = m();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                b(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                i = n();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                float f1 = p();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                }
                a(flag2);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                boolean flag3 = q();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag3)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                boolean flag4 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag4)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                i = r();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.ICircleDelegate");
        }
    }

    static final class a.a
        implements e
    {

        private IBinder a;

        public final String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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

        public final void a(double d)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            parcel.writeDouble(d);
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

        public final void a(float f)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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

        public final void a(LatLng latlng)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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

        public final boolean a(e e1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            e1 = e1.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(e1);
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            e1 = null;
              goto _L1
            e1;
            parcel1.recycle();
            parcel.recycle();
            throw e1;
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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

        public final LatLng k()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = LatLng.CREATOR;
            obj = g.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((LatLng) (obj));
_L2:
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final double l()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            double d;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            d = parcel1.readDouble();
            parcel1.recycle();
            parcel.recycle();
            return d;
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
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

        public final int r()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            a.transact(18, parcel, parcel1, 0);
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

    public abstract void a(double d);

    public abstract void a(float f);

    public abstract void a(int i);

    public abstract void a(LatLng latlng);

    public abstract void a(boolean flag);

    public abstract boolean a(e e1);

    public abstract void b(float f);

    public abstract void b(int i);

    public abstract void j();

    public abstract LatLng k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract float o();

    public abstract float p();

    public abstract boolean q();

    public abstract int r();
}
