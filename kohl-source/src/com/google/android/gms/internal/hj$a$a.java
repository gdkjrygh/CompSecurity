// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hj, hi

private static class ko
    implements hj
{

    private IBinder ko;

    public void a(hi hi1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        ko.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void a(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void a(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void a(hi hi1, int i1, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void a(hi hi1, int i1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        ko.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void a(hi hi1, int i1, String s, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        ko.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void a(hi hi1, int i1, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        ko.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void a(hi hi1, int i1, String s, String s1, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void a(hi hi1, int i1, String s, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
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
        ko.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void a(hi hi1, int i1, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
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
        ko.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void a(hi hi1, int i1, String s, String as[], String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return ko;
    }

    public void b(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void b(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void b(hi hi1, int i1, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        ko.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void c(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void c(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void d(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void d(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void e(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void e(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void f(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void f(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void g(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void g(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void h(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void h(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void i(hi hi1, int i1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hi1 = hi1.asBinder();
_L1:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        ko.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hi1 = null;
          goto _L1
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
    }

    public void i(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void j(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void k(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void l(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void m(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void n(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void o(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    public void p(hi hi1, int i1, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (hi1 == null) goto _L2; else goto _L1
_L1:
        hi1 = hi1.asBinder();
_L5:
        parcel.writeStrongBinder(hi1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        ko.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        hi1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        hi1;
        parcel1.recycle();
        parcel.recycle();
        throw hi1;
          goto _L5
    }

    (IBinder ibinder)
    {
        ko = ibinder;
    }
}
