// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.f;

// Referenced classes of package com.google.android.gms.internal:
//            hw

public interface hv
    extends IInterface
{
    public static abstract class a extends Binder
        implements hv
    {

        public static hv a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (iinterface != null && (iinterface instanceof hv))
            {
                return (hv)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                a(com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder()), parcel.readString(), (UsageInfo[])parcel.createTypedArray(UsageInfo.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                a(com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                b(com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                hw hw = com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder());
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(hw, flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                Object obj;
                if (parcel.readInt() != 0)
                {
                    obj = com.google.android.gms.appdatasearch.GetRecentContextCall.Request.CREATOR;
                    obj = f.a(parcel);
                } else
                {
                    obj = null;
                }
                a(((com.google.android.gms.appdatasearch.GetRecentContextCall.Request) (obj)), com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                a(com.google.android.gms.internal.hw.a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class a.a
        implements hv
    {

        private IBinder a;

        public final void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, hw hw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (request == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            request.writeToParcel(parcel, 0);
_L3:
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            request = hw1.asBinder();
_L4:
            parcel.writeStrongBinder(request);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            request;
            parcel1.recycle();
            parcel.recycle();
            throw request;
            request = null;
              goto _L4
        }

        public final void a(hw hw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            hw1 = hw1.asBinder();
_L1:
            parcel.writeStrongBinder(hw1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hw1 = null;
              goto _L1
            hw1;
            parcel1.recycle();
            parcel.recycle();
            throw hw1;
        }

        public final void a(hw hw1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hw1 = hw1.asBinder();
_L1:
            parcel.writeStrongBinder(hw1);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hw1 = null;
              goto _L1
            hw1;
            parcel1.recycle();
            parcel.recycle();
            throw hw1;
        }

        public final void a(hw hw1, String s, UsageInfo ausageinfo[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hw1 = hw1.asBinder();
_L1:
            parcel.writeStrongBinder(hw1);
            parcel.writeString(s);
            parcel.writeTypedArray(ausageinfo, 0);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hw1 = null;
              goto _L1
            hw1;
            parcel1.recycle();
            parcel.recycle();
            throw hw1;
        }

        public final void a(hw hw1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            hw1 = hw1.asBinder();
_L1:
            parcel.writeStrongBinder(hw1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hw1 = null;
              goto _L1
            hw1;
            parcel1.recycle();
            parcel.recycle();
            throw hw1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(hw hw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hw1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            hw1 = hw1.asBinder();
_L1:
            parcel.writeStrongBinder(hw1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hw1 = null;
              goto _L1
            hw1;
            parcel1.recycle();
            parcel.recycle();
            throw hw1;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, hw hw)
        throws RemoteException;

    public abstract void a(hw hw)
        throws RemoteException;

    public abstract void a(hw hw, String s, String s1)
        throws RemoteException;

    public abstract void a(hw hw, String s, UsageInfo ausageinfo[])
        throws RemoteException;

    public abstract void a(hw hw, boolean flag)
        throws RemoteException;

    public abstract void b(hw hw)
        throws RemoteException;
}
