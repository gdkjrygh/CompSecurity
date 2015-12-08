// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

public interface gl
    extends IInterface
{
    public static abstract class a extends Binder
        implements gl
    {

        public static gl H(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            if (iinterface != null && (iinterface instanceof gl))
            {
                return (gl)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag3 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                disconnect();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                parcel1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                e(parcel1, flag);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                h(parcel.readString(), parcel.readString());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                ep();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                am(parcel.readString());
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                eg();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                double d = parcel.readDouble();
                double d2 = parcel.readDouble();
                boolean flag1;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(d, d2, flag1);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                double d1;
                boolean flag2;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                d1 = parcel.readDouble();
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(flag2, d1, flag3);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                a(parcel.readString(), parcel.readString(), parcel.readLong());
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                an(parcel.readString());
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                ao(parcel.readString());
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                parcel1 = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel1, parcel);
            return true;
        }
    }

    private static class a.a
        implements gl
    {

        private IBinder kq;

        public void a(double d, double d1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeDouble(d);
            parcel.writeDouble(d1);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            kq.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void a(String s, LaunchOptions launchoptions)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            if (launchoptions == null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            parcel.writeInt(1);
            launchoptions.writeToParcel(parcel, 0);
_L1:
            kq.transact(13, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public void a(String s, String s1, long l)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeLong(l);
            kq.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void a(String s, byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            kq.transact(10, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void a(boolean flag, double d, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeDouble(d);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            kq.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void am(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            kq.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void an(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            kq.transact(11, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void ao(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            kq.transact(12, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void disconnect()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            kq.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void e(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            kq.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void eg()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            kq.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void ep()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            kq.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void h(String s, String s1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel.writeString(s);
            parcel.writeString(s1);
            kq.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void a(double d, double d1, boolean flag)
        throws RemoteException;

    public abstract void a(String s, LaunchOptions launchoptions)
        throws RemoteException;

    public abstract void a(String s, String s1, long l)
        throws RemoteException;

    public abstract void a(String s, byte abyte0[], long l)
        throws RemoteException;

    public abstract void a(boolean flag, double d, boolean flag1)
        throws RemoteException;

    public abstract void am(String s)
        throws RemoteException;

    public abstract void an(String s)
        throws RemoteException;

    public abstract void ao(String s)
        throws RemoteException;

    public abstract void disconnect()
        throws RemoteException;

    public abstract void e(String s, boolean flag)
        throws RemoteException;

    public abstract void eg()
        throws RemoteException;

    public abstract void ep()
        throws RemoteException;

    public abstract void h(String s, String s1)
        throws RemoteException;
}
