// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            IRoomService, IRoomServiceCallbacks

private static class 
    implements IRoomService
{

    private IBinder kq;

    public void G(boolean flag)
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
        kq.transact(1008, parcel, null, 1);
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
        kq.transact(1001, parcel, null, 1);
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
        kq.transact(1006, parcel, null, 1);
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

    public void a(byte abyte0[], String s1, int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeByteArray(abyte0);
        parcel.writeString(s1);
        parcel.writeInt(i);
        kq.transact(1009, parcel, null, 1);
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
        kq.transact(1010, parcel, null, 1);
        parcel.recycle();
        return;
        abyte0;
        parcel.recycle();
        throw abyte0;
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void be(String s1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeString(s1);
        kq.transact(1013, parcel, null, 1);
        parcel.recycle();
        return;
        s1;
        parcel.recycle();
        throw s1;
    }

    public void bf(String s1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeString(s1);
        kq.transact(1014, parcel, null, 1);
        parcel.recycle();
        return;
        s1;
        parcel.recycle();
        throw s1;
    }

    public void c(String s1, String s2, String s3)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        kq.transact(1004, parcel, null, 1);
        parcel.recycle();
        return;
        s1;
        parcel.recycle();
        throw s1;
    }

    public void hF()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        kq.transact(1002, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void hG()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        kq.transact(1003, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void hH()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        kq.transact(1005, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void hI()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        kq.transact(1007, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void r(String s1, int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeString(s1);
        parcel.writeInt(i);
        kq.transact(1011, parcel, null, 1);
        parcel.recycle();
        return;
        s1;
        parcel.recycle();
        throw s1;
    }

    public void s(String s1, int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomService");
        parcel.writeString(s1);
        parcel.writeInt(i);
        kq.transact(1012, parcel, null, 1);
        parcel.recycle();
        return;
        s1;
        parcel.recycle();
        throw s1;
    }
}
