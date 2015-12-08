// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface n
    extends IInterface
{
    public static abstract class a extends Binder
        implements n
    {

        public static n a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            if (iinterface != null && (iinterface instanceof n))
            {
                return (n)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int l)
        {
            boolean flag = false;
            boolean flag1 = false;
            boolean flag4 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                c();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                d();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                parcel = a();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                float f = e();
                parcel1.writeNoException();
                parcel1.writeFloat(f);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(flag3);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                flag3 = g();
                parcel1.writeNoException();
                j = ((flag) ? 1 : 0);
                if (flag3)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                flag3 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                j = ((flag1) ? 1 : 0);
                if (flag3)
                {
                    j = 1;
                }
                parcel1.writeInt(j);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                j = k();
                parcel1.writeNoException();
                parcel1.writeInt(j);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                flag3 = flag4;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                b(flag3);
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                flag3 = i();
                parcel1.writeNoException();
                j = ((flag2) ? 1 : 0);
                break;
            }
            if (flag3)
            {
                j = 1;
            }
            parcel1.writeInt(j);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
        }
    }

    static final class a.a
        implements n
    {

        private IBinder a;

        public final String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(3, parcel, parcel1, 0);
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
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            parcel.writeFloat(f);
            a.transact(4, parcel, parcel1, 0);
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

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(6, parcel, parcel1, 0);
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

        public final boolean a(n n1)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            if (n1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            n1 = n1.asBinder();
_L1:
            int j;
            parcel.writeStrongBinder(n1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            n1 = null;
              goto _L1
            n1;
            parcel1.recycle();
            parcel.recycle();
            throw n1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            a.transact(10, parcel, parcel1, 0);
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

        public final void c()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
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

        public final void d()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(2, parcel, parcel1, 0);
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

        public final float e()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            float f;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(5, parcel, parcel1, 0);
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

        public final boolean g()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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

        public final boolean i()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            if (j != 0)
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
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int j;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            j = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return j;
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

    public abstract void a(boolean flag);

    public abstract boolean a(n n1);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void d();

    public abstract float e();

    public abstract boolean g();

    public abstract boolean i();

    public abstract int k();
}
