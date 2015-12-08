// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface j
    extends IInterface
{
    public static abstract class a extends Binder
        implements j
    {

        public static j a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (iinterface != null && (iinterface instanceof j))
            {
                return (j)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
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
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                a(flag9);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag10;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                b(flag9);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag11;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                c(flag9);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                d(flag9);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                e(flag9);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                f(flag9);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag15;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                g(flag9);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag16;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                h(flag9);
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = a();
                parcel1.writeNoException();
                k = ((flag) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = b();
                parcel1.writeNoException();
                k = ((flag1) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = c();
                parcel1.writeNoException();
                k = ((flag2) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = d();
                parcel1.writeNoException();
                k = ((flag3) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = e();
                parcel1.writeNoException();
                k = ((flag4) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = f();
                parcel1.writeNoException();
                k = ((flag5) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = g();
                parcel1.writeNoException();
                k = ((flag6) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag17;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                i(flag9);
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = h();
                parcel1.writeNoException();
                k = ((flag7) ? 1 : 0);
                if (flag9)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = flag18;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                j(flag9);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                flag9 = i();
                parcel1.writeNoException();
                k = ((flag8) ? 1 : 0);
                break;
            }
            if (flag9)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;
        }
    }

    private static class a.a
        implements j
    {

        private IBinder a;

        public void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (!flag)
            {
                k = 0;
            }
            parcel.writeInt(k);
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

        public boolean a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public IBinder asBinder()
        {
            return a;
        }

        public void b(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void c(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void d(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void e(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean e()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void f(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void g(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void h(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void i(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        public boolean i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int k;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (k != 0)
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

        public void j(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a()
        throws RemoteException;

    public abstract void b(boolean flag)
        throws RemoteException;

    public abstract boolean b()
        throws RemoteException;

    public abstract void c(boolean flag)
        throws RemoteException;

    public abstract boolean c()
        throws RemoteException;

    public abstract void d(boolean flag)
        throws RemoteException;

    public abstract boolean d()
        throws RemoteException;

    public abstract void e(boolean flag)
        throws RemoteException;

    public abstract boolean e()
        throws RemoteException;

    public abstract void f(boolean flag)
        throws RemoteException;

    public abstract boolean f()
        throws RemoteException;

    public abstract void g(boolean flag)
        throws RemoteException;

    public abstract boolean g()
        throws RemoteException;

    public abstract void h(boolean flag)
        throws RemoteException;

    public abstract boolean h()
        throws RemoteException;

    public abstract void i(boolean flag)
        throws RemoteException;

    public abstract boolean i()
        throws RemoteException;

    public abstract void j(boolean flag)
        throws RemoteException;
}
