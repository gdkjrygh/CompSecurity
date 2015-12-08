// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.j:
//            t, s, aa, i

static final class a
    implements t
{

    private IBinder a;

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

    public final void a(s s1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, int i1, String s2, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, int i1, String s2, String s3)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(s s1, int i1, String s2, String s3, String s4, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeString(s4);
        parcel.writeStringArray(as);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(s s1, int i1, String s2, String s3, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(s s1, int i1, String s2, String s3, String as[], Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, int i1, String s2, String s3, String as[], String s4, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        parcel.writeString(s4);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, int i1, String s2, String s3, String as[], String s4, IBinder ibinder, 
            String s5, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        parcel.writeString(s4);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s5);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, int i1, String s2, String as[], String s3, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        parcel.writeString(s3);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, aa aa1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        if (aa1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        aa1.writeToParcel(parcel, 0);
_L6:
        a.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void a(s s1, i i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        if (i1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        i1.writeToParcel(parcel, 0);
_L6:
        a.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void b(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void c(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void c(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void d(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void d(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void e(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void e(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void f(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void f(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void g(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void g(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void h(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void h(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void i(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void i(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void j(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void j(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void k(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void k(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void l(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void l(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void m(s s1, int i1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
        a.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void m(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void n(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void o(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void p(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void q(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void r(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void s(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    public final void t(s s1, int i1, String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = s1.asBinder();
_L5:
        parcel.writeStrongBinder(s1);
        parcel.writeInt(i1);
        parcel.writeString(s2);
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
        s1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
          goto _L5
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
