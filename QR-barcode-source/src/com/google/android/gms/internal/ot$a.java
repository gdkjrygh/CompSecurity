// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

// Referenced classes of package com.google.android.gms.internal:
//            ot, on, ow, ov

public static abstract class a.lb extends Binder
    implements ot
{
    private static class a
        implements ot
    {

        private IBinder lb;

        public void a(Bundle bundle, ow ow1)
            throws RemoteException
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
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            bundle = ow1.asBinder();
            parcel.writeStrongBinder(bundle);
            lb.transact(5, parcel, null, 1);
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

        public void a(on on1, Bundle bundle, ow ow1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (on1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            on1.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            on1 = obj;
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            on1 = ow1.asBinder();
            parcel.writeStrongBinder(on1);
            lb.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            on1;
            parcel.recycle();
            throw on1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(FullWalletRequest fullwalletrequest, Bundle bundle, ow ow1)
            throws RemoteException
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
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            fullwalletrequest = ow1.asBinder();
            parcel.writeStrongBinder(fullwalletrequest);
            lb.transact(2, parcel, null, 1);
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

        public void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, ov ov1)
            throws RemoteException
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
            if (ov1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = ov1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            lb.transact(7, parcel, null, 1);
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

        public void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, ow ow1)
            throws RemoteException
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
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = ow1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            lb.transact(1, parcel, null, 1);
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

        public void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle)
            throws RemoteException
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
            lb.transact(4, parcel, null, 1);
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

        public void a(d d1, Bundle bundle, ow ow1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            d1 = obj;
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            d1 = ow1.asBinder();
            parcel.writeStrongBinder(d1);
            lb.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            d1;
            parcel.recycle();
            throw d1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(String s, String s1, Bundle bundle, ow ow1)
            throws RemoteException
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
            if (ow1 == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            s = ow1.asBinder();
            parcel.writeStrongBinder(s);
            lb.transact(3, parcel, null, 1);
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

        public IBinder asBinder()
        {
            return lb;
        }

        public void p(Bundle bundle)
            throws RemoteException
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
            lb.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public static ot bL(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (iinterface != null && (iinterface instanceof ot))
        {
            return (ot)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
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
            a(parcel1, bundle, bO(parcel.readStrongBinder()));
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
            a(parcel1, bundle1, bO(parcel.readStrongBinder()));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            String s = parcel.readString();
            String s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            a(s, s1, parcel1, bO(parcel.readStrongBinder()));
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
            a(parcel1, bO(parcel.readStrongBinder()));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (d)d.CREATOR.createFromParcel(parcel);
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
            a(parcel1, bundle2, bO(parcel.readStrongBinder()));
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
            a(parcel1, bundle3, bN(parcel.readStrongBinder()));
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle4;
            if (parcel.readInt() != 0)
            {
                parcel1 = (on)on.CREATOR.createFromParcel(parcel);
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
            a(parcel1, bundle4, bO(parcel.readStrongBinder()));
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        p(parcel);
        return true;
    }
}
