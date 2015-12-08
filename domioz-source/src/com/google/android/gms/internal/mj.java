// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            mi, mk, mp, ml, 
//            mn, zzvx

public abstract class mj extends Binder
    implements mi
{

    public static mi a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (iinterface != null && (iinterface instanceof mi))
        {
            return (mi)iinterface;
        } else
        {
            return new mk(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wallet.internal.IOwService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                parcel1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            a(parcel1, bundle, mp.a(parcel.readStrongBinder()));
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle1 = null;
            }
            a(parcel1, bundle1, mp.a(parcel.readStrongBinder()));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            String s = parcel.readString();
            s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            a(s, s1, parcel1, mp.a(parcel.readStrongBinder()));
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            if (parcel.readInt() != 0)
            {
                parcel1 = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel1, parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            a(parcel1, mp.a(parcel.readStrongBinder()));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (zzd)zzd.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle2 = null;
            }
            a(parcel1, bundle2, mp.a(parcel.readStrongBinder()));
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle3 = null;
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = s1;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                if (iinterface != null && (iinterface instanceof ml))
                {
                    parcel = (ml)iinterface;
                } else
                {
                    parcel = new mn(parcel);
                }
            }
            a(parcel1, bundle3, parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle4;
            if (parcel.readInt() != 0)
            {
                parcel1 = (zzvx)zzvx.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle4 = null;
            }
            a(parcel1, bundle4, mp.a(parcel.readStrongBinder()));
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel1 = null;
        }
        b(parcel1, mp.a(parcel.readStrongBinder()));
        return true;
    }
}
