// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo.security.services:
//            ScanResult, b

public interface com.qihoo.security.services.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.qihoo.security.services.a
    {

        public static com.qihoo.security.services.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.services.IEngineBase");
            if (iinterface != null && (iinterface instanceof com.qihoo.security.services.a))
            {
                return (com.qihoo.security.services.a)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
        {
            Object obj = null;
            Object obj1 = null;
            Object obj2 = null;
            ScanResult scanresult = null;
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.services.IEngineBase");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = a(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = b(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = c(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = d(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = e(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = a(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    scanresult = (ScanResult)ScanResult.CREATOR.createFromParcel(parcel);
                }
                k = a(k, scanresult);
                parcel1.writeNoException();
                parcel1.writeInt(k);
                if (scanresult != null)
                {
                    parcel1.writeInt(1);
                    scanresult.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 8: // '\b'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = parcel.readInt();
                parcel = parcel.createTypedArrayList(ScanResult.CREATOR);
                k = a(k, parcel);
                parcel1.writeNoException();
                parcel1.writeInt(k);
                parcel1.writeTypedList(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = parcel.readInt();
                ScanResult scanresult1 = obj;
                if (parcel.readInt() != 0)
                {
                    scanresult1 = (ScanResult)ScanResult.CREATOR.createFromParcel(parcel);
                }
                k = a(k, scanresult1, com.qihoo.security.services.b.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = parcel.readInt();
                ScanResult scanresult2 = obj1;
                if (parcel.readInt() != 0)
                {
                    scanresult2 = (ScanResult)ScanResult.CREATOR.createFromParcel(parcel);
                }
                k = b(k, scanresult2);
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = f(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = g(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = h(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                parcel = i(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                ScanResult scanresult3 = obj2;
                if (parcel.readInt() != 0)
                {
                    scanresult3 = (ScanResult)ScanResult.CREATOR.createFromParcel(parcel);
                }
                a(scanresult3);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                parcel = a(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                parcel = j(parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                k = a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.qihoo.security.services.IEngineBase");
                break;
            }
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.services.IEngineBase");
        }
    }

    private static class a.a
        implements com.qihoo.security.services.a
    {

        private IBinder a;

        public int a(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int a(int k, int l, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            parcel.writeInt(l);
            parcel.writeString(s);
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int a(int k, ScanResult scanresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            if (scanresult == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            parcel.writeInt(1);
            scanresult.writeToParcel(parcel, 0);
_L1:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            if (parcel1.readInt() != 0)
            {
                scanresult.a(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return k;
            parcel.writeInt(0);
              goto _L1
            scanresult;
            parcel1.recycle();
            parcel.recycle();
            throw scanresult;
        }

        public int a(int k, ScanResult scanresult, b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            if (scanresult == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            scanresult.writeToParcel(parcel, 0);
_L3:
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            scanresult = b1.asBinder();
_L4:
            parcel.writeStrongBinder(scanresult);
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
_L2:
            parcel.writeInt(0);
              goto _L3
            scanresult;
            parcel1.recycle();
            parcel.recycle();
            throw scanresult;
            scanresult = null;
              goto _L4
        }

        public int a(int k, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int a(int k, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            parcel.writeTypedList(list);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.readTypedList(list, ScanResult.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return k;
            list;
            parcel1.recycle();
            parcel.recycle();
            throw list;
        }

        public String a(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeString(s);
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(ScanResult scanresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            if (scanresult == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            scanresult.writeToParcel(parcel, 0);
_L1:
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            scanresult;
            parcel1.recycle();
            parcel.recycle();
            throw scanresult;
        }

        public void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            a.transact(19, parcel, parcel1, 0);
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

        public IBinder asBinder()
        {
            return a;
        }

        public int b(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int b(int k, ScanResult scanresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            if (scanresult == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            parcel.writeInt(1);
            scanresult.writeToParcel(parcel, 0);
_L1:
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            parcel.writeInt(0);
              goto _L1
            scanresult;
            parcel1.recycle();
            parcel.recycle();
            throw scanresult;
        }

        public int c(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int d(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int e(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int f(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int g(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int h(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            k = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return k;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String i(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(14, parcel, parcel1, 0);
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

        public IBinder j(int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IBinder ibinder;
            parcel.writeInterfaceToken("com.qihoo.security.services.IEngineBase");
            parcel.writeInt(k);
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            ibinder = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return ibinder;
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


    public abstract int a(int k)
        throws RemoteException;

    public abstract int a(int k, int l, String s)
        throws RemoteException;

    public abstract int a(int k, ScanResult scanresult)
        throws RemoteException;

    public abstract int a(int k, ScanResult scanresult, b b1)
        throws RemoteException;

    public abstract int a(int k, String s, String s1)
        throws RemoteException;

    public abstract int a(int k, List list)
        throws RemoteException;

    public abstract String a(String s)
        throws RemoteException;

    public abstract void a(ScanResult scanresult)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract int b(int k)
        throws RemoteException;

    public abstract int b(int k, ScanResult scanresult)
        throws RemoteException;

    public abstract int c(int k)
        throws RemoteException;

    public abstract int d(int k)
        throws RemoteException;

    public abstract int e(int k)
        throws RemoteException;

    public abstract int f(int k)
        throws RemoteException;

    public abstract int g(int k)
        throws RemoteException;

    public abstract int h(int k)
        throws RemoteException;

    public abstract String i(int k)
        throws RemoteException;

    public abstract IBinder j(int k)
        throws RemoteException;
}
