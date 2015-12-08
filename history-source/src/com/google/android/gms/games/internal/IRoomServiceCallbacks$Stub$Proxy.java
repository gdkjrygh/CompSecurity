// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.games.internal:
//            IRoomServiceCallbacks, ConnectionInfo

private static class le
    implements IRoomServiceCallbacks
{

    private IBinder le;

    public void a(ParcelFileDescriptor parcelfiledescriptor, int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L1:
        parcel.writeInt(i);
        le.transact(1024, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        parcelfiledescriptor;
        parcel.recycle();
        throw parcelfiledescriptor;
    }

    public void a(ConnectionInfo connectioninfo)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        if (connectioninfo == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        parcel.writeInt(1);
        connectioninfo.writeToParcel(parcel, 0);
_L1:
        le.transact(1022, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        connectioninfo;
        parcel.recycle();
        throw connectioninfo;
    }

    public void a(String s, byte abyte0[], int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(i);
        le.transact(1002, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void a(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1008, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void aG(IBinder ibinder)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeStrongBinder(ibinder);
        le.transact(1021, parcel, null, 1);
        parcel.recycle();
        return;
        ibinder;
        parcel.recycle();
        throw ibinder;
    }

    public IBinder asBinder()
    {
        return le;
    }

    public void b(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1009, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bS(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1003, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bT(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1004, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bU(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1005, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bV(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1006, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bW(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1007, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void bX(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1019, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void c(int i, int k, String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeInt(i);
        parcel.writeInt(k);
        parcel.writeString(s);
        le.transact(1001, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void c(String s, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        le.transact(1018, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void c(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1010, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void d(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1011, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void dX(int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeInt(i);
        le.transact(1020, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void e(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1012, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void f(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1013, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void g(String s, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeStringArray(as);
        le.transact(1017, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void j(String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        le.transact(1026, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void lR()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        le.transact(1016, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void lS()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        le.transact(1023, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public void onP2PConnected(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1014, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void onP2PDisconnected(String s)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        le.transact(1015, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public void x(String s, int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
        parcel.writeString(s);
        parcel.writeInt(i);
        le.transact(1025, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
