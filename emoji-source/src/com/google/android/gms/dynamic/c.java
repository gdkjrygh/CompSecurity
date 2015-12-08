// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.dynamic:
//            d

public interface c
    extends IInterface
{
    public static abstract class a extends Binder
        implements c
    {

        public static c af(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (iinterface != null && (iinterface instanceof c))
            {
                return (c)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            d d3 = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj = null;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            boolean flag6 = false;
            boolean flag7 = false;
            boolean flag8 = false;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d3 = gI();
                parcel1.writeNoException();
                parcel = obj;
                if (d3 != null)
                {
                    parcel = d3.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                parcel = getArguments();
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

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                i = getId();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                c c1 = gJ();
                parcel1.writeNoException();
                parcel = d3;
                if (c1 != null)
                {
                    parcel = c1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d d1 = gK();
                parcel1.writeNoException();
                parcel = obj1;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = getRetainInstance();
                parcel1.writeNoException();
                if (flag8)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                parcel = getTag();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                c c2 = gL();
                parcel1.writeNoException();
                parcel = obj2;
                if (c2 != null)
                {
                    parcel = c2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                i = getTargetRequestCode();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = getUserVisibleHint();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d d2 = getView();
                parcel1.writeNoException();
                parcel = obj3;
                if (d2 != null)
                {
                    parcel = d2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isAdded();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isDetached();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isHidden();
                parcel1.writeNoException();
                i = ((flag3) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isInLayout();
                parcel1.writeNoException();
                i = ((flag4) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isRemoving();
                parcel1.writeNoException();
                i = ((flag5) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isResumed();
                parcel1.writeNoException();
                i = ((flag6) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isVisible();
                parcel1.writeNoException();
                i = ((flag7) ? 1 : 0);
                if (flag8)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                c(com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                }
                setHasOptionsMenu(flag8);
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag9 = flag12;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                setMenuVisibility(flag9);
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag10 = flag13;
                if (parcel.readInt() != 0)
                {
                    flag10 = true;
                }
                setRetainInstance(flag10);
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag11 = flag14;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                setUserVisibleHint(flag11);
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                Intent intent = obj4;
                if (parcel.readInt() != 0)
                {
                    intent = (Intent)Intent.CREATOR.createFromParcel(parcel);
                }
                startActivity(intent);
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                Intent intent1 = obj5;
                if (parcel.readInt() != 0)
                {
                    intent1 = (Intent)Intent.CREATOR.createFromParcel(parcel);
                }
                startActivityForResult(intent1, parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d(com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
        }
    }

    private static class a.a
        implements c
    {

        private IBinder kq;

        public IBinder asBinder()
        {
            return kq;
        }

        public void c(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            kq.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void d(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            kq.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public d gI()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public c gJ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            c c1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            c1 = a.af(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d gK()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public c gL()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            c c1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            c1 = a.af(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Bundle getArguments()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int getId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(4, parcel, parcel1, 0);
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

        public boolean getRetainInstance()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(7, parcel, parcel1, 0);
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

        public String getTag()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(8, parcel, parcel1, 0);
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

        public int getTargetRequestCode()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(10, parcel, parcel1, 0);
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

        public boolean getUserVisibleHint()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(11, parcel, parcel1, 0);
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

        public d getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isAdded()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(13, parcel, parcel1, 0);
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

        public boolean isDetached()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(14, parcel, parcel1, 0);
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

        public boolean isHidden()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(15, parcel, parcel1, 0);
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

        public boolean isInLayout()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(16, parcel, parcel1, 0);
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

        public boolean isRemoving()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(17, parcel, parcel1, 0);
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

        public boolean isResumed()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(18, parcel, parcel1, 0);
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

        public boolean isVisible()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            kq.transact(19, parcel, parcel1, 0);
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

        public void setHasOptionsMenu(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(21, parcel, parcel1, 0);
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

        public void setMenuVisibility(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(22, parcel, parcel1, 0);
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

        public void setRetainInstance(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(23, parcel, parcel1, 0);
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

        public void setUserVisibleHint(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(24, parcel, parcel1, 0);
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

        public void startActivity(Intent intent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (intent == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            kq.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        public void startActivityForResult(Intent intent, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if (intent == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            kq.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void c(d d1)
        throws RemoteException;

    public abstract void d(d d1)
        throws RemoteException;

    public abstract d gI()
        throws RemoteException;

    public abstract c gJ()
        throws RemoteException;

    public abstract d gK()
        throws RemoteException;

    public abstract c gL()
        throws RemoteException;

    public abstract Bundle getArguments()
        throws RemoteException;

    public abstract int getId()
        throws RemoteException;

    public abstract boolean getRetainInstance()
        throws RemoteException;

    public abstract String getTag()
        throws RemoteException;

    public abstract int getTargetRequestCode()
        throws RemoteException;

    public abstract boolean getUserVisibleHint()
        throws RemoteException;

    public abstract d getView()
        throws RemoteException;

    public abstract boolean isAdded()
        throws RemoteException;

    public abstract boolean isDetached()
        throws RemoteException;

    public abstract boolean isHidden()
        throws RemoteException;

    public abstract boolean isInLayout()
        throws RemoteException;

    public abstract boolean isRemoving()
        throws RemoteException;

    public abstract boolean isResumed()
        throws RemoteException;

    public abstract boolean isVisible()
        throws RemoteException;

    public abstract void setHasOptionsMenu(boolean flag)
        throws RemoteException;

    public abstract void setMenuVisibility(boolean flag)
        throws RemoteException;

    public abstract void setRetainInstance(boolean flag)
        throws RemoteException;

    public abstract void setUserVisibleHint(boolean flag)
        throws RemoteException;

    public abstract void startActivity(Intent intent)
        throws RemoteException;

    public abstract void startActivityForResult(Intent intent, int i)
        throws RemoteException;
}
