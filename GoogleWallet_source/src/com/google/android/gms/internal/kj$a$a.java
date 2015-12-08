// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            kj, ki, jz

static final class ld
    implements kj
{

    private IBinder ld;

    public final void a(ki ki1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        ld.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void a(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void a(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, int i1, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, int i1, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        ld.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void a(ki ki1, int i1, String s1, String s2, String s3, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        ld.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void a(ki ki1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        ld.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void a(ki ki1, int i1, String s1, String s2, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
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
        ld.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
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
        ld.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, int i1, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void a(ki ki1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        if (jz1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jz1.writeToParcel(parcel, 0);
_L6:
        ld.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return ld;
    }

    public final void b(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void b(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void b(ki ki1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        ld.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void c(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void c(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void d(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void d(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void e(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void e(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void f(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void f(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void g(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void g(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void h(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void h(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void i(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void i(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void j(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void j(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void k(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void k(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void l(ki ki1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ki1 = ki1.asBinder();
_L1:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        ld.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ki1 = null;
          goto _L1
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
    }

    public final void l(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void m(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void n(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void o(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void p(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void q(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void r(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void s(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    public final void t(ki ki1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ki1 == null) goto _L2; else goto _L1
_L1:
        ki1 = ki1.asBinder();
_L5:
        parcel.writeStrongBinder(ki1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ld.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ki1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ki1;
        parcel1.recycle();
        parcel.recycle();
        throw ki1;
          goto _L5
    }

    (IBinder ibinder)
    {
        ld = ibinder;
    }
}
