// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            mi, mo, zzvx, ml

final class mk
    implements mi
{

    private IBinder a;

    mk(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Bundle bundle)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(9, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel.recycle();
        throw bundle;
    }

    public final void a(Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        bundle = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        bundle = mo1.asBinder();
        parcel.writeStrongBinder(bundle);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        if (true) goto _L4; else goto _L3
_L3:
        bundle;
        parcel.recycle();
        throw bundle;
    }

    public final void a(zzvx zzvx1, Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (zzvx1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzvx1.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        zzvx1 = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        zzvx1 = mo1.asBinder();
        parcel.writeStrongBinder(zzvx1);
        a.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzvx1;
        parcel.recycle();
        throw zzvx1;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(FullWalletRequest fullwalletrequest, Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (fullwalletrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        fullwalletrequest.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        fullwalletrequest = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        fullwalletrequest = mo1.asBinder();
        parcel.writeStrongBinder(fullwalletrequest);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        fullwalletrequest;
        parcel.recycle();
        throw fullwalletrequest;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, ml ml1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (maskedwalletrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        maskedwalletrequest.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        maskedwalletrequest = obj;
        if (ml1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        maskedwalletrequest = ml1.asBinder();
        parcel.writeStrongBinder(maskedwalletrequest);
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        maskedwalletrequest;
        parcel.recycle();
        throw maskedwalletrequest;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (maskedwalletrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        maskedwalletrequest.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        maskedwalletrequest = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        maskedwalletrequest = mo1.asBinder();
        parcel.writeStrongBinder(maskedwalletrequest);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        maskedwalletrequest;
        parcel.recycle();
        throw maskedwalletrequest;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (notifytransactionstatusrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        notifytransactionstatusrequest.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        notifytransactionstatusrequest;
        parcel.recycle();
        throw notifytransactionstatusrequest;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(zzd zzd1, Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzd1.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        zzd1 = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        zzd1 = mo1.asBinder();
        parcel.writeStrongBinder(zzd1);
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzd1;
        parcel.recycle();
        throw zzd1;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(String s, String s1, Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        s = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s = mo1.asBinder();
        parcel.writeStrongBinder(s);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(Bundle bundle)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(10, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel.recycle();
        throw bundle;
    }

    public final void b(Bundle bundle, mo mo1)
    {
        Object obj;
        Parcel parcel;
        obj = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        bundle = obj;
        if (mo1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        bundle = mo1.asBinder();
        parcel.writeStrongBinder(bundle);
        a.transact(11, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        if (true) goto _L4; else goto _L3
_L3:
        bundle;
        parcel.recycle();
        throw bundle;
    }
}
