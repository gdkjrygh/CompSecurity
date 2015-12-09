// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.w;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.google.android.gms.internal:
//            mo, mq, zzvz

public abstract class mp extends Binder
    implements mo
{

    public mp()
    {
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public static mo a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        if (iinterface != null && (iinterface instanceof mo))
        {
            return (mo)iinterface;
        } else
        {
            return new mq(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            i = parcel.readInt();
            MaskedWallet maskedwallet;
            if (parcel.readInt() != 0)
            {
                maskedwallet = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(parcel);
            } else
            {
                maskedwallet = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, maskedwallet, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            i = parcel.readInt();
            FullWallet fullwallet;
            if (parcel.readInt() != 0)
            {
                fullwallet = (FullWallet)FullWallet.CREATOR.createFromParcel(parcel);
            } else
            {
                fullwallet = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, fullwallet, parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            i = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, flag, parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            Object obj;
            zzvz zzvz1;
            if (parcel.readInt() != 0)
            {
                obj = Status.CREATOR;
                obj = w.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                zzvz1 = (zzvz)zzvz.CREATOR.createFromParcel(parcel);
            } else
            {
                zzvz1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((Status) (obj)), zzvz1, parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            i = parcel.readInt();
            break;
        }
        boolean flag1;
        if (parcel.readInt() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        b(i, flag1, parcel);
        parcel1.writeNoException();
        return true;
    }
}
