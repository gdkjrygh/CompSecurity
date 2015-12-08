// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesSignInService, IGamesSignInCallbacks

private static class 
    implements IGamesSignInService
{

    private IBinder kq;

    public void a(IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        kq.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public void a(IGamesSignInCallbacks igamessignincallbacks, String s, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        kq.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public void a(IGamesSignInCallbacks igamessignincallbacks, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        kq.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public void a(IGamesSignInCallbacks igamessignincallbacks, String s, String s1, String as[], String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        kq.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(IGamesSignInCallbacks igamessignincallbacks, String s, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        kq.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public void b(IGamesSignInCallbacks igamessignincallbacks, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        if (igamessignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        igamessignincallbacks = igamessignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igamessignincallbacks);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        kq.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igamessignincallbacks = null;
          goto _L1
        igamessignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igamessignincallbacks;
    }

    public String bc(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        parcel.writeString(s);
        kq.transact(5001, parcel, parcel1, 0);
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

    public String bd(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        parcel.writeString(s);
        kq.transact(5002, parcel, parcel1, 0);
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

    public String f(String s, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        parcel.writeString(s);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        kq.transact(5009, parcel, parcel1, 0);
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

    public void o(String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
        parcel.writeString(s);
        parcel.writeString(s1);
        kq.transact(9001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }
}
