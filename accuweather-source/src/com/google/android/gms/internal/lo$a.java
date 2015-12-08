// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            lo, ll, lm

public static abstract class a.ko extends Binder
    implements lo
{
    private static class a
        implements lo
    {

        private IBinder ko;

        public ll a(d d1, c c1, WalletFragmentOptions walletfragmentoptions, lm lm1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L7:
            parcel.writeStrongBinder(d1);
            if (c1 == null) goto _L4; else goto _L3
_L3:
            d1 = c1.asBinder();
_L8:
            parcel.writeStrongBinder(d1);
            if (walletfragmentoptions == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            walletfragmentoptions.writeToParcel(parcel, 0);
_L9:
            d1 = obj;
            if (lm1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            d1 = lm1.asBinder();
            parcel.writeStrongBinder(d1);
            ko.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = ll.a.bo(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
              goto _L7
_L4:
            d1 = null;
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L7
        }

        public IBinder asBinder()
        {
            return ko;
        }

        a(IBinder ibinder)
        {
            ko = ibinder;
        }
    }


    public static lo br(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        if (iinterface != null && (iinterface instanceof lo))
        {
            return (lo)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        d d;
        c c;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            d = com.google.android.gms.dynamic.g(parcel.readStrongBinder());
            c = com.google.android.gms.dynamic.f(parcel.readStrongBinder());
            break;
        }
        Object obj;
        if (parcel.readInt() != 0)
        {
            obj = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        obj = a(d, c, ((WalletFragmentOptions) (obj)), bp(parcel.readStrongBinder()));
        parcel1.writeNoException();
        parcel = obj1;
        if (obj != null)
        {
            parcel = ((ll) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
