// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            gk, gh

final class gm
    implements gk
{

    private IBinder a;

    gm(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(gh gh1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void a(gh gh1, int i1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void a(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void a(gh gh1, int i1, String s, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void a(gh gh1, int i1, String s, String s1, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void a(gh gh1, int i1, String s, String s1, String as[], String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
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
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void a(gh gh1, int i1, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
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
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void a(gh gh1, int i1, String s, String as[], String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        parcel.writeString(s1);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(gh gh1, int i1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void b(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void c(gh gh1, int i1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void c(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void d(gh gh1, int i1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gh1 = gh1.asBinder();
_L1:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gh1 = null;
          goto _L1
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
    }

    public final void d(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void e(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void f(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void g(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void h(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void i(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void j(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void k(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void l(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void m(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }

    public final void n(gh gh1, int i1, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (gh1 == null) goto _L2; else goto _L1
_L1:
        gh1 = gh1.asBinder();
_L5:
        parcel.writeStrongBinder(gh1);
        parcel.writeInt(i1);
        parcel.writeString(s);
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
        gh1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        gh1;
        parcel1.recycle();
        parcel.recycle();
        throw gh1;
          goto _L5
    }
}
