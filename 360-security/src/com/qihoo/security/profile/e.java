// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.qihoo.security.profile:
//            d

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
            IInterface iinterface = ibinder.queryLocalInterface("com.qihoo.security.profile.IProfileManager");
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

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.qihoo.security.profile.IProfileManager");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.qihoo.security.profile.IProfileManager");
                a(d.a.a(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.qihoo.security.profile.IProfileManager");
                a(d.a.a(parcel.readStrongBinder()));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.qihoo.security.profile.IProfileManager");
                a(d.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.qihoo.security.profile.IProfileManager");
                a(parcel.readInt(), parcel.readInt());
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.qihoo.security.profile.IProfileManager");
        }
    }

    private static class a.a
        implements e
    {

        private IBinder a;

        public void a(int i, int j)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
            parcel.writeInt(i);
            parcel.writeInt(j);
            a.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void a(d d1)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = d1.asBinder();
            parcel.writeStrongBinder(ibinder);
            a.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            d1;
            parcel.recycle();
            throw d1;
        }

        public void a(d d1, int i, int j, String s)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = d1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeString(s);
            a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            d1;
            parcel.recycle();
            throw d1;
        }

        public void a(d d1, String s)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.qihoo.security.profile.IProfileManager");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = d1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            d1;
            parcel.recycle();
            throw d1;
        }

        public IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(int i, int j)
        throws RemoteException;

    public abstract void a(d d)
        throws RemoteException;

    public abstract void a(d d, int i, int j, String s)
        throws RemoteException;

    public abstract void a(d d, String s)
        throws RemoteException;
}
