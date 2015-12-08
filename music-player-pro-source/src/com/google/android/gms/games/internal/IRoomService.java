// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.internal:
//            IRoomServiceCallbacks

public interface IRoomService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IRoomService
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag2 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IRoomService");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                a(parcel.readStrongBinder(), IRoomServiceCallbacks.Stub.aH(parcel.readStrongBinder()));
                return true;

            case 1002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                lN();
                return true;

            case 1003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                lO();
                return true;

            case 1004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                c(parcel.readString(), parcel.readString(), parcel.readString());
                return true;

            case 1005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                lP();
                return true;

            case 1006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR.B(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                a(parcel1, flag);
                return true;

            case 1007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                lQ();
                return true;

            case 1008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                boolean flag1 = flag2;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                R(flag1);
                return true;

            case 1009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                a(parcel.createByteArray(), parcel.readString(), parcel.readInt());
                return true;

            case 1010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                a(parcel.createByteArray(), parcel.createStringArray());
                return true;

            case 1011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                v(parcel.readString(), parcel.readInt());
                return true;

            case 1012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                w(parcel.readString(), parcel.readInt());
                return true;

            case 1013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                bQ(parcel.readString());
                return true;

            case 1014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomService");
                bR(parcel.readString());
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IRoomService");
        }
    }

    private static class Stub.Proxy
        implements IRoomService
    {

        private IBinder le;

        public void R(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            le.transact(1008, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void a(IBinder ibinder, IRoomServiceCallbacks iroomservicecallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeStrongBinder(ibinder);
            ibinder = obj;
            if (iroomservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            ibinder = iroomservicecallbacks.asBinder();
            parcel.writeStrongBinder(ibinder);
            le.transact(1001, parcel, null, 1);
            parcel.recycle();
            return;
            ibinder;
            parcel.recycle();
            throw ibinder;
        }

        public void a(DataHolder dataholder, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
              goto _L3
_L5:
            parcel.writeInt(i);
            le.transact(1006, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            break; /* Loop/switch isn't completed */
            dataholder;
            parcel.recycle();
            throw dataholder;
_L6:
            i = 0;
            if (true) goto _L4; else goto _L3
_L4:
            break; /* Loop/switch isn't completed */
_L3:
            if (!flag) goto _L6; else goto _L5
        }

        public void a(byte abyte0[], String s, int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            parcel.writeInt(i);
            le.transact(1009, parcel, null, 1);
            parcel.recycle();
            return;
            abyte0;
            parcel.recycle();
            throw abyte0;
        }

        public void a(byte abyte0[], String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeByteArray(abyte0);
            parcel.writeStringArray(as);
            le.transact(1010, parcel, null, 1);
            parcel.recycle();
            return;
            abyte0;
            parcel.recycle();
            throw abyte0;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void bQ(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeString(s);
            le.transact(1013, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void bR(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeString(s);
            le.transact(1014, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void c(String s, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            le.transact(1004, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void lN()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            le.transact(1002, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void lO()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            le.transact(1003, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void lP()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            le.transact(1005, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void lQ()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            le.transact(1007, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void v(String s, int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeString(s);
            parcel.writeInt(i);
            le.transact(1011, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public void w(String s, int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
            parcel.writeString(s);
            parcel.writeInt(i);
            le.transact(1012, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }
    }


    public abstract void R(boolean flag)
        throws RemoteException;

    public abstract void a(IBinder ibinder, IRoomServiceCallbacks iroomservicecallbacks)
        throws RemoteException;

    public abstract void a(DataHolder dataholder, boolean flag)
        throws RemoteException;

    public abstract void a(byte abyte0[], String s, int i)
        throws RemoteException;

    public abstract void a(byte abyte0[], String as[])
        throws RemoteException;

    public abstract void bQ(String s)
        throws RemoteException;

    public abstract void bR(String s)
        throws RemoteException;

    public abstract void c(String s, String s1, String s2)
        throws RemoteException;

    public abstract void lN()
        throws RemoteException;

    public abstract void lO()
        throws RemoteException;

    public abstract void lP()
        throws RemoteException;

    public abstract void lQ()
        throws RemoteException;

    public abstract void v(String s, int i)
        throws RemoteException;

    public abstract void w(String s, int i)
        throws RemoteException;
}
