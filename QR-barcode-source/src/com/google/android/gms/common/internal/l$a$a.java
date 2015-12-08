// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            l, k

private static class lb
    implements l
{

    private IBinder lb;

    public void a(k k1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        lb.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void a(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void a(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void a(k k1, int i1, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void a(k k1, int i1, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        lb.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void a(k k1, int i1, String s1, String s2, String s3, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        lb.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void a(k k1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        lb.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void a(k k1, int i1, String s1, String s2, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void a(k k1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        parcel.writeString(s3);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void a(k k1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        parcel.writeString(s3);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s4);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void a(k k1, int i1, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return lb;
    }

    public void b(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void b(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void b(k k1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        lb.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void c(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void c(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void d(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void d(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void e(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void e(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void f(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void f(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void g(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void g(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void h(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void h(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void i(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void i(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void j(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void j(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void k(k k1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        lb.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void k(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void l(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void m(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void n(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void o(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void p(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void q(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void r(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void s(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    public void t(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (k1 == null) goto _L2; else goto _L1
_L1:
        k1 = k1.asBinder();
_L5:
        parcel.writeStrongBinder(k1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        lb.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        k1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
          goto _L5
    }

    (IBinder ibinder)
    {
        lb = ibinder;
    }
}
