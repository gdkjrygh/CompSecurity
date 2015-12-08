// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.google.android.gms.internal:
//            gi

private static class dG
    implements gi
{

    private IBinder dG;

    public void a(int i, FullWallet fullwallet, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        parcel.writeInt(i);
        if (fullwallet == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        fullwallet.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        fullwallet;
        parcel1.recycle();
        parcel.recycle();
        throw fullwallet;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(int i, MaskedWallet maskedwallet, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        parcel.writeInt(i);
        if (maskedwallet == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        maskedwallet.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        maskedwallet;
        parcel1.recycle();
        parcel.recycle();
        throw maskedwallet;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(int i, boolean flag, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        parcel.writeInt(i);
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        dG.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel1.recycle();
        parcel.recycle();
        throw bundle;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    let(IBinder ibinder)
    {
        dG = ibinder;
    }
}
