// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.internal:
//            ec, ed

public interface fh
    extends IInterface
{
    public static abstract class a extends Binder
        implements fh
    {

        public static fh an(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            if (iinterface != null && (iinterface instanceof fh))
            {
                return (fh)iinterface;
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
            ec ec1 = null;
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(i, ((Bundle) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(i, ((Bundle) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                W(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = d.CREATOR.h(parcel);
                }
                a(((d) (obj)), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                Bundle bundle;
                if (parcel.readInt() != 0)
                {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    bundle = null;
                }
                if (parcel.readInt() != 0)
                {
                    ec1 = ec.CREATOR.s(parcel);
                }
                a(i, bundle, ec1);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                d d1 = obj1;
                if (parcel.readInt() != 0)
                {
                    d1 = d.CREATOR.h(parcel);
                }
                a(d1, parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                b(i, parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                X(parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }
    }

    private static class a.a
        implements fh
    {

        private IBinder dG;

        public void W(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeString(s);
            dG.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void X(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeString(s);
            dG.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void a(int i, Bundle bundle, Bundle bundle1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (bundle1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            parcel.writeInt(1);
            bundle1.writeToParcel(parcel, 0);
_L4:
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(int i, Bundle bundle, ec ec1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (ec1 == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            parcel.writeInt(1);
            ec1.writeToParcel(parcel, 0);
_L4:
            dG.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(d d1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            dG.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void a(d d1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public void b(int i, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            dG.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract void W(String s)
        throws RemoteException;

    public abstract void X(String s)
        throws RemoteException;

    public abstract void a(int i, Bundle bundle, Bundle bundle1)
        throws RemoteException;

    public abstract void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;

    public abstract void a(int i, Bundle bundle, ec ec)
        throws RemoteException;

    public abstract void a(d d, String s)
        throws RemoteException;

    public abstract void a(d d, String s, String s1)
        throws RemoteException;

    public abstract void b(int i, Bundle bundle)
        throws RemoteException;
}
