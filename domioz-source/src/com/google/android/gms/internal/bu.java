// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;

// Referenced classes of package com.google.android.gms.internal:
//            bs, zzax, bv, zzba

final class bu
    implements bs
{

    private IBinder a;

    bu(IBinder ibinder)
    {
        a = ibinder;
    }

    public final j a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        j j1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        j1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(j j1, zzax zzax1, String s, bv bv1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (zzax1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzax1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        j1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        j1 = bv1.asBinder();
        parcel.writeStrongBinder(j1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
          goto _L5
    }

    public final void a(j j1, zzax zzax1, String s, String s1, bv bv1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (zzax1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzax1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        j1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        j1 = bv1.asBinder();
        parcel.writeStrongBinder(j1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
          goto _L5
    }

    public final void a(j j1, zzba zzba1, zzax zzax1, String s, bv bv1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (zzba1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzba1.writeToParcel(parcel, 0);
_L6:
        if (zzax1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        parcel.writeInt(1);
        zzax1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        j1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        j1 = bv1.asBinder();
        parcel.writeStrongBinder(j1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(j j1, zzba zzba1, zzax zzax1, String s, String s1, bv bv1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (zzba1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzba1.writeToParcel(parcel, 0);
_L6:
        if (zzax1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        parcel.writeInt(1);
        zzax1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        parcel.writeString(s1);
        j1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        j1 = bv1.asBinder();
        parcel.writeStrongBinder(j1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
        parcel.writeInt(0);
          goto _L7
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(4, parcel, parcel1, 0);
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

    public final void c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(5, parcel, parcel1, 0);
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

    public final void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(8, parcel, parcel1, 0);
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

    public final void e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(9, parcel, parcel1, 0);
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
}
