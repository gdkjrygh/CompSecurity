// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dj, di

private static class dG
    implements dj
{

    private IBinder dG;

    public void a(di di1, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        di1 = di1.asBinder();
_L1:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        dG.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        di1 = null;
          goto _L1
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
    }

    public void a(di di1, int k, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        di1 = di1.asBinder();
_L1:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        dG.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        di1 = null;
          goto _L1
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
    }

    public void a(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void a(di di1, int k, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        di1 = di1.asBinder();
_L1:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        dG.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        di1 = null;
          goto _L1
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
    }

    public void a(di di1, int k, String s, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void a(di di1, int k, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
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
        dG.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public void b(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void c(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void d(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void e(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void f(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void g(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void h(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void i(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    public void j(di di1, int k, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (di1 == null) goto _L2; else goto _L1
_L1:
        di1 = di1.asBinder();
_L5:
        parcel.writeStrongBinder(di1);
        parcel.writeInt(k);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        dG.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        di1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        di1;
        parcel1.recycle();
        parcel.recycle();
        throw di1;
          goto _L5
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
