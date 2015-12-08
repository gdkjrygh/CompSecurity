// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

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
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
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

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
        {
            boolean flag10 = false;
            boolean flag11 = false;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag15 = false;
            boolean flag16 = false;
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            boolean flag6 = false;
            boolean flag17 = false;
            boolean flag7 = false;
            boolean flag18 = false;
            boolean flag8 = false;
            boolean flag9 = false;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                f(flag9);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag10;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                h(flag9);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag11;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                i(flag9);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                j(flag9);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                k(flag9);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                l(flag9);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag15;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                m(flag9);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag16;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                n(flag9);
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = u();
                parcel1.writeNoException();
                i1 = ((flag) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = v();
                parcel1.writeNoException();
                i1 = ((flag1) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = w();
                parcel1.writeNoException();
                i1 = ((flag2) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = x();
                parcel1.writeNoException();
                i1 = ((flag3) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = y();
                parcel1.writeNoException();
                i1 = ((flag4) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = z();
                parcel1.writeNoException();
                i1 = ((flag5) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = A();
                parcel1.writeNoException();
                i1 = ((flag6) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag17;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                c(flag9);
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = l();
                parcel1.writeNoException();
                i1 = ((flag7) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = flag18;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                g(flag9);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
                flag9 = t();
                parcel1.writeNoException();
                i1 = ((flag8) ? 1 : 0);
                break;
            }
            if (flag9)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.IUiSettingsDelegate");
        }
    }

    static final class a.a
        implements l
    {

        private IBinder a;

        public final boolean A()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final void c(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(16, parcel, parcel1, 0);
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

        public final void f(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (!flag)
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
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

        public final void g(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(18, parcel, parcel1, 0);
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

        public final void h(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final void i(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final void j(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final void k(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final void l(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final boolean l()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final void m(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
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

        public final void n(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(8, parcel, parcel1, 0);
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

        public final boolean t()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean u()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean v()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean w()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean x()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean y()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final boolean z()
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IUiSettingsDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract boolean A();

    public abstract void c(boolean flag);

    public abstract void f(boolean flag);

    public abstract void g(boolean flag);

    public abstract void h(boolean flag);

    public abstract void i(boolean flag);

    public abstract void j(boolean flag);

    public abstract void k(boolean flag);

    public abstract void l(boolean flag);

    public abstract boolean l();

    public abstract void m(boolean flag);

    public abstract void n(boolean flag);

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w();

    public abstract boolean x();

    public abstract boolean y();

    public abstract boolean z();
}
