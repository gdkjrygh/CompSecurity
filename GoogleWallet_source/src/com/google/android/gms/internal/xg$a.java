// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;

// Referenced classes of package com.google.android.gms.internal:
//            xg, xj, xi

public static abstract class a.ld extends Binder
    implements xg
{
    static final class a
        implements xg
    {

        private IBinder ld;

        public final void a(Bundle bundle, xj xj1)
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
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            bundle = xj1.asBinder();
            parcel.writeStrongBinder(bundle);
            ld.transact(5, parcel, null, 1);
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

        public final void a(CreateWalletObjectsRequest createwalletobjectsrequest, Bundle bundle, xj xj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (createwalletobjectsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createwalletobjectsrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            createwalletobjectsrequest = obj;
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            createwalletobjectsrequest = xj1.asBinder();
            parcel.writeStrongBinder(createwalletobjectsrequest);
            ld.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createwalletobjectsrequest;
            parcel.recycle();
            throw createwalletobjectsrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(FullWalletRequest fullwalletrequest, Bundle bundle, xj xj1)
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
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            fullwalletrequest = xj1.asBinder();
            parcel.writeStrongBinder(fullwalletrequest);
            ld.transact(2, parcel, null, 1);
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

        public final void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, xi xi1)
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
            if (xi1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = xi1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            ld.transact(7, parcel, null, 1);
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

        public final void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, xj xj1)
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
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            maskedwalletrequest = xj1.asBinder();
            parcel.writeStrongBinder(maskedwalletrequest);
            ld.transact(1, parcel, null, 1);
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
            ld.transact(4, parcel, null, 1);
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

        public final void a(GetInstrumentsRequest getinstrumentsrequest, Bundle bundle, xj xj1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (getinstrumentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getinstrumentsrequest.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            getinstrumentsrequest = obj;
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            getinstrumentsrequest = xj1.asBinder();
            parcel.writeStrongBinder(getinstrumentsrequest);
            ld.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getinstrumentsrequest;
            parcel.recycle();
            throw getinstrumentsrequest;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(String s, String s1, Bundle bundle, xj xj1)
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
            if (xj1 == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            s = xj1.asBinder();
            parcel.writeStrongBinder(s);
            ld.transact(3, parcel, null, 1);
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
            return ld;
        }

        public final void y(Bundle bundle)
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
            ld.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public final void z(Bundle bundle)
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
            ld.transact(10, parcel, null, 1);
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
            ld = ibinder;
        }
    }


    public static xg el(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (iinterface != null && (iinterface instanceof xg))
        {
            return (xg)iinterface;
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
            a(parcel1, bundle, eo(parcel.readStrongBinder()));
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
            a(parcel1, bundle1, eo(parcel.readStrongBinder()));
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
            a(s, s1, parcel1, eo(parcel.readStrongBinder()));
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
            a(parcel1, eo(parcel.readStrongBinder()));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (CreateWalletObjectsRequest)CreateWalletObjectsRequest.CREATOR.createFromParcel(parcel);
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
            a(parcel1, bundle2, eo(parcel.readStrongBinder()));
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
            a(parcel1, bundle3, en(parcel.readStrongBinder()));
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
            Bundle bundle4;
            if (parcel.readInt() != 0)
            {
                parcel1 = (GetInstrumentsRequest)GetInstrumentsRequest.CREATOR.createFromParcel(parcel);
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
            a(parcel1, bundle4, eo(parcel.readStrongBinder()));
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
            y(parcel);
            return true;

        case 10: // '\n'
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
        z(parcel);
        return true;
    }
}
