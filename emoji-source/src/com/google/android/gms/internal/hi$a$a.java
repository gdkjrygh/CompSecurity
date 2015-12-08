// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hi, hh

private static class kq
    implements hi
{

    private IBinder kq;

    public void a(hh hh1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        kq.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void a(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void a(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void a(hh hh1, int i1, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void a(hh hh1, int i1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        kq.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void a(hh hh1, int i1, String s, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        kq.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void a(hh hh1, int i1, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        kq.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void a(hh hh1, int i1, String s, String s1, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void a(hh hh1, int i1, String s, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void a(hh hh1, int i1, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s3);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void a(hh hh1, int i1, String s, String as[], String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void b(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void b(hh hh1, int i1, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        kq.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void c(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void c(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void d(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void d(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void e(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void e(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void f(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void f(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void g(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void g(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void h(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void h(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void i(hh hh1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hh1 = hh1.asBinder();
_L1:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        kq.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hh1 = null;
          goto _L1
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
    }

    public void i(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void j(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void k(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void l(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void m(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void n(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void o(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    public void p(hh hh1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hh1 == null) goto _L2; else goto _L1
_L1:
        hh1 = hh1.asBinder();
_L5:
        parcel.writeStrongBinder(hh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        kq.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hh1;
        parcel1.recycle();
        parcel.recycle();
        throw hh1;
          goto _L5
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
