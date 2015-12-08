// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            jt, js, jj

private static class le
    implements jt
{

    private IBinder le;

    public void a(js js1, int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        le.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void a(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void a(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, int i1, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, int i1, String s1, String s2)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        le.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void a(js js1, int i1, String s1, String s2, String s3, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        le.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void a(js js1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        le.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void a(js js1, int i1, String s1, String s2, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
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
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
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
        le.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, int i1, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void a(js js1, jj jj1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        if (jj1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jj1.writeToParcel(parcel, 0);
_L6:
        le.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return le;
    }

    public void b(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void b(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void b(js js1, int i1, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        le.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void c(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void c(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void d(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void d(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void e(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void e(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void f(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void f(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void g(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void g(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void h(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void h(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void i(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void i(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void j(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void j(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void k(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void k(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void l(js js1, int i1, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        js1 = js1.asBinder();
_L1:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        le.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        js1 = null;
          goto _L1
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
    }

    public void l(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void m(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void n(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void o(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void p(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void q(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void r(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void s(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    public void t(js js1, int i1, String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (js1 == null) goto _L2; else goto _L1
_L1:
        js1 = js1.asBinder();
_L5:
        parcel.writeStrongBinder(js1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        le.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        js1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        js1;
        parcel1.recycle();
        parcel.recycle();
        throw js1;
          goto _L5
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
