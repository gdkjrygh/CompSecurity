// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal:
//            ah, ae, zzae, zzi

final class aj
    implements ah
{

    private IBinder a;

    aj(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(ae ae1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void a(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void a(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, int i1, String s1, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, int i1, String s1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void a(ae ae1, int i1, String s1, String s2, String s3, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void a(ae ae1, int i1, String s1, String s2, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void a(ae ae1, int i1, String s1, String s2, String as[], Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
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
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
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
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, int i1, String s1, String as[], String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, zzae zzae1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        if (zzae1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzae1.writeToParcel(parcel, 0);
_L6:
        a.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void a(ae ae1, zzi zzi1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        if (zzi1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzi1.writeToParcel(parcel, 0);
_L6:
        a.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void b(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void c(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void c(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void d(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void d(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void e(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void e(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void f(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void f(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void g(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void g(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void h(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void h(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void i(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void i(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void j(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void j(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void k(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void k(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void l(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void l(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void m(ae ae1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ae1 = ae1.asBinder();
_L1:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ae1 = null;
          goto _L1
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
    }

    public final void m(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void n(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void o(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void p(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void q(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void r(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void s(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }

    public final void t(ae ae1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (ae1 == null) goto _L2; else goto _L1
_L1:
        ae1 = ae1.asBinder();
_L5:
        parcel.writeStrongBinder(ae1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ae1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ae1;
        parcel1.recycle();
        parcel.recycle();
        throw ae1;
          goto _L5
    }
}
