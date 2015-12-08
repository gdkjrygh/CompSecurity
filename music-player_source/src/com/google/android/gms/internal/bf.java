// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ab, z, bg

final class bf
    implements bd
{

    private IBinder a;

    bf(IBinder ibinder)
    {
        a = ibinder;
    }

    public final c a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        c c1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        c1 = d.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return c1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(c c1, ab ab1, z z1, String s, bg bg1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1 = c1.asBinder();
_L5:
        parcel.writeStrongBinder(c1);
        if (ab1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ab1.writeToParcel(parcel, 0);
_L6:
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        parcel.writeInt(1);
        z1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        c1 = obj;
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        c1 = bg1.asBinder();
        parcel.writeStrongBinder(c1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        c1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(c c1, ab ab1, z z1, String s, String s1, bg bg1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1 = c1.asBinder();
_L5:
        parcel.writeStrongBinder(c1);
        if (ab1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ab1.writeToParcel(parcel, 0);
_L6:
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        parcel.writeInt(1);
        z1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        parcel.writeString(s1);
        c1 = obj;
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        c1 = bg1.asBinder();
        parcel.writeStrongBinder(c1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        c1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(c c1, z z1, String s, bg bg1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1 = c1.asBinder();
_L5:
        parcel.writeStrongBinder(c1);
        if (z1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        z1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        c1 = obj;
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        c1 = bg1.asBinder();
        parcel.writeStrongBinder(c1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        c1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
          goto _L5
    }

    public final void a(c c1, z z1, String s, String s1, bg bg1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1 = c1.asBinder();
_L5:
        parcel.writeStrongBinder(c1);
        if (z1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        z1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        c1 = obj;
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        c1 = bg1.asBinder();
        parcel.writeStrongBinder(c1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        c1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        c1;
        parcel1.recycle();
        parcel.recycle();
        throw c1;
          goto _L5
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
}
