// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.google.android.gms.internal:
//            li

public interface lp
    extends IInterface
{
    public static abstract class a extends Binder
        implements lp
    {

        public static lp bt(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            if (iinterface != null && (iinterface instanceof lp))
            {
                return (lp)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                j = parcel.readInt();
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
                a(j, maskedwallet, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                j = parcel.readInt();
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
                a(j, fullwallet, parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                j = parcel.readInt();
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
                a(j, flag, parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                j = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                i(j, parcel);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                break;
            }
            Status status;
            li li1;
            if (parcel.readInt() != 0)
            {
                status = Status.CREATOR.createFromParcel(parcel);
            } else
            {
                status = null;
            }
            if (parcel.readInt() != 0)
            {
                li1 = (li)li.CREATOR.createFromParcel(parcel);
            } else
            {
                li1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(status, li1, parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }
    }

    private static class a.a
        implements lp
    {

        private IBinder kq;

        public void a(int j, FullWallet fullwallet, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(j);
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
            kq.transact(2, parcel, parcel1, 0);
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

        public void a(int j, MaskedWallet maskedwallet, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(j);
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
            kq.transact(1, parcel, parcel1, 0);
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

        public void a(int j, boolean flag, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(j);
            if (flag)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(3, parcel, parcel1, 0);
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

        public void a(Status status, li li1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            if (status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L5:
            if (li1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            li1.writeToParcel(parcel, 0);
_L6:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            kq.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void i(int j, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            parcel.writeInt(j);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(4, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void a(int j, FullWallet fullwallet, Bundle bundle)
        throws RemoteException;

    public abstract void a(int j, MaskedWallet maskedwallet, Bundle bundle)
        throws RemoteException;

    public abstract void a(int j, boolean flag, Bundle bundle)
        throws RemoteException;

    public abstract void a(Status status, li li, Bundle bundle)
        throws RemoteException;

    public abstract void i(int j, Bundle bundle)
        throws RemoteException;
}
